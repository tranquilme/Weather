package com.example.testapp.logic.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.testapp.logic.model.City;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDao_Impl implements CityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<City> __insertionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __deletionAdapterOfCity;

  public CityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCity = new EntityInsertionAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `my_city` (`id`,`city_name`,`city_lng`,`city_lat`,`city_address`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
        if (value.getCityName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCityName());
        }
        if (value.getLng() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLng());
        }
        if (value.getLat() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLat());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAddress());
        }
      }
    };
    this.__deletionAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `my_city` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertCity(final City city, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCity.insert(city);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteCity(final City city, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCity.handle(city);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<City>> queryAllCities() {
    final String _sql = "SELECT * FROM my_city";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"my_city"}, false, new Callable<List<City>>() {
      @Override
      public List<City> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "city_lng");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "city_lat");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "city_address");
          final List<City> _result = new ArrayList<City>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final City _item;
            final String _tmpCityName;
            _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            final String _tmpLng;
            _tmpLng = _cursor.getString(_cursorIndexOfLng);
            final String _tmpLat;
            _tmpLat = _cursor.getString(_cursorIndexOfLat);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            _item = new City(_tmpCityName,_tmpLng,_tmpLat,_tmpAddress);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<String>> queryAllNames() {
    final String _sql = "SELECT city_name FROM my_city";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"my_city"}, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
