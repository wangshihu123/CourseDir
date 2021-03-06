package shihoo.wang.coursedir.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import shihoo.wang.coursedir.bean.FileDirBean;

import shihoo.wang.coursedir.dao.FileDirBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig fileDirBeanDaoConfig;

    private final FileDirBeanDao fileDirBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        fileDirBeanDaoConfig = daoConfigMap.get(FileDirBeanDao.class).clone();
        fileDirBeanDaoConfig.initIdentityScope(type);

        fileDirBeanDao = new FileDirBeanDao(fileDirBeanDaoConfig, this);

        registerDao(FileDirBean.class, fileDirBeanDao);
    }
    
    public void clear() {
        fileDirBeanDaoConfig.clearIdentityScope();
    }

    public FileDirBeanDao getFileDirBeanDao() {
        return fileDirBeanDao;
    }

}
