/**
 * Copyright (C) 2014 Next Generation Mobile Service JSC., (NMS).
 * All rights reserved.
 */
package com.nms.vmm.eip.service.entity;

import com.nms.vmm.eip.entity.User;


public interface UserService extends BaseService<User>{
    public boolean hasAdminUser();
}