package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mappers.ManagerMapper;
import ssm.pojo.Manager;
import ssm.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public boolean verification(Manager manager) {
        Manager manager1 = managerMapper.getManager(manager);
        if(manager1 == null){
            return false;
        }
        return true;
    }

}
