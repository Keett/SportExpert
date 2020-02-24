package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class insertveriler_subs_0 {


public static RemoteObject  _aytablosunudoldur(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("AyTablosunuDoldur (insertveriler) ","insertveriler",32,_ba,insertveriler.mostCurrent,59);
if (RapidSub.canDelegate("aytablosunudoldur")) { return b4a.example3.insertveriler.remoteMe.runUserSub(false, "insertveriler","aytablosunudoldur", _ba);}
RemoteObject _aylistesi = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _diziay = null;
int _i = 0;
RemoteObject _veri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 59;BA.debugLine="Sub AyTablosunuDoldur";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim ayListesi As List";
Debug.ShouldStop(134217728);
_aylistesi = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ayListesi", _aylistesi);
 BA.debugLineNum = 61;BA.debugLine="ayListesi.Initialize";
Debug.ShouldStop(268435456);
_aylistesi.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="Dim diziAy() As String";
Debug.ShouldStop(536870912);
_diziay = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("diziAy", _diziay);
 BA.debugLineNum = 63;BA.debugLine="diziAy = Array As String(\"Ocak\",\"Şubat\",\"Mart\",\"N";
Debug.ShouldStop(1073741824);
_diziay = RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Ocak"),BA.ObjectToString("Şubat"),BA.ObjectToString("Mart"),BA.ObjectToString("Nisan"),BA.ObjectToString("Mayıs"),BA.ObjectToString("Haziran"),BA.ObjectToString("Temmuz"),BA.ObjectToString("Ağustos"),BA.ObjectToString("Eylül"),BA.ObjectToString("Ekim"),BA.ObjectToString("Kasım"),RemoteObject.createImmutable("Aralık")});Debug.locals.put("diziAy", _diziay);
 BA.debugLineNum = 65;BA.debugLine="For i = 1 To diziAy.Length";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = _diziay.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="Dim veri As Map = CreateMap(\"ay_id\": i, \"ay\" : d";
Debug.ShouldStop(2);
_veri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veri = insertveriler.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ay_id")),RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("ay")),(_diziay.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))}));Debug.locals.put("veri", _veri);Debug.locals.put("veri", _veri);
 BA.debugLineNum = 67;BA.debugLine="ayListesi.Add(veri)";
Debug.ShouldStop(4);
_aylistesi.runVoidMethod ("Add",(Object)((_veri.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 69;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Ay\" , ayListesi)";
Debug.ShouldStop(16);
insertveriler.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(insertveriler.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Ay")),(Object)(_aylistesi));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cinsiyettablosunudoldur(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CinsiyetTablosunuDoldur (insertveriler) ","insertveriler",32,_ba,insertveriler.mostCurrent,30);
if (RapidSub.canDelegate("cinsiyettablosunudoldur")) { return b4a.example3.insertveriler.remoteMe.runUserSub(false, "insertveriler","cinsiyettablosunudoldur", _ba);}
RemoteObject _cinsiyetlistesi = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dizicinsiyet = null;
int _i = 0;
RemoteObject _veri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 30;BA.debugLine="Sub CinsiyetTablosunuDoldur";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Dim cinsiyetListesi As List";
Debug.ShouldStop(1073741824);
_cinsiyetlistesi = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cinsiyetListesi", _cinsiyetlistesi);
 BA.debugLineNum = 32;BA.debugLine="cinsiyetListesi.Initialize";
Debug.ShouldStop(-2147483648);
_cinsiyetlistesi.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="Dim diziCinsiyet() As String";
Debug.ShouldStop(1);
_dizicinsiyet = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("diziCinsiyet", _dizicinsiyet);
 BA.debugLineNum = 34;BA.debugLine="diziCinsiyet = Array As String(\"\",\"KADIN\",\"ERKEK\"";
Debug.ShouldStop(2);
_dizicinsiyet = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString(""),BA.ObjectToString("KADIN"),RemoteObject.createImmutable("ERKEK")});Debug.locals.put("diziCinsiyet", _dizicinsiyet);
 BA.debugLineNum = 36;BA.debugLine="For i=1 To diziCinsiyet.Length";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = _dizicinsiyet.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="Dim Veri As Map = CreateMap(\"cinsiyet_id\": i, \"c";
Debug.ShouldStop(32);
_veri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veri = insertveriler.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("cinsiyet_id")),RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("cinsiyet_adi")),(_dizicinsiyet.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))}));Debug.locals.put("Veri", _veri);Debug.locals.put("Veri", _veri);
 BA.debugLineNum = 39;BA.debugLine="cinsiyetListesi.Add(Veri)";
