var items=function(){
    function item(checkBox,id,type,title,sellPoint,price,num,createTime,auditStatus,status,opertion){
        this.checkBox=checkBox;
        this.id=id;
        this.type=type;
        this.title=title;
        this.sellPoint=sellPoint;
        this.price=price;
        this.num=num;
        this.createTime=createTime;
        this.auditStatus=auditStatus;
        this.status=status;
        this.opertion=opertion;
    }

    var loadData=function(){

        $("#table_exmple").DataTable({
            bFilter:false,/*搜索栏*/
            processing:true,
            bSort:false,
            bLengthChange:true,
            bInfo:true,
            bAutoWidth:true,
            serverSide:true,/*详细分页组，可以支持跳转到某页*/
            pageLength:10,/*每页显示数据条数*/
            sServerMethod:"post",
            ajax:{
                url:"/item/all",
                type:"post",
                dataType:"json",
                dataSrc:''
            },
            columns:[
                {sDefaultContent:"<label><input type=\"checkbox\" class=\"ace\" ><span class=\"lbl\"></span></label>"},
                {data:"id"},
                {data:"type"},
                {data:"title"},
                {data:"sellPoint"},
                {data:"price"},
                {data:"num"},
                {data:"createTime"},
                {data:"auditStatus"},
                {data:"status"}
            ],
            aoColumnDefs:[
                {
                    targets:10,
                    data:null,
                    render: function (data,type,row) {
                        return `<a onClick="member_stop(this,data.id)"  href="javascript:;" title="下架"  class="btn btn-xs btn-status">下架</a>
        <a title="编辑" onclick="member_edit('编辑','add_product.html','4','','510')" href="javascript:;"  class="btn btn-xs btn-info" >编辑</a>
        <a title="删除" href="javascript:;"  onclick="member_del(this,data.id)" class="btn btn-xs btn-delete" >删除</a>`;
                    }

                }
            ],
            oLanguage:{
                sProcessing:"正在加载中......",
                sLengthMenu:"每页显示 _MENU_ 条数据",
                sZeroRecords:"没有数据",
                sEmptyTable:"表中没有数据",

                sInfo:"从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                sInfoEmpty:"显示0到0条数据",
                sInfoFiltered:"(数据表中共为 _MAX_ 条数据)",
                sSearch:"检索",
                oPaginate:{
                    sFirst:"首页",
                    sPrevious:"上一页",
                    sNext:"下一页",
                    sLast:"尾页"
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