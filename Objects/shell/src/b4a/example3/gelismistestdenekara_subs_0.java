package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gelismistestdenekara_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,82);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="Activity.LoadLayout(\"GelismisTestDenekAraPage\")";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GelismisTestDenekAraPage")),gelismistestdenekara.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="ScrollView1.Panel.LoadLayout(\"GelismisTestDenekAr";
Debug.ShouldStop(2097152);
gelismistestdenekara.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GelismisTestDenekAraScrollVeriPage")),gelismistestdenekara.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="ScrollView1.Panel.Width = 2000dip";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",gelismistestdenekara.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2000))));
 BA.debugLineNum = 88;BA.debugLine="ScrollView1.Panel.Height = 1000dip";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",gelismistestdenekara.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000))));
 BA.debugLineNum = 90;BA.debugLine="Panel2.Visible= False";
Debug.ShouldStop(33554432);
gelismistestdenekara.mostCurrent._panel2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="KisimGoster";
Debug.ShouldStop(67108864);
_kisimgoster();
 BA.debugLineNum = 93;BA.debugLine="LabelCarpi1.Visible = False";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._labelcarpi1.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="LabelCarpi2.Visible = False";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._labelcarpi2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="LabelCarpi3.Visible = False";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent._labelcarpi3.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="LabelCarpi4.Visible = False";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._labelcarpi4.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="LabelCarpi5.Visible = False";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._labelcarpi5.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="LabelCarpi6.Visible = False";
Debug.ShouldStop(2);
gelismistestdenekara.mostCurrent._labelcarpi6.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="LabelCarpi7.Visible = False";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent._labelcarpi7.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 102;BA.debugLine="SpinnerCinsiyet.DropdownBackgroundColor= Colors.W";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._spinnercinsiyet.runMethod(true,"setDropdownBackgroundColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 103;BA.debugLine="SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._spinnercinsiyet.runMethod(true,"setDropdownTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="SpinnerCinsiyet.TextColor= Colors.White";
Debug.ShouldStop(128);
gelismistestdenekara.mostCurrent._spinnercinsiyet.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 105;BA.debugLine="SpinnerCinsiyet.TextSize = 20";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._spinnercinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 107;BA.debugLine="SpinnerDogumYeri.DropdownBackgroundColor= Colors.";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setDropdownBackgroundColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 108;BA.debugLine="SpinnerDogumYeri.DropdownTextColor= Color.koyuMav";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setDropdownTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="SpinnerDogumYeri.TextColor= Colors.White";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 110;BA.debugLine="SpinnerDogumYeri.TextSize = 20";
Debug.ShouldStop(8192);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 112;BA.debugLine="EditTextKimlikNo.HintColor = Color.hintColor";
Debug.ShouldStop(32768);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="EditTextKimlikNo.Hint = \"TCKN'i eksiksiz giriniz.";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"setHint",BA.ObjectToString("TCKN'i eksiksiz giriniz.."));
 BA.debugLineNum = 114;BA.debugLine="EditTextKimlikNo.TextSize = 20";
Debug.ShouldStop(131072);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 115;BA.debugLine="EditTextKimlikNo.TextColor = Colors.White";
Debug.ShouldStop(262144);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 116;BA.debugLine="EditTextKimlikNo.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 117;BA.debugLine="EditTextKimlikNo.SingleLine = True";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent._edittextkimlikno.runVoidMethod ("setSingleLine",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 119;BA.debugLine="EditTextIsim.HintColor = Color.hintColor";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="EditTextIsim.Hint = \"Denek ismini giriniz..\"";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"setHint",BA.ObjectToString("Denek ismini giriniz.."));
 BA.debugLineNum = 121;BA.debugLine="EditTextIsim.TextSize = 20";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 122;BA.debugLine="EditTextIsim.TextColor = Colors.White";
Debug.ShouldStop(33554432);
gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 123;BA.debugLine="EditTextIsim.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._edittextisim.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 125;BA.debugLine="EditTextBabaAdi.HintColor = Color.hintColor";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="EditTextBabaAdi.Hint = \"Denek baba adını giriniz.";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setHint",BA.ObjectToString("Denek baba adını giriniz.."));
 BA.debugLineNum = 127;BA.debugLine="EditTextBabaAdi.TextSize = 20";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 128;BA.debugLine="EditTextBabaAdi.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 129;BA.debugLine="EditTextBabaAdi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 131;BA.debugLine="EditTextEngelDurumu.HintColor = Color.hintColor";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="EditTextEngelDurumu.Hint = \"Engel durumu varsa lü";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setHint",BA.ObjectToString("Engel durumu varsa lütfen doldurunuz.."));
 BA.debugLineNum = 133;BA.debugLine="EditTextEngelDurumu.TextSize = 20";
Debug.ShouldStop(16);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 134;BA.debugLine="EditTextEngelDurumu.TextColor = Colors.White";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 135;BA.debugLine="EditTextEngelDurumu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 137;BA.debugLine="EditTextTakimOkul.HintColor = Color.hintColor";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="EditTextTakimOkul.Hint = \"Bağlı olduğu Takım/Okul";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"setHint",BA.ObjectToString("Bağlı olduğu Takım/Okul değerini giriniz..."));
 BA.debugLineNum = 139;BA.debugLine="EditTextTakimOkul.TextSize = 20";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 140;BA.debugLine="EditTextTakimOkul.TextColor = Colors.White";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 141;BA.debugLine="EditTextTakimOkul.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 143;BA.debugLine="EditTextBransSinif.HintColor = Color.hintColor";
Debug.ShouldStop(16384);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 144;BA.debugLine="EditTextBransSinif.Hint = \"Bağlı olduğu Branş/Sın";
Debug.ShouldStop(32768);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"setHint",BA.ObjectToString("Bağlı olduğu Branş/Sınıf değerini giriniz..."));
 BA.debugLineNum = 145;BA.debugLine="EditTextBransSinif.TextSize = 20";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 146;BA.debugLine="EditTextBransSinif.TextColor = Colors.White";
