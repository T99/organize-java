package com.t99sdevelopment;

// Created by Trevor Sears <trevorsears.main@gmail.com> @ 9:57 AM - May 24, 2017

import com.t99sdevelopment.listen.ShutdownListener;

public class Debug{
	
	public static final int RAW_OBJECT = 1;
	public static final int NICE_FORM = 2;
	
	public static final String[] SERIES_EVENTS = {"event1", "event2", "event3"};
	public static final String[] SERIES_PSEUDO = {"Brushed teeth.", "Walked dog.", "Went to get groceries."};
	
	public static void outputLog(int format) {
		
		LogListModel logOutput = Main.mainWindow.log;
		
		if (format != RAW_OBJECT && format != NICE_FORM) {
			
			return;
			
		} else if (format == RAW_OBJECT) {
			
			System.out.println("Raw version of log object:");
			System.out.println(logOutput);
			
		} else if (format == NICE_FORM) {
			
			System.out.println("Formatted version of log object:");
			
			for (int i = 0; i <= (logOutput.size() - 1) ; i++) {
				
				System.out.println(logOutput.get(i));
				
			}
			
		} else {
			
			// Something went seriously wrong, this should not be happening.
			// Just kill everything, as seen below
			new ShutdownListener(99999).actionPerformed(null);
			
		}
		
		
		
	}
	
	public static void insertEvents(String... event) {
	
		for (int i = 0; i < event.length; i++) {
			
			Main.mainWindow.appendNewEvent(event[i]);
			
		}
	
	}
	
	public static void watchpointTrigger() { /* Ha! It does nothing, just like it's supposed to! */ }
	
}