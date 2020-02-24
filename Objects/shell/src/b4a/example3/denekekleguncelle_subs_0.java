package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class denekekleguncelle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,70);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","activity_create", _firsttime);}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="Activity.LoadLayout(\"DenekEklePage\")";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DenekEklePage")),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="Panel2.Visible= False";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent._panel2.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="SpinnerCinsiyet.DropdownBackgroundColor= Colors.W";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent._spinnercinsiyet.runMethod(true,"setDropdownBackgroundColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 81;BA.debugLine="SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._spinnercinsiyet.runMethod(true,"setDropdownTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="SpinnerCinsiyet.TextColor= Colors.White";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent._spinnercinsiyet.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="SpinnerCinsiyet.TextSize = 20";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._spinnercinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 85;BA.debugLine="SpinnerDogumYeri.DropdownBackgroundColor= Colors.";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._spinnerdogumyeri.runMethod(true,"setDropdownBackgroundColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 86;BA.debugLine="SpinnerDogumYeri.DropdownTextColor= Color.koyuMav";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent._spinnerdogumyeri.runMethod(true,"setDropdownTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="SpinnerDogumYeri.TextColor= Colors.White";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._spinnerdogumyeri.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 88;BA.debugLine="SpinnerDogumYeri.TextSize = 20";
Debug.ShouldStop(8388608);
denekekleguncelle.mostCurrent._spinnerdogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 90;BA.debugLine="SpinnerGun.DropdownBackgroundColor = Color.acikMa";
Debug.ShouldStop(33554432);
denekekleguncelle.mostCurrent._spinnergun.runMethod(true,"setDropdownBackgroundColor",denekekleguncelle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="SpinnerGun.DropdownTextColor = Colors.White";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._spinnergun.runMethod(true,"setDropdownTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 92;BA.debugLine="SpinnerGun.TextColor = Color.koyuMavi";
Debug.ShouldStop(134217728);
denekekleguncelle.mostCurrent._spinnergun.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="SpinnerGun.TextSize = 20";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._spinnergun.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 95;BA.debugLine="SpinnerAy.DropdownBackgroundColor = Color.acikMav";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._spinneray.runMethod(true,"setDropdownBackgroundColor",denekekleguncelle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="SpinnerAy.DropdownTextColor = Colors.White";
Debug.ShouldStop(-2147483648);
denekekleguncelle.mostCurrent._spinneray.runMethod(true,"setDropdownTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 97;BA.debugLine="SpinnerAy.TextColor = Color.koyuMavi";
Debug.ShouldStop(1);
denekekleguncelle.mostCurrent._spinneray.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="SpinnerAy.TextSize = 20";
Debug.ShouldStop(2);
denekekleguncelle.mostCurrent._spinneray.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 100;BA.debugLine="SpinnerYil.DropdownBackgroundColor = Color.acikMa";
Debug.ShouldStop(8);
denekekleguncelle.mostCurrent._spinneryil.runMethod(true,"setDropdownBackgroundColor",denekekleguncelle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="SpinnerYil.DropdownTextColor = Colors.White";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._spinneryil.runMethod(true,"setDropdownTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 102;BA.debugLine="SpinnerYil.TextColor = Color.koyuMavi";
Debug.ShouldStop(32);
denekekleguncelle.mostCurrent._spinneryil.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="SpinnerYil.TextSize = 20";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent._spinneryil.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 105;BA.debugLine="LabelGun.TextColor = Color.koyuMavi";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent._labelgun.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="LabelGun.TextSize = 20";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._labelgun.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 107;BA.debugLine="LabelGun.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._labelgun.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 109;BA.debugLine="LabelAy.TextColor = Color.koyuMavi";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._labelay.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="LabelAy.TextSize = 20";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._labelay.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 111;BA.debugLine="LabelAy.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent._labelay.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 113;BA.debugLine="LabelYil.TextColor = Color.koyuMavi";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._labelyil.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="LabelYil.TextSize = 20";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent._labelyil.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 115;BA.debugLine="LabelYil.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._labelyil.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 117;BA.debugLine="LabelKimlikNo.TextColor = Colors.White";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._labelkimlikno.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 118;BA.debugLine="LabelKimlikNo.TextSize = 20";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent._labelkimlikno.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 119;BA.debugLine="LabelKimlikNo.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._labelkimlikno.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 121;BA.debugLine="Labelisim.TextColor = Colors.White";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._labelisim.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 122;BA.debugLine="Labelisim.TextSize = 20";
Debug.ShouldStop(33554432);
denekekleguncelle.mostCurrent._labelisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 123;BA.debugLine="Labelisim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._labelisim.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 125;BA.debugLine="LabelCinsiyet.TextColor = Colors.White";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._labelcinsiyet.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 126;BA.debugLine="LabelCinsiyet.TextSize = 20";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent._labelcinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 127;BA.debugLine="LabelCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._labelcinsiyet.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 129;BA.debugLine="LabelDogumTarihi.TextColor = Colors.White";
Debug.ShouldStop(1);
denekekleguncelle.mostCurrent._labeldogumtarihi.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 130;BA.debugLine="LabelDogumTarihi.TextSize = 20";
Debug.ShouldStop(2);
denekekleguncelle.mostCurrent._labeldogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 131;BA.debugLine="LabelDogumTarihi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent._labeldogumtarihi.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 133;BA.debugLine="LabelDogumYeri.TextColor = Colors.White";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._labeldogumyeri.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 134;BA.debugLine="LabelDogumYeri.TextSize = 20";
Debug.ShouldStop(32);
denekekleguncelle.mostCurrent._labeldogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 135;BA.debugLine="LabelDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent._labeldogumyeri.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 137;BA.debugLine="LabelBabaAdi.TextColor = Colors.White";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent._labelbabaadi.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 138;BA.debugLine="LabelBabaAdi.TextSize = 20";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._labelbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 139;BA.debugLine="LabelBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._labelbabaadi.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 141;BA.debugLine="CheckBoxEngelDurumu.TextColor = Colors.White";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._checkboxengeldurumu.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 142;BA.debugLine="CheckBoxEngelDurumu.TextSize = 20";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._checkboxengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 143;BA.debugLine="CheckBoxEngelDurumu.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent._checkboxengeldurumu.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 145;BA.debugLine="LabelTakimOkul.TextColor = Colors.White";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._labeltakimokul.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 146;BA.debugLine="LabelTakimOkul.TextSize = 20";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent._labeltakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 147;BA.debugLine="LabelTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._labeltakimokul.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 149;BA.debugLine="LabelBransSinif.TextColor = Colors.White";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._labelbranssinif.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 150;BA.debugLine="LabelBransSinif.TextSize = 20";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent._labelbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 151;BA.debugLine="LabelBransSinif.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._labelbranssinif.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 153;BA.debugLine="LabelMevki.TextColor = Colors.White";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._labelmevki.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 154;BA.debugLine="LabelMevki.TextSize = 20";
Debug.ShouldStop(33554432);
denekekleguncelle.mostCurrent._labelmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 155;BA.debugLine="LabelMevki.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._labelmevki.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 157;BA.debugLine="EditTextKimlikNo.HintColor = Color.hintColor";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 158;BA.debugLine="EditTextKimlikNo.Hint = \"TCKN'i eksiksiz giriniz.";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"setHint",BA.ObjectToString("TCKN'i eksiksiz giriniz.."));
 BA.debugLineNum = 159;BA.debugLine="EditTextKimlikNo.TextSize = 20";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 160;BA.debugLine="EditTextKimlikNo.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 161;BA.debugLine="EditTextKimlikNo.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 162;BA.debugLine="EditTextKimlikNo.SingleLine = True";
Debug.ShouldStop(2);
denekekleguncelle.mostCurrent._edittextkimlikno.runVoidMethod ("setSingleLine",denekekleguncelle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 164;BA.debugLine="EditTextIsim.HintColor = Color.hintColor";
Debug.ShouldStop(8);
denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="EditTextIsim.Hint = \"Denek ismini giriniz..\"";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"setHint",BA.ObjectToString("Denek ismini giriniz.."));
 BA.debugLineNum = 166;BA.debugLine="EditTextIsim.TextSize = 20";
Debug.ShouldStop(32);
denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 167;BA.debugLine="EditTextIsim.TextColor = Colors.White";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 168;BA.debugLine="EditTextIsim.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent._edittextisim.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 170;BA.debugLine="EditTextBabaAdi.HintColor = Color.hintColor";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 171;BA.debugLine="EditTextBabaAdi.Hint = \"Denek baba adını giriniz.";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"setHint",BA.ObjectToString("Denek baba adını giriniz.."));
 BA.debugLineNum = 172;BA.debugLine="EditTextBabaAdi.TextSize = 20";
Debug.ShouldStop(2048);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 173;BA.debugLine="EditTextBabaAdi.TextColor = Colors.White";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 174;BA.debugLine="EditTextBabaAdi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 176;BA.debugLine="EditTextEngelDurumu.HintColor = Color.hintColor";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="EditTextEngelDurumu.Hint = \"Engel durumu varsa lü";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setHint",BA.ObjectToString("Engel durumu varsa lütfen doldurunuz.."));
 BA.debugLineNum = 178;BA.debugLine="EditTextEngelDurumu.TextSize = 20";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 179;BA.debugLine="EditTextEngelDurumu.TextColor = Colors.White";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 180;BA.debugLine="EditTextEngelDurumu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(524288);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 182;BA.debugLine="EditTextTakimOkul.HintColor = Color.hintColor";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="EditTextTakimOkul.Hint = \"Bağlı olduğu Takım/Okul";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"setHint",BA.ObjectToString("Bağlı olduğu Takım/Okul değerini giriniz..."));
 BA.debugLineNum = 184;BA.debugLine="EditTextTakimOkul.TextSize = 20";
Debug.ShouldStop(8388608);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 185;BA.debugLine="EditTextTakimOkul.TextColor = Colors.White";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 186;BA.debugLine="EditTextTakimOkul.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(33554432);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 188;BA.debugLine="EditTextBransSinif.HintColor = Color.hintColor";
Debug.ShouldStop(134217728);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="EditTextBransSinif.Hint = \"Bağlı olduğu Branş/Sın";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"setHint",BA.ObjectToString("Bağlı olduğu Branş/Sınıf değerini giriniz..."));
 BA.debugLineNum = 190;BA.debugLine="EditTextBransSinif.TextSize = 20";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 191;BA.debugLine="EditTextBransSinif.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 192;BA.debugLine="EditTextBransSinif.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(-2147483648);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 194;BA.debugLine="EditTextMevki.HintColor = Color.hintColor";
Debug.ShouldStop(2);
denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"setHintColor",denekekleguncelle.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="EditTextMevki.Hint = \"Bulunduğu mevki değerini gi";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"setHint",BA.ObjectToString("Bulunduğu mevki değerini giriniz..."));
 BA.debugLineNum = 196;BA.debugLine="EditTextMevki.TextSize = 20";
Debug.ShouldStop(8);
denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 197;BA.debugLine="EditTextMevki.TextColor = Colors.White";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 198;BA.debugLine="EditTextMevki.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
denekekleguncelle.mostCurrent._edittextmevki.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 200;BA.debugLine="ButtonDogumTarihi.Text = \"Doğum Tarihi\"";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence("Doğum Tarihi"));
 BA.debugLineNum = 201;BA.debugLine="ButtonDogumTarihi.TextColor = Colors.White";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setTextColor",denekekleguncelle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 202;BA.debugLine="ButtonDogumTarihi.TextSize = 20";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 203;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(false,"setTypeface",denekekleguncelle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 204;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
Debug.ShouldStop(2048);
denekekleguncelle.mostCurrent._buttondogumtarihi.runVoidMethod ("setSingleLine",denekekleguncelle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 206;BA.debugLine="ButtonYukle.Visible = False";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._buttonyukle.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 207;BA.debugLine="ButtonFotoCek.Visible = False";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent._buttonfotocek.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 208;BA.debugLine="If Main.Status = \"S\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._main._status /*RemoteObject*/ ,BA.ObjectToString("S"))) { 
 BA.debugLineNum = 209;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._panel1.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 211;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._panel1.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 213;BA.debugLine="EditTextEngelDurumu.Visible = False";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT cinsiyet";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT cinsiyet_adi FROM Cinsiyet")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinnercinsiyet));
 BA.debugLineNum = 216;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetIt";
