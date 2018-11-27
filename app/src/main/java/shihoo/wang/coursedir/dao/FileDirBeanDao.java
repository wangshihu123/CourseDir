package shihoo.wang.coursedir.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import shihoo.wang.coursedir.bean.FileDirBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FILE_DIR_BEAN".
*/
public class FileDirBeanDao extends AbstractDao<FileDirBean, Long> {

    public static final String TABLENAME = "FILE_DIR_BEAN";

    /**
     * Properties of entity FileDirBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FolderId = new Property(1, String.class, "folderId", false, "FOLDER_ID");
        public final static Property FolderType = new Property(2, String.class, "folderType", false, "FOLDER_TYPE");
        public final static Property FolderName = new Property(3, String.class, "folderName", false, "FOLDER_NAME");
        public final static Property Depth = new Property(4, String.class, "depth", false, "DEPTH");
        public final static Property ParentFolder = new Property(5, String.class, "parentFolder", false, "PARENT_FOLDER");
        public final static Property LastDatetime = new Property(6, String.class, "lastDatetime", false, "LAST_DATETIME");
        public final static Property TemplateId = new Property(7, String.class, "templateId", false, "TEMPLATE_ID");
        public final static Property TemplateName = new Property(8, String.class, "templateName", false, "TEMPLATE_NAME");
        public final static Property TemplateSubName = new Property(9, String.class, "templateSubName", false, "TEMPLATE_SUB_NAME");
        public final static Property TemplateType = new Property(10, String.class, "templateType", false, "TEMPLATE_TYPE");
        public final static Property UserId = new Property(11, String.class, "userId", false, "USER_ID");
        public final static Property ClubId = new Property(12, String.class, "clubId", false, "CLUB_ID");
        public final static Property Image = new Property(13, String.class, "image", false, "IMAGE");
        public final static Property Difficulty = new Property(14, String.class, "difficulty", false, "DIFFICULTY");
        public final static Property CourseTime = new Property(15, String.class, "courseTime", false, "COURSE_TIME");
        public final static Property TotalStep = new Property(16, String.class, "totalStep", false, "TOTAL_STEP");
    }


    public FileDirBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FileDirBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FILE_DIR_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FOLDER_ID\" TEXT," + // 1: folderId
                "\"FOLDER_TYPE\" TEXT," + // 2: folderType
                "\"FOLDER_NAME\" TEXT," + // 3: folderName
                "\"DEPTH\" TEXT," + // 4: depth
                "\"PARENT_FOLDER\" TEXT," + // 5: parentFolder
                "\"LAST_DATETIME\" TEXT," + // 6: lastDatetime
                "\"TEMPLATE_ID\" TEXT," + // 7: templateId
                "\"TEMPLATE_NAME\" TEXT," + // 8: templateName
                "\"TEMPLATE_SUB_NAME\" TEXT," + // 9: templateSubName
                "\"TEMPLATE_TYPE\" TEXT," + // 10: templateType
                "\"USER_ID\" TEXT," + // 11: userId
                "\"CLUB_ID\" TEXT," + // 12: clubId
                "\"IMAGE\" TEXT," + // 13: image
                "\"DIFFICULTY\" TEXT," + // 14: difficulty
                "\"COURSE_TIME\" TEXT," + // 15: courseTime
                "\"TOTAL_STEP\" TEXT);"); // 16: totalStep
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FILE_DIR_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FileDirBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String folderId = entity.getFolderId();
        if (folderId != null) {
            stmt.bindString(2, folderId);
        }
 
        String folderType = entity.getFolderType();
        if (folderType != null) {
            stmt.bindString(3, folderType);
        }
 
        String folderName = entity.getFolderName();
        if (folderName != null) {
            stmt.bindString(4, folderName);
        }
 
        String depth = entity.getDepth();
        if (depth != null) {
            stmt.bindString(5, depth);
        }
 
        String parentFolder = entity.getParentFolder();
        if (parentFolder != null) {
            stmt.bindString(6, parentFolder);
        }
 
        String lastDatetime = entity.getLastDatetime();
        if (lastDatetime != null) {
            stmt.bindString(7, lastDatetime);
        }
 
        String templateId = entity.getTemplateId();
        if (templateId != null) {
            stmt.bindString(8, templateId);
        }
 
        String templateName = entity.getTemplateName();
        if (templateName != null) {
            stmt.bindString(9, templateName);
        }
 
        String templateSubName = entity.getTemplateSubName();
        if (templateSubName != null) {
            stmt.bindString(10, templateSubName);
        }
 
        String templateType = entity.getTemplateType();
        if (templateType != null) {
            stmt.bindString(11, templateType);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(12, userId);
        }
 
        String clubId = entity.getClubId();
        if (clubId != null) {
            stmt.bindString(13, clubId);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(14, image);
        }
 
        String difficulty = entity.getDifficulty();
        if (difficulty != null) {
            stmt.bindString(15, difficulty);
        }
 
        String courseTime = entity.getCourseTime();
        if (courseTime != null) {
            stmt.bindString(16, courseTime);
        }
 
        String totalStep = entity.getTotalStep();
        if (totalStep != null) {
            stmt.bindString(17, totalStep);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FileDirBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String folderId = entity.getFolderId();
        if (folderId != null) {
            stmt.bindString(2, folderId);
        }
 
        String folderType = entity.getFolderType();
        if (folderType != null) {
            stmt.bindString(3, folderType);
        }
 
        String folderName = entity.getFolderName();
        if (folderName != null) {
            stmt.bindString(4, folderName);
        }
 
        String depth = entity.getDepth();
        if (depth != null) {
            stmt.bindString(5, depth);
        }
 
        String parentFolder = entity.getParentFolder();
        if (parentFolder != null) {
            stmt.bindString(6, parentFolder);
        }
 
        String lastDatetime = entity.getLastDatetime();
        if (lastDatetime != null) {
            stmt.bindString(7, lastDatetime);
        }
 
        String templateId = entity.getTemplateId();
        if (templateId != null) {
            stmt.bindString(8, templateId);
        }
 
        String templateName = entity.getTemplateName();
        if (templateName != null) {
            stmt.bindString(9, templateName);
        }
 
        String templateSubName = entity.getTemplateSubName();
        if (templateSubName != null) {
            stmt.bindString(10, templateSubName);
        }
 
        String templateType = entity.getTemplateType();
        if (templateType != null) {
            stmt.bindString(11, templateType);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(12, userId);
        }
 
        String clubId = entity.getClubId();
        if (clubId != null) {
            stmt.bindString(13, clubId);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(14, image);
        }
 
        String difficulty = entity.getDifficulty();
        if (difficulty != null) {
            stmt.bindString(15, difficulty);
        }
 
        String courseTime = entity.getCourseTime();
        if (courseTime != null) {
            stmt.bindString(16, courseTime);
        }
 
        String totalStep = entity.getTotalStep();
        if (totalStep != null) {
            stmt.bindString(17, totalStep);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FileDirBean readEntity(Cursor cursor, int offset) {
        FileDirBean entity = new FileDirBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // folderId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // folderType
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // folderName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // depth
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // parentFolder
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // lastDatetime
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // templateId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // templateName
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // templateSubName
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // templateType
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // userId
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // clubId
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // image
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // difficulty
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // courseTime
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // totalStep
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FileDirBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFolderId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFolderType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFolderName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDepth(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setParentFolder(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLastDatetime(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTemplateId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTemplateName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTemplateSubName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTemplateType(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setUserId(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setClubId(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setImage(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setDifficulty(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCourseTime(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setTotalStep(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FileDirBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FileDirBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FileDirBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}