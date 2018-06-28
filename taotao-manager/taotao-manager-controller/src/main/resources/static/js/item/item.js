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
        /*$("#table_exmple").DataTable({
            data:[
                new item("<label><input type=\"checkbox\" class=\"ace\" ><span class=\"lbl\"></span></label>",14421424,"手机","苹果X  256G","8888","666","快来买啊。5折优惠了","2018-06-28 16:09","上架","出售中","<a onClick=\"member_stop(this,'10001')\"  href=\"javascript:;\" title=\"下架\"  class=\"btn btn-xs btn-status\">下架</a>\n" +
                    "        <a title=\"编辑\" onclick=\"member_edit('编辑','add_product.html','4','','510')\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" >编辑</a>\n" +
                    "        <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,'1')\" class=\"btn btn-xs btn-delete\" >删除</a>"),
                new item("<label><input type=\"checkbox\" class=\"ace\" ><span class=\"lbl\"></span></label>",14421424,"手机","华为P20  128G","9999","8888","买一送一","2018-06-28 16:09","上架","出售中","<a onClick=\"member_stop(this,'10001')\"  href=\"javascript:;\" title=\"下架\"  class=\"btn btn-xs btn-status\">下架</a>\n" +
                    "        <a title=\"编辑\" onclick=\"member_edit('编辑','add_product.html','4','','510')\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" >编辑</a>\n" +
                    "        <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,'1')\" class=\"btn btn-xs btn-delete\" >删除</a>"),
            ],
            columns:[
                {data:"checkBox"},
                {data:"id"},
                {data:"type"},
                {data:"title"},
                {data:"sellPoint"},
                {data:"price"},
                {data:"num"},
                {data:"createTime"},
                {data:"auditStatus"},
                {data:"status"},
                {data:"opertion"}
            ]
        });*/

        $("#table_exmple").DataTable({
            ajax:{
                url:"/item/all",
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
            ]

        });

    };


    return{
        init:function(){
            loadData();
        }
    };
}