Debug.ShouldStop(8388608);
_spinnercinsiyet_itemclick(BA.numberCast(int.class, 0),(denekekleguncelle.mostCurrent._spinnercinsiyet.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 217;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT il_adi F";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT il_adi FROM Iller")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinnerdogumyeri));
 BA.debugLineNum = 218;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetI";
Debug.ShouldStop(33554432);
_spinnercinsiyet_itemclick(BA.numberCast(int.class, 0),(denekekleguncelle.mostCurrent._spinnerdogumyeri.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 219;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql ,\"SELECT gun FROM";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT gun FROM Gun")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinnergun));
 BA.debugLineNum = 220;BA.debugLine="SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0))";
Debug.ShouldStop(134217728);
_spinnergun_itemclick(BA.numberCast(int.class, 0),(denekekleguncelle.mostCurrent._spinnergun.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 221;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT ay FROM";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT ay FROM Ay")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinneray));
 BA.debugLineNum = 222;BA.debugLine="SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))";
Debug.ShouldStop(536870912);
_spinneray_itemclick(BA.numberCast(int.class, 0),(denekekleguncelle.mostCurrent._spinneray.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 223;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT yil FROM";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT yil FROM Yil")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinneryil));
 BA.debugLineNum = 224;BA.debugLine="SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))";
