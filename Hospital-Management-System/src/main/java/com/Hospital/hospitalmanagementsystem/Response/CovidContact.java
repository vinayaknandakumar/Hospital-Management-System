package com.Hospital.hospitalmanagementsystem.Response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CovidContact {
    private boolean success;
    private Data data;
    private String lastRefreshed;
    private String lastOriginUpdate;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data {
        private Contacts contacts;

        @Getter
        @Setter
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Contacts {
            private Primary primary;
            private List<Regional> regional;

            @Getter
            @Setter
            @AllArgsConstructor
            @NoArgsConstructor
            public static class Primary {
                private String number;
                private String numberTollfree;
                private String email;
                private String twitter;
                private String facebook;
                private List<String> media;
            }
            @Getter
            @Setter
            @AllArgsConstructor
            @NoArgsConstructor
            public static class Regional {
                private String loc;
                private String number;
            }
        }
    }



}
