package com.abdhilabs.footbalschedule.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TeamDao _teamDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Team` (`idLeague` TEXT, `idSoccerXML` TEXT, `id_team` INTEGER, `intFormedYear` TEXT, `intLoved` TEXT, `intStadiumCapacity` TEXT, `strAlternate` TEXT, `country` TEXT, `strDescriptionCN` TEXT, `strDescriptionDE` TEXT, `strDescriptionEN` TEXT, `strDescriptionES` TEXT, `strDescriptionFR` TEXT, `strDescriptionHU` TEXT, `strDescriptionIL` TEXT, `strDescriptionIT` TEXT, `strDescriptionJP` TEXT, `strDescriptionNL` TEXT, `strDescriptionNO` TEXT, `strDescriptionPL` TEXT, `strDescriptionPT` TEXT, `strDescriptionRU` TEXT, `strDescriptionSE` TEXT, `strDivision` TEXT, `strFacebook` TEXT, `strGender` TEXT, `strInstagram` TEXT, `strKeywords` TEXT, `league` TEXT, `strLocked` TEXT, `strManager` TEXT, `strSport` TEXT, `strStadium` TEXT, `stadiumDescription` TEXT, `strStadiumLocation` TEXT, `strStadiumThumb` TEXT, `team` TEXT, `strTeamBadge` TEXT, `teamBanner` TEXT, `strTeamFanart1` TEXT, `strTeamFanart2` TEXT, `strTeamFanart3` TEXT, `strTeamFanart4` TEXT, `strTeamJersey` TEXT, `teamLogo` TEXT, `strTeamShort` TEXT, `strTwitter` TEXT, `website` TEXT, `strYoutube` TEXT, PRIMARY KEY(`id_team`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"11453bb995b99bf5b87e1cb921af9140\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Team`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTeam = new HashMap<String, TableInfo.Column>(49);
        _columnsTeam.put("idLeague", new TableInfo.Column("idLeague", "TEXT", false, 0));
        _columnsTeam.put("idSoccerXML", new TableInfo.Column("idSoccerXML", "TEXT", false, 0));
        _columnsTeam.put("id_team", new TableInfo.Column("id_team", "INTEGER", false, 1));
        _columnsTeam.put("intFormedYear", new TableInfo.Column("intFormedYear", "TEXT", false, 0));
        _columnsTeam.put("intLoved", new TableInfo.Column("intLoved", "TEXT", false, 0));
        _columnsTeam.put("intStadiumCapacity", new TableInfo.Column("intStadiumCapacity", "TEXT", false, 0));
        _columnsTeam.put("strAlternate", new TableInfo.Column("strAlternate", "TEXT", false, 0));
        _columnsTeam.put("country", new TableInfo.Column("country", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionCN", new TableInfo.Column("strDescriptionCN", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionDE", new TableInfo.Column("strDescriptionDE", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionEN", new TableInfo.Column("strDescriptionEN", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionES", new TableInfo.Column("strDescriptionES", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionFR", new TableInfo.Column("strDescriptionFR", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionHU", new TableInfo.Column("strDescriptionHU", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionIL", new TableInfo.Column("strDescriptionIL", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionIT", new TableInfo.Column("strDescriptionIT", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionJP", new TableInfo.Column("strDescriptionJP", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionNL", new TableInfo.Column("strDescriptionNL", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionNO", new TableInfo.Column("strDescriptionNO", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionPL", new TableInfo.Column("strDescriptionPL", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionPT", new TableInfo.Column("strDescriptionPT", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionRU", new TableInfo.Column("strDescriptionRU", "TEXT", false, 0));
        _columnsTeam.put("strDescriptionSE", new TableInfo.Column("strDescriptionSE", "TEXT", false, 0));
        _columnsTeam.put("strDivision", new TableInfo.Column("strDivision", "TEXT", false, 0));
        _columnsTeam.put("strFacebook", new TableInfo.Column("strFacebook", "TEXT", false, 0));
        _columnsTeam.put("strGender", new TableInfo.Column("strGender", "TEXT", false, 0));
        _columnsTeam.put("strInstagram", new TableInfo.Column("strInstagram", "TEXT", false, 0));
        _columnsTeam.put("strKeywords", new TableInfo.Column("strKeywords", "TEXT", false, 0));
        _columnsTeam.put("league", new TableInfo.Column("league", "TEXT", false, 0));
        _columnsTeam.put("strLocked", new TableInfo.Column("strLocked", "TEXT", false, 0));
        _columnsTeam.put("strManager", new TableInfo.Column("strManager", "TEXT", false, 0));
        _columnsTeam.put("strSport", new TableInfo.Column("strSport", "TEXT", false, 0));
        _columnsTeam.put("strStadium", new TableInfo.Column("strStadium", "TEXT", false, 0));
        _columnsTeam.put("stadiumDescription", new TableInfo.Column("stadiumDescription", "TEXT", false, 0));
        _columnsTeam.put("strStadiumLocation", new TableInfo.Column("strStadiumLocation", "TEXT", false, 0));
        _columnsTeam.put("strStadiumThumb", new TableInfo.Column("strStadiumThumb", "TEXT", false, 0));
        _columnsTeam.put("team", new TableInfo.Column("team", "TEXT", false, 0));
        _columnsTeam.put("strTeamBadge", new TableInfo.Column("strTeamBadge", "TEXT", false, 0));
        _columnsTeam.put("teamBanner", new TableInfo.Column("teamBanner", "TEXT", false, 0));
        _columnsTeam.put("strTeamFanart1", new TableInfo.Column("strTeamFanart1", "TEXT", false, 0));
        _columnsTeam.put("strTeamFanart2", new TableInfo.Column("strTeamFanart2", "TEXT", false, 0));
        _columnsTeam.put("strTeamFanart3", new TableInfo.Column("strTeamFanart3", "TEXT", false, 0));
        _columnsTeam.put("strTeamFanart4", new TableInfo.Column("strTeamFanart4", "TEXT", false, 0));
        _columnsTeam.put("strTeamJersey", new TableInfo.Column("strTeamJersey", "TEXT", false, 0));
        _columnsTeam.put("teamLogo", new TableInfo.Column("teamLogo", "TEXT", false, 0));
        _columnsTeam.put("strTeamShort", new TableInfo.Column("strTeamShort", "TEXT", false, 0));
        _columnsTeam.put("strTwitter", new TableInfo.Column("strTwitter", "TEXT", false, 0));
        _columnsTeam.put("website", new TableInfo.Column("website", "TEXT", false, 0));
        _columnsTeam.put("strYoutube", new TableInfo.Column("strYoutube", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTeam = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTeam = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTeam = new TableInfo("Team", _columnsTeam, _foreignKeysTeam, _indicesTeam);
        final TableInfo _existingTeam = TableInfo.read(_db, "Team");
        if (! _infoTeam.equals(_existingTeam)) {
          throw new IllegalStateException("Migration didn't properly handle Team(com.abdhilabs.footbalschedule.model.response.TeamResponse.Team).\n"
                  + " Expected:\n" + _infoTeam + "\n"
                  + " Found:\n" + _existingTeam);
        }
      }
    }, "11453bb995b99bf5b87e1cb921af9140", "26771a7222aacd71539fe56c2cada665");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Team");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Team`");
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
  public TeamDao teamDao() {
    if (_teamDao != null) {
      return _teamDao;
    } else {
      synchronized(this) {
        if(_teamDao == null) {
          _teamDao = new TeamDao_Impl(this);
        }
        return _teamDao;
      }
    }
  }
}
