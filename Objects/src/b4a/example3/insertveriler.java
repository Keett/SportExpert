package b4a.example3;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class insertveriler {
private static insertveriler mostCurrent = new insertveriler();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
public b4a.example3.gelismistestdenekara _gelismistestdenekara = null;
public b4a.example3.programayar _programayar = null;
public b4a.example3.surattestlistele _surattestlistele = null;
public b4a.example3.deneklistele _deneklistele = null;
public b4a.example3.dbutils _dbutils = null;
public b4a.example3.antranorgorusekle _antranorgorusekle = null;
public b4a.example3.programveri _programveri = null;
public b4a.example3.testdenekara _testdenekara = null;
public b4a.example3.denekekleguncelle _denekekleguncelle = null;
public b4a.example3.dayanikliliktestmenu _dayanikliliktestmenu = null;
public b4a.example3.programlistele _programlistele = null;
public b4a.example3.programsil _programsil = null;
public b4a.example3.surattestayar _surattestayar = null;
public b4a.example3.surattestekle _surattestekle = null;
public b4a.example3.surattestsil _surattestsil = null;
public b4a.example3.sesservice _sesservice = null;
public b4a.example3.denekduzenlesil _denekduzenlesil = null;
public b4a.example3.antropometriklistele _antropometriklistele = null;
public b4a.example3.saglikbilgilerisil _saglikbilgilerisil = null;
public b4a.example3.testmenu _testmenu = null;
public b4a.example3.motorozellikmenu _motorozellikmenu = null;
public b4a.example3.saglikbilgilerilistele _saglikbilgilerilistele = null;
public b4a.example3.biyokimyasalekle _biyokimyasalekle = null;
public b4a.example3.antropometrikekle _antropometrikekle = null;
public b4a.example3.color _color = null;
public b4a.example3.anamenu _anamenu = null;
public b4a.example3.biyokimyasallistele _biyokimyasallistele = null;
public b4a.example3.biyokimyasalsil _biyokimyasalsil = null;
public b4a.example3.psikolojiksil _psikolojiksil = null;
public b4a.example3.psikolojiklistele _psikolojiklistele = null;
public b4a.example3.antropometriksil _antropometriksil = null;
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _sehirlertablosunudoldur(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="insertveriler";
if (Debug.shouldDelegate(null, "sehirlertablosunudoldur", false))
	 {return ((String) Debug.delegate(null, "sehirlertablosunudoldur", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _sehirlistesi = null;
String[] _dizi = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _veri = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Sub SehirlerTablosunuDoldur";
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="Dim SehirListesi As List";
_sehirlistesi = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="SehirListesi.Initialize";
_sehirlistesi.Initialize();
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="Dim dizi() As String";
_dizi = new String[(int) (0)];
java.util.Arrays.fill(_dizi,"");
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="dizi=Array As String(\"\",\"ADANA\",\"ADIYAMAN\",\"AFYON";
_dizi = new String[]{"","ADANA","ADIYAMAN","AFYON","AĞRI","AMASYA","ANKARA","ANTALYA","ARTVİN","AYDIN","BALIKESİR","BİLECİK","BİNGÖL","BİTLİS","BOLU","BURDUR","BURSA","ÇANAKKALE","ÇANKIRI","ÇORUM","DENİZLİ","DİYARBAKIR","EDİRNE","ELAZIĞ","ERZİNCAN","ERZURUM","ESKİŞEHİR","GAZİANTEP","GİRESUN","GÜMÜŞHANE","HAKKARİ","HATAY","ISPARTA","İÇEL(MERSİN)","İSTANBUL","İZMİR","KARS","KASTAMONU","KAYSERİ","KIRKLARELİ","KIRŞEHİR","KOCAELİ","KONYA","KÜTAHYA","MALATYA","MANİSA","KAHRAMANMARAŞ","MARDİN","MUĞLA","MUŞ","NEVŞEHİR","NİĞDE","ORDU","RİZE","SAKARYA","SAMSUN","SİİRT","SİNOP","SİVAS","TEKİRDAĞ","TOKAT","TRABZON","TUNCELİ","ŞANLIURFA","UŞAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","ŞIRNAK","BARTIN","ARDAHAN","IĞDIR","YALOVA","KARABÜK","KİLİS","OSMANİYE","DÜZCE"};
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="For i=1 To dizi.Length";
{
final int step5 = 1;
final int limit5 = _dizi.length;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="Dim Veri As Map = CreateMap(\"il_id\": i, \"il_adi\"";
_veri = new anywheresoftware.b4a.objects.collections.Map();
_veri = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("il_id"),(Object)(_i),(Object)("il_adi"),(Object)(_dizi[(int) (_i-1)])});
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="SehirListesi.Add(Veri)";
_sehirlistesi.Add((Object)(_veri.getObject()));
 }
};
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Iller\", SehirListes";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"Iller",_sehirlistesi);
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="Log(\"Iller TABLOSUNA INSERT İŞLEMİ\")";
anywheresoftware.b4a.keywords.Common.LogImpl("238338577","Iller TABLOSUNA INSERT İŞLEMİ",0);
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="End Sub";
return "";
}
public static String  _cinsiyettablosunudoldur(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="insertveriler";
if (Debug.shouldDelegate(null, "cinsiyettablosunudoldur", false))
	 {return ((String) Debug.delegate(null, "cinsiyettablosunudoldur", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _cinsiyetlistesi = null;
String[] _dizicinsiyet = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _veri = null;
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Sub CinsiyetTablosunuDoldur";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="Dim cinsiyetListesi As List";
_cinsiyetlistesi = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="cinsiyetListesi.Initialize";
_cinsiyetlistesi.Initialize();
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Dim diziCinsiyet() As String";
_dizicinsiyet = new String[(int) (0)];
java.util.Arrays.fill(_dizicinsiyet,"");
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="diziCinsiyet = Array As String(\"\",\"KADIN\",\"ERKEK\"";
_dizicinsiyet = new String[]{"","KADIN","ERKEK"};
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="For i=1 To diziCinsiyet.Length";
{
final int step5 = 1;
final int limit5 = _dizicinsiyet.length;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="Dim Veri As Map = CreateMap(\"cinsiyet_id\": i, \"c";
_veri = new anywheresoftware.b4a.objects.collections.Map();
_veri = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("cinsiyet_id"),(Object)(_i),(Object)("cinsiyet_adi"),(Object)(_dizicinsiyet[(int) (_i-1)])});
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="cinsiyetListesi.Add(Veri)";
_cinsiyetlistesi.Add((Object)(_veri.getObject()));
 }
};
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Cinsiyet\", cinsiyet";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"Cinsiyet",_cinsiyetlistesi);
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="Log(\"cinsiyet TABLOSUNA INSERT İŞLEMİ\")";
anywheresoftware.b4a.keywords.Common.LogImpl("238404109","cinsiyet TABLOSUNA INSERT İŞLEMİ",0);
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="End Sub";
return "";
}
public static String  _guntablosunudoldur(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="insertveriler";
if (Debug.shouldDelegate(null, "guntablosunudoldur", false))
	 {return ((String) Debug.delegate(null, "guntablosunudoldur", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _gunlistesi = null;
int[] _dizigun = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _veri = null;
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Sub GunTablosunuDoldur";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Dim gunListesi As List";
_gunlistesi = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="gunListesi.Initialize";
_gunlistesi.Initialize();
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="Dim diziGun() As Int";
_dizigun = new int[(int) (0)];
;
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="diziGun = Array As Int(1,2,3,4,5,6,7,8,9,10,11,12";
_dizigun = new int[]{(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12),(int) (13),(int) (14),(int) (15),(int) (16),(int) (17),(int) (18),(int) (19),(int) (20),(int) (21),(int) (22),(int) (23),(int) (24),(int) (25),(int) (26),(int) (27),(int) (28),(int) (29),(int) (30),(int) (31)};
RDebugUtils.currentLine=38469638;
 //BA.debugLineNum = 38469638;BA.debugLine="For i = 1 To diziGun.Length";
{
final int step5 = 1;
final int limit5 = _dizigun.length;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=38469639;
 //BA.debugLineNum = 38469639;BA.debugLine="Dim Veri As Map = CreateMap(\"gun_id\": i, \"gun\" :";
_veri = new anywheresoftware.b4a.objects.collections.Map();
_veri = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("gun_id"),(Object)(_i),(Object)("gun"),(Object)(_dizigun[(int) (_i-1)])});
RDebugUtils.currentLine=38469640;
 //BA.debugLineNum = 38469640;BA.debugLine="gunListesi.Add(Veri)";
_gunlistesi.Add((Object)(_veri.getObject()));
 }
};
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Gun\" , gunListesi)";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"Gun",_gunlistesi);
RDebugUtils.currentLine=38469643;
 //BA.debugLineNum = 38469643;BA.debugLine="End Sub";