Debug.ShouldStop(64);
_cinsiyetlistesi.runVoidMethod ("Add",(Object)((_veri.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Cinsiyet\", cinsiyet";
Debug.ShouldStop(512);
insertveriler.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(insertveriler.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Cinsiyet")),(Object)(_cinsiyetlistesi));
 BA.debugLineNum = 43;BA.debugLine="Log(\"cinsiyet TABLOSUNA INSERT İŞLEMİ\")";
Debug.ShouldStop(1024);
insertveriler.mostCurrent.__c.runVoidMethod ("LogImpl","238404109",RemoteObject.createImmutable("cinsiyet TABLOSUNA INSERT İŞLEMİ"),0);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _guntablosunudoldur(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GunTablosunuDoldur (insertveriler) ","insertveriler",32,_ba,insertveriler.mostCurrent,46);
if (RapidSub.canDelegate("guntablosunudoldur")) { return b4a.example3.insertveriler.remoteMe.runUserSub(false, "insertveriler","guntablosunudoldur", _ba);}
RemoteObject _gunlistesi = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dizigun = null;
int _i = 0;
RemoteObject _veri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 46;BA.debugLine="Sub GunTablosunuDoldur";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim gunListesi As List";
Debug.ShouldStop(16384);
_gunlistesi = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("gunListesi", _gunlistesi);
 BA.debugLineNum = 48;BA.debugLine="gunListesi.Initialize";
Debug.ShouldStop(32768);
_gunlistesi.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="Dim diziGun() As Int";
Debug.ShouldStop(65536);
_dizigun = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("diziGun", _dizigun);
 BA.debugLineNum = 50;BA.debugLine="diziGun = Array As Int(1,2,3,4,5,6,7,8,9,10,11,12";
Debug.ShouldStop(131072);
_dizigun = RemoteObject.createNewArray("int",new int[] {31},new Object[] {BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12),BA.numberCast(int.class, 13),BA.numberCast(int.class, 14),BA.numberCast(int.class, 15),BA.numberCast(int.class, 16),BA.numberCast(int.class, 17),BA.numberCast(int.class, 18),BA.numberCast(int.class, 19),BA.numberCast(int.class, 20),BA.numberCast(int.class, 21),BA.numberCast(int.class, 22),BA.numberCast(int.class, 23),BA.numberCast(int.class, 24),BA.numberCast(int.class, 25),BA.numberCast(int.class, 26),BA.numberCast(int.class, 27),BA.numberCast(int.class, 28),BA.numberCast(int.class, 29),BA.numberCast(int.class, 30),BA.numberCast(int.class, 31)});Debug.locals.put("diziGun", _dizigun);
 BA.debugLineNum = 52;BA.debugLine="For i = 1 To diziGun.Length";
Debug.ShouldStop(524288);
{
final int step5 = 1;
final int limit5 = _dizigun.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 53;BA.debugLine="Dim Veri As Map = CreateMap(\"gun_id\": i, \"gun\" :";
Debug.ShouldStop(1048576);
_veri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veri = insertveriler.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("gun_id")),RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("gun")),(_dizigun.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))}));Debug.locals.put("Veri", _veri);Debug.locals.put("Veri", _veri);
 BA.debugLineNum = 54;BA.debugLine="gunListesi.Add(Veri)";