Debug.ShouldStop(-2147483648);
_spinneryil_itemclick(BA.numberCast(int.class, 0),(denekekleguncelle.mostCurrent._spinneryil.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 229;BA.debugLine="If Main.Status=\"U\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._main._status /*RemoteObject*/ ,BA.ObjectToString("U"))) { 
 BA.debugLineNum = 230;BA.debugLine="DenekID = DenekDuzenleSil.id";
Debug.ShouldStop(32);
denekekleguncelle.mostCurrent._denekid = denekekleguncelle.mostCurrent._denekduzenlesil._id /*RemoteObject*/ ;
 BA.debugLineNum = 231;BA.debugLine="EditTextKimlikNo.Text = DenekDuzenleSil.tc";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent._edittextkimlikno.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._tc /*RemoteObject*/ ));
 BA.debugLineNum = 232;BA.debugLine="EditTextIsim.Text = DenekDuzenleSil.isim";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent._edittextisim.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._isim /*RemoteObject*/ ));
 BA.debugLineNum = 233;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql,\"SELECT cinsiyet";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT cinsiyet_adi FROM Cinsiyet ")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinnercinsiyet));
 BA.debugLineNum = 234;BA.debugLine="ButtonDogumTarihi.Text = DenekDuzenleSil.dogum_t";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._dogum_tarihi /*RemoteObject*/ ));
 BA.debugLineNum = 235;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql,\"SELECT il_adi F";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,denekekleguncelle.mostCurrent.activityBA,(Object)(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT il_adi FROM Iller ")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle.mostCurrent._spinnerdogumyeri));
 BA.debugLineNum = 236;BA.debugLine="EditTextBabaAdi.Text = DenekDuzenleSil.baba_adi";
Debug.ShouldStop(2048);
denekekleguncelle.mostCurrent._edittextbabaadi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._baba_adi /*RemoteObject*/ ));
 BA.debugLineNum = 237;BA.debugLine="EditTextEngelDurumu.Text = DenekDuzenleSil.engel";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._engel_durumu /*RemoteObject*/ ));
 BA.debugLineNum = 238;BA.debugLine="EditTextTakimOkul.Text = DenekDuzenleSil.takim_o";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._edittexttakimokul.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._takim_okul /*RemoteObject*/ ));
 BA.debugLineNum = 239;BA.debugLine="EditTextBransSinif.Text = DenekDuzenleSil.brans_";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent._edittextbranssinif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._brans_sinif /*RemoteObject*/ ));
 BA.debugLineNum = 240;BA.debugLine="EditTextMevki.Text = DenekDuzenleSil.mevki";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent._edittextmevki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._denekduzenlesil._mevki /*RemoteObject*/ ));
 BA.debugLineNum = 241;BA.debugLine="Buffer = DenekDuzenleSil.resim";
Debug.ShouldStop(65536);
denekekleguncelle._buffer = denekekleguncelle.mostCurrent._denekduzenlesil._resim /*RemoteObject*/ ;
 BA.debugLineNum = 242;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 243;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(262144);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 244;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(524288);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 245;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0,";
Debug.ShouldStop(1048576);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(denekekleguncelle._buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(denekekleguncelle._buffer.getField(true,"length")));
 BA.debugLineNum = 246;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(2097152);
_bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 247;BA.debugLine="inputStream.Close";
Debug.ShouldStop(4194304);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 248;BA.debugLine="ImageView1.SetBackgroundImage(bmp)";
Debug.ShouldStop(8388608);
denekekleguncelle.mostCurrent._imageview1.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
 BA.debugLineNum = 249;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220709555",RemoteObject.createImmutable("try"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e143) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e143.toString()); BA.debugLineNum = 251;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._imageview1.runMethod(false,"setBitmap",(denekekleguncelle.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(denekekleguncelle.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png"))).getObject()));
 BA.debugLineNum = 252;BA.debugLine="Log(\"catch\")";
Debug.ShouldStop(134217728);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220709558",RemoteObject.createImmutable("catch"),0);
 };
 };
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,330);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 330;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,326);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","activity_resume");}
 BA.debugLineNum = 326;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenekok_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekOk_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,348);
if (RapidSub.canDelegate("buttondenekok_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","buttondenekok_click");}
RemoteObject _sayi = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 348;BA.debugLine="Sub ButtonDenekOk_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="If EditTextKimlikNo.Text=\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 350;BA.debugLine="Msgbox(\"TC Kimlik numarası boş bırakılamaz\",\"Bil";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("TC Kimlik numarası boş bırakılamaz")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bildirim Mesajı"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 351;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 354;BA.debugLine="If ImageView1.Bitmap = Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",denekekleguncelle.mostCurrent._imageview1.runMethod(false,"getBitmap"))) { 
 BA.debugLineNum = 355;BA.debugLine="Msgbox(\"Denek Fotoğrafı çekiniz\",\"Bildirim Mesaj";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Denek Fotoğrafı çekiniz")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bildirim Mesajı"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 356;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 359;BA.debugLine="Dim sayi As Long = EditTextKimlikNo.Text";
Debug.ShouldStop(64);
_sayi = BA.numberCast(long.class, denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText"));Debug.locals.put("sayi", _sayi);Debug.locals.put("sayi", _sayi);
 BA.debugLineNum = 360;BA.debugLine="If sayi > 99999999999 Or sayi < 10000000000 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_sayi,BA.numberCast(double.class, 99999999999L)) || RemoteObject.solveBoolean("<",_sayi,BA.numberCast(double.class, 10000000000L))) { 
 BA.debugLineNum = 361;BA.debugLine="Log(sayi)";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221299213",BA.NumberToString(_sayi),0);
 BA.debugLineNum = 362;BA.debugLine="Msgbox(\"Geçerli bir TC giriniz..\",\"Bildirim Mesa";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Geçerli bir TC giriniz..")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bildirim Mesajı"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 363;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 366;BA.debugLine="If Main.Status = \"S\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._main._status /*RemoteObject*/ ,BA.ObjectToString("S"))) { 
 BA.debugLineNum = 368;BA.debugLine="Dim rs As ResultSet = Main.sql.ExecQuery(\"SELECT";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
denekekleguncelle.mostCurrent._rs.setObject(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc ='"),denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 369;BA.debugLine="If rs.RowCount >0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",denekekleguncelle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 370;BA.debugLine="Msgbox(\"Bu TC kimlik numarasına sahip denek ekl";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bu TC kimlik numarasına sahip denek eklendi")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 371;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 373;BA.debugLine="result = Msgbox2(\"Aşağıda ismi ve soy ismi yazı";
Debug.ShouldStop(1048576);
denekekleguncelle._result = denekekleguncelle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Aşağıda ismi ve soy ismi yazılı kişiyi denek olarak eklemek istiyor musunuz?:"),denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")))),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 374;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 375;BA.debugLine="ID";
Debug.ShouldStop(4194304);
_id();
 BA.debugLineNum = 376;BA.debugLine="If kayitTürü = \"FotoCek\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._kayittürü,BA.ObjectToString("FotoCek"))) { 
 BA.debugLineNum = 377;BA.debugLine="InsertBlob";
Debug.ShouldStop(16777216);
_insertblob();
 BA.debugLineNum = 378;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Denek VAL";
Debug.ShouldStop(33554432);
denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)")),(Object)(denekekleguncelle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {12},new Object[] {(denekekleguncelle.mostCurrent._denekid),(denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._secilencinsiyet),(denekekleguncelle.mostCurrent._secilendogumtarihi),(denekekleguncelle.mostCurrent._secilendogumyeri),(denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"getText")),(denekekleguncelle._buffer)})))));
 }else {
 BA.debugLineNum = 380;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Denek VAL";
Debug.ShouldStop(134217728);
denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)")),(Object)(denekekleguncelle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {12},new Object[] {(denekekleguncelle.mostCurrent._denekid),(denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._secilencinsiyet),(denekekleguncelle.mostCurrent._secilendogumtarihi),(denekekleguncelle.mostCurrent._secilendogumyeri),(denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"getText")),(denekekleguncelle._buffer)})))));
 };
 BA.debugLineNum = 382;BA.debugLine="Log(\"tc eklendi: \"&EditTextKimlikNo.Text)";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221299234",RemoteObject.concat(RemoteObject.createImmutable("tc eklendi: "),denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText")),0);
 }else 
{ BA.debugLineNum = 383;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 384;BA.debugLine="ToastMessageShow(\"Denek ekleme sayfasına yönle";
Debug.ShouldStop(-2147483648);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Denek ekleme sayfasına yönlendiriliyorsunuz...")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 385;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 }}
;
 };
 BA.debugLineNum = 388;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
