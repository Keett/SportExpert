package b4a.example3;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
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
public b4a.example3.insertveriler _insertveriler = null;
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
public static boolean  _tableexists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "tableexists", false))
	 {return ((Boolean) Debug.delegate(null, "tableexists", new Object[] {_ba,_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",new String[]{_tablename})));
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="End Sub";
return false;
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executehtml", false))
	 {return ((String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("211010055","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=11010077;
 //BA.debugLineNum = 11010077;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=11010078;
 //BA.debugLineNum = 11010078;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=11010079;
 //BA.debugLineNum = 11010079;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=11010081;
 //BA.debugLineNum = 11010081;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=11010083;
 //BA.debugLineNum = 11010083;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=11010084;
 //BA.debugLineNum = 11010084;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=11010085;
 //BA.debugLineNum = 11010085;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=11010086;
 //BA.debugLineNum = 11010086;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=11010087;
 //BA.debugLineNum = 11010087;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=11010088;
 //BA.debugLineNum = 11010088;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=11010090;
 //BA.debugLineNum = 11010090;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=11010092;
 //BA.debugLineNum = 11010092;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=11010094;
 //BA.debugLineNum = 11010094;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=11010095;
 //BA.debugLineNum = 11010095;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=11010097;
 //BA.debugLineNum = 11010097;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=11010098;
 //BA.debugLineNum = 11010098;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=11010099;
 //BA.debugLineNum = 11010099;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=11010100;
 //BA.debugLineNum = 11010100;BA.debugLine="End Sub";
return "";
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executespinner", false))
	 {return ((String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="End Sub";
return "";
}
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "copydbfromassets", false))
	 {return ((String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename}));}
String _targetdir = "";
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String) A";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim TargetDir As String = GetDBFolder";
_targetdir = _getdbfolder(_ba);
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbfolder", false))
	 {return ((String) Debug.delegate(null, "getdbfolder", new Object[] {_ba}));}
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub GetDBFolder As String";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="If File.ExternalWritable Then Return rp.GetSafeDi";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
if (true) return _rp.GetSafeDirDefaultExternal("");}
else {
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirInternal();};
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "createtable", false))
	 {return ((String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_ba,_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_ba,_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("210354702","CreateTable: "+_query,0);
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "escapefield", false))
	 {return ((String) Debug.delegate(null, "escapefield", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "deleterecord", false))
	 {return ((String) Debug.delegate(null, "deleterecord", new Object[] {_ba,_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_ba,_tablename)+" WHERE ");
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("211337733","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("211337743","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "droptable", false))
	 {return ((String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_ba,_tablename);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("210420226","DropTable: "+_query,0);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("210944520","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10944525;
 //BA.debugLineNum = 10944525;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=10944529;
 //BA.debugLineNum = 10944529;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=10944531;
 //BA.debugLineNum = 10944531;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=10944533;
 //BA.debugLineNum = 10944533;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=10944535;
 //BA.debugLineNum = 10944535;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("210944535","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=10944538;
 //BA.debugLineNum = 10944538;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=10944539;
 //BA.debugLineNum = 10944539;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=10944541;
 //BA.debugLineNum = 10944541;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=10944542;
 //BA.debugLineNum = 10944542;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10944543;
 //BA.debugLineNum = 10944543;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=10944544;
 //BA.debugLineNum = 10944544;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=10944545;
 //BA.debugLineNum = 10944545;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=10944546;
 //BA.debugLineNum = 10944546;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executelist", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executememorytable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("210551302","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=10551314;
 //BA.debugLineNum = 10551314;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelist2", false))
	 {return ((String) Debug.delegate(null, "executelist2", new Object[] {_ba,_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_ba,_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="End Sub";
return "";
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executelistview", false))
	 {return ((String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines}));}
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub ExecuteListView(SQL As SQL, Query As St";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(BA.ObjectToCharSequence(_cols[(int) (0)]),BA.ObjectToCharSequence(_cols[(int) (1)]),(Object)(_cols));
 }else {
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(BA.ObjectToCharSequence(_cols[(int) (0)]),(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "executemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("210616840","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("210616842","No records found.",0);
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=10616849;
 //BA.debugLineNum = 10616849;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="End Sub";
return null;
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "getdbversion", false))
	 {return ((Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_ba,_sql,"DBVersion")) { 
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="End Sub";
return 0;
}
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "insertmaps", false))
	 {return ((String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("210485764","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="Try";
try {RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit8 ;_i1 = _i1 + step8 ) {
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _m.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=10485779;
 //BA.debugLineNum = 10485779;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=10485781;
 //BA.debugLineNum = 10485781;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=10485783;
 //BA.debugLineNum = 10485783;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_ba,_col));
RDebugUtils.currentLine=10485784;
 //BA.debugLineNum = 10485784;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=10485785;
 //BA.debugLineNum = 10485785;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=10485787;
 //BA.debugLineNum = 10485787;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=10485788;
 //BA.debugLineNum = 10485788;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("210485788","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=10485789;
 //BA.debugLineNum = 10485789;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=10485791;
 //BA.debugLineNum = 10485791;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e32) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e32);RDebugUtils.currentLine=10485793;
 //BA.debugLineNum = 10485793;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("210485793",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=10485799;
 //BA.debugLineNum = 10485799;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=10485801;
 //BA.debugLineNum = 10485801;BA.debugLine="End Sub";
return "";
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "setdbversion", false))
	 {return ((String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord", false))
	 {return ((String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_ba,_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(null, "updaterecord2", false))
	 {return ((String) Debug.delegate(null, "updaterecord2", new Object[] {_ba,_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("211272194","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("211272198","Fields empty",0);
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_ba,_tablename)).Append(" SET ");
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_ba,_col)).Append("=?");
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_ba,_col)).Append(" = ?");
RDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=11272219;
 //BA.debugLineNum = 11272219;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("211272219","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=11272220;
 //BA.debugLineNum = 11272220;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="End Sub";
return "";
}
}