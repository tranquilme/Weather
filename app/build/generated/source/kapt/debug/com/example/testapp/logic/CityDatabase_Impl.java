package com.example.testapp.logic;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.testapp.logic.dao.CityDao;
import com.example.testapp.logic.dao.CityDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDatabase_Impl extends CityDatabase {
  private volatile CityDao _cityDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `my_city` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `city_name` TEXT NOT NULL, `city_lng` TEXT NOT NULL, `city_lat` TEXT NOT NULL, `city_address` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c0bb188bd940cd9dcb50160cb955676')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `my_city`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMyCity = new HashMap<String, TableInfo.Column>(5);
        _columnsMyCity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyCity.put("city_name", new TableInfo.Column("city_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyCity.put("city_lng", new TableInfo.Column("city_lng", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyCity.put("city_lat", new TableInfo.Column("city_lat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyCity.put("city_address", new TableInfo.Column("city_address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMyCity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMyCity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMyCity = new TableInfo("my_city", _columnsMyCity, _foreignKeysMyCity, _indicesMyCity);
        final TableInfo _existingMyCity = TableInfo.read(_db, "my_city");
        if (! _infoMyCity.equals(_existingMyCity)) {
          return new RoomOpenHelper.ValidationResult(false, "my_city(com.example.testapp.logic.model.City).\n"
                  + " Expected:\n" + _infoMyCity + "\n"
                  + " Found:\n" + _existingMyCity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6c0bb188bd940cd9dcb50160cb955676", "b469f9cdad34e9e71833a91b59de2c13");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "my_city");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `my_city`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CityDao cityDao() {
    if (_cityDao != null) {
      return _cityDao;
    } else {
      synchronized(this) {
        if(_cityDao == null) {
          _cityDao = new CityDao_Impl(this);
        }
        return _cityDao;
      }
    }
  }
}
