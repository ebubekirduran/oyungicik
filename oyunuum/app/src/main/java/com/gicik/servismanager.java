package com.gicik;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


public class servismanager {
    private static final String METHOD_NAME ="Sksorlar";
    private static final String NAMESPACE="http://tempuri.org/";
    private static final String SOAP_ACTION="http://tempuri.org/Sksorlar";
    private static final String URL="http://gicikskorlari.azurewebsites.net";

    SoapObject soapObject;
    SoapSerializationEnvelope soapSerializationEnvelope;
    HttpTransportSE httpTransportSE;


    public void skorlarimiz(String bölüm,String skor ,String ad,String soyad){
        soapObject=new SoapObject(NAMESPACE,METHOD_NAME);
        soapObject.addProperty("bölüm1",bölüm);
        soapObject.addProperty("skor1",skor);
        soapObject.addProperty("ad1",ad);
        soapObject.addProperty("soyad1",soyad);

        soapSerializationEnvelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapSerializationEnvelope.dotNet=true;
        soapSerializationEnvelope.setOutputSoapObject(soapObject);


        httpTransportSE =new HttpTransportSE(URL);
        httpTransportSE.debug=true;

        try{
            httpTransportSE.call(SOAP_ACTION,soapSerializationEnvelope);
            SoapPrimitive soapPrimitive=(SoapPrimitive) soapSerializationEnvelope.getResponse();
            System.out.println(soapPrimitive.toString() );

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
