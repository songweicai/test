(function(vc){
    //员工权限
    vc.extends({
        data:{
            staffPrivilegeInfo:{
                privileges:[],
                _currentStaffId:'',
            }
        },
        _initMethod:function(){

        },
        _initEvent:function(){
            vc.on('staffPrivilege','_loadStaffPrivileges',function(_param){
                vc.component._loadStaffPrivileges(_param);
            });
        },
        methods:{
            _loadStaffPrivileges:function(_param){
                vc.component.staffPrivilegeInfo._currentStaffId=_param.staffId;
                var param = {
                    params:{
                        staffId:_param.staffId
                    }
                };
             //发送get请求
            vc.http.get('staffPrivilege',
                         'listStaffPrivileges',
                          param,
                          function(json){
                             var _staffPrivilegeInfo = JSON.parse(json);
                             vc.component.staffPrivilegeInfo.privileges = _staffPrivilegeInfo.datas;

                          },function(){
                             console.log('请求失败处理');
                          });
            },
            _openDeleteStaffPrivilegeModel:function(_staffPrivilege){
                _staffPrivilege.staffId = vc.component.staffPrivilegeInfo._currentStaffId;
                vc.emit('deleteStaffPrivilege','openStaffPrivilegeModel',_staffPrivilege);
            }
        }
    });

})(window.vc);