return "";
}
public static String  _aytablosunudoldur(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="insertveriler";
if (Debug.shouldDelegate(null, "aytablosunudoldur", false))
	 {return ((String) Debug.delegate(null, "aytablosunudoldur", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _aylistesi = null;
String[] _diziay = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _veri = null;
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Sub AyTablosunuDoldur";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Dim ayListesi As List";
_aylistesi = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="ayListesi.Initialize";
_aylistesi.Initialize();
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="Dim diziAy() As String";
_diziay = new String[(int) (0)];
java.util.Arrays.fill(_diziay,"");
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="diziAy = Array As String(\"Ocak\",\"Şubat\",\"Mart\",\"N";
_diziay = new String[]{"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="For i = 1 To diziAy.Length";
{
final int step5 = 1;
final int limit5 = _diziay.length;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="Dim veri As Map = CreateMap(\"ay_id\": i, \"ay\" : d";
_veri = new anywheresoftware.b4a.objects.collections.Map();
_veri = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("ay_id"),(Object)(_i),(Object)("ay"),(Object)(_diziay[(int) (_i-1)])});
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="ayListesi.Add(veri)";
_aylistesi.Add((Object)(_veri.getObject()));
 }
};
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Ay\" , ayListesi)";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"Ay",_aylistesi);
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="End Sub";
return "";
}
public static String  _yiltablosunudoldur(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="insertveriler";
if (Debug.shouldDelegate(null, "yiltablosunudoldur", false))
	 {return ((String) Debug.delegate(null, "yiltablosunudoldur", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _yillistesi = null;
int[] _diziyil = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _veri = null;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Sub YilTablosunuDoldur";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Dim yilListesi As List";
_yillistesi = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="yilListesi.Initialize";
_yillistesi.Initialize();
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="Dim diziYil() As Int";
_diziyil = new int[(int) (0)];
;
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="diziYil = Array As Int(1950,1951,1952,1953,1954,1";
_diziyil = new int[]{(int) (1950),(int) (1951),(int) (1952),(int) (1953),(int) (1954),(int) (1955),(int) (1956),(int) (1957),(int) (1958),(int) (1959),(int) (1960),(int) (1961),(int) (1962),(int) (1963),(int) (1964),(int) (1965),(int) (1966),(int) (1967),(int) (1968),(int) (1969),(int) (1970),(int) (1971),(int) (1972),(int) (1973),(int) (1974),(int) (1975),(int) (1976),(int) (1977),(int) (1978),(int) (1979),(int) (1980),(int) (1981),(int) (1982),(int) (1983),(int) (1984),(int) (1985),(int) (1986),(int) (1987),(int) (1988),(int) (1989),(int) (1990),(int) (1991),(int) (1992),(int) (1993),(int) (1994),(int) (1995),(int) (1996),(int) (1997),(int) (1998),(int) (1999),(int) (2000),(int) (2001),(int) (2002),(int) (2003),(int) (2004),(int) (2005),(int) (2006),(int) (2007),(int) (2008),(int) (2009),(int) (2010),(int) (2011),(int) (2012),(int) (2013),(int) (2014),(int) (2015),(int) (2016),(int) (2017),(int) (2018),(int) (2019),(int) (2020),(int) (2021),(int) (2022),(int) (2023),(int) (2024),(int) (2025),(int) (2026),(int) (2027),(int) (2028),(int) (2029)};
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="For i = 1 To diziYil.Length";
{
final int step5 = 1;
final int limit5 = _diziyil.length;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="Dim veri As Map = CreateMap(\"yil_id\": i, \"yil\" :";
_veri = new anywheresoftware.b4a.objects.collections.Map();
_veri = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("yil_id"),(Object)(_i),(Object)("yil"),(Object)(_diziyil[(int) (_i-1)])});
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="yilListesi.Add(veri)";
_yillistesi.Add((Object)(_veri.getObject()));
 }
};
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="DBUtils.InsertMaps(Main.sql, \"Yil\" , yilListesi)";
mostCurrent._dbutils._insertmaps /*String*/ (_ba,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"Yil",_yillistesi);
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="End Sub";
return "";
}
}