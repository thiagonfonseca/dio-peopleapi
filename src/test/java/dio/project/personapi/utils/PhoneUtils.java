package dio.project.personapi.utils;

import dio.project.personapi.dto.request.PhoneDTO;
import dio.project.personapi.entity.Phone;
import dio.project.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(18)997055998";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
