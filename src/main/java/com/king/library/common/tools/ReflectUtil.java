package com.king.library.common.tools;

import org.apache.ibatis.session.Configuration;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @date: 2020/1/8 16:14
 * @author: duanyong
 * @desc:
 */
public class ReflectUtil {

    public static Map mapArrToMapObject(Map<String,String[]> mapArr){
        if(mapArr==null){
            return null;
        }else{
            HashMap map=new HashMap();
            Iterator<Map.Entry<String, String[]>> it= mapArr.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, String[]> entry=it.next();
                if(entry.getValue()!=null && entry.getValue().length==1){
                    map.put(entry.getKey(),entry.getValue()[0]);
                }else{
                    map.put(entry.getKey(),entry.getValue());
                }
            }
            return map;
        }
    }

    public static void mapToBeanAndFieldMap(Object obj,Map map,String mapName) throws IllegalAccessException {
        Field[] fields=obj.getClass().getDeclaredFields();
        HashMap<String,Field> fieldMap=new HashMap();
        for(int i=0;i<fields.length;i++){
            fieldMap.put(fields[i].getName(),fields[i]);
        }

        Object[] removeKey = new Object[fieldMap.size()];
        int k=0;
        Iterator it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry= (Map.Entry) it.next();
            Object key=entry.getKey();
            Object val=entry.getValue();
            if(fieldMap.containsKey(key)){
                setField(fieldMap.get(key),obj,converType(fieldMap.get(key),val));
                removeKey[k]=key;
                k++;
            }
        }

        for(int i=0;i<removeKey.length;i++){
            map.remove(removeKey[i]);
        }

        if(fieldMap.containsKey(mapName)){
            setField(fieldMap.get(mapName),obj,map);
        }

    }

    public static void setField(Field field,Object obj,Object fieldValue) throws IllegalAccessException {
        if(field.isAccessible()){
            field.set(obj,fieldValue);
        }else{
            field.setAccessible(true);
            field.set(obj,fieldValue);
            field.setAccessible(false);
        }

    }

    public static Object converType(Field field,Object obj){
        if(!field.getType().equals(String.class) && field.getType().equals(Integer.class) && obj instanceof String){
            obj=Integer.valueOf(Integer.parseInt(obj.toString()));
        }
        if(!field.getType().equals(String.class) && field.getType().equals(Long.class) && obj instanceof String){
            obj=Long.valueOf(Long.parseLong(obj.toString()));
        }
        return obj;
    }
}