denekekleguncelle.mostCurrent._rs.runVoidMethod ("Close");
 }else 
{ BA.debugLineNum = 389;BA.debugLine="Else if Main.Status = \"U\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._main._status /*RemoteObject*/ ,BA.ObjectToString("U"))) { 
 BA.debugLineNum = 391;BA.debugLine="result = Msgbox2(\"Aşağıda ismi ve soy ismi yazıl";
Debug.ShouldStop(64);
denekekleguncelle._result = denekekleguncelle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Aşağıda ismi ve soy ismi yazılı kişiyi güncellemek istiyor musunuz?:"),denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")))),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 392;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 393;BA.debugLine="If kayitTürü = \"FotoCek\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._kayittürü,BA.ObjectToString("FotoCek"))) { 
 BA.debugLineNum = 394;BA.debugLine="InsertBlob";
Debug.ShouldStop(512);
_insertblob();
 BA.debugLineNum = 395;BA.debugLine="Main.sql.ExecNonQuery2(\"UPDATE Denek SET denek";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id ="),denekekleguncelle.mostCurrent._denekid)),(Object)(denekekleguncelle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {(denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._secilencinsiyet),(denekekleguncelle.mostCurrent._secilendogumtarihi),(denekekleguncelle.mostCurrent._secilendogumyeri),(denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"getText")),(denekekleguncelle._buffer)})))));
 }else {
 BA.debugLineNum = 397;BA.debugLine="Main.sql.ExecNonQuery2(\"UPDATE Denek SET denek";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id ="),denekekleguncelle.mostCurrent._denekid)),(Object)(denekekleguncelle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {(denekekleguncelle.mostCurrent._edittextkimlikno.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextisim.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._secilencinsiyet),(denekekleguncelle.mostCurrent._secilendogumtarihi),(denekekleguncelle.mostCurrent._secilendogumyeri),(denekekleguncelle.mostCurrent._edittextbabaadi.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittexttakimokul.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextbranssinif.runMethod(true,"getText")),(denekekleguncelle.mostCurrent._edittextmevki.runMethod(true,"getText")),(denekekleguncelle._buffer)})))));
 };
 }else 
{ BA.debugLineNum = 399;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 400;BA.debugLine="ToastMessageShow(\"Denek güncelleme sayfasına yö";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Denek güncelleme sayfasına yönlendiriliyorsunuz...")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 401;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 }}
;
 }else {
 BA.debugLineNum = 404;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221299256",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 }}
;
 BA.debugLineNum = 407;BA.debugLine="ToastMessageShow(\"Denek Listesine Yönlendiriliyor";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Denek Listesine Yönlendiriliyorsunuz...")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 408;BA.debugLine="StartActivity(DenekListele)";
Debug.ShouldStop(8388608);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("StartActivity",denekekleguncelle.processBA,(Object)((denekekleguncelle.mostCurrent._deneklistele.getObject())));
 BA.debugLineNum = 409;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondogumtarihi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDogumTarihi_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,434);
if (RapidSub.canDelegate("buttondogumtarihi_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","buttondogumtarihi_click");}
 BA.debugLineNum = 434;BA.debugLine="Sub ButtonDogumTarihi_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="Panel2.Visible = True";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._panel2.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonfotocek_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonFotoCek_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,429);
if (RapidSub.canDelegate("buttonfotocek_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","buttonfotocek_click");}
 BA.debugLineNum = 429;BA.debugLine="Sub ButtonFotoCek_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="kayitTürü =\"FotoCek\"";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent._kayittürü = BA.ObjectToString("FotoCek");
 BA.debugLineNum = 431;BA.debugLine="TakePicture";
Debug.ShouldStop(16384);
_takepicture();
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontarihayar_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarihAyar_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,534);
if (RapidSub.canDelegate("buttontarihayar_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","buttontarihayar_click");}
RemoteObject _dd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog");
RemoteObject _yilsubathesabi = null;
int _i = 0;
RemoteObject _secilen = RemoteObject.createImmutable("");
 BA.debugLineNum = 534;BA.debugLine="Sub ButtonTarihAyar_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 535;BA.debugLine="Panel2.Visible = False";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._panel2.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 536;BA.debugLine="Dim Dd As DateDialog";
Debug.ShouldStop(8388608);
_dd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog");Debug.locals.put("Dd", _dd);
 BA.debugLineNum = 540;BA.debugLine="If secilenYil == 1950 Or secilenYil == 1951 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilenyil,BA.numberCast(double.class, 1950)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilenyil,BA.numberCast(double.class, 1951))) { 
 BA.debugLineNum = 541;BA.debugLine="If secilenAy == 2 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(2))) { 
 BA.debugLineNum = 542;BA.debugLine="If secilenGun == 29 Or secilenGun == 30 Or seci";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 29)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 543;BA.debugLine="ToastMessageShow($\" Şubat ayı ${secilenYil} yı";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle._secilenyil))),RemoteObject.createImmutable(" yılında 28 gündür"))))),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 544;BA.debugLine="secilenGun = 28";
Debug.ShouldStop(-2147483648);
denekekleguncelle._secilengun = BA.numberCast(int.class, 28);
 };
 }else 
{ BA.debugLineNum = 546;BA.debugLine="Else if secilenAy == 4 Or secilenAy == 6 Or seci";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(4)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(6)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(9)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(11))) { 
 BA.debugLineNum = 547;BA.debugLine="If secilenGun == 31 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 548;BA.debugLine="ToastMessageShow($\"${secilenYil} yılında ${sec";
Debug.ShouldStop(8);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle._secilenyil))),RemoteObject.createImmutable(" yılında "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle.mostCurrent._secilenay))),RemoteObject.createImmutable(". ay 30 gündür"))))),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 549;BA.debugLine="secilenGun = 30";
Debug.ShouldStop(16);
denekekleguncelle._secilengun = BA.numberCast(int.class, 30);
 };
 }}
;
 };
 BA.debugLineNum = 555;BA.debugLine="Dim yilSubatHesabi() As Int = Array As Int(1952,1";
Debug.ShouldStop(1024);
_yilsubathesabi = RemoteObject.createNewArray("int",new int[] {78},new Object[] {BA.numberCast(int.class, 1952),BA.numberCast(int.class, 1953),BA.numberCast(int.class, 1954),BA.numberCast(int.class, 1955),BA.numberCast(int.class, 1956),BA.numberCast(int.class, 1957),BA.numberCast(int.class, 1958),BA.numberCast(int.class, 1959),BA.numberCast(int.class, 1960),BA.numberCast(int.class, 1961),BA.numberCast(int.class, 1962),BA.numberCast(int.class, 1963),BA.numberCast(int.class, 1964),BA.numberCast(int.class, 1965),BA.numberCast(int.class, 1966),BA.numberCast(int.class, 1967),BA.numberCast(int.class, 1968),BA.numberCast(int.class, 1969),BA.numberCast(int.class, 1970),BA.numberCast(int.class, 1971),BA.numberCast(int.class, 1972),BA.numberCast(int.class, 1973),BA.numberCast(int.class, 1974),BA.numberCast(int.class, 1975),BA.numberCast(int.class, 1976),BA.numberCast(int.class, 1977),BA.numberCast(int.class, 1978),BA.numberCast(int.class, 1979),BA.numberCast(int.class, 1980),BA.numberCast(int.class, 1981),BA.numberCast(int.class, 1982),BA.numberCast(int.class, 1983),BA.numberCast(int.class, 1984),BA.numberCast(int.class, 1985),BA.numberCast(int.class, 1986),BA.numberCast(int.class, 1987),BA.numberCast(int.class, 1988),BA.numberCast(int.class, 1989),BA.numberCast(int.class, 1990),BA.numberCast(int.class, 1991),BA.numberCast(int.class, 1992),BA.numberCast(int.class, 1993),BA.numberCast(int.class, 1994),BA.numberCast(int.class, 1995),BA.numberCast(int.class, 1996),BA.numberCast(int.class, 1997),BA.numberCast(int.class, 1998),BA.numberCast(int.class, 1999),BA.numberCast(int.class, 2000),BA.numberCast(int.class, 2001),BA.numberCast(int.class, 2002),BA.numberCast(int.class, 2003),BA.numberCast(int.class, 2004),BA.numberCast(int.class, 2005),BA.numberCast(int.class, 2006),BA.numberCast(int.class, 2007),BA.numberCast(int.class, 2008),BA.numberCast(int.class, 2009),BA.numberCast(int.class, 2010),BA.numberCast(int.class, 2011),BA.numberCast(int.class, 2012),BA.numberCast(int.class, 2013),BA.numberCast(int.class, 2014),BA.numberCast(int.class, 2015),BA.numberCast(int.class, 2016),BA.numberCast(int.class, 2017),BA.numberCast(int.class, 2018),BA.numberCast(int.class, 2019),BA.numberCast(int.class, 2020),BA.numberCast(int.class, 2021),BA.numberCast(int.class, 2022),BA.numberCast(int.class, 2023),BA.numberCast(int.class, 2024),BA.numberCast(int.class, 2025),BA.numberCast(int.class, 2026),BA.numberCast(int.class, 2027),BA.numberCast(int.class, 2028),BA.numberCast(int.class, 2029)});Debug.locals.put("yilSubatHesabi", _yilsubathesabi);Debug.locals.put("yilSubatHesabi", _yilsubathesabi);
 BA.debugLineNum = 556;BA.debugLine="For i=0 To yilSubatHesabi.Length-1";