Debug.ShouldStop(2097152);
_gunlistesi.runVoidMethod ("Add",(Object)((_veri.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 56;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Gun\" , gunListesi)";
Debug.ShouldStop(8388608);
insertveriler.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(insertveriler.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Gun")),(Object)(_gunlistesi));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sehirlertablosunudoldur(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("SehirlerTablosunuDoldur (insertveriler) ","insertveriler",32,_ba,insertveriler.mostCurrent,9);
if (RapidSub.canDelegate("sehirlertablosunudoldur")) { return b4a.example3.insertveriler.remoteMe.runUserSub(false, "insertveriler","sehirlertablosunudoldur", _ba);}
RemoteObject _sehirlistesi = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dizi = null;
int _i = 0;
RemoteObject _veri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 9;BA.debugLine="Sub SehirlerTablosunuDoldur";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="Dim SehirListesi As List";
Debug.ShouldStop(1024);
_sehirlistesi = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("SehirListesi", _sehirlistesi);
 BA.debugLineNum = 12;BA.debugLine="SehirListesi.Initialize";
Debug.ShouldStop(2048);
_sehirlistesi.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="Dim dizi() As String";
Debug.ShouldStop(4096);
_dizi = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("dizi", _dizi);
 BA.debugLineNum = 14;BA.debugLine="dizi=Array As String(\"\",\"ADANA\",\"ADIYAMAN\",\"AFYON";
Debug.ShouldStop(8192);
_dizi = RemoteObject.createNewArray("String",new int[] {82},new Object[] {BA.ObjectToString(""),BA.ObjectToString("ADANA"),BA.ObjectToString("ADIYAMAN"),BA.ObjectToString("AFYON"),BA.ObjectToString("AĞRI"),BA.ObjectToString("AMASYA"),BA.ObjectToString("ANKARA"),BA.ObjectToString("ANTALYA"),BA.ObjectToString("ARTVİN"),BA.ObjectToString("AYDIN"),BA.ObjectToString("BALIKESİR"),BA.ObjectToString("BİLECİK"),BA.ObjectToString("BİNGÖL"),BA.ObjectToString("BİTLİS"),BA.ObjectToString("BOLU"),BA.ObjectToString("BURDUR"),BA.ObjectToString("BURSA"),BA.ObjectToString("ÇANAKKALE"),BA.ObjectToString("ÇANKIRI"),BA.ObjectToString("ÇORUM"),BA.ObjectToString("DENİZLİ"),BA.ObjectToString("DİYARBAKIR"),BA.ObjectToString("EDİRNE"),BA.ObjectToString("ELAZIĞ"),BA.ObjectToString("ERZİNCAN"),BA.ObjectToString("ERZURUM"),BA.ObjectToString("ESKİŞEHİR"),BA.ObjectToString("GAZİANTEP"),BA.ObjectToString("GİRESUN"),BA.ObjectToString("GÜMÜŞHANE"),BA.ObjectToString("HAKKARİ"),BA.ObjectToString("HATAY"),BA.ObjectToString("ISPARTA"),BA.ObjectToString("İÇEL(MERSİN)"),BA.ObjectToString("İSTANBUL"),BA.ObjectToString("İZMİR"),BA.ObjectToString("KARS"),BA.ObjectToString("KASTAMONU"),BA.ObjectToString("KAYSERİ"),BA.ObjectToString("KIRKLARELİ"),BA.ObjectToString("KIRŞEHİR"),BA.ObjectToString("KOCAELİ"),BA.ObjectToString("KONYA"),BA.ObjectToString("KÜTAHYA"),BA.ObjectToString("MALATYA"),BA.ObjectToString("MANİSA"),BA.ObjectToString("KAHRAMANMARAŞ"),BA.ObjectToString("MARDİN"),BA.ObjectToString("MUĞLA"),BA.ObjectToString("MUŞ"),BA.ObjectToString("NEVŞEHİR"),BA.ObjectToString("NİĞDE"),BA.ObjectToString("ORDU"),BA.ObjectToString("RİZE"),BA.ObjectToString("SAKARYA"),BA.ObjectToString("SAMSUN"),BA.ObjectToString("SİİRT"),BA.ObjectToString("SİNOP"),BA.ObjectToString("SİVAS"),BA.ObjectToString("TEKİRDAĞ"),BA.ObjectToString("TOKAT"),BA.ObjectToString("TRABZON"),BA.ObjectToString("TUNCELİ"),BA.ObjectToString("ŞANLIURFA"),BA.ObjectToString("UŞAK"),BA.ObjectToString("VAN"),BA.ObjectToString("YOZGAT"),BA.ObjectToString("ZONGULDAK"),BA.ObjectToString("AKSARAY"),BA.ObjectToString("BAYBURT"),BA.ObjectToString("KARAMAN"),BA.ObjectToString("KIRIKKALE"),BA.ObjectToString("BATMAN"),BA.ObjectToString("ŞIRNAK"),BA.ObjectToString("BARTIN"),BA.ObjectToString("ARDAHAN"),BA.ObjectToString("IĞDIR"),BA.ObjectToString("YALOVA"),BA.ObjectToString("KARABÜK"),BA.ObjectToString("KİLİS"),BA.ObjectToString("OSMANİYE"),RemoteObject.createImmutable("DÜZCE")});Debug.locals.put("dizi", _dizi);
 BA.debugLineNum = 16;BA.debugLine="For i=1 To dizi.Length";
Debug.ShouldStop(32768);
{
final int step5 = 1;
final int limit5 = _dizi.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 18;BA.debugLine="Dim Veri As Map = CreateMap(\"il_id\": i, \"il_adi\"";
Debug.ShouldStop(131072);
_veri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veri = insertveriler.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("il_id")),RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("il_adi")),(_dizi.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))}));Debug.locals.put("Veri", _veri);Debug.locals.put("Veri", _veri);
 BA.debugLineNum = 19;BA.debugLine="SehirListesi.Add(Veri)";
