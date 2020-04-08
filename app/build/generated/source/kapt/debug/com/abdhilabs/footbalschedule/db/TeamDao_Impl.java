package com.abdhilabs.footbalschedule.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.abdhilabs.footbalschedule.model.response.TeamResponse;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class TeamDao_Impl implements TeamDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTeam;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTeam;

  public TeamDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTeam = new EntityInsertionAdapter<TeamResponse.Team>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Team`(`idLeague`,`idSoccerXML`,`id_team`,`intFormedYear`,`intLoved`,`intStadiumCapacity`,`strAlternate`,`country`,`strDescriptionCN`,`strDescriptionDE`,`strDescriptionEN`,`strDescriptionES`,`strDescriptionFR`,`strDescriptionHU`,`strDescriptionIL`,`strDescriptionIT`,`strDescriptionJP`,`strDescriptionNL`,`strDescriptionNO`,`strDescriptionPL`,`strDescriptionPT`,`strDescriptionRU`,`strDescriptionSE`,`strDivision`,`strFacebook`,`strGender`,`strInstagram`,`strKeywords`,`league`,`strLocked`,`strManager`,`strSport`,`strStadium`,`stadiumDescription`,`strStadiumLocation`,`strStadiumThumb`,`team`,`strTeamBadge`,`teamBanner`,`strTeamFanart1`,`strTeamFanart2`,`strTeamFanart3`,`strTeamFanart4`,`strTeamJersey`,`teamLogo`,`strTeamShort`,`strTwitter`,`website`,`strYoutube`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TeamResponse.Team value) {
        if (value.getIdLeague() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdLeague());
        }
        if (value.getIdSoccerXML() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdSoccerXML());
        }
        if (value.getIdTeam() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getIdTeam());
        }
        if (value.getIntFormedYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIntFormedYear());
        }
        if (value.getIntLoved() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIntLoved());
        }
        if (value.getIntStadiumCapacity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getIntStadiumCapacity());
        }
        if (value.getStrAlternate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getStrAlternate());
        }
        if (value.getStrCountry() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStrCountry());
        }
        if (value.getStrDescriptionCN() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStrDescriptionCN());
        }
        if (value.getStrDescriptionDE() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStrDescriptionDE());
        }
        if (value.getStrDescriptionEN() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStrDescriptionEN());
        }
        if (value.getStrDescriptionES() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStrDescriptionES());
        }
        if (value.getStrDescriptionFR() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStrDescriptionFR());
        }
        if (value.getStrDescriptionHU() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getStrDescriptionHU());
        }
        if (value.getStrDescriptionIL() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getStrDescriptionIL());
        }
        if (value.getStrDescriptionIT() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getStrDescriptionIT());
        }
        if (value.getStrDescriptionJP() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getStrDescriptionJP());
        }
        if (value.getStrDescriptionNL() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getStrDescriptionNL());
        }
        if (value.getStrDescriptionNO() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStrDescriptionNO());
        }
        if (value.getStrDescriptionPL() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStrDescriptionPL());
        }
        if (value.getStrDescriptionPT() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStrDescriptionPT());
        }
        if (value.getStrDescriptionRU() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getStrDescriptionRU());
        }
        if (value.getStrDescriptionSE() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getStrDescriptionSE());
        }
        if (value.getStrDivision() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getStrDivision());
        }
        if (value.getStrFacebook() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getStrFacebook());
        }
        if (value.getStrGender() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getStrGender());
        }
        if (value.getStrInstagram() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getStrInstagram());
        }
        if (value.getStrKeywords() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getStrKeywords());
        }
        if (value.getStrLeague() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getStrLeague());
        }
        if (value.getStrLocked() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getStrLocked());
        }
        if (value.getStrManager() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getStrManager());
        }
        if (value.getStrSport() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getStrSport());
        }
        if (value.getStrStadium() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getStrStadium());
        }
        if (value.getStrStadiumDescription() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getStrStadiumDescription());
        }
        if (value.getStrStadiumLocation() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStrStadiumLocation());
        }
        if (value.getStrStadiumThumb() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getStrStadiumThumb());
        }
        if (value.getStrTeam() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getStrTeam());
        }
        if (value.getStrTeamBadge() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getStrTeamBadge());
        }
        if (value.getStrTeamBanner() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getStrTeamBanner());
        }
        if (value.getStrTeamFanart1() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getStrTeamFanart1());
        }
        if (value.getStrTeamFanart2() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getStrTeamFanart2());
        }
        if (value.getStrTeamFanart3() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getStrTeamFanart3());
        }
        if (value.getStrTeamFanart4() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getStrTeamFanart4());
        }
        if (value.getStrTeamJersey() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getStrTeamJersey());
        }
        if (value.getStrTeamLogo() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getStrTeamLogo());
        }
        if (value.getStrTeamShort() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getStrTeamShort());
        }
        if (value.getStrTwitter() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getStrTwitter());
        }
        if (value.getStrWebsite() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getStrWebsite());
        }
        if (value.getStrYoutube() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getStrYoutube());
        }
      }
    };
    this.__deletionAdapterOfTeam = new EntityDeletionOrUpdateAdapter<TeamResponse.Team>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Team` WHERE `id_team` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TeamResponse.Team value) {
        if (value.getIdTeam() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getIdTeam());
        }
      }
    };
  }

  @Override
  public void addToFavorite(TeamResponse.Team team) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTeam.insert(team);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFromFavorite(TeamResponse.Team team) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfTeam.handle(team);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<TeamResponse.Team> getAll() {
    final String _sql = "SELECT * FROM team";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfIdLeague = _cursor.getColumnIndexOrThrow("idLeague");
      final int _cursorIndexOfIdSoccerXML = _cursor.getColumnIndexOrThrow("idSoccerXML");
      final int _cursorIndexOfIdTeam = _cursor.getColumnIndexOrThrow("id_team");
      final int _cursorIndexOfIntFormedYear = _cursor.getColumnIndexOrThrow("intFormedYear");
      final int _cursorIndexOfIntLoved = _cursor.getColumnIndexOrThrow("intLoved");
      final int _cursorIndexOfIntStadiumCapacity = _cursor.getColumnIndexOrThrow("intStadiumCapacity");
      final int _cursorIndexOfStrAlternate = _cursor.getColumnIndexOrThrow("strAlternate");
      final int _cursorIndexOfStrCountry = _cursor.getColumnIndexOrThrow("country");
      final int _cursorIndexOfStrDescriptionCN = _cursor.getColumnIndexOrThrow("strDescriptionCN");
      final int _cursorIndexOfStrDescriptionDE = _cursor.getColumnIndexOrThrow("strDescriptionDE");
      final int _cursorIndexOfStrDescriptionEN = _cursor.getColumnIndexOrThrow("strDescriptionEN");
      final int _cursorIndexOfStrDescriptionES = _cursor.getColumnIndexOrThrow("strDescriptionES");
      final int _cursorIndexOfStrDescriptionFR = _cursor.getColumnIndexOrThrow("strDescriptionFR");
      final int _cursorIndexOfStrDescriptionHU = _cursor.getColumnIndexOrThrow("strDescriptionHU");
      final int _cursorIndexOfStrDescriptionIL = _cursor.getColumnIndexOrThrow("strDescriptionIL");
      final int _cursorIndexOfStrDescriptionIT = _cursor.getColumnIndexOrThrow("strDescriptionIT");
      final int _cursorIndexOfStrDescriptionJP = _cursor.getColumnIndexOrThrow("strDescriptionJP");
      final int _cursorIndexOfStrDescriptionNL = _cursor.getColumnIndexOrThrow("strDescriptionNL");
      final int _cursorIndexOfStrDescriptionNO = _cursor.getColumnIndexOrThrow("strDescriptionNO");
      final int _cursorIndexOfStrDescriptionPL = _cursor.getColumnIndexOrThrow("strDescriptionPL");
      final int _cursorIndexOfStrDescriptionPT = _cursor.getColumnIndexOrThrow("strDescriptionPT");
      final int _cursorIndexOfStrDescriptionRU = _cursor.getColumnIndexOrThrow("strDescriptionRU");
      final int _cursorIndexOfStrDescriptionSE = _cursor.getColumnIndexOrThrow("strDescriptionSE");
      final int _cursorIndexOfStrDivision = _cursor.getColumnIndexOrThrow("strDivision");
      final int _cursorIndexOfStrFacebook = _cursor.getColumnIndexOrThrow("strFacebook");
      final int _cursorIndexOfStrGender = _cursor.getColumnIndexOrThrow("strGender");
      final int _cursorIndexOfStrInstagram = _cursor.getColumnIndexOrThrow("strInstagram");
      final int _cursorIndexOfStrKeywords = _cursor.getColumnIndexOrThrow("strKeywords");
      final int _cursorIndexOfStrLeague = _cursor.getColumnIndexOrThrow("league");
      final int _cursorIndexOfStrLocked = _cursor.getColumnIndexOrThrow("strLocked");
      final int _cursorIndexOfStrManager = _cursor.getColumnIndexOrThrow("strManager");
      final int _cursorIndexOfStrSport = _cursor.getColumnIndexOrThrow("strSport");
      final int _cursorIndexOfStrStadium = _cursor.getColumnIndexOrThrow("strStadium");
      final int _cursorIndexOfStrStadiumDescription = _cursor.getColumnIndexOrThrow("stadiumDescription");
      final int _cursorIndexOfStrStadiumLocation = _cursor.getColumnIndexOrThrow("strStadiumLocation");
      final int _cursorIndexOfStrStadiumThumb = _cursor.getColumnIndexOrThrow("strStadiumThumb");
      final int _cursorIndexOfStrTeam = _cursor.getColumnIndexOrThrow("team");
      final int _cursorIndexOfStrTeamBadge = _cursor.getColumnIndexOrThrow("strTeamBadge");
      final int _cursorIndexOfStrTeamBanner = _cursor.getColumnIndexOrThrow("teamBanner");
      final int _cursorIndexOfStrTeamFanart1 = _cursor.getColumnIndexOrThrow("strTeamFanart1");
      final int _cursorIndexOfStrTeamFanart2 = _cursor.getColumnIndexOrThrow("strTeamFanart2");
      final int _cursorIndexOfStrTeamFanart3 = _cursor.getColumnIndexOrThrow("strTeamFanart3");
      final int _cursorIndexOfStrTeamFanart4 = _cursor.getColumnIndexOrThrow("strTeamFanart4");
      final int _cursorIndexOfStrTeamJersey = _cursor.getColumnIndexOrThrow("strTeamJersey");
      final int _cursorIndexOfStrTeamLogo = _cursor.getColumnIndexOrThrow("teamLogo");
      final int _cursorIndexOfStrTeamShort = _cursor.getColumnIndexOrThrow("strTeamShort");
      final int _cursorIndexOfStrTwitter = _cursor.getColumnIndexOrThrow("strTwitter");
      final int _cursorIndexOfStrWebsite = _cursor.getColumnIndexOrThrow("website");
      final int _cursorIndexOfStrYoutube = _cursor.getColumnIndexOrThrow("strYoutube");
      final List<TeamResponse.Team> _result = new ArrayList<TeamResponse.Team>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TeamResponse.Team _item;
        final String _tmpIdLeague;
        _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
        final String _tmpIdSoccerXML;
        _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
        final Integer _tmpIdTeam;
        if (_cursor.isNull(_cursorIndexOfIdTeam)) {
          _tmpIdTeam = null;
        } else {
          _tmpIdTeam = _cursor.getInt(_cursorIndexOfIdTeam);
        }
        final String _tmpIntFormedYear;
        _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
        final String _tmpIntLoved;
        _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
        final String _tmpIntStadiumCapacity;
        _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
        final String _tmpStrAlternate;
        _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
        final String _tmpStrCountry;
        _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
        final String _tmpStrDescriptionCN;
        _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
        final String _tmpStrDescriptionDE;
        _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
        final String _tmpStrDescriptionEN;
        _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
        final String _tmpStrDescriptionES;
        _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
        final String _tmpStrDescriptionFR;
        _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
        final String _tmpStrDescriptionHU;
        _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
        final String _tmpStrDescriptionIL;
        _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
        final String _tmpStrDescriptionIT;
        _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
        final String _tmpStrDescriptionJP;
        _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
        final String _tmpStrDescriptionNL;
        _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
        final String _tmpStrDescriptionNO;
        _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
        final String _tmpStrDescriptionPL;
        _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
        final String _tmpStrDescriptionPT;
        _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
        final String _tmpStrDescriptionRU;
        _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
        final String _tmpStrDescriptionSE;
        _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
        final String _tmpStrDivision;
        _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
        final String _tmpStrFacebook;
        _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
        final String _tmpStrGender;
        _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
        final String _tmpStrInstagram;
        _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
        final String _tmpStrKeywords;
        _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
        final String _tmpStrLeague;
        _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
        final String _tmpStrLocked;
        _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
        final String _tmpStrManager;
        _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
        final String _tmpStrSport;
        _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
        final String _tmpStrStadium;
        _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
        final String _tmpStrStadiumDescription;
        _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
        final String _tmpStrStadiumLocation;
        _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
        final String _tmpStrStadiumThumb;
        _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
        final String _tmpStrTeam;
        _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
        final String _tmpStrTeamBadge;
        _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
        final String _tmpStrTeamBanner;
        _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
        final String _tmpStrTeamFanart1;
        _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
        final String _tmpStrTeamFanart2;
        _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
        final String _tmpStrTeamFanart3;
        _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
        final String _tmpStrTeamFanart4;
        _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
        final String _tmpStrTeamJersey;
        _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
        final String _tmpStrTeamLogo;
        _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
        final String _tmpStrTeamShort;
        _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
        final String _tmpStrTwitter;
        _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
        final String _tmpStrWebsite;
        _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
        final String _tmpStrYoutube;
        _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
        _item = new TeamResponse.Team(_tmpIdLeague,_tmpIdSoccerXML,_tmpIdTeam,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TeamResponse.Team> isFavorite(int id) {
    final String _sql = "SELECT * FROM team WHERE id_team=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfIdLeague = _cursor.getColumnIndexOrThrow("idLeague");
      final int _cursorIndexOfIdSoccerXML = _cursor.getColumnIndexOrThrow("idSoccerXML");
      final int _cursorIndexOfIdTeam = _cursor.getColumnIndexOrThrow("id_team");
      final int _cursorIndexOfIntFormedYear = _cursor.getColumnIndexOrThrow("intFormedYear");
      final int _cursorIndexOfIntLoved = _cursor.getColumnIndexOrThrow("intLoved");
      final int _cursorIndexOfIntStadiumCapacity = _cursor.getColumnIndexOrThrow("intStadiumCapacity");
      final int _cursorIndexOfStrAlternate = _cursor.getColumnIndexOrThrow("strAlternate");
      final int _cursorIndexOfStrCountry = _cursor.getColumnIndexOrThrow("country");
      final int _cursorIndexOfStrDescriptionCN = _cursor.getColumnIndexOrThrow("strDescriptionCN");
      final int _cursorIndexOfStrDescriptionDE = _cursor.getColumnIndexOrThrow("strDescriptionDE");
      final int _cursorIndexOfStrDescriptionEN = _cursor.getColumnIndexOrThrow("strDescriptionEN");
      final int _cursorIndexOfStrDescriptionES = _cursor.getColumnIndexOrThrow("strDescriptionES");
      final int _cursorIndexOfStrDescriptionFR = _cursor.getColumnIndexOrThrow("strDescriptionFR");
      final int _cursorIndexOfStrDescriptionHU = _cursor.getColumnIndexOrThrow("strDescriptionHU");
      final int _cursorIndexOfStrDescriptionIL = _cursor.getColumnIndexOrThrow("strDescriptionIL");
      final int _cursorIndexOfStrDescriptionIT = _cursor.getColumnIndexOrThrow("strDescriptionIT");
      final int _cursorIndexOfStrDescriptionJP = _cursor.getColumnIndexOrThrow("strDescriptionJP");
      final int _cursorIndexOfStrDescriptionNL = _cursor.getColumnIndexOrThrow("strDescriptionNL");
      final int _cursorIndexOfStrDescriptionNO = _cursor.getColumnIndexOrThrow("strDescriptionNO");
      final int _cursorIndexOfStrDescriptionPL = _cursor.getColumnIndexOrThrow("strDescriptionPL");
      final int _cursorIndexOfStrDescriptionPT = _cursor.getColumnIndexOrThrow("strDescriptionPT");
      final int _cursorIndexOfStrDescriptionRU = _cursor.getColumnIndexOrThrow("strDescriptionRU");
      final int _cursorIndexOfStrDescriptionSE = _cursor.getColumnIndexOrThrow("strDescriptionSE");
      final int _cursorIndexOfStrDivision = _cursor.getColumnIndexOrThrow("strDivision");
      final int _cursorIndexOfStrFacebook = _cursor.getColumnIndexOrThrow("strFacebook");
      final int _cursorIndexOfStrGender = _cursor.getColumnIndexOrThrow("strGender");
      final int _cursorIndexOfStrInstagram = _cursor.getColumnIndexOrThrow("strInstagram");
      final int _cursorIndexOfStrKeywords = _cursor.getColumnIndexOrThrow("strKeywords");
      final int _cursorIndexOfStrLeague = _cursor.getColumnIndexOrThrow("league");
      final int _cursorIndexOfStrLocked = _cursor.getColumnIndexOrThrow("strLocked");
      final int _cursorIndexOfStrManager = _cursor.getColumnIndexOrThrow("strManager");
      final int _cursorIndexOfStrSport = _cursor.getColumnIndexOrThrow("strSport");
      final int _cursorIndexOfStrStadium = _cursor.getColumnIndexOrThrow("strStadium");
      final int _cursorIndexOfStrStadiumDescription = _cursor.getColumnIndexOrThrow("stadiumDescription");
      final int _cursorIndexOfStrStadiumLocation = _cursor.getColumnIndexOrThrow("strStadiumLocation");
      final int _cursorIndexOfStrStadiumThumb = _cursor.getColumnIndexOrThrow("strStadiumThumb");
      final int _cursorIndexOfStrTeam = _cursor.getColumnIndexOrThrow("team");
      final int _cursorIndexOfStrTeamBadge = _cursor.getColumnIndexOrThrow("strTeamBadge");
      final int _cursorIndexOfStrTeamBanner = _cursor.getColumnIndexOrThrow("teamBanner");
      final int _cursorIndexOfStrTeamFanart1 = _cursor.getColumnIndexOrThrow("strTeamFanart1");
      final int _cursorIndexOfStrTeamFanart2 = _cursor.getColumnIndexOrThrow("strTeamFanart2");
      final int _cursorIndexOfStrTeamFanart3 = _cursor.getColumnIndexOrThrow("strTeamFanart3");
      final int _cursorIndexOfStrTeamFanart4 = _cursor.getColumnIndexOrThrow("strTeamFanart4");
      final int _cursorIndexOfStrTeamJersey = _cursor.getColumnIndexOrThrow("strTeamJersey");
      final int _cursorIndexOfStrTeamLogo = _cursor.getColumnIndexOrThrow("teamLogo");
      final int _cursorIndexOfStrTeamShort = _cursor.getColumnIndexOrThrow("strTeamShort");
      final int _cursorIndexOfStrTwitter = _cursor.getColumnIndexOrThrow("strTwitter");
      final int _cursorIndexOfStrWebsite = _cursor.getColumnIndexOrThrow("website");
      final int _cursorIndexOfStrYoutube = _cursor.getColumnIndexOrThrow("strYoutube");
      final List<TeamResponse.Team> _result = new ArrayList<TeamResponse.Team>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TeamResponse.Team _item;
        final String _tmpIdLeague;
        _tmpIdLeague = _cursor.getString(_cursorIndexOfIdLeague);
        final String _tmpIdSoccerXML;
        _tmpIdSoccerXML = _cursor.getString(_cursorIndexOfIdSoccerXML);
        final Integer _tmpIdTeam;
        if (_cursor.isNull(_cursorIndexOfIdTeam)) {
          _tmpIdTeam = null;
        } else {
          _tmpIdTeam = _cursor.getInt(_cursorIndexOfIdTeam);
        }
        final String _tmpIntFormedYear;
        _tmpIntFormedYear = _cursor.getString(_cursorIndexOfIntFormedYear);
        final String _tmpIntLoved;
        _tmpIntLoved = _cursor.getString(_cursorIndexOfIntLoved);
        final String _tmpIntStadiumCapacity;
        _tmpIntStadiumCapacity = _cursor.getString(_cursorIndexOfIntStadiumCapacity);
        final String _tmpStrAlternate;
        _tmpStrAlternate = _cursor.getString(_cursorIndexOfStrAlternate);
        final String _tmpStrCountry;
        _tmpStrCountry = _cursor.getString(_cursorIndexOfStrCountry);
        final String _tmpStrDescriptionCN;
        _tmpStrDescriptionCN = _cursor.getString(_cursorIndexOfStrDescriptionCN);
        final String _tmpStrDescriptionDE;
        _tmpStrDescriptionDE = _cursor.getString(_cursorIndexOfStrDescriptionDE);
        final String _tmpStrDescriptionEN;
        _tmpStrDescriptionEN = _cursor.getString(_cursorIndexOfStrDescriptionEN);
        final String _tmpStrDescriptionES;
        _tmpStrDescriptionES = _cursor.getString(_cursorIndexOfStrDescriptionES);
        final String _tmpStrDescriptionFR;
        _tmpStrDescriptionFR = _cursor.getString(_cursorIndexOfStrDescriptionFR);
        final String _tmpStrDescriptionHU;
        _tmpStrDescriptionHU = _cursor.getString(_cursorIndexOfStrDescriptionHU);
        final String _tmpStrDescriptionIL;
        _tmpStrDescriptionIL = _cursor.getString(_cursorIndexOfStrDescriptionIL);
        final String _tmpStrDescriptionIT;
        _tmpStrDescriptionIT = _cursor.getString(_cursorIndexOfStrDescriptionIT);
        final String _tmpStrDescriptionJP;
        _tmpStrDescriptionJP = _cursor.getString(_cursorIndexOfStrDescriptionJP);
        final String _tmpStrDescriptionNL;
        _tmpStrDescriptionNL = _cursor.getString(_cursorIndexOfStrDescriptionNL);
        final String _tmpStrDescriptionNO;
        _tmpStrDescriptionNO = _cursor.getString(_cursorIndexOfStrDescriptionNO);
        final String _tmpStrDescriptionPL;
        _tmpStrDescriptionPL = _cursor.getString(_cursorIndexOfStrDescriptionPL);
        final String _tmpStrDescriptionPT;
        _tmpStrDescriptionPT = _cursor.getString(_cursorIndexOfStrDescriptionPT);
        final String _tmpStrDescriptionRU;
        _tmpStrDescriptionRU = _cursor.getString(_cursorIndexOfStrDescriptionRU);
        final String _tmpStrDescriptionSE;
        _tmpStrDescriptionSE = _cursor.getString(_cursorIndexOfStrDescriptionSE);
        final String _tmpStrDivision;
        _tmpStrDivision = _cursor.getString(_cursorIndexOfStrDivision);
        final String _tmpStrFacebook;
        _tmpStrFacebook = _cursor.getString(_cursorIndexOfStrFacebook);
        final String _tmpStrGender;
        _tmpStrGender = _cursor.getString(_cursorIndexOfStrGender);
        final String _tmpStrInstagram;
        _tmpStrInstagram = _cursor.getString(_cursorIndexOfStrInstagram);
        final String _tmpStrKeywords;
        _tmpStrKeywords = _cursor.getString(_cursorIndexOfStrKeywords);
        final String _tmpStrLeague;
        _tmpStrLeague = _cursor.getString(_cursorIndexOfStrLeague);
        final String _tmpStrLocked;
        _tmpStrLocked = _cursor.getString(_cursorIndexOfStrLocked);
        final String _tmpStrManager;
        _tmpStrManager = _cursor.getString(_cursorIndexOfStrManager);
        final String _tmpStrSport;
        _tmpStrSport = _cursor.getString(_cursorIndexOfStrSport);
        final String _tmpStrStadium;
        _tmpStrStadium = _cursor.getString(_cursorIndexOfStrStadium);
        final String _tmpStrStadiumDescription;
        _tmpStrStadiumDescription = _cursor.getString(_cursorIndexOfStrStadiumDescription);
        final String _tmpStrStadiumLocation;
        _tmpStrStadiumLocation = _cursor.getString(_cursorIndexOfStrStadiumLocation);
        final String _tmpStrStadiumThumb;
        _tmpStrStadiumThumb = _cursor.getString(_cursorIndexOfStrStadiumThumb);
        final String _tmpStrTeam;
        _tmpStrTeam = _cursor.getString(_cursorIndexOfStrTeam);
        final String _tmpStrTeamBadge;
        _tmpStrTeamBadge = _cursor.getString(_cursorIndexOfStrTeamBadge);
        final String _tmpStrTeamBanner;
        _tmpStrTeamBanner = _cursor.getString(_cursorIndexOfStrTeamBanner);
        final String _tmpStrTeamFanart1;
        _tmpStrTeamFanart1 = _cursor.getString(_cursorIndexOfStrTeamFanart1);
        final String _tmpStrTeamFanart2;
        _tmpStrTeamFanart2 = _cursor.getString(_cursorIndexOfStrTeamFanart2);
        final String _tmpStrTeamFanart3;
        _tmpStrTeamFanart3 = _cursor.getString(_cursorIndexOfStrTeamFanart3);
        final String _tmpStrTeamFanart4;
        _tmpStrTeamFanart4 = _cursor.getString(_cursorIndexOfStrTeamFanart4);
        final String _tmpStrTeamJersey;
        _tmpStrTeamJersey = _cursor.getString(_cursorIndexOfStrTeamJersey);
        final String _tmpStrTeamLogo;
        _tmpStrTeamLogo = _cursor.getString(_cursorIndexOfStrTeamLogo);
        final String _tmpStrTeamShort;
        _tmpStrTeamShort = _cursor.getString(_cursorIndexOfStrTeamShort);
        final String _tmpStrTwitter;
        _tmpStrTwitter = _cursor.getString(_cursorIndexOfStrTwitter);
        final String _tmpStrWebsite;
        _tmpStrWebsite = _cursor.getString(_cursorIndexOfStrWebsite);
        final String _tmpStrYoutube;
        _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
        _item = new TeamResponse.Team(_tmpIdLeague,_tmpIdSoccerXML,_tmpIdTeam,_tmpIntFormedYear,_tmpIntLoved,_tmpIntStadiumCapacity,_tmpStrAlternate,_tmpStrCountry,_tmpStrDescriptionCN,_tmpStrDescriptionDE,_tmpStrDescriptionEN,_tmpStrDescriptionES,_tmpStrDescriptionFR,_tmpStrDescriptionHU,_tmpStrDescriptionIL,_tmpStrDescriptionIT,_tmpStrDescriptionJP,_tmpStrDescriptionNL,_tmpStrDescriptionNO,_tmpStrDescriptionPL,_tmpStrDescriptionPT,_tmpStrDescriptionRU,_tmpStrDescriptionSE,_tmpStrDivision,_tmpStrFacebook,_tmpStrGender,_tmpStrInstagram,_tmpStrKeywords,_tmpStrLeague,_tmpStrLocked,_tmpStrManager,_tmpStrSport,_tmpStrStadium,_tmpStrStadiumDescription,_tmpStrStadiumLocation,_tmpStrStadiumThumb,_tmpStrTeam,_tmpStrTeamBadge,_tmpStrTeamBanner,_tmpStrTeamFanart1,_tmpStrTeamFanart2,_tmpStrTeamFanart3,_tmpStrTeamFanart4,_tmpStrTeamJersey,_tmpStrTeamLogo,_tmpStrTeamShort,_tmpStrTwitter,_tmpStrWebsite,_tmpStrYoutube);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
