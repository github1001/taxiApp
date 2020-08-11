package com.log.cyclone.General;

public class Globals {

    // Create dummy values for Berlin and drop values to Postdam.
    public static final Double DEFAULT_LATITUDE = 52.5200;
    public static final Double DEFAULT_LONGITUDE = 13.4050;
    public static final Double DEFAULT_DROP_LATITUDE = 52.3906;
    public static final Double DEFAULT_DROP_LONGITUDE = 13.4050;
    private static final String HOST = "http://www.workrack.com.au/webapptheme11/";
    //DriverActivity
    public static final String getRidesUrl = HOST + "requested-rides-list.php";
    public static final String modeSendUrl = HOST + "receievemode.php";
    public static final String dataSendUrl1 = HOST + "update-request.php";
    public static final String dataSendUrl = HOST + "receievelocation.php";
    public static final String taxiRequUrl = HOST + "requesttaxi.php";
    //DriverPositionActivity
    public static final String getDataUrl = HOST + "getlocations.php";
    //LoginActivity
    public static final String regiURL = HOST + "registration.php";
    public static final String loginURL = HOST + "login.php";
    public static final String recoverPasswordURL = HOST + "admin/fog.php";
    //UserRequestActivity
    public static final String getUserRidesUrl = HOST + "user-rides-list.php";
    public static final String smsURL = HOST + "sms.php";//"http://ec2-54-212-211-126.us-west-2.compute.amazonaws.com/sms.php";
    //ChatActivity
    public static final String sendChatMessageUrl = HOST + "send_message.php";
    public static final String getChatMessagesUrl = HOST + "get_messages.php";
    //UserEditProfileActivity
    public static final String updateURL = HOST + "user-edit-profile.php";
}
