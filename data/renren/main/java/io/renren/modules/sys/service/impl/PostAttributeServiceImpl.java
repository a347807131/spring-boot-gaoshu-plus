package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.PostAttributeDao;
import io.renren.modules.sys.entity.PostAttributeEntity;
import io.renren.modules.sys.service.PostAttributeService;


@Service("postAttributeService")
public class PostAttributeServiceImpl extends ServiceImpl<PostAttributeDao, PostAttributeEntity> implements PostAttributeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PostAttributeEntity> page = this.selectPage(
                new Query<PostAttributeEntity>(params).getPage(),
                new EntityWrapper<PostAttributeEntity>()
        );

        return new PageUtils(page);
    }

}
