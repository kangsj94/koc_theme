package com.koc.tema_back.place.placeClient;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;

import java.io.IOException;
import java.lang.reflect.Type;

public class PlaceDecoder  implements Decoder {

    /** 커스텀 디코드 함수
     *  헤더 체크가 필요하거나 리턴 데이터 파싱시 특정 로직을 추가하고 싶은경우 사용.
     * */
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {

        return new GsonDecoder().decode(response,type);
    }
}