var items=function(){
    var loadData=function(){

        $("#table_exmple").DataTable({
            "bFilter":false,/*搜索栏*/
            "processing":true,
            "bSort":false,
            "bLengthChange":true,
            "bInfo":true,
            "bAutoWidth":true,
            "serverSide":true,/*详细分页组，可以支持跳转到某页*/
            "pageLength":10,/*每页显示数据条数*/
            "sServerMethod":"post",
            "pagingType":"full_numbers",
            "ajax":{
                "url":"/item/all",
                "type":"post",
                "dataType":"json",
                "dataSrc":function(list){
                    return list.data;
                }
            },
            "aoColumns":[
                {"sDefaultContent":"<label><input type=\"checkbox\" class=\"ace\" ><span class=\"lbl\"></span></label>"},
                {"mData":"id"},
                {"mData":"cid"},
                {"mData":"title"},
                {"mData":"sellPoint"},
                {"mData":"price"},
                {"mData":"num"},
                {"mData":"createTime"},
                {"mData":"auditStatus"},
                {"mData":function(data){
                        if(data.status==1){
                            return "上架";
                        }else if(data.status==2){
                            return "下架";
                        }else{
                            return "删除";
                        }
                    }}
            ],
            "aoColumnDefs":[
                {
                    "targets":10,
                    "data":null,
                    "render": function (data,type,row) {
                        var id=data.id;
                        var title;
                        var status=parseInt(data.status);
                        var opertion;
                        if(status==1){
                            title="下架"
                            opertion=`<a onClick="member_stop(this,${id})"  href="javascript:;" title="${title}" name="stop"  class="btn btn-xs btn-status">${title}</a>`;
                        }else if(status==2){
                            title="上架"
                            opertion=`<a onClick="member_start(this,${id})"  href="javascript:;" title="${title}" name="stop"  class="btn btn-xs btn-status">${title}</a>`
                        }

                        return `${opertion}
        <a title="编辑" onclick="member_edit('编辑','add_product.html','4','','510')" href="javascript:;"  class="btn btn-xs btn-info" >编辑</a>
        <a title="删除" href="javascript:;"  onclick="member_del(this,${id})" name="delete" class="btn btn-xs btn-delete" >删除</a>`;
                    }

                }
            ],
            "oLanguage":{
                "sProcessing":"正在加载中......",
                "sLengthMenu":"每页显示 _MENU_ 条数据",
                "sZeroRecords":"没有数据",
                "sEmptyTable":"表中没有数据",
                "sInfo":"从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty":"显示0到0条数据",
                "sInfoFiltered":"(数据表中共为 _MAX_ 条数据)",
                "sSearch":"检索",
                "oPaginate":{
                    "sFirst":"首页",
                    "sPrevious":"上一页",
                    "sNext":"下一页",
                    "sLast":"尾页"
                }
            }
        });

    };


    return{
        init:function(){
            loadData();
        }
    };
}