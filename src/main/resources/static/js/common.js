
function getFilterObj(){
    var filterArr=mini.getsByName("filterName");
    var param={};
    for(var i=0;i<filterArr.length;i++){
        if(filterArr[i].value != ""){
            var value;
            if(filterArr[i].type == "monthpiccker"){
                value=filterArr[i].text;
            }else{
                value=filterArr[i].value;
            }
            value=$.trim(value);
            param[filterArr[i].id]=value;
        }
    }
    return param;
}

function onFilterChanged(){
    grid.load({filterStr:JSON.stringify(getFilterObj())});
}

function exportExcel(grid,url,fileName){
    if(grid.data){

    }
}

function arrStrOprat(arrStr,str,flag){
    var arr;
    if(arrStr.length==0){
        arr=new Array();
    }else{
        arr=arrStr.split(",");
    }
    if(flag=="div"){
        arr.splice(arr.indexOf(str),1);
    }
    if(flag=="add"){
        arr.push(str);
    }
    return arr.join(",");
}