Debug.ShouldStop(131072);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 147;BA.debugLine="EditTextBransSinif.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(262144);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 149;BA.debugLine="EditTextMevki.HintColor = Color.hintColor";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"setHintColor",gelismistestdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="EditTextMevki.Hint = \"Bulunduğu mevki değerini gi";
Debug.ShouldStop(2097152);
gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"setHint",BA.ObjectToString("Bulunduğu mevki değerini giriniz..."));
 BA.debugLineNum = 151;BA.debugLine="EditTextMevki.TextSize = 20";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 152;BA.debugLine="EditTextMevki.TextColor = Colors.White";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 153;BA.debugLine="EditTextMevki.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._edittextmevki.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 155;BA.debugLine="ButtonDogumTarihi.Text = \"Doğum Tarihi\"";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence("Doğum Tarihi"));
 BA.debugLineNum = 156;BA.debugLine="ButtonDogumTarihi.TextColor = Colors.White";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 157;BA.debugLine="ButtonDogumTarihi.TextSize = 20";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 158;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 159;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runVoidMethod ("setSingleLine",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 161;BA.debugLine="SpinnerGun.DropdownBackgroundColor = Color.acikMa";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._spinnergun.runMethod(true,"setDropdownBackgroundColor",gelismistestdenekara.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="SpinnerGun.DropdownTextColor = Colors.White";
Debug.ShouldStop(2);
gelismistestdenekara.mostCurrent._spinnergun.runMethod(true,"setDropdownTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 163;BA.debugLine="SpinnerGun.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent._spinnergun.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="SpinnerGun.TextSize = 20";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._spinnergun.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 166;BA.debugLine="SpinnerAy.DropdownBackgroundColor = Color.acikMav";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._spinneray.runMethod(true,"setDropdownBackgroundColor",gelismistestdenekara.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="SpinnerAy.DropdownTextColor = Colors.White";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._spinneray.runMethod(true,"setDropdownTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 168;BA.debugLine="SpinnerAy.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
gelismistestdenekara.mostCurrent._spinneray.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="SpinnerAy.TextSize = 20";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._spinneray.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 171;BA.debugLine="SpinnerYil.DropdownBackgroundColor = Color.acikMa";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._spinneryil.runMethod(true,"setDropdownBackgroundColor",gelismistestdenekara.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="SpinnerYil.DropdownTextColor = Colors.White";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent._spinneryil.runMethod(true,"setDropdownTextColor",gelismistestdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 173;BA.debugLine="SpinnerYil.TextColor = Color.koyuMavi";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._spinneryil.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 174;BA.debugLine="SpinnerYil.TextSize = 20";
Debug.ShouldStop(8192);
gelismistestdenekara.mostCurrent._spinneryil.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 176;BA.debugLine="LabelGun.TextColor = Color.koyuMavi";
Debug.ShouldStop(32768);
gelismistestdenekara.mostCurrent._labelgun.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="LabelGun.TextSize = 20";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._labelgun.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 178;BA.debugLine="LabelGun.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(131072);
gelismistestdenekara.mostCurrent._labelgun.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 180;BA.debugLine="LabelAy.TextColor = Color.koyuMavi";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._labelay.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="LabelAy.TextSize = 20";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent._labelay.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 182;BA.debugLine="LabelAy.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2097152);
gelismistestdenekara.mostCurrent._labelay.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 184;BA.debugLine="LabelYil.TextColor = Color.koyuMavi";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._labelyil.runMethod(true,"setTextColor",gelismistestdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 185;BA.debugLine="LabelYil.TextSize = 20";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._labelyil.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 186;BA.debugLine="LabelYil.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(33554432);
gelismistestdenekara.mostCurrent._labelyil.runMethod(false,"setTypeface",gelismistestdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 190;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT cinsiyet";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,gelismistestdenekara.mostCurrent.activityBA,(Object)(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT cinsiyet_adi FROM Cinsiyet")),(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(gelismistestdenekara.mostCurrent._spinnercinsiyet));
 BA.debugLineNum = 191;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetIt";
Debug.ShouldStop(1073741824);
_spinnercinsiyet_itemclick(BA.numberCast(int.class, 0),(gelismistestdenekara.mostCurrent._spinnercinsiyet.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 192;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT il_adi F";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,gelismistestdenekara.mostCurrent.activityBA,(Object)(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT il_adi FROM Iller")),(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(gelismistestdenekara.mostCurrent._spinnerdogumyeri));
 BA.debugLineNum = 193;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetI";
Debug.ShouldStop(1);
_spinnercinsiyet_itemclick(BA.numberCast(int.class, 0),(gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 194;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql ,\"SELECT gun FROM";
Debug.ShouldStop(2);
gelismistestdenekara.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,gelismistestdenekara.mostCurrent.activityBA,(Object)(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT gun FROM Gun")),(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(gelismistestdenekara.mostCurrent._spinnergun));
 BA.debugLineNum = 195;BA.debugLine="SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0))";
Debug.ShouldStop(4);
_spinnergun_itemclick(BA.numberCast(int.class, 0),(gelismistestdenekara.mostCurrent._spinnergun.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 196;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT ay FROM";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,gelismistestdenekara.mostCurrent.activityBA,(Object)(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT ay FROM Ay")),(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(gelismistestdenekara.mostCurrent._spinneray));
 BA.debugLineNum = 197;BA.debugLine="SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))";
Debug.ShouldStop(16);
_spinneray_itemclick(BA.numberCast(int.class, 0),(gelismistestdenekara.mostCurrent._spinneray.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 198;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT yil FROM";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._dbutils.runVoidMethod ("_executespinner" /*RemoteObject*/ ,gelismistestdenekara.mostCurrent.activityBA,(Object)(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT yil FROM Yil")),(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(gelismistestdenekara.mostCurrent._spinneryil));
 BA.debugLineNum = 199;BA.debugLine="SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))";
Debug.ShouldStop(64);
_spinneryil_itemclick(BA.numberCast(int.class, 0),(gelismistestdenekara.mostCurrent._spinneryil.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 201;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(256);
_listviewgosterdb();
 BA.debugLineNum = 202;BA.debugLine="list.Initialize";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent._list.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Pause (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,209);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 209;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,205);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","activity_resume");}
 BA.debugLineNum = 205;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ara() throws Exception{
try {
		Debug.PushSubsStack("Ara (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,386);
if (RapidSub.canDelegate("ara")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","ara");}
int _i = 0;
 BA.debugLineNum = 386;BA.debugLine="Sub Ara";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25570561",RemoteObject.createImmutable("BURADA"),0);
 BA.debugLineNum = 388;BA.debugLine="CustomListView1.Clear";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._customlistview1.runVoidMethod ("_clear");
 BA.debugLineNum = 389;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
Debug.ShouldStop(16);
gelismistestdenekara.mostCurrent._rs.setObject(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc LIKE '%"),gelismistestdenekara.mostCurrent._aratc,RemoteObject.createImmutable("%' AND denek_isim LIKE '%"),gelismistestdenekara.mostCurrent._araisim,RemoteObject.createImmutable("%' AND cinsiyet_adi LIKE '%"),gelismistestdenekara.mostCurrent._aracinsiyet,RemoteObject.createImmutable("%' AND il_adi LIKE '%"),gelismistestdenekara.mostCurrent._aradogumyeri,RemoteObject.createImmutable("%' AND denek_babaAdi LIKE '%"),gelismistestdenekara.mostCurrent._arababaadi,RemoteObject.createImmutable("%' AND denek_engelDurumu LIKE '%"),gelismistestdenekara.mostCurrent._araengeldurumu,RemoteObject.createImmutable("%' AND denek_takimOkul LIKE '%"),gelismistestdenekara.mostCurrent._aratakimokul,RemoteObject.createImmutable("%' AND denek_bransSinif LIKE '%"),gelismistestdenekara.mostCurrent._arabranssinif,RemoteObject.createImmutable("%' AND denek_mevki LIKE '%"),gelismistestdenekara.mostCurrent._aramevki,RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 390;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(32);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 391;BA.debugLine="rs.Position = i";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 392;BA.debugLine="VeriAl";
Debug.ShouldStop(128);
_verial();
 BA.debugLineNum = 393;BA.debugLine="CustomListView1.Add(CreateListItem(tc,isim,id,Cu";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._customlistview1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(gelismistestdenekara.mostCurrent._tc,gelismistestdenekara.mostCurrent._isim,gelismistestdenekara._id,gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"getWidth"),gelismistestdenekara.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))).getObject()),(Object)((gelismistestdenekara._id)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 395;BA.debugLine="rs.Close";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 396;BA.debugLine="If list.Size == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 397;BA.debugLine="Log(\"liste boş seçili checkbox yok\")";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25570571",RemoteObject.createImmutable("liste boş seçili checkbox yok"),0);
 }else 
{ BA.debugLineNum = 398;BA.debugLine="Else if list.Size > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 399;BA.debugLine="CheckAt";
Debug.ShouldStop(16384);
_checkat();
 }}
;
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("ButtonDogumTarihi_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,538);
if (RapidSub.canDelegate("buttondogumtarihi_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","buttondogumtarihi_click");}
 BA.debugLineNum = 538;BA.debugLine="Sub ButtonDogumTarihi_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 539;BA.debugLine="Panel2.Visible = True";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._panel2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 540;BA.debugLine="KisimGizle";
Debug.ShouldStop(134217728);
_kisimgizle();
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonok_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonOK_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,378);
if (RapidSub.canDelegate("buttonok_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","buttonok_click");}
int _i = 0;
 BA.debugLineNum = 378;BA.debugLine="Sub ButtonOK_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 379;BA.debugLine="For i=0 To checkedIdList.Size-1";
Debug.ShouldStop(67108864);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara._checkedidlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="Log(checkedIdList.Size)";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25505026",BA.NumberToString(gelismistestdenekara._checkedidlist.runMethod(true,"getSize")),0);
 BA.debugLineNum = 381;BA.debugLine="Log(i &\"   :   \"&\" : \" &checkedIdList.Get(i) )";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25505027",RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("   :   "),RemoteObject.createImmutable(" : "),gelismistestdenekara._checkedidlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 383;BA.debugLine="StartActivity(ProgramSec)";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",gelismistestdenekara.processBA,(Object)((gelismistestdenekara.mostCurrent._programsec.getObject())));
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ButtonTarihAyar_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,543);
if (RapidSub.canDelegate("buttontarihayar_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","buttontarihayar_click");}
RemoteObject _dd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog");
RemoteObject _yilsubathesabi = null;
int _i = 0;
RemoteObject _secilen = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 543;BA.debugLine="Sub ButtonTarihAyar_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 544;BA.debugLine="Panel2.Visible = False";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._panel2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 546;BA.debugLine="Dim Dd As DateDialog";
Debug.ShouldStop(2);
_dd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog");Debug.locals.put("Dd", _dd);
 BA.debugLineNum = 548;BA.debugLine="If araYil == 1950 Or araYil == 1951 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._arayil,BA.numberCast(double.class, 1950)) || RemoteObject.solveBoolean("=",gelismistestdenekara._arayil,BA.numberCast(double.class, 1951))) { 
 BA.debugLineNum = 549;BA.debugLine="If araAy == 2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(2))) { 
 BA.debugLineNum = 550;BA.debugLine="If araGun == 29 Or araGun == 30 Or araGun == 31";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 29)) || RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 551;BA.debugLine="ToastMessageShow($\" Şubat ayı ${araYil} yılınd";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara._arayil))),RemoteObject.createImmutable(" yılında 28 gündür"))))),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 552;BA.debugLine="araGun = 28";
Debug.ShouldStop(128);
gelismistestdenekara._aragun = BA.numberCast(int.class, 28);
 };
 }else 
{ BA.debugLineNum = 554;BA.debugLine="Else if araAy == 4 Or araAy == 6 Or araAy == 9 O";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(4)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(6)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(9)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(11))) { 
 BA.debugLineNum = 555;BA.debugLine="If araGun == 31 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 556;BA.debugLine="ToastMessageShow($\"${araYil} yılında ${araAy}.";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara._arayil))),RemoteObject.createImmutable(" yılında "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara.mostCurrent._araay))),RemoteObject.createImmutable(". ay 30 gündür"))))),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 557;BA.debugLine="araGun = 30";
