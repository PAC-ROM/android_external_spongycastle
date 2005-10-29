package org.bouncycastle.openpgp.test;

import java.security.Security;

import org.bouncycastle.util.test.Test;
import org.bouncycastle.util.test.TestResult;

public class RegressionTest
{
    public static Test[]    tests = {
        new PGPKeyRingTest(),
        new PGPRSATest(),
        new PGPDSATest(),
        new PGPDSAElGamalTest(),
        new PGPPBETest(),
        new PGPMarkerTest(),
        new PGPPacketTest(),
        new PGPArmoredTest(),
        new PGPSignatureTest(),
        new PGPCompressionTest()
    };

    public static void main(
        String[]    args)
    {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        for (int i = 0; i != tests.length; i++)
        {
            TestResult  result = tests[i].perform();
            System.out.println(result);
        }
    }
}

