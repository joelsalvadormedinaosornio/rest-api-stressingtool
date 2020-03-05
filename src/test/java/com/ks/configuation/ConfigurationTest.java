package com.ks.configuation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.ks.client.model.TransactionRequest;
import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class ConfigurationTest extends TestCase
{

    public void testReadConfig() throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();

        final String json = "{\"amount\":300,\"card_number\":\"474245653001007\",\"currency_code\":\"484\",\"cvv2\":null,\"deferred_payments\":{\"credit_plan\":null,\"credit_term\":\"00\",\"months_skipped\":\"00\"},\"emv\":{\"emv_5F2A\":\"0484\",\"emv_5F34\":\"00\",\"emv_71\":null,\"emv_72\":null,\"emv_82\":\"3C00\",\"emv_84\":\"A000000025010801\",\"emv_91\":null,\"emv_95\":\"0000008000\",\"emv_9A\":\"180126\",\"emv_9C\":\"00\",\"emv_9F02\":\"000000030000\",\"emv_9F03\":\"000000000000\",\"emv_9F09\":\"0001\",\"emv_9F10\":\"06020103A4B802\",\"emv_9F1A\":\"0484\",\"emv_9F1E\":\"3037303830363534\",\"emv_9F26\":\"FA2D3592264F480B\",\"emv_9F27\":\"80\",\"emv_9F33\":\"E0B0C8\",\"emv_9F34\":\"440302\",\"emv_9F35\":\"22\",\"emv_9F36\":\"0003\",\"emv_9F37\":\"20AD1B5A\",\"emv_9F41\":\"00000016\",\"emv_9F53\":\"52\",\"emv_9F5B\":null},\"expiration_date\":null,\"merchant_type\":null,\"message_type\":\"01\",\"pinpad\":{\"card_sequence\":0,\"entry_mode_1\":\"05\",\"entry_mode_2\":\"1\",\"mit\":\"0\",\"registerid\":\"17\",\"terminal_capability\":\"8\",\"token_C4\":null,\"token_Q1\":null,\"token_Q2\":null},\"points\":{\"available_balance\":0,\"available_exp_balance\":0,\"available_exp_points\":0,\"existing_client\":\"\",\"exp_points_expiration\":\"\",\"point_exponential_factor\":0,\"prev_balance\":0,\"prev_points_balance\":0,\"redeemed_amount\":300,\"redeemed_points\":300,\"reedemed_exp_amount\":0,\"reedemed_exp_points\":0},\"security_data\":{\"key\":\"\\/wECAQEHAoFPAwEH2gEBWg8PIBRkZXYuaG9tZWRlcG90LmNvbS5teA6MX+dutWGMCtMx4+sENOInz0jcIXK67XUm1JlzcZfvUAhFjKD7cW79bcResYexX1Ar5S\\/Witp7yU1VFKMlc16J1VuSGFya+J489Or01xFxw5KrViP9EfZBQ+ParkSQGFbznNhnK02Mu0RHNU5oEB9CaPB40EYUng7pjfaoddv3AmbrYzTivM4Q1mnfgm7DklyY6jjd1ffW\\/yLEM5ESWZLj6UyUbUy4Iv4OeTzhOsA4\"},\"shop_number\":8752,\"track1\":null,\"track2\":\"374245653001007=210320124249967180375\",\"transaction_date\":\"26012018\",\"transaction_id\":\"000000000001\",\"transaction_time\":\"11:45:31\",\"transaction_type\":\"000000\"}";
        final TransactionRequest request = new Gson().fromJson(json, TransactionRequest.class);

        mapper.writeValue(new File("./config\\test.json"), request);
    }
}