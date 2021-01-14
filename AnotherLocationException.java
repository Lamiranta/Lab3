package com.ifmo;

import java.io.IOException;

public class AnotherLocationException extends IOException
{
    AnotherLocationException(String message)
    {
        super(message);
    }
}
