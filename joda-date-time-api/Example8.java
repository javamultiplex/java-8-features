package com.javamultiplex.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Demo of ZonedId and ZonedDateTime class methods.
public class Example8 {
	public static void main(String[] args) {

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		ZoneId zoneId2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId2);
		System.out.println(zonedDateTime);

	}
}