Debug.ShouldStop(2048);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_yilsubathesabi.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 557;BA.debugLine="If secilenYil == yilSubatHesabi(i) Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilenyil,BA.numberCast(double.class, _yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))) { 
 BA.debugLineNum = 558;BA.debugLine="If secilenAy == 2 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(2))) { 
 BA.debugLineNum = 559;BA.debugLine="If i Mod 4 == 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(4)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 560;BA.debugLine="If secilenGun == 30 Or secilenGun == 31 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 561;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında 29 gündür"))))),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 562;BA.debugLine="secilenGun = 29";
Debug.ShouldStop(131072);
denekekleguncelle._secilengun = BA.numberCast(int.class, 29);
 };
 }else {
 BA.debugLineNum = 565;BA.debugLine="If secilenGun == 29 Or secilenGun == 30 Or se";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 29)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 566;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında 28 gündür"))))),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 567;BA.debugLine="secilenGun = 28";
Debug.ShouldStop(4194304);
denekekleguncelle._secilengun = BA.numberCast(int.class, 28);
 };
 };
 }else 
{ BA.debugLineNum = 570;BA.debugLine="Else if secilenAy == 4 Or secilenAy == 6 Or sec";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(4)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(6)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(9)) || RemoteObject.solveBoolean("=",denekekleguncelle.mostCurrent._secilenay,BA.NumberToString(11))) { 
 BA.debugLineNum = 571;BA.debugLine="If secilenGun == 31 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",denekekleguncelle._secilengun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 572;BA.debugLine="ToastMessageShow($\" ${yilSubatHesabi(i)} yılı";
Debug.ShouldStop(134217728);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında "),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle.mostCurrent._secilenay))),RemoteObject.createImmutable(". ay 30 gündür"))))),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 573;BA.debugLine="secilenGun = 30";
Debug.ShouldStop(268435456);
denekekleguncelle._secilengun = BA.numberCast(int.class, 30);
 };
 }}
