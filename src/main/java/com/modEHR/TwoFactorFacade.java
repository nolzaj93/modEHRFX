package com.modEHR;

import java.security.SecureRandom;
import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

public class TwoFactorFacade {

  private static volatile TwoFactorFacade twoFactorInstance;

  private TwoFactorFacade(){

  }

  private String generateSecret() {
    SecureRandom random = new SecureRandom();
    byte[] bytes = new byte[20];
    random.nextBytes(bytes);
    Base32 base32 = new Base32();
    return base32.encodeToString(bytes);
  }

  public static String getTOTPCode(String secretKey) {
    Base32 base32 = new Base32();
    byte[] bytes = base32.decode(secretKey);
    String hexKey = Hex.encodeHexString(bytes);
    return TOTP.getOTP(hexKey);
  }

  public static void generateCodes(String secretKey) {
    String lastCode = null;
    while (true) {
      String code = getTOTPCode(secretKey);
      if (!code.equals(lastCode)) {
        System.out.println(code);
      }
      lastCode = code;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {};
    }
  }

  // Sample Client code:
  // https://github.com/IhorSokolyk/google-2fa/blob/master/src/main/java/com/example/googleauth/MainApplication.java

  public static TwoFactorFacade getInstance() {
    if (twoFactorInstance == null) {
      synchronized (TwoFactorFacade.class) {
        if (twoFactorInstance == null) {
          twoFactorInstance = new TwoFactorFacade();
        }
      }

    }
    return twoFactorInstance;
  }
}
