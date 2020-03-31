package com.example.assignment.model.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.assignment.model.database.entity.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class RepoDao_Impl implements RepoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public RepoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User`(`id`,`author`,`name`,`avatar`,`url`,`description`,`language`,`languageColor`,`stars`,`forks`,`currentPeriodStars`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAvatar());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUrl());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanguage());
        }
        if (value.getLanguageColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLanguageColor());
        }
        stmt.bindLong(9, value.getStars());
        stmt.bindLong(10, value.getForks());
        stmt.bindLong(11, value.getCurrentPeriodStars());
      }
    };
  }

  @Override
  public void insertAll(List<User> repoDetails) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(repoDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<User> getAll() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfAuthor = _cursor.getColumnIndexOrThrow("author");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfAvatar = _cursor.getColumnIndexOrThrow("avatar");
      final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("url");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfLanguage = _cursor.getColumnIndexOrThrow("language");
      final int _cursorIndexOfLanguageColor = _cursor.getColumnIndexOrThrow("languageColor");
      final int _cursorIndexOfStars = _cursor.getColumnIndexOrThrow("stars");
      final int _cursorIndexOfForks = _cursor.getColumnIndexOrThrow("forks");
      final int _cursorIndexOfCurrentPeriodStars = _cursor.getColumnIndexOrThrow("currentPeriodStars");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpAvatar;
        _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpLanguage;
        _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
        final String _tmpLanguageColor;
        _tmpLanguageColor = _cursor.getString(_cursorIndexOfLanguageColor);
        final int _tmpStars;
        _tmpStars = _cursor.getInt(_cursorIndexOfStars);
        final int _tmpForks;
        _tmpForks = _cursor.getInt(_cursorIndexOfForks);
        final int _tmpCurrentPeriodStars;
        _tmpCurrentPeriodStars = _cursor.getInt(_cursorIndexOfCurrentPeriodStars);
        _item = new User(_tmpId,_tmpAuthor,_tmpName,_tmpAvatar,_tmpUrl,_tmpDescription,_tmpLanguage,_tmpLanguageColor,_tmpStars,_tmpForks,_tmpCurrentPeriodStars);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