;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 579;BA.debugLine="Dim secilen As String = $\"${secilenAy}/${secilenG";
Debug.ShouldStop(4);
_secilen = (RemoteObject.concat(RemoteObject.createImmutable(""),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle.mostCurrent._secilenay))),RemoteObject.createImmutable("/"),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle._secilengun))),RemoteObject.createImmutable("/"),denekekleguncelle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekekleguncelle._secilenyil))),RemoteObject.createImmutable("")));Debug.locals.put("secilen", _secilen);Debug.locals.put("secilen", _secilen);
 BA.debugLineNum = 580;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.DateParse(sec";
Debug.ShouldStop(8);
_dd.runMethod(true,"setYear",denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 581;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.DateParse(s";
Debug.ShouldStop(16);
_dd.runMethod(true,"setMonth",denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 582;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.D";
Debug.ShouldStop(32);
_dd.runMethod(true,"setDayOfMonth",denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(denekekleguncelle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 584;BA.debugLine="Dim result As Int = Dd.Show(\"Tarih seçiniz\", \"SPO";
Debug.ShouldStop(128);
denekekleguncelle._result = _dd.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Tarih seçiniz")),(Object)(BA.ObjectToString("SPORT EXPERT TARİH SEÇİM PANELİ")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("İptal")),(Object)(BA.ObjectToString("")),denekekleguncelle.mostCurrent.activityBA,(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 585;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 586;BA.debugLine="secilenDogumTarihi = Dd.DayOfMonth & \"/\" & Dd.Mo";
Debug.ShouldStop(512);
denekekleguncelle.mostCurrent._secilendogumtarihi = RemoteObject.concat(_dd.runMethod(true,"getDayOfMonth"),RemoteObject.createImmutable("/"),_dd.runMethod(true,"getMonth"),RemoteObject.createImmutable("/"),_dd.runMethod(true,"getYear"));
 BA.debugLineNum = 587;BA.debugLine="ButtonDogumTarihi.Text = secilenDogumTarihi";
Debug.ShouldStop(1024);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence(denekekleguncelle.mostCurrent._secilendogumtarihi));
 }else 
{ BA.debugLineNum = 588;BA.debugLine="Else If result = DialogResponse.CANCEL Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
 BA.debugLineNum = 589;BA.debugLine="ButtonDogumTarihi.Text = \"\"";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 590;BA.debugLine="ToastMessageShow(\"Seçim yapılmadı\",True)";
Debug.ShouldStop(8192);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Seçim yapılmadı")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 }}
;
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonyukle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonYukle_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,438);
if (RapidSub.canDelegate("buttonyukle_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","buttonyukle_click");}
 BA.debugLineNum = 438;BA.debugLine="Sub ButtonYukle_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="kayitTürü = \"ResimSec\"";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._kayittürü = BA.ObjectToString("ResimSec");
 BA.debugLineNum = 440;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(8388608);
denekekleguncelle._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 441;BA.debugLine="ImageChooser.Show(\"image/*\",\"Choose Image\")";
Debug.ShouldStop(16777216);
denekekleguncelle._imagechooser.runVoidMethod ("Show",denekekleguncelle.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Choose Image")));
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkboxengeldurumu_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("checkBoxEngelDurumu_CheckedChange (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,594);
if (RapidSub.canDelegate("checkboxengeldurumu_checkedchange")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","checkboxengeldurumu_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 594;BA.debugLine="Sub checkBoxEngelDurumu_CheckedChange(Checked As B";
Debug.ShouldStop(131072);
 BA.debugLineNum = 595;BA.debugLine="If CheckBoxEngelDurumu.Checked Then";
Debug.ShouldStop(262144);
if (denekekleguncelle.mostCurrent._checkboxengeldurumu.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 596;BA.debugLine="EditTextEngelDurumu.Visible = True";
Debug.ShouldStop(524288);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 598;BA.debugLine="EditTextEngelDurumu.Visible = False";
Debug.ShouldStop(2097152);
denekekleguncelle.mostCurrent._edittextengeldurumu.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getba() throws Exception{
try {
		Debug.PushSubsStack("GetBA (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,317);
if (RapidSub.canDelegate("getba")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","getba");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 317;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Log(\"GetBA\")";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221037057",RemoteObject.createImmutable("GetBA"),0);
 BA.debugLineNum = 319;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 320;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(-2147483648);
_cls = BA.ObjectToString(denekekleguncelle.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 321;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(1);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 322;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(2);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 323;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(4);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private EditTextKimlikNo As EditText";
denekekleguncelle.mostCurrent._edittextkimlikno = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private EditTextIsim As EditText";
denekekleguncelle.mostCurrent._edittextisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private SpinnerCinsiyet As Spinner";
denekekleguncelle.mostCurrent._spinnercinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SpinnerDogumYeri As Spinner";
denekekleguncelle.mostCurrent._spinnerdogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EditTextBabaAdi As EditText";
denekekleguncelle.mostCurrent._edittextbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private EditTextEngelDurumu As EditText";
denekekleguncelle.mostCurrent._edittextengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextTakimOkul As EditText";
denekekleguncelle.mostCurrent._edittexttakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EditTextBransSinif As EditText";
denekekleguncelle.mostCurrent._edittextbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private EditTextMevki As EditText";
denekekleguncelle.mostCurrent._edittextmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ImageView1 As ImageView";
denekekleguncelle.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Dim result As Int";
denekekleguncelle._result = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 33;BA.debugLine="Dim DenekID As String";
denekekleguncelle.mostCurrent._denekid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Dim secilenCinsiyet As String";
denekekleguncelle.mostCurrent._secilencinsiyet = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim secilenDogumYeri As String";
denekekleguncelle.mostCurrent._secilendogumyeri = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim secilenDogumTarihi As String";
denekekleguncelle.mostCurrent._secilendogumtarihi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Dim rs As ResultSet";
denekekleguncelle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ButtonDenekOk As Button";
denekekleguncelle.mostCurrent._buttondenekok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ButtonDogumTarihi As Button";
denekekleguncelle.mostCurrent._buttondogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ButtonYukle As Button";
denekekleguncelle.mostCurrent._buttonyukle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private PanelFotoCek As Panel";
denekekleguncelle.mostCurrent._panelfotocek = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private LabelKimlikNo As Label";
denekekleguncelle.mostCurrent._labelkimlikno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Labelisim As Label";
denekekleguncelle.mostCurrent._labelisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelCinsiyet As Label";
denekekleguncelle.mostCurrent._labelcinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelDogumTarihi As Label";
denekekleguncelle.mostCurrent._labeldogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelDogumYeri As Label";
denekekleguncelle.mostCurrent._labeldogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LabelBabaAdi As Label";
denekekleguncelle.mostCurrent._labelbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private CheckBoxEngelDurumu As CheckBox";
denekekleguncelle.mostCurrent._checkboxengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private LabelTakimOkul As Label";
denekekleguncelle.mostCurrent._labeltakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private LabelBransSinif As Label";
denekekleguncelle.mostCurrent._labelbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private LabelMevki As Label";
denekekleguncelle.mostCurrent._labelmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Dim kayitTürü As String =\"\"";
denekekleguncelle.mostCurrent._kayittürü = BA.ObjectToString("");
 //BA.debugLineNum = 54;BA.debugLine="Private ButtonFotoCek As Button";
denekekleguncelle.mostCurrent._buttonfotocek = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Panel1 As Panel";
denekekleguncelle.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private Panel2 As Panel";
denekekleguncelle.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private LabelGun As Label";
denekekleguncelle.mostCurrent._labelgun = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private LabelAy As Label";
denekekleguncelle.mostCurrent._labelay = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private LabelYil As Label";
denekekleguncelle.mostCurrent._labelyil = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private SpinnerGun As Spinner";
denekekleguncelle.mostCurrent._spinnergun = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private SpinnerAy As Spinner";
denekekleguncelle.mostCurrent._spinneray = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private SpinnerYil As Spinner";
denekekleguncelle.mostCurrent._spinneryil = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Dim secilenGun As Int";
denekekleguncelle._secilengun = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 65;BA.debugLine="Dim secilenAy As String";
denekekleguncelle.mostCurrent._secilenay = RemoteObject.createImmutable("");
 //BA.debugLineNum = 66;BA.debugLine="Dim secilenYil As Int";
denekekleguncelle._secilenyil = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 67;BA.debugLine="Private ButtonTarihAyar As Button";
denekekleguncelle.mostCurrent._buttontarihayar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _id() throws Exception{
try {
		Debug.PushSubsStack("ID (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,334);
if (RapidSub.canDelegate("id")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 334;BA.debugLine="Sub ID";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(16384);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 336;BA.debugLine="sf.initialize";
Debug.ShouldStop(32768);
_sf.runVoidMethod ("_initialize",denekekleguncelle.processBA);
 BA.debugLineNum = 338;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
Debug.ShouldStop(131072);
denekekleguncelle.mostCurrent._rs.setObject(denekekleguncelle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Denek ORDER BY denek_id DESC"))));
 BA.debugLineNum = 339;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",denekekleguncelle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 340;BA.debugLine="rs.Position = 0";
Debug.ShouldStop(524288);
denekekleguncelle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 341;BA.debugLine="DenekID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.Right";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._denekid = _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(denekekleguncelle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3)));
 }else {
 BA.debugLineNum = 343;BA.debugLine="DenekID=\"001\"";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._denekid = BA.ObjectToString("001");
 };
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,465);
if (RapidSub.canDelegate("imageview1_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","imageview1_click");}
 BA.debugLineNum = 465;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="Dim result As Int";
Debug.ShouldStop(131072);
denekekleguncelle._result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 467;BA.debugLine="result = Msgbox2(\"Fotoğraf Yükleyin veya çekin\",";
Debug.ShouldStop(262144);
denekekleguncelle._result = denekekleguncelle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Fotoğraf Yükleyin veya çekin")),(Object)(BA.ObjectToCharSequence("Fotoğraf")),(Object)(BA.ObjectToString("Fotoğraf Çek")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Fotoğraf Yükle")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null"))),denekekleguncelle.mostCurrent.activityBA);
 BA.debugLineNum = 468;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 469;BA.debugLine="ButtonFotoCek_Click";
Debug.ShouldStop(1048576);
_buttonfotocek_click();
 }else 
{ BA.debugLineNum = 470;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",denekekleguncelle._result,BA.numberCast(double.class, denekekleguncelle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 471;BA.debugLine="ButtonYukle_Click";
Debug.ShouldStop(4194304);
_buttonyukle_click();
 }}
;
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgchooser_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,444);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","imgchooser_result", _success, _dir, _filename);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 444;BA.debugLine="Sub imgChooser_Result(Success As Boolean, Dir As S";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 446;BA.debugLine="Log(\"img_Chooser_Result Succcess \")";
Debug.ShouldStop(536870912);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221692418",RemoteObject.createImmutable("img_Chooser_Result Succcess "),0);
 BA.debugLineNum = 448;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(-2147483648);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 449;BA.debugLine="bmp.Initialize(Dir,FileName)";
Debug.ShouldStop(1);
_bmp.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 450;BA.debugLine="lastPicture = bmp";
Debug.ShouldStop(2);
denekekleguncelle._lastpicture = _bmp;
 BA.debugLineNum = 451;BA.debugLine="ImageView1.Bitmap = lastPicture";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent._imageview1.runMethod(false,"setBitmap",(denekekleguncelle._lastpicture.getObject()));
 BA.debugLineNum = 453;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(16);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 454;BA.debugLine="inputStream = File.OpenInput(Dir,FileName)";
Debug.ShouldStop(32);
_inputstream = denekekleguncelle.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 455;BA.debugLine="Dim outputStream As OutputStream";
Debug.ShouldStop(64);
_outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 456;BA.debugLine="outputStream.InitializeToBytesArray(1000)";
Debug.ShouldStop(128);
_outputstream.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1000)));
 BA.debugLineNum = 457;BA.debugLine="File.Copy2(inputStream,outputStream)";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream.getObject())),(Object)((_outputstream.getObject())));
 BA.debugLineNum = 458;BA.debugLine="Buffer = outputStream.ToBytesArray";
Debug.ShouldStop(512);
denekekleguncelle._buffer = _outputstream.runMethod(false,"ToBytesArray");
 }else {
 BA.debugLineNum = 461;BA.debugLine="ToastMessageShow(\"Resim Seçilmedi\", True)";
Debug.ShouldStop(4096);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Resim Seçilmedi")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertblob() throws Exception{
try {
		Debug.PushSubsStack("InsertBlob (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,259);
if (RapidSub.canDelegate("insertblob")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","insertblob");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 259;BA.debugLine="Sub InsertBlob 'görünüyü veritabanına kaydeder.";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(8);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 261;BA.debugLine="Dim outputStream As OutputStream";
Debug.ShouldStop(16);
_outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 262;BA.debugLine="inputStream= File.OpenInput(Starter.provider.Shar";
Debug.ShouldStop(32);
_inputstream = denekekleguncelle.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(denekekleguncelle.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(denekekleguncelle._tempimagefile));Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 263;BA.debugLine="outputStream.InitializeToBytesArray(1000)";
Debug.ShouldStop(64);
_outputstream.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1000)));
 BA.debugLineNum = 264;BA.debugLine="File.Copy2(inputStream, outputStream)";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream.getObject())),(Object)((_outputstream.getObject())));
 BA.debugLineNum = 265;BA.debugLine="Buffer= outputStream.ToBytesArray";
Debug.ShouldStop(256);
denekekleguncelle._buffer = _outputstream.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ion_event(RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("ion_Event (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,285);
if (RapidSub.canDelegate("ion_event")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","ion_event", _methodname, _args);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 285;BA.debugLine="Sub ion_Event (MethodName As String, Args() As Obj";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="If Args(0) = -1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_args.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable((-(double) (0 + 1))))) { 
 BA.debugLineNum = 287;BA.debugLine="Log(\"ion_Event args(0) = -1 if bloğu \")";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220905986",RemoteObject.createImmutable("ion_Event args(0) = -1 if bloğu "),0);
 BA.debugLineNum = 288;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 289;BA.debugLine="Dim in As Intent = Args(1)";
Debug.ShouldStop(1);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in.setObject(_args.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("in", _in);
 BA.debugLineNum = 290;BA.debugLine="If File.Exists(Starter.provider.SharedFolder, t";
Debug.ShouldStop(2);
if (denekekleguncelle.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(denekekleguncelle.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(denekekleguncelle._tempimagefile)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 291;BA.debugLine="Log(\"ion_event File.Exists(Starter.provider.Sh";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220905990",RemoteObject.createImmutable("ion_event File.Exists(Starter.provider.SharedFolder, tempImageFile)"),0);
 BA.debugLineNum = 292;BA.debugLine="lastPicture = LoadBitmapSample(Starter.provide";
Debug.ShouldStop(8);
denekekleguncelle._lastpicture = denekekleguncelle.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(denekekleguncelle.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(denekekleguncelle._tempimagefile),(Object)(denekekleguncelle.mostCurrent._imageview1.runMethod(true,"getWidth")),(Object)(denekekleguncelle.mostCurrent._imageview1.runMethod(true,"getHeight")));
 BA.debugLineNum = 293;BA.debugLine="ImageView1.Bitmap = lastPicture";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._imageview1.runMethod(false,"setBitmap",(denekekleguncelle._lastpicture.getObject()));
 }else 
{ BA.debugLineNum = 294;BA.debugLine="Else If in.HasExtra(\"data\") Then 'bunun yerine";
Debug.ShouldStop(32);
if (_in.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("data"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 295;BA.debugLine="Log(\"in.HasExtra(data)\")";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220905994",RemoteObject.createImmutable("in.HasExtra(data)"),0);
 BA.debugLineNum = 296;BA.debugLine="Dim jo As JavaObject = in";
Debug.ShouldStop(128);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_in.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 297;BA.debugLine="lastPicture = jo.RunMethodJO(\"getExtras\", Null";
Debug.ShouldStop(256);
denekekleguncelle._lastpicture.setObject(_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getExtras")),(Object)((denekekleguncelle.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("data"))}))));
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e15.toString()); BA.debugLineNum = 300;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220905999",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 };
 BA.debugLineNum = 303;BA.debugLine="If lastPicture.IsInitialized Then";
Debug.ShouldStop(16384);
if (denekekleguncelle._lastpicture.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 304;BA.debugLine="ImageView1.Bitmap = lastPicture";
Debug.ShouldStop(32768);
denekekleguncelle.mostCurrent._imageview1.runMethod(false,"setBitmap",(denekekleguncelle._lastpicture.getObject()));
 BA.debugLineNum = 305;BA.debugLine="Log(\"ion_event lastPicture.IsInitialized if bloğ";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220906004",RemoteObject.createImmutable("ion_event lastPicture.IsInitialized if bloğu "),0);
 };
 BA.debugLineNum = 307;BA.debugLine="Return Null";
Debug.ShouldStop(262144);
if (true) return denekekleguncelle.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_click() throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,479);
if (RapidSub.canDelegate("panel1_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","panel1_click");}
 BA.debugLineNum = 479;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(-2147483648);
denekekleguncelle.mostCurrent._panel1.runMethod(true,"setVisible",denekekleguncelle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 481;BA.debugLine="ImageView1_Click";
Debug.ShouldStop(1);
_imageview1_click();
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelfotocek_click() throws Exception{
try {
		Debug.PushSubsStack("PanelFotoCek_Click (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,475);
if (RapidSub.canDelegate("panelfotocek_click")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","panelfotocek_click");}
 BA.debugLineNum = 475;BA.debugLine="Sub PanelFotoCek_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="ImageView1_Click";
Debug.ShouldStop(134217728);
_imageview1_click();
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private ion As Object";
denekekleguncelle._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 10;BA.debugLine="Private const tempImageFile As String = \"tempimag";
denekekleguncelle._tempimagefile = BA.ObjectToString("tempimage.jpg");
 //BA.debugLineNum = 11;BA.debugLine="Public lastPicture As Bitmap";
denekekleguncelle._lastpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim ImageChooser As ContentChooser";
denekekleguncelle._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 13;BA.debugLine="Public Buffer() As Byte";
denekekleguncelle._buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinneray_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerAy_ItemClick (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,492);
if (RapidSub.canDelegate("spinneray_itemclick")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","spinneray_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 492;BA.debugLine="Sub SpinnerAy_ItemClick (Position As Int, Value As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 494;BA.debugLine="If Value == \"Ocak\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ocak")))) { 
 BA.debugLineNum = 495;BA.debugLine="secilenAy = 1";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(1);
 }else 
{ BA.debugLineNum = 496;BA.debugLine="Else if Value == \"Şubat\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Şubat")))) { 
 BA.debugLineNum = 497;BA.debugLine="secilenAy = 2";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(2);
 }else 
{ BA.debugLineNum = 498;BA.debugLine="Else if Value == \"Mart\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Mart")))) { 
 BA.debugLineNum = 499;BA.debugLine="secilenAy = 3";
Debug.ShouldStop(262144);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(3);
 }else 
{ BA.debugLineNum = 500;BA.debugLine="Else if Value == \"Nisan\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Nisan")))) { 
 BA.debugLineNum = 501;BA.debugLine="secilenAy = 4";
Debug.ShouldStop(1048576);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(4);
 }else 
{ BA.debugLineNum = 502;BA.debugLine="Else if Value == \"Mayıs\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Mayıs")))) { 
 BA.debugLineNum = 503;BA.debugLine="secilenAy = 5";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(5);
 }else 
{ BA.debugLineNum = 504;BA.debugLine="Else if Value == \"Haziran\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Haziran")))) { 
 BA.debugLineNum = 505;BA.debugLine="secilenAy = 6";
Debug.ShouldStop(16777216);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(6);
 }else 
{ BA.debugLineNum = 506;BA.debugLine="Else if Value == \"Temmuz\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Temmuz")))) { 
 BA.debugLineNum = 507;BA.debugLine="secilenAy = 7";
Debug.ShouldStop(67108864);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(7);
 }else 
{ BA.debugLineNum = 508;BA.debugLine="Else if Value == \"Ağustos\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ağustos")))) { 
 BA.debugLineNum = 509;BA.debugLine="secilenAy = 8";
Debug.ShouldStop(268435456);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(8);
 }else 
{ BA.debugLineNum = 510;BA.debugLine="Else if Value == \"Eylül\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Eylül")))) { 
 BA.debugLineNum = 511;BA.debugLine="secilenAy = 9";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(9);
 }else 
{ BA.debugLineNum = 512;BA.debugLine="Else if Value == \"Ekim\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ekim")))) { 
 BA.debugLineNum = 513;BA.debugLine="secilenAy = 10";
Debug.ShouldStop(1);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(10);
 }else 
{ BA.debugLineNum = 514;BA.debugLine="Else if Value == \"Kasım\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Kasım")))) { 
 BA.debugLineNum = 515;BA.debugLine="secilenAy = 11";
Debug.ShouldStop(4);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(11);
 }else 
{ BA.debugLineNum = 516;BA.debugLine="Else if Value == \"Aralık\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Aralık")))) { 
 BA.debugLineNum = 517;BA.debugLine="secilenAy = 12";
Debug.ShouldStop(16);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(12);
 }}}}}}}}}}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e28.toString()); BA.debugLineNum = 520;BA.debugLine="secilenAy = 6";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent._secilenay = BA.NumberToString(6);
 BA.debugLineNum = 521;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","222020125",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnercinsiyet_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinnerCinsiyet_ItemClick (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,413);
