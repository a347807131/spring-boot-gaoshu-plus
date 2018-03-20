package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CommentsDao;
import io.renren.modules.sys.entity.CommentsEntity;
import io.renren.modules.sys.service.CommentsService;


@Service("commentsService")
public class CommentsServiceImpl extends ServiceImpl<CommentsDao, CommentsEntity> implements CommentsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CommentsEntity> page = this.selectPage(
                new Query<CommentsEntity>(params).getPage(),
                new EntityWrapper<CommentsEntity>()
        );

        return new PageUtils(page);
    }

}