Debug.ShouldStop(4096);
gelismistestdenekara._aragun = BA.numberCast(int.class, 30);
 };
 }}
;
 };
 BA.debugLineNum = 569;BA.debugLine="Dim yilSubatHesabi() As Int = Array As Int(1952,1";
Debug.ShouldStop(16777216);
_yilsubathesabi = RemoteObject.createNewArray("int",new int[] {78},new Object[] {BA.numberCast(int.class, 1952),BA.numberCast(int.class, 1953),BA.numberCast(int.class, 1954),BA.numberCast(int.class, 1955),BA.numberCast(int.class, 1956),BA.numberCast(int.class, 1957),BA.numberCast(int.class, 1958),BA.numberCast(int.class, 1959),BA.numberCast(int.class, 1960),BA.numberCast(int.class, 1961),BA.numberCast(int.class, 1962),BA.numberCast(int.class, 1963),BA.numberCast(int.class, 1964),BA.numberCast(int.class, 1965),BA.numberCast(int.class, 1966),BA.numberCast(int.class, 1967),BA.numberCast(int.class, 1968),BA.numberCast(int.class, 1969),BA.numberCast(int.class, 1970),BA.numberCast(int.class, 1971),BA.numberCast(int.class, 1972),BA.numberCast(int.class, 1973),BA.numberCast(int.class, 1974),BA.numberCast(int.class, 1975),BA.numberCast(int.class, 1976),BA.numberCast(int.class, 1977),BA.numberCast(int.class, 1978),BA.numberCast(int.class, 1979),BA.numberCast(int.class, 1980),BA.numberCast(int.class, 1981),BA.numberCast(int.class, 1982),BA.numberCast(int.class, 1983),BA.numberCast(int.class, 1984),BA.numberCast(int.class, 1985),BA.numberCast(int.class, 1986),BA.numberCast(int.class, 1987),BA.numberCast(int.class, 1988),BA.numberCast(int.class, 1989),BA.numberCast(int.class, 1990),BA.numberCast(int.class, 1991),BA.numberCast(int.class, 1992),BA.numberCast(int.class, 1993),BA.numberCast(int.class, 1994),BA.numberCast(int.class, 1995),BA.numberCast(int.class, 1996),BA.numberCast(int.class, 1997),BA.numberCast(int.class, 1998),BA.numberCast(int.class, 1999),BA.numberCast(int.class, 2000),BA.numberCast(int.class, 2001),BA.numberCast(int.class, 2002),BA.numberCast(int.class, 2003),BA.numberCast(int.class, 2004),BA.numberCast(int.class, 2005),BA.numberCast(int.class, 2006),BA.numberCast(int.class, 2007),BA.numberCast(int.class, 2008),BA.numberCast(int.class, 2009),BA.numberCast(int.class, 2010),BA.numberCast(int.class, 2011),BA.numberCast(int.class, 2012),BA.numberCast(int.class, 2013),BA.numberCast(int.class, 2014),BA.numberCast(int.class, 2015),BA.numberCast(int.class, 2016),BA.numberCast(int.class, 2017),BA.numberCast(int.class, 2018),BA.numberCast(int.class, 2019),BA.numberCast(int.class, 2020),BA.numberCast(int.class, 2021),BA.numberCast(int.class, 2022),BA.numberCast(int.class, 2023),BA.numberCast(int.class, 2024),BA.numberCast(int.class, 2025),BA.numberCast(int.class, 2026),BA.numberCast(int.class, 2027),BA.numberCast(int.class, 2028),BA.numberCast(int.class, 2029)});Debug.locals.put("yilSubatHesabi", _yilsubathesabi);Debug.locals.put("yilSubatHesabi", _yilsubathesabi);
 BA.debugLineNum = 570;BA.debugLine="For i=0 To yilSubatHesabi.Length-1";
Debug.ShouldStop(33554432);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_yilsubathesabi.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 571;BA.debugLine="If araYil == yilSubatHesabi(i) Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._arayil,BA.numberCast(double.class, _yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))) { 
 BA.debugLineNum = 572;BA.debugLine="If araAy == 2 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(2))) { 
 BA.debugLineNum = 573;BA.debugLine="If i Mod 4 == 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(4)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 574;BA.debugLine="If araGun == 30 Or araGun == 31 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 575;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında 29 gündür"))))),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 576;BA.debugLine="araGun = 29";
Debug.ShouldStop(-2147483648);
gelismistestdenekara._aragun = BA.numberCast(int.class, 29);
 };
 }else {
 BA.debugLineNum = 579;BA.debugLine="If araGun == 29 Or araGun == 30 Or araGun ==";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 29)) || RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 30)) || RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 580;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Şubat ayı "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında 28 gündür"))))),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 581;BA.debugLine="araGun = 28";