if (RapidSub.canDelegate("spinnercinsiyet_itemclick")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","spinnercinsiyet_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 413;BA.debugLine="Sub spinnerCinsiyet_ItemClick (Position As Int, Va";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 414;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 415;BA.debugLine="secilenCinsiyet= Value";
Debug.ShouldStop(1073741824);
denekekleguncelle.mostCurrent._secilencinsiyet = BA.ObjectToString(_value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e4.toString()); BA.debugLineNum = 417;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221364740",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnerdogumyeri_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinnerDogumYeri_ItemClick (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,421);
if (RapidSub.canDelegate("spinnerdogumyeri_itemclick")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","spinnerdogumyeri_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 421;BA.debugLine="Sub spinnerDogumYeri_ItemClick (Position As Int, V";
Debug.ShouldStop(16);
 BA.debugLineNum = 422;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 423;BA.debugLine="secilenDogumYeri= Value";
Debug.ShouldStop(64);
denekekleguncelle.mostCurrent._secilendogumyeri = BA.ObjectToString(_value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e4.toString()); BA.debugLineNum = 425;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221430276",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnergun_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerGun_ItemClick (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,484);
if (RapidSub.canDelegate("spinnergun_itemclick")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","spinnergun_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 484;BA.debugLine="Sub SpinnerGun_ItemClick (Position As Int, Value A";
Debug.ShouldStop(8);
 BA.debugLineNum = 485;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 486;BA.debugLine="secilenGun = Value";
Debug.ShouldStop(32);
denekekleguncelle._secilengun = BA.numberCast(int.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e4.toString()); BA.debugLineNum = 488;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","221954564",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinneryil_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerYil_ItemClick (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,525);
if (RapidSub.canDelegate("spinneryil_itemclick")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","spinneryil_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 525;BA.debugLine="Sub SpinnerYil_ItemClick (Position As Int, Value A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 527;BA.debugLine="secilenYil = Value";
Debug.ShouldStop(16384);
denekekleguncelle._secilenyil = BA.numberCast(int.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e4.toString()); BA.debugLineNum = 529;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","222085636",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 532;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startactivityforresult(RemoteObject _ii) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,310);
if (RapidSub.canDelegate("startactivityforresult")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","startactivityforresult", _ii);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 310;BA.debugLine="Sub StartActivityForResult(ii As Intent)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="Log(\"StartActivityForResult\")";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220971521",RemoteObject.createImmutable("StartActivityForResult"),0);
 BA.debugLineNum = 312;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(8388608);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_getba());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 313;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(16777216);
denekekleguncelle._ion = _jo.runMethod(false,"CreateEvent",denekekleguncelle.processBA,(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(denekekleguncelle.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 314;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {denekekleguncelle._ion,(_ii.getObject())})));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takepicture() throws Exception{
try {
		Debug.PushSubsStack("TakePicture (denekekleguncelle) ","denekekleguncelle",14,denekekleguncelle.mostCurrent.activityBA,denekekleguncelle.mostCurrent,268);
if (RapidSub.canDelegate("takepicture")) { return b4a.example3.denekekleguncelle.remoteMe.runUserSub(false, "denekekleguncelle","takepicture");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _u = RemoteObject.declareNull("Object");
 BA.debugLineNum = 268;BA.debugLine="Sub TakePicture";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(4096);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
Debug.ShouldStop(8192);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.media.action.IMAGE_CAPTURE")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 271;BA.debugLine="File.Delete(Starter.provider.SharedFolder, tempIm";
Debug.ShouldStop(16384);
denekekleguncelle.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(denekekleguncelle.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(denekekleguncelle._tempimagefile));
 BA.debugLineNum = 272;BA.debugLine="Dim u As Object = Starter.provider.GetFileUri(tem";
Debug.ShouldStop(32768);
_u = denekekleguncelle.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (b4a.example3.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(denekekleguncelle._tempimagefile));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 273;BA.debugLine="i.PutExtra(\"output\", u) 'görüntü bu yola kaydedil";
Debug.ShouldStop(65536);
_i.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("output")),(Object)(_u));
 BA.debugLineNum = 275;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 276;BA.debugLine="Log(\"take picture try kısmı\")";
Debug.ShouldStop(524288);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220840456",RemoteObject.createImmutable("take picture try kısmı"),0);
 BA.debugLineNum = 277;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(1048576);
_startactivityforresult(_i);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekekleguncelle.processBA, e10.toString()); BA.debugLineNum = 279;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
Debug.ShouldStop(4194304);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Camera is not available.")),(Object)(denekekleguncelle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 280;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
denekekleguncelle.mostCurrent.__c.runVoidMethod ("LogImpl","220840460",BA.ObjectToString(denekekleguncelle.mostCurrent.__c.runMethod(false,"LastException",denekekleguncelle.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}