Debug.ShouldStop(262144);
_sehirlistesi.runVoidMethod ("Add",(Object)((_veri.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 25;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Iller\", SehirListes";
Debug.ShouldStop(16777216);
insertveriler.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(insertveriler.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Iller")),(Object)(_sehirlistesi));
 BA.debugLineNum = 26;BA.debugLine="Log(\"Iller TABLOSUNA INSERT İŞLEMİ\")";
Debug.ShouldStop(33554432);
insertveriler.mostCurrent.__c.runVoidMethod ("LogImpl","238338577",RemoteObject.createImmutable("Iller TABLOSUNA INSERT İŞLEMİ"),0);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _yiltablosunudoldur(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("YilTablosunuDoldur (insertveriler) ","insertveriler",32,_ba,insertveriler.mostCurrent,72);
if (RapidSub.canDelegate("yiltablosunudoldur")) { return b4a.example3.insertveriler.remoteMe.runUserSub(false, "insertveriler","yiltablosunudoldur", _ba);}
RemoteObject _yillistesi = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _diziyil = null;
int _i = 0;
RemoteObject _veri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 72;BA.debugLine="Sub YilTablosunuDoldur";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim yilListesi As List";
Debug.ShouldStop(256);
_yillistesi = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("yilListesi", _yillistesi);
 BA.debugLineNum = 74;BA.debugLine="yilListesi.Initialize";
Debug.ShouldStop(512);
_yillistesi.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="Dim diziYil() As Int";
Debug.ShouldStop(1024);
_diziyil = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("diziYil", _diziyil);
 BA.debugLineNum = 76;BA.debugLine="diziYil = Array As Int(1950,1951,1952,1953,1954,1";
Debug.ShouldStop(2048);
_diziyil = RemoteObject.createNewArray("int",new int[] {80},new Object[] {BA.numberCast(int.class, 1950),BA.numberCast(int.class, 1951),BA.numberCast(int.class, 1952),BA.numberCast(int.class, 1953),BA.numberCast(int.class, 1954),BA.numberCast(int.class, 1955),BA.numberCast(int.class, 1956),BA.numberCast(int.class, 1957),BA.numberCast(int.class, 1958),BA.numberCast(int.class, 1959),BA.numberCast(int.class, 1960),BA.numberCast(int.class, 1961),BA.numberCast(int.class, 1962),BA.numberCast(int.class, 1963),BA.numberCast(int.class, 1964),BA.numberCast(int.class, 1965),BA.numberCast(int.class, 1966),BA.numberCast(int.class, 1967),BA.numberCast(int.class, 1968),BA.numberCast(int.class, 1969),BA.numberCast(int.class, 1970),BA.numberCast(int.class, 1971),BA.numberCast(int.class, 1972),BA.numberCast(int.class, 1973),BA.numberCast(int.class, 1974),BA.numberCast(int.class, 1975),BA.numberCast(int.class, 1976),BA.numberCast(int.class, 1977),BA.numberCast(int.class, 1978),BA.numberCast(int.class, 1979),BA.numberCast(int.class, 1980),BA.numberCast(int.class, 1981),BA.numberCast(int.class, 1982),BA.numberCast(int.class, 1983),BA.numberCast(int.class, 1984),BA.numberCast(int.class, 1985),BA.numberCast(int.class, 1986),BA.numberCast(int.class, 1987),BA.numberCast(int.class, 1988),BA.numberCast(int.class, 1989),BA.numberCast(int.class, 1990),BA.numberCast(int.class, 1991),BA.numberCast(int.class, 1992),BA.numberCast(int.class, 1993),BA.numberCast(int.class, 1994),BA.numberCast(int.class, 1995),BA.numberCast(int.class, 1996),BA.numberCast(int.class, 1997),BA.numberCast(int.class, 1998),BA.numberCast(int.class, 1999),BA.numberCast(int.class, 2000),BA.numberCast(int.class, 2001),BA.numberCast(int.class, 2002),BA.numberCast(int.class, 2003),BA.numberCast(int.class, 2004),BA.numberCast(int.class, 2005),BA.numberCast(int.class, 2006),BA.numberCast(int.class, 2007),BA.numberCast(int.class, 2008),BA.numberCast(int.class, 2009),BA.numberCast(int.class, 2010),BA.numberCast(int.class, 2011),BA.numberCast(int.class, 2012),BA.numberCast(int.class, 2013),BA.numberCast(int.class, 2014),BA.numberCast(int.class, 2015),BA.numberCast(int.class, 2016),BA.numberCast(int.class, 2017),BA.numberCast(int.class, 2018),BA.numberCast(int.class, 2019),BA.numberCast(int.class, 2020),BA.numberCast(int.class, 2021),BA.numberCast(int.class, 2022),BA.numberCast(int.class, 2023),BA.numberCast(int.class, 2024),BA.numberCast(int.class, 2025),BA.numberCast(int.class, 2026),BA.numberCast(int.class, 2027),BA.numberCast(int.class, 2028),BA.numberCast(int.class, 2029)});Debug.locals.put("diziYil", _diziyil);
 BA.debugLineNum = 78;BA.debugLine="For i = 1 To diziYil.Length";
Debug.ShouldStop(8192);
{
final int step5 = 1;
final int limit5 = _diziyil.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="Dim veri As Map = CreateMap(\"yil_id\": i, \"yil\" :";
Debug.ShouldStop(16384);
_veri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veri = insertveriler.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("yil_id")),RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("yil")),(_diziyil.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))}));Debug.locals.put("veri", _veri);Debug.locals.put("veri", _veri);
 BA.debugLineNum = 80;BA.debugLine="yilListesi.Add(veri)";
Debug.ShouldStop(32768);
_yillistesi.runVoidMethod ("Add",(Object)((_veri.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 82;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Yil\" , yilListesi)";
Debug.ShouldStop(131072);
insertveriler.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(insertveriler.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Yil")),(Object)(_yillistesi));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}