Debug.ShouldStop(16);
gelismistestdenekara._aragun = BA.numberCast(int.class, 28);
 };
 };
 }else 
{ BA.debugLineNum = 584;BA.debugLine="Else if araAy == 4 Or araAy == 6 Or araAy == 9";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(4)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(6)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(9)) || RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._araay,BA.NumberToString(11))) { 
 BA.debugLineNum = 585;BA.debugLine="If araGun == 31 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",gelismistestdenekara._aragun,BA.numberCast(double.class, 31))) { 
 BA.debugLineNum = 586;BA.debugLine="ToastMessageShow($\" ${yilSubatHesabi(i)} yılı";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yilsubathesabi.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(" yılında "),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara.mostCurrent._araay))),RemoteObject.createImmutable(". ay 30 gündür"))))),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 587;BA.debugLine="araGun = 30";
Debug.ShouldStop(1024);
gelismistestdenekara._aragun = BA.numberCast(int.class, 30);
 };
 }}
;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 593;BA.debugLine="Dim secilen As String = $\"${araAy}/${araGun}/${ar";
Debug.ShouldStop(65536);
_secilen = (RemoteObject.concat(RemoteObject.createImmutable(""),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara.mostCurrent._araay))),RemoteObject.createImmutable("/"),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara._aragun))),RemoteObject.createImmutable("/"),gelismistestdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((gelismistestdenekara._arayil))),RemoteObject.createImmutable("")));Debug.locals.put("secilen", _secilen);Debug.locals.put("secilen", _secilen);
 BA.debugLineNum = 594;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.DateParse(sec";
Debug.ShouldStop(131072);
_dd.runMethod(true,"setYear",gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 595;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.DateParse(s";
Debug.ShouldStop(262144);
_dd.runMethod(true,"setMonth",gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 596;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.D";
Debug.ShouldStop(524288);
_dd.runMethod(true,"setDayOfMonth",gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(gelismistestdenekara.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_secilen)))));
 BA.debugLineNum = 598;BA.debugLine="Dim result As Int = Dd.Show(\"Tarih seçiniz\", \"SPO";
Debug.ShouldStop(2097152);
_result = _dd.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Tarih seçiniz")),(Object)(BA.ObjectToString("SPORT EXPERT TARİH SEÇİM PANELİ")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("İptal")),(Object)(BA.ObjectToString("")),gelismistestdenekara.mostCurrent.activityBA,(Object)((gelismistestdenekara.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 599;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, gelismistestdenekara.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 600;BA.debugLine="araDogumTarihi = Dd.DayOfMonth & \"/\" & Dd.Month";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._aradogumtarihi = RemoteObject.concat(_dd.runMethod(true,"getDayOfMonth"),RemoteObject.createImmutable("/"),_dd.runMethod(true,"getMonth"),RemoteObject.createImmutable("/"),_dd.runMethod(true,"getYear"));
 BA.debugLineNum = 601;BA.debugLine="ButtonDogumTarihi.Text = araDogumTarihi";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence(gelismistestdenekara.mostCurrent._aradogumtarihi));
 BA.debugLineNum = 602;BA.debugLine="Ara";
Debug.ShouldStop(33554432);
_ara();
 }else 
{ BA.debugLineNum = 603;BA.debugLine="Else If result = DialogResponse.CANCEL Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, gelismistestdenekara.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
 BA.debugLineNum = 604;BA.debugLine="ButtonDogumTarihi.Text = \"\"";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 605;BA.debugLine="ToastMessageShow(\"Seçim yapılmadı\",True)";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Seçim yapılmadı")),(Object)(gelismistestdenekara.mostCurrent.__c.getField(true,"True")));
 }}
;
 BA.debugLineNum = 608;BA.debugLine="KisimGoster";
Debug.ShouldStop(-2147483648);
_kisimgoster();
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkat() throws Exception{
try {
		Debug.PushSubsStack("CheckAt (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,340);
if (RapidSub.canDelegate("checkat")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","checkat");}
int _i = 0;
int _j = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 340;BA.debugLine="Sub CheckAt";
Debug.ShouldStop(524288);
 BA.debugLineNum = 355;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25373967",RemoteObject.createImmutable("BURADA"),0);
 BA.debugLineNum = 356;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(8);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 357;BA.debugLine="For j=0 To CustomListView1.Size -1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._customlistview1.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step3 > 0 && _j <= limit3) || (step3 < 0 && _j >= limit3) ;_j = ((int)(0 + _j + step3))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 358;BA.debugLine="Dim pnl As B4XView = CustomListView1.GetPanel(j";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _j)));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 359;BA.debugLine="Dim chk As B4XView = pnl.GetView(0)";
Debug.ShouldStop(64);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chk = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("chk", _chk);Debug.locals.put("chk", _chk);
 BA.debugLineNum = 360;BA.debugLine="If list.Size > i Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, _i))) { 
 BA.debugLineNum = 361;BA.debugLine="Log(list)";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25373973",BA.ObjectToString(gelismistestdenekara.mostCurrent._list),0);
 BA.debugLineNum = 362;BA.debugLine="If list.Get(i) == CustomListView1.GetValue(j)";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _j))))) { 
 BA.debugLineNum = 363;BA.debugLine="Log(\"listenin \"&i&\"  .elemanı   \"&list.Get(i)";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25373975",RemoteObject.concat(RemoteObject.createImmutable("listenin "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("  .elemanı   "),gelismistestdenekara.mostCurrent._list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("== eşit "),RemoteObject.createImmutable(_j),RemoteObject.createImmutable("  .elemanındaki değere   "),gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _j)))),0);
 BA.debugLineNum = 364;BA.debugLine="chk.Checked = True";
Debug.ShouldStop(2048);
_chk.runMethod(true,"setChecked",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 };
 };
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkboxsecim_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBoxSecim_CheckedChange (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,276);
if (RapidSub.canDelegate("checkboxsecim_checkedchange")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","checkboxsecim_checkedchange", _checked);}
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tclabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _isimlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _j = 0;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 276;BA.debugLine="Sub CheckBoxSecim_CheckedChange(Checked As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="checkedIdList.Initialize";
Debug.ShouldStop(1048576);
gelismistestdenekara._checkedidlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 278;BA.debugLine="checkedTcList.Initialize";
Debug.ShouldStop(2097152);
gelismistestdenekara._checkedtclist.runVoidMethod ("Initialize");
 BA.debugLineNum = 279;BA.debugLine="checkedIsimList.Initialize";
Debug.ShouldStop(4194304);
gelismistestdenekara._checkedisimlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="silinenListe.Initialize";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._silinenliste.runVoidMethod ("Initialize");
 BA.debugLineNum = 282;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(33554432);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25308422",RemoteObject.createImmutable("BURADA"),0);
 BA.debugLineNum = 283;BA.debugLine="For i=0 To CustomListView1.GetSize - 1";
Debug.ShouldStop(67108864);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._customlistview1.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 284;BA.debugLine="Dim pnl As B4XView = CustomListView1.GetPanel(i)";
Debug.ShouldStop(134217728);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 285;BA.debugLine="Dim chk As B4XView = pnl.GetView(0)";
Debug.ShouldStop(268435456);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_chk = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("chk", _chk);Debug.locals.put("chk", _chk);
 BA.debugLineNum = 286;BA.debugLine="Dim tclabel As B4XView = pnl.GetView(1)";
Debug.ShouldStop(536870912);
_tclabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tclabel = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("tclabel", _tclabel);Debug.locals.put("tclabel", _tclabel);
 BA.debugLineNum = 287;BA.debugLine="Dim isimLabel As B4XView = pnl.GetView(2)";
Debug.ShouldStop(1073741824);
_isimlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_isimlabel = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("isimLabel", _isimlabel);Debug.locals.put("isimLabel", _isimlabel);
 BA.debugLineNum = 288;BA.debugLine="If chk.Checked Then";
Debug.ShouldStop(-2147483648);
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 289;BA.debugLine="checkedIdList.Add(CustomListView1.GetValue(i))";
Debug.ShouldStop(1);
gelismistestdenekara._checkedidlist.runVoidMethod ("Add",(Object)(gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 290;BA.debugLine="checkedTcList.Add(tclabel.Text)";
Debug.ShouldStop(2);
gelismistestdenekara._checkedtclist.runVoidMethod ("Add",(Object)((_tclabel.runMethod(true,"getText"))));
 BA.debugLineNum = 291;BA.debugLine="checkedIsimList.Add(isimLabel.Text)";
Debug.ShouldStop(4);
gelismistestdenekara._checkedisimlist.runVoidMethod ("Add",(Object)((_isimlabel.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 292;BA.debugLine="Else If chk.Checked = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_chk.runMethod(true,"getChecked"),gelismistestdenekara.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 294;BA.debugLine="silinenListe.Add(CustomListView1.GetValue(i))";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._silinenliste.runVoidMethod ("Add",(Object)(gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 298;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25308438",RemoteObject.createImmutable("BURADA"),0);
 BA.debugLineNum = 300;BA.debugLine="If checkedIdList.Size<>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",gelismistestdenekara._checkedidlist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 301;BA.debugLine="list.AddAll(checkedIdList)";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._list.runVoidMethod ("AddAll",(Object)(gelismistestdenekara._checkedidlist));
 BA.debugLineNum = 302;BA.debugLine="If  list.Size > 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 304;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(32768);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 305;BA.debugLine="For j=1 To list.Size-1";
Debug.ShouldStop(65536);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 1 ;
for (;(step24 > 0 && _j <= limit24) || (step24 < 0 && _j >= limit24) ;_j = ((int)(0 + _j + step24))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 306;BA.debugLine="If list.Size>j And list.Size>i And i<>j Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, _j)) && RemoteObject.solveBoolean(">",gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize"),BA.numberCast(double.class, _i)) && RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _j))) { 
 BA.debugLineNum = 307;BA.debugLine="If list.Get(i) == list.Get(j) Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),gelismistestdenekara.mostCurrent._list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))))) { 
 BA.debugLineNum = 308;BA.debugLine="list.RemoveAt(j)";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._list.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _j)));
 BA.debugLineNum = 309;BA.debugLine="Log(list&\"  listenin uzunluğu \"&list.Size)";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25308449",RemoteObject.concat(gelismistestdenekara.mostCurrent._list,RemoteObject.createImmutable("  listenin uzunluğu "),gelismistestdenekara.mostCurrent._list.runMethod(true,"getSize")),0);
 };
 };
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 315;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25308455",RemoteObject.createImmutable("BURADA"),0);
 };
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _texttc,RemoteObject _textisim,RemoteObject _textid,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,245);
if (RapidSub.canDelegate("createlistitem")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","createlistitem", _texttc, _textisim, _textid, _width, _height);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("TextTC", _texttc);
Debug.locals.put("TextIsim", _textisim);
Debug.locals.put("TextID", _textid);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 245;BA.debugLine="Sub CreateListItem(TextTC As String, TextIsim As S";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(2097152);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 247;BA.debugLine="panel.Initialize(\"\")";
Debug.ShouldStop(4194304);
_panel.runVoidMethod ("Initialize",gelismistestdenekara.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 248;BA.debugLine="panel.SetLayout(0,0,Width,Height)";
Debug.ShouldStop(8388608);
_panel.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 249;BA.debugLine="panel.LoadLayout(\"GelismisTestDenekAraCustomLvVer";
Debug.ShouldStop(16777216);
_panel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GelismisTestDenekAraCustomLvVeriPage")),gelismistestdenekara.mostCurrent.activityBA);
 BA.debugLineNum = 251;BA.debugLine="LabelId.Visible = False";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._labelid.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 252;BA.debugLine="LabelDenekTc.Text = TextTC";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent._labeldenektc.runMethod(true,"setText",BA.ObjectToCharSequence(_texttc));
 BA.debugLineNum = 253;BA.debugLine="LabelDenekIsim.Text = TextIsim";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._labeldenekisim.runMethod(true,"setText",BA.ObjectToCharSequence(_textisim));
 BA.debugLineNum = 254;BA.debugLine="LabelId.Text = TextID";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._labelid.runMethod(true,"setText",BA.ObjectToCharSequence(_textid));
 BA.debugLineNum = 256;BA.debugLine="Return panel";
Debug.ShouldStop(-2147483648);
if (true) return _panel;
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customlistview1_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,372);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","customlistview1_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 372;BA.debugLine="Sub CustomListView1_ItemClick (Index As Int, Value";
Debug.ShouldStop(524288);
 BA.debugLineNum = 373;BA.debugLine="Log(Value)";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25439489",BA.ObjectToString(_value),0);
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextbabaadi_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextBabaAdi_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,424);
if (RapidSub.canDelegate("edittextbabaadi_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextbabaadi_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 424;BA.debugLine="Sub editTextBabaAdi_TextChanged (Old As String, Ne";
Debug.ShouldStop(128);
 BA.debugLineNum = 425;BA.debugLine="araBabaAdi = EditTextBabaAdi.Text";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._arababaadi = gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"getText");
 BA.debugLineNum = 426;BA.debugLine="Ara";
Debug.ShouldStop(512);
_ara();
 BA.debugLineNum = 427;BA.debugLine="If EditTextBabaAdi.Text == \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 428;BA.debugLine="LabelCarpi3.Visible = False";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent._labelcarpi3.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextbranssinif_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextBransSinif_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,448);
if (RapidSub.canDelegate("edittextbranssinif_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextbranssinif_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 448;BA.debugLine="Sub editTextBransSinif_TextChanged (Old As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="araBransSinif = EditTextBransSinif.Text";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._arabranssinif = gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"getText");
 BA.debugLineNum = 450;BA.debugLine="Ara";
Debug.ShouldStop(2);
_ara();
 BA.debugLineNum = 451;BA.debugLine="If EditTextBransSinif.Text == \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextbranssinif.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 452;BA.debugLine="LabelCarpi6.Visible = False";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._labelcarpi6.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextengeldurumu_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextEngelDurumu_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,432);
if (RapidSub.canDelegate("edittextengeldurumu_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextengeldurumu_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 432;BA.debugLine="Sub editTextEngelDurumu_TextChanged (Old As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="araEngelDurumu = EditTextEngelDurumu.Text";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._araengeldurumu = gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"getText");
 BA.debugLineNum = 434;BA.debugLine="Ara";
Debug.ShouldStop(131072);
_ara();
 BA.debugLineNum = 435;BA.debugLine="If EditTextEngelDurumu.Text == \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 436;BA.debugLine="LabelCarpi4.Visible = False";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._labelcarpi4.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextisim_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextIsim_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,415);
if (RapidSub.canDelegate("edittextisim_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextisim_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 415;BA.debugLine="Sub editTextIsim_TextChanged (Old As String, New A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="LabelCarpi2.Visible = True";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._labelcarpi2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 417;BA.debugLine="araIsim = EditTextIsim.Text";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._araisim = gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"getText");
 BA.debugLineNum = 418;BA.debugLine="Ara";
Debug.ShouldStop(2);
_ara();
 BA.debugLineNum = 419;BA.debugLine="If EditTextIsim.Text == \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextisim.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 420;BA.debugLine="LabelCarpi2.Visible = False";
Debug.ShouldStop(8);
gelismistestdenekara.mostCurrent._labelcarpi2.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextkimlikno_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextKimlikNo_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,405);
if (RapidSub.canDelegate("edittextkimlikno_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextkimlikno_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 405;BA.debugLine="Sub editTextKimlikNo_TextChanged (Old As String, N";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 406;BA.debugLine="Log(\"BURADA\")";
Debug.ShouldStop(2097152);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","25636097",RemoteObject.createImmutable("BURADA"),0);
 BA.debugLineNum = 407;BA.debugLine="LabelCarpi1.Visible = True";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._labelcarpi1.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 408;BA.debugLine="araTc = EditTextKimlikNo.Text";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._aratc = gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"getText");
 BA.debugLineNum = 409;BA.debugLine="Ara";
Debug.ShouldStop(16777216);
_ara();
 BA.debugLineNum = 410;BA.debugLine="If EditTextKimlikNo.Text == \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextkimlikno.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 411;BA.debugLine="LabelCarpi1.Visible = False";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._labelcarpi1.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextmevki_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("editTextMevki_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,456);
if (RapidSub.canDelegate("edittextmevki_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittextmevki_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 456;BA.debugLine="Sub editTextMevki_TextChanged (Old As String, New";
Debug.ShouldStop(128);
 BA.debugLineNum = 457;BA.debugLine="araMevki = EditTextMevki.Text";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._aramevki = gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"getText");
 BA.debugLineNum = 458;BA.debugLine="Ara";
Debug.ShouldStop(512);
_ara();
 BA.debugLineNum = 459;BA.debugLine="If EditTextMevki.Text == \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittextmevki.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 460;BA.debugLine="LabelCarpi7.Visible = False";
Debug.ShouldStop(2048);
gelismistestdenekara.mostCurrent._labelcarpi7.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexttakimokul_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextTakimOkul_TextChanged (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,440);
if (RapidSub.canDelegate("edittexttakimokul_textchanged")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","edittexttakimokul_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 440;BA.debugLine="Sub EditTextTakimOkul_TextChanged (Old As String,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="araTakimOkul = EditTextTakimOkul.Text";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._aratakimokul = gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"getText");
 BA.debugLineNum = 442;BA.debugLine="Ara";
Debug.ShouldStop(33554432);
_ara();
 BA.debugLineNum = 443;BA.debugLine="If EditTextTakimOkul.Text == \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",gelismistestdenekara.mostCurrent._edittexttakimokul.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 444;BA.debugLine="LabelCarpi5.Visible = False";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent._labelcarpi5.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Panel1 As Panel";
gelismistestdenekara.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelKimlikNo As Label";
gelismistestdenekara.mostCurrent._labelkimlikno = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Labelisim As Label";
gelismistestdenekara.mostCurrent._labelisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelCinsiyet As Label";
gelismistestdenekara.mostCurrent._labelcinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelDogumTarihi As Label";
gelismistestdenekara.mostCurrent._labeldogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelDogumYeri As Label";
gelismistestdenekara.mostCurrent._labeldogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelBabaAdi As Label";
gelismistestdenekara.mostCurrent._labelbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelEngel As Label";
gelismistestdenekara.mostCurrent._labelengel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextEngelDurumu As EditText";
gelismistestdenekara.mostCurrent._edittextengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EditTextBabaAdi As EditText";
gelismistestdenekara.mostCurrent._edittextbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private SpinnerDogumYeri As Spinner";
gelismistestdenekara.mostCurrent._spinnerdogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonDogumTarihi As Button";
gelismistestdenekara.mostCurrent._buttondogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private SpinnerCinsiyet As Spinner";
gelismistestdenekara.mostCurrent._spinnercinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private EditTextIsim As EditText";
gelismistestdenekara.mostCurrent._edittextisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private EditTextKimlikNo As EditText";
gelismistestdenekara.mostCurrent._edittextkimlikno = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelTakimOkul As Label";
gelismistestdenekara.mostCurrent._labeltakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LabelBransSinif As Label";
gelismistestdenekara.mostCurrent._labelbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelMevki As Label";
gelismistestdenekara.mostCurrent._labelmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private EditTextTakimOkul As EditText";
gelismistestdenekara.mostCurrent._edittexttakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private EditTextBransSinif As EditText";
gelismistestdenekara.mostCurrent._edittextbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private EditTextMevki As EditText";
gelismistestdenekara.mostCurrent._edittextmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ScrollView1 As ScrollView";
gelismistestdenekara.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ButtonOK As Button";
gelismistestdenekara.mostCurrent._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private CustomListView1 As CustomListView";
gelismistestdenekara.mostCurrent._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelId As Label";
gelismistestdenekara.mostCurrent._labelid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelDenekIsim As Label";
gelismistestdenekara.mostCurrent._labeldenekisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelDenekTc As Label";
gelismistestdenekara.mostCurrent._labeldenektc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private CheckBoxSecim As CheckBox";
gelismistestdenekara.mostCurrent._checkboxsecim = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Dim id As Int";
gelismistestdenekara._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 50;BA.debugLine="Dim isim,tc As String";
gelismistestdenekara.mostCurrent._isim = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._tc = RemoteObject.createImmutable("");
 //BA.debugLineNum = 52;BA.debugLine="Dim rs As ResultSet";
gelismistestdenekara.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Panel2 As Panel";
gelismistestdenekara.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private LabelGun As Label";
gelismistestdenekara.mostCurrent._labelgun = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private LabelAy As Label";
gelismistestdenekara.mostCurrent._labelay = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private LabelYil As Label";
gelismistestdenekara.mostCurrent._labelyil = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private ButtonTarihAyar As Button";
gelismistestdenekara.mostCurrent._buttontarihayar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private SpinnerGun As Spinner";
gelismistestdenekara.mostCurrent._spinnergun = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private SpinnerAy As Spinner";
gelismistestdenekara.mostCurrent._spinneray = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private SpinnerYil As Spinner";
gelismistestdenekara.mostCurrent._spinneryil = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Dim araCinsiyet,araDogumYeri As String = \"\"";
gelismistestdenekara.mostCurrent._aracinsiyet = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._aradogumyeri = BA.ObjectToString("");
 //BA.debugLineNum = 64;BA.debugLine="Dim araDogumTarihi ,araAy As String";
gelismistestdenekara.mostCurrent._aradogumtarihi = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._araay = RemoteObject.createImmutable("");
 //BA.debugLineNum = 65;BA.debugLine="Dim araGun As Int";
gelismistestdenekara._aragun = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 66;BA.debugLine="Dim araYil As Int";
gelismistestdenekara._arayil = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 67;BA.debugLine="Dim araTc, araIsim, araBabaAdi, araEngelDurumu, a";
gelismistestdenekara.mostCurrent._aratc = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._araisim = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._arababaadi = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._araengeldurumu = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._aratakimokul = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._arabranssinif = RemoteObject.createImmutable("");
gelismistestdenekara.mostCurrent._aramevki = BA.ObjectToString("");
 //BA.debugLineNum = 69;BA.debugLine="Dim silinenListe As List";
gelismistestdenekara.mostCurrent._silinenliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 70;BA.debugLine="Dim list As List";
gelismistestdenekara.mostCurrent._list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 72;BA.debugLine="Private LabelCarpi1 As Label";
gelismistestdenekara.mostCurrent._labelcarpi1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private LabelCarpi2 As Label";
gelismistestdenekara.mostCurrent._labelcarpi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private LabelCarpi3 As Label";
gelismistestdenekara.mostCurrent._labelcarpi3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private LabelCarpi4 As Label";
gelismistestdenekara.mostCurrent._labelcarpi4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private LabelCarpi5 As Label";
gelismistestdenekara.mostCurrent._labelcarpi5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private LabelCarpi6 As Label";
gelismistestdenekara.mostCurrent._labelcarpi6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private LabelCarpi7 As Label";
gelismistestdenekara.mostCurrent._labelcarpi7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _kisimgizle() throws Exception{
try {
		Debug.PushSubsStack("KisimGizle (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,229);
if (RapidSub.canDelegate("kisimgizle")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","kisimgizle");}
 BA.debugLineNum = 229;BA.debugLine="Sub KisimGizle";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="LabelDogumYeri.Visible = False";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._labeldogumyeri.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 231;BA.debugLine="LabelDogumYeri.Enabled = False";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._labeldogumyeri.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 232;BA.debugLine="LabelBabaAdi.Visible = False";
Debug.ShouldStop(128);
gelismistestdenekara.mostCurrent._labelbabaadi.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 233;BA.debugLine="LabelBabaAdi.Enabled = False";
Debug.ShouldStop(256);
gelismistestdenekara.mostCurrent._labelbabaadi.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 234;BA.debugLine="LabelEngel.Visible = False";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent._labelengel.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 235;BA.debugLine="LabelEngel.Enabled = False";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._labelengel.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 237;BA.debugLine="SpinnerDogumYeri.Visible = False";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 238;BA.debugLine="SpinnerDogumYeri.Enabled = False";
Debug.ShouldStop(8192);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 239;BA.debugLine="EditTextBabaAdi.Visible = False";
Debug.ShouldStop(16384);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 240;BA.debugLine="EditTextBabaAdi.Enabled = False";
Debug.ShouldStop(32768);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="EditTextEngelDurumu.Visible = False";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="EditTextEngelDurumu.Enabled = False";
Debug.ShouldStop(131072);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kisimgoster() throws Exception{
try {
		Debug.PushSubsStack("KisimGoster (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,213);
if (RapidSub.canDelegate("kisimgoster")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","kisimgoster");}
 BA.debugLineNum = 213;BA.debugLine="Sub KisimGoster";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="LabelDogumYeri.Visible = True";
Debug.ShouldStop(2097152);
gelismistestdenekara.mostCurrent._labeldogumyeri.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 215;BA.debugLine="LabelDogumYeri.Enabled = True";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._labeldogumyeri.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 216;BA.debugLine="LabelBabaAdi.Visible = True";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._labelbabaadi.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 217;BA.debugLine="LabelBabaAdi.Enabled = True";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._labelbabaadi.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 218;BA.debugLine="LabelEngel.Visible = True";
Debug.ShouldStop(33554432);
gelismistestdenekara.mostCurrent._labelengel.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 219;BA.debugLine="LabelEngel.Enabled = True";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._labelengel.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 221;BA.debugLine="SpinnerDogumYeri.Visible = True";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 222;BA.debugLine="SpinnerDogumYeri.Enabled = True";
Debug.ShouldStop(536870912);
gelismistestdenekara.mostCurrent._spinnerdogumyeri.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 223;BA.debugLine="EditTextBabaAdi.Visible = True";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 224;BA.debugLine="EditTextBabaAdi.Enabled = True";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 225;BA.debugLine="EditTextEngelDurumu.Visible = True";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setVisible",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 226;BA.debugLine="EditTextEngelDurumu.Enabled = True";
Debug.ShouldStop(2);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethod(true,"setEnabled",gelismistestdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi1_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi1_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,614);
if (RapidSub.canDelegate("labelcarpi1_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi1_click");}
 BA.debugLineNum = 614;BA.debugLine="Sub LabelCarpi1_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 615;BA.debugLine="EditTextKimlikNo.SelectAll";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._edittextkimlikno.runVoidMethod ("SelectAll");
 BA.debugLineNum = 616;BA.debugLine="EditTextKimlikNo.Text = \"\"";
Debug.ShouldStop(128);
gelismistestdenekara.mostCurrent._edittextkimlikno.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi2_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi2_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,620);
if (RapidSub.canDelegate("labelcarpi2_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi2_click");}
 BA.debugLineNum = 620;BA.debugLine="Sub LabelCarpi2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 621;BA.debugLine="EditTextIsim.SelectAll";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._edittextisim.runVoidMethod ("SelectAll");
 BA.debugLineNum = 622;BA.debugLine="EditTextIsim.Text = \"\"";
Debug.ShouldStop(8192);
gelismistestdenekara.mostCurrent._edittextisim.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi3_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi3_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,625);
if (RapidSub.canDelegate("labelcarpi3_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi3_click");}
 BA.debugLineNum = 625;BA.debugLine="Sub LabelCarpi3_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 626;BA.debugLine="EditTextBabaAdi.SelectAll";
Debug.ShouldStop(131072);
gelismistestdenekara.mostCurrent._edittextbabaadi.runVoidMethod ("SelectAll");
 BA.debugLineNum = 627;BA.debugLine="EditTextBabaAdi.Text = \"\"";
Debug.ShouldStop(262144);
gelismistestdenekara.mostCurrent._edittextbabaadi.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi4_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi4_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,630);
if (RapidSub.canDelegate("labelcarpi4_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi4_click");}
 BA.debugLineNum = 630;BA.debugLine="Sub LabelCarpi4_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 631;BA.debugLine="EditTextEngelDurumu.SelectAll";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runVoidMethod ("SelectAll");
 BA.debugLineNum = 632;BA.debugLine="EditTextEngelDurumu.Text = \"\"";
Debug.ShouldStop(8388608);
gelismistestdenekara.mostCurrent._edittextengeldurumu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 633;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi5_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi5_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,635);
if (RapidSub.canDelegate("labelcarpi5_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi5_click");}
 BA.debugLineNum = 635;BA.debugLine="Sub LabelCarpi5_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 636;BA.debugLine="EditTextTakimOkul.SelectAll";
Debug.ShouldStop(134217728);
gelismistestdenekara.mostCurrent._edittexttakimokul.runVoidMethod ("SelectAll");
 BA.debugLineNum = 637;BA.debugLine="EditTextTakimOkul.Text = \"\"";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._edittexttakimokul.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi6_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi6_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,640);
if (RapidSub.canDelegate("labelcarpi6_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi6_click");}
 BA.debugLineNum = 640;BA.debugLine="Sub LabelCarpi6_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="EditTextBransSinif.SelectAll";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._edittextbranssinif.runVoidMethod ("SelectAll");
 BA.debugLineNum = 642;BA.debugLine="EditTextBransSinif.Text = \"\"";
Debug.ShouldStop(2);
gelismistestdenekara.mostCurrent._edittextbranssinif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi7_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi7_Click (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,645);
if (RapidSub.canDelegate("labelcarpi7_click")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","labelcarpi7_click");}
 BA.debugLineNum = 645;BA.debugLine="Sub LabelCarpi7_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 646;BA.debugLine="EditTextMevki.SelectAll";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._edittextmevki.runVoidMethod ("SelectAll");
 BA.debugLineNum = 647;BA.debugLine="EditTextMevki.Text = \"\"";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._edittextmevki.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewgosterdb() throws Exception{
try {
		Debug.PushSubsStack("ListViewGosterDB (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,265);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 265;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="CustomListView1.Clear";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent._customlistview1.runVoidMethod ("_clear");
 BA.debugLineNum = 267;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent._rs.setObject(gelismistestdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Denek ORDER BY denek_id DESC"))));
 BA.debugLineNum = 268;BA.debugLine="For i = 0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {gelismistestdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
gelismistestdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 270;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 271;BA.debugLine="CustomListView1.Add(CreateListItem(tc,isim,id,Cu";
Debug.ShouldStop(16384);
gelismistestdenekara.mostCurrent._customlistview1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(gelismistestdenekara.mostCurrent._tc,gelismistestdenekara.mostCurrent._isim,gelismistestdenekara._id,gelismistestdenekara.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"getWidth"),gelismistestdenekara.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))).getObject()),(Object)((gelismistestdenekara._id)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 273;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim checkedIdList As List";
gelismistestdenekara._checkedidlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="Dim checkedTcList As List";
gelismistestdenekara._checkedtclist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 11;BA.debugLine="Dim checkedIsimList As List";
gelismistestdenekara._checkedisimlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinneray_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerAy_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,494);
if (RapidSub.canDelegate("spinneray_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","spinneray_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 494;BA.debugLine="Sub SpinnerAy_ItemClick (Position As Int, Value As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 495;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 496;BA.debugLine="If Value == \"Ocak\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ocak")))) { 
 BA.debugLineNum = 497;BA.debugLine="araAy = 1";
Debug.ShouldStop(65536);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(1);
 }else 
{ BA.debugLineNum = 498;BA.debugLine="Else if Value == \"Şubat\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Şubat")))) { 
 BA.debugLineNum = 499;BA.debugLine="araAy = 2";
Debug.ShouldStop(262144);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(2);
 }else 
{ BA.debugLineNum = 500;BA.debugLine="Else if Value == \"Mart\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Mart")))) { 
 BA.debugLineNum = 501;BA.debugLine="araAy = 3";
Debug.ShouldStop(1048576);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(3);
 }else 
{ BA.debugLineNum = 502;BA.debugLine="Else if Value == \"Nisan\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Nisan")))) { 
 BA.debugLineNum = 503;BA.debugLine="araAy = 4";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(4);
 }else 
{ BA.debugLineNum = 504;BA.debugLine="Else if Value == \"Mayıs\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Mayıs")))) { 
 BA.debugLineNum = 505;BA.debugLine="araAy = 5";
Debug.ShouldStop(16777216);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(5);
 }else 
{ BA.debugLineNum = 506;BA.debugLine="Else if Value == \"Haziran\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Haziran")))) { 
 BA.debugLineNum = 507;BA.debugLine="araAy = 6";
Debug.ShouldStop(67108864);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(6);
 }else 
{ BA.debugLineNum = 508;BA.debugLine="Else if Value == \"Temmuz\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Temmuz")))) { 
 BA.debugLineNum = 509;BA.debugLine="araAy = 7";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(7);
 }else 
{ BA.debugLineNum = 510;BA.debugLine="Else if Value == \"Ağustos\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ağustos")))) { 
 BA.debugLineNum = 511;BA.debugLine="araAy = 8";
Debug.ShouldStop(1073741824);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(8);
 }else 
{ BA.debugLineNum = 512;BA.debugLine="Else if Value == \"Eylül\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Eylül")))) { 
 BA.debugLineNum = 513;BA.debugLine="araAy = 9";
Debug.ShouldStop(1);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(9);
 }else 
{ BA.debugLineNum = 514;BA.debugLine="Else if Value == \"Ekim\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Ekim")))) { 
 BA.debugLineNum = 515;BA.debugLine="araAy = 10";
Debug.ShouldStop(4);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(10);
 }else 
{ BA.debugLineNum = 516;BA.debugLine="Else if Value == \"Kasım\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Kasım")))) { 
 BA.debugLineNum = 517;BA.debugLine="araAy = 11";
Debug.ShouldStop(16);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(11);
 }else 
{ BA.debugLineNum = 518;BA.debugLine="Else if Value == \"Aralık\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Aralık")))) { 
 BA.debugLineNum = 519;BA.debugLine="araAy = 12";
Debug.ShouldStop(64);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(12);
 }}}}}}}}}}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",gelismistestdenekara.processBA, e28.toString()); BA.debugLineNum = 522;BA.debugLine="araAy = 6";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent._araay = BA.NumberToString(6);
 BA.debugLineNum = 523;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","26291485",BA.ObjectToString(gelismistestdenekara.mostCurrent.__c.runMethod(false,"LastException",gelismistestdenekara.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("spinnerCinsiyet_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,466);
