import com.google.common.collect.Maps;
import com.wisdombud.core.tuple.TwoTuple;

import java.util.Map;

/**
 * Created by vivider on 2016/9/6.
 */
public class MyMapToXml {
    public static final Map<String, TwoTuple<String, String>> ALARMCAUSEMAP = Maps.newHashMap();
    public static final Map<String, String> DETAILMAP = Maps.newHashMap();

    static {
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.1",
            new TwoTuple<String, String>("A new ONU register success.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.2",
            new TwoTuple<String, String>("An ONU reregister success.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.3",
            new TwoTuple<String, String>("An ONU is not present alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.4",
            new TwoTuple<String, String>("device Power Alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.5",
            new TwoTuple<String, String>("device Power Alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.6",
            new TwoTuple<String, String>("saving config data to flash successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.7",
            new TwoTuple<String, String>("saving config data to flash unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.8",
            new TwoTuple<String, String>("clear config data successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.9",
            new TwoTuple<String, String>("clear config data unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.10",
            new TwoTuple<String, String>("update software successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.11",
            new TwoTuple<String, String>("update software unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.12",
            new TwoTuple<String, String>("firmware update successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.13",
            new TwoTuple<String, String>("update firmware unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.14",
            new TwoTuple<String, String>("backup configuration data to NMS successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.15",
            new TwoTuple<String, String>("backup configuration data  to NMS unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.16",
            new TwoTuple<String, String>("restore configuration data from NMS successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.17",
            new TwoTuple<String, String>("restore configuration data from NMS unsuccessfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.18",
            new TwoTuple<String, String>("Auto Protect Switch(APS) occurs.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.19",
            new TwoTuple<String, String>("high cpu usage factor alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.20",
            new TwoTuple<String, String>("pon port BER alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.21",
            new TwoTuple<String, String>("pon port BER alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.22",
            new TwoTuple<String, String>("pon port FER alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.23",
            new TwoTuple<String, String>("pon port FER alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.24",
            new TwoTuple<String, String>("llid bandwidth exceed the limit.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.25",
            new TwoTuple<String, String>("llid bandwidth return to appropriate value.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.26",
            new TwoTuple<String, String>("insert a board.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.27",
            new TwoTuple<String, String>("pull a board out.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.30",
            new TwoTuple<String, String>("power alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.31",
            new TwoTuple<String, String>("power alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.32",
            new TwoTuple<String, String>("board temperature high alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.33",
            new TwoTuple<String, String>("board temperature high alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.34",
            new TwoTuple<String, String>("PON board reset event occur.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.35",
            new TwoTuple<String, String>("sw board protected switch event occur.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.36",
            new TwoTuple<String, String>("abnormal status on PON port occur.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.37",
            new TwoTuple<String, String>("onu register conflict.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.38",
            new TwoTuple<String, String>("firmware load successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.39",
            new TwoTuple<String, String>("firmware load fail.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.40",
            new TwoTuple<String, String>("update dba successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.41",
            new TwoTuple<String, String>("update dba faul.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.42",
            new TwoTuple<String, String>("load dba successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.43",
            new TwoTuple<String, String>("load dba fail.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.44",
            new TwoTuple<String, String>("Pon To Eth Linkdown.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.45",
            new TwoTuple<String, String>("Pon To Eth Linkdown.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.46",
            new TwoTuple<String, String>("load onu software successfully.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.47",
            new TwoTuple<String, String>("load onu software fail.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.54",
            new TwoTuple<String, String>("Ethernet port linkdown alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.55",
            new TwoTuple<String, String>("Ethernet port linkdown alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.56",
            new TwoTuple<String, String>("boot firmware update successfully notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.57",
            new TwoTuple<String, String>("boot firmware update fail notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.58",
            new TwoTuple<String, String>("bat file backup successfully notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.59",
            new TwoTuple<String, String>("bat file backup fail notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.60",
            new TwoTuple<String, String>("bat file restore successfully notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.61",
            new TwoTuple<String, String>("bat file restore fail notification.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.62",
            new TwoTuple<String, String>("Illegal ONU register.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.63", new TwoTuple<String, String>(
            "Only report OLT cold start. this trap is not sent if a devPowerOn trap is sent for the same restart. "
            + "Implementation of this trap is optional.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.64",
            new TwoTuple<String, String>("Only report OLT warm start.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.65",
            new TwoTuple<String, String>("Only report OLT restart because of exception.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.84",
            new TwoTuple<String, String>("Ethernet port loop alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.85",
            new TwoTuple<String, String>("Ethernet port loop alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.86",
            new TwoTuple<String, String>("Onu loop alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.87",
            new TwoTuple<String, String>("Onu loop alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.88",
            new TwoTuple<String, String>("Ethernet port linkdown alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.89",
            new TwoTuple<String, String>("Ethernet port linkdown alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.116",
            new TwoTuple<String, String>("cpu usage factor alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.117",
            new TwoTuple<String, String>("cpu usage factor alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.118",
            new TwoTuple<String, String>("Board Memory Usage Alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.119",
            new TwoTuple<String, String>("Board Memory Usage Alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.132",
            new TwoTuple<String, String>("Pon Port Full Alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.133",
            new TwoTuple<String, String>("Pon Port Full Alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.136",
            new TwoTuple<String, String>("Ethernet port broadcast flood alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.137",
            new TwoTuple<String, String>("Ethernet port broadcast flood alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.138",
            new TwoTuple<String, String>("Sysfile Upload Success.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.139",
            new TwoTuple<String, String>("sysfile Upload Failure.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.140",
            new TwoTuple<String, String>("Sysfile Download Success.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.141",
            new TwoTuple<String, String>("sysfile Download Failure.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.142",
            new TwoTuple<String, String>("Pon Port Los Alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.143",
            new TwoTuple<String, String>("Pon Port Los Alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.144",
            new TwoTuple<String, String>("Pon FW Version Mismatch.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.145",
            new TwoTuple<String, String>("Pon FW Version Match.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.146",
            new TwoTuple<String, String>("Pon DBA Version Mismatch.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.147",
            new TwoTuple<String, String>("Pon DBA Version Match.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.148",
            new TwoTuple<String, String>("Pon SFP Type Mismatch", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.149",
            new TwoTuple<String, String>("Pon SFP Type Mitch", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.150",
            new TwoTuple<String, String>("Pon Port BRAS Alarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.151",
            new TwoTuple<String, String>("Pon Port BRAS Alarm.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.152",
            new TwoTuple<String, String>("Pon Port Up No Traffic.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.153",
            new TwoTuple<String, String>("Pon Port Up No Traffic.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.154",
            new TwoTuple<String, String>("Illegal ONU register.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.208",
            new TwoTuple<String, String>("onu mac table over flow.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.209",
            new TwoTuple<String, String>("onu mac table over flow.", "6110010000000000"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.215",
            new TwoTuple<String, String>("Onu Backup PonAlarm.", "6110010000000001"));
        ALARMCAUSEMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.216",
            new TwoTuple<String, String>("Onu Backup PonAlarm.", "6110010000000000"));

    }

    static {
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.1",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.2",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.3", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.4", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.5",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion,"
            + "deviceRestartupTime");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.6", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.7", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.8", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.9", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.10", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.11", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.12", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.13", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.14", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.15", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.16", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.17", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.18", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.19", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.20", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponPortBER");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.21", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponPortBER");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.22", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponPortFER");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.23", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponPortFER");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.24", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponLlidIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.25", "deviceIndex,ponPortBrdIndex,ponPortIndex,ponLlidIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.26", "deviceIndex,boardIndex,curBoardType");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.27", "deviceIndex,boardIndex,curBoardType");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.30", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.31", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.32", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.33", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.34", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.35", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.36", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.37", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.38", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.39", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.40", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.41", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.42", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.43", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.44", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.45", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.46", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.47", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.54", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.55", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.56", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.57", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.58", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.59", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.60", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.61", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.62", "deviceIndex,boardIndex,ponPortIndexdeviceMacAddress");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.63",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion,"
            + "deviceRestartupTime");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.64",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion,"
            + "deviceRestartupTime");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.65",
            "deviceIndex,deviceType,deviceSoftWareVersion,deviceFirmWareVersion,deviceHardWareVersion,"
            + "deviceRestartupTime");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.84", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.85", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.86", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.87", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.88", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.89", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.116", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.117", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.118", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.119", "deviceIndex,boardIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.132", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.133", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.136", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.137", "deviceIndex,boardIndex,ethPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.138", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.139", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.140", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.141", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.142", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.143", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.144", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.145", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.146", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.147", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.148", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.149", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.150", "deviceIndex,boardIndex,ponPortIndex,brasMacAddress");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.151", "deviceIndex,boardIndex,ponPortIndex,brasMacAddress");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.152", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.153", "deviceIndex,boardIndex,ponPortIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.154",
            "onuPredefPonSlotIdx,onuPredefPonPortIdx,onuPredefOnuIdx,onuPredefOnuMacAddr, onuPredefOnuDevIdx");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.208", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.209", "deviceIndex");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.215",
            "deviceIndex,boardIndex,ponPortIndex,deviceMacAddress,ponPortAlarmStatus");
        DETAILMAP.put(".1.3.6.1.4.1.10072.2.20.1.1.6.216",
            "deviceIndex,boardIndex,ponPortIndex,deviceMacAddress,ponPortAlarmStatus");
    }

    public static void main(final String[] args) {
        for (final String key : ALARMCAUSEMAP.keySet()) {
            System.out.println("<cause>");
            System.out.println("<oid>" + key + "</oid>");
            System.out.println("<cau>" + ALARMCAUSEMAP.get(key).getFirst() + "</cau>");
            System.out.println("<ala>" + ALARMCAUSEMAP.get(key).getSecond() + "</ala>");
            System.out.println("<detail>" + DETAILMAP.get(key) + "</detail>");
            System.out.println("</cause>");
        }
    }
}
