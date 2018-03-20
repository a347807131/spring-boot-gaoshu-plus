package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.PostsDao;
import io.renren.modules.sys.entity.PostsEntity;
import io.renren.modules.sys.service.PostsService;


@Service("postsService")
public class PostsServiceImpl extends ServiceImpl<PostsDao, PostsEntity> implements PostsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PostsEntity> page = this.selectPage(
                new Query<PostsEntity>(params).getPage(),
                new EntityWrapper<PostsEntity>()
        );

        return new PageUtils(page);
    }

}