if (RapidSub.canDelegate("spinnercinsiyet_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","spinnercinsiyet_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 466;BA.debugLine="Sub spinnerCinsiyet_ItemClick (Position As Int, Va";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 468;BA.debugLine="araCinsiyet= Value";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent._aracinsiyet = BA.ObjectToString(_value);
 BA.debugLineNum = 469;BA.debugLine="Ara";
Debug.ShouldStop(1048576);
_ara();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",gelismistestdenekara.processBA, e5.toString()); BA.debugLineNum = 471;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","26094853",BA.ObjectToString(gelismistestdenekara.mostCurrent.__c.runMethod(false,"LastException",gelismistestdenekara.mostCurrent.activityBA)),0);
 };
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
public static RemoteObject  _spinnerdogumyeri_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinnerDogumYeri_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,475);
if (RapidSub.canDelegate("spinnerdogumyeri_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","spinnerdogumyeri_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 475;BA.debugLine="Sub spinnerDogumYeri_ItemClick (Position As Int, V";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 477;BA.debugLine="araDogumYeri= Value";
Debug.ShouldStop(268435456);
gelismistestdenekara.mostCurrent._aradogumyeri = BA.ObjectToString(_value);
 BA.debugLineNum = 478;BA.debugLine="Ara";
Debug.ShouldStop(536870912);
_ara();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",gelismistestdenekara.processBA, e5.toString()); BA.debugLineNum = 480;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","26160389",BA.ObjectToString(gelismistestdenekara.mostCurrent.__c.runMethod(false,"LastException",gelismistestdenekara.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("SpinnerGun_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,485);
if (RapidSub.canDelegate("spinnergun_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","spinnergun_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 485;BA.debugLine="Sub SpinnerGun_ItemClick (Position As Int, Value A";
Debug.ShouldStop(16);
 BA.debugLineNum = 486;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 487;BA.debugLine="araGun = Value";
Debug.ShouldStop(64);
gelismistestdenekara._aragun = BA.numberCast(int.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",gelismistestdenekara.processBA, e4.toString()); BA.debugLineNum = 489;BA.debugLine="araGun = 28";
Debug.ShouldStop(256);
gelismistestdenekara._aragun = BA.numberCast(int.class, 28);
 BA.debugLineNum = 490;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","26225925",BA.ObjectToString(gelismistestdenekara.mostCurrent.__c.runMethod(false,"LastException",gelismistestdenekara.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SpinnerYil_ItemClick (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,527);
if (RapidSub.canDelegate("spinneryil_itemclick")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","spinneryil_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 527;BA.debugLine="Sub SpinnerYil_ItemClick (Position As Int, Value A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 528;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 529;BA.debugLine="araYil = Value";
Debug.ShouldStop(65536);
gelismistestdenekara._arayil = BA.numberCast(int.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",gelismistestdenekara.processBA, e4.toString()); BA.debugLineNum = 531;BA.debugLine="araYil = 1996";
Debug.ShouldStop(262144);
gelismistestdenekara._arayil = BA.numberCast(int.class, 1996);
 BA.debugLineNum = 532;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
gelismistestdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","26356997",BA.ObjectToString(gelismistestdenekara.mostCurrent.__c.runMethod(false,"LastException",gelismistestdenekara.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verial() throws Exception{
try {
		Debug.PushSubsStack("VeriAl (gelismistestdenekara) ","gelismistestdenekara",6,gelismistestdenekara.mostCurrent.activityBA,gelismistestdenekara.mostCurrent,259);
if (RapidSub.canDelegate("verial")) { return b4a.example3.gelismistestdenekara.remoteMe.runUserSub(false, "gelismistestdenekara","verial");}
 BA.debugLineNum = 259;BA.debugLine="Sub VeriAl";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="id = rs.GetInt(\"denek_id\")";
Debug.ShouldStop(8);
gelismistestdenekara._id = gelismistestdenekara.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("denek_id")));
 BA.debugLineNum = 261;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(16);
gelismistestdenekara.mostCurrent._tc = gelismistestdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 262;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(32);
gelismistestdenekara.mostCurrent._isim = gelismistestdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}