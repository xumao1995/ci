/**
 * 从url获取请求参数
 * @returns {string}
 */
function getParam() {
    let url = window.location.search;
    let result;
    if(url.indexOf('?')!=-1){
        result = url.substr(url.indexOf('=')+1);
    }
    console.log("param:",result);
    return result;
}

/**
 * 向后台请求区域信息
 * @returns
 */
function requestRegion() {
    let region = [{'id':'','regionName':'','branchPoList':[{'id':'','branchName':'','address':'','regionId':''}]}];
    $.ajax({
        async:false,
        url:'/ci/region/all',
        type:'get',
        dataType:'json',
        success:(result)=>{
            console.log("请求成功");
            region=result;
        },
        error:(e)=>{
            console.log("请求失败");
            console.log(e);
        },
        complete:(e)=>{
            console.log("请求完成");
        }
    })
    return region;
}

/**
 * 向后台请求业务类型信息
 * @returns
 */
function requestBusiness() {
    let business = [{'id':'','type':'','businessName':''}];
    $.ajax({
        async:false,
        url:'/ci/business/all',
        type:'get',
        dataType:'json',
        success:(result)=>{
            console.log("请求成功");
            business=result;
        },
        error:(e)=>{
            console.log("请求失败");
            console.log(e);
        },
        complete:(e)=>{
            console.log("请求完成");
        }
    })
    return business;
}

/**
 * 提交预约
 * @returns {boolean}
 */
function submitAppoint() {
    let result = false;
    let reqAppoint = {
        'branchId':$('#branch').val(),
        'businessId':$('#business-content').val(),
        'appointDate':$('#appoint-date').val(),
        'appointTime':$('#appoint-time').val(),
        'customerName':$('#customer').val(),
        'idType':$('input[type=radio][name=idType]:checked').val(),
        'idNo':$('#id-no').val(),
        'tel':$('#tel').val(),
        'note':$('#note').val()
    }
    $.ajax({
        url:'/ci/appoint/add',
        type:'post',
        contentType:'application/json',
        data:JSON.stringify(reqAppoint),
        success:(e)=>{
            console.log("预约成功");
            result = true;
        },
        error:(e)=>{
            console.log("预约失败");
        }
    })
    return result;
}

/**
 * 请求我的预约记录
 * @param tel
 * @returns {[{}]}
 */
function requestMyAppoint(tel) {
    let appointList = [{}];
    $.ajax({
        url:'/ci/appoint/customer',
        async:false,
        data:{ 'tel':tel},
        type:'get',
        contentType:'application/json',
        success:(data)=>{
            console.log("请求我的预计记录成功");
            appointList = data;
        },
        error:(e)=>{
            console.log("请求我的预计记录失败");
        }
    })
    return appointList;
}

/**
 * 请求当前排队人数
 * @param branch
 * @param date
 * @param time
 * @returns {number}
 */
function requestQueuePersonal(branch,date,time) {
    let num = 0;
    $.ajax({
        url:'/ci/appoint/queue',
        async:false,
        data:{
            'branch':branch,
            'date':date,
            'time':time
        },
        type:'get',
        contentType:'application/json',
        success:(data)=>{
            console.log("请求当前排队人数成功：",data);
            num = data;
        },
        error:(e)=>{
            console.log("请求当前排队人数失败");
        }
    })
    return num;
}
