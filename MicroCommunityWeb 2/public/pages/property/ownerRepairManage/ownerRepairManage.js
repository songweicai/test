/**
    入驻小区
**/
(function(vc){
    var DEFAULT_PAGE = 1;
    var DEFAULT_ROWS = 10;
    vc.extends({
        data:{
            ownerRepairManageInfo:{
                ownerRepairs:[],
                total:0,
                records:1,
                moreCondition:false,
                repairName:'',
                conditions:{
                    repairId:'',
                    repairName:'',
                    tel:'',
                    repairType:'',
                    ownerId:'',
                    state:''
                }
            }
        },
        _initMethod:function(){
            //vc.component._listOwnerRepairs(DEFAULT_PAGE, DEFAULT_ROWS);
            //vc.component._validateParam();
            vc.component._listOwnerRepairs(DEFAULT_PAGE, DEFAULT_ROWS);
        },
        _initEvent:function(){
            
            vc.on('ownerRepairManage','listOwnerRepair',function(_param){
                  vc.component._listOwnerRepairs(DEFAULT_PAGE, DEFAULT_ROWS);
            });
             vc.on('pagination','page_event',function(_currentPage){
                vc.component._listOwnerRepairs(_currentPage,DEFAULT_ROWS);
            });
        },
        methods:{
            _listOwnerRepairs:function(_page, _rows){
                vc.component.ownerRepairManageInfo.conditions.page = _page;
                vc.component.ownerRepairManageInfo.conditions.row = _rows;
                vc.component.ownerRepairManageInfo.conditions.communityId = vc.getCurrentCommunity().communityId;
                vc.component.ownerRepairManageInfo.conditions.state = '1000';
                var param = {
                    params:vc.component.ownerRepairManageInfo.conditions
               };

               //发送get请求
               vc.http.get('ownerRepairManage',
                            'list',
                             param,
                             function(json,res){
                                var _ownerRepairManageInfo=JSON.parse(json);
                                vc.component.ownerRepairManageInfo.total = _ownerRepairManageInfo.total;
                                vc.component.ownerRepairManageInfo.records = _ownerRepairManageInfo.records;
                                vc.component.ownerRepairManageInfo.ownerRepairs = _ownerRepairManageInfo.data;
                                vc.emit('pagination','init',{
                                     total:vc.component.ownerRepairManageInfo.records,
                                     currentPage:_page
                                 });
                             },function(errInfo,error){
                                console.log('请求失败处理');
                             }
                           );
            },
            _openAddOwnerRepairModal:function(){
                vc.emit('addOwnerRepair','openAddOwnerRepairModal',vc.component.ownerRepairManageInfo.conditions);
            },
            _openEditOwnerRepairModel:function(_ownerRepair){
                _ownerRepair.roomName = vc.component.ownerRepairManageInfo.conditions.roomName;
                _ownerRepair.roomId = vc.component.ownerRepairManageInfo.conditions.roomId;
                
                vc.emit('editOwnerRepair','openEditOwnerRepairModal',_ownerRepair);
            },
            _openDeleteOwnerRepairModel:function(_ownerRepair){
                vc.emit('deleteOwnerRepair','openDeleteOwnerRepairModal',_ownerRepair);
            },
            _queryOwnerRepairMethod:function(){
                vc.component._listOwnerRepairs(DEFAULT_PAGE, DEFAULT_ROWS);

            },
            _openDispatchRepair:function(_ownerRepair){
                 vc.jumpToPage('/admin.html#/pages/property/repairDispatchStep?repairId=' + _ownerRepair.repairId);

            },
            _moreCondition:function(){
                if(vc.component.ownerRepairManageInfo.moreCondition){
                    vc.component.ownerRepairManageInfo.moreCondition = false;
                }else{
                    vc.component.ownerRepairManageInfo.moreCondition = true;
                }
            }

             
        }
    });
})(window.vc);
