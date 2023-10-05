//package com.Hospital.hospitalmanagementsystem.Security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//@Configuration
//public class PasswordEncrypt {
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

/*

{
  "AN": {
    "delta": {
      "tested": 1376,
      "vaccinated1": 3,
      "vaccinated2": 13
    },
    "delta21_14": {
      "confirmed": 9
    },
    "delta7": {
      "confirmed": 3,
      "recovered": 5,
      "tested": 8936,
      "vaccinated1": 884,
      "vaccinated2": 10640
    },
    "districts": {
      "Nicobars": {
        "delta7": {
          "vaccinated1": 62,
          "vaccinated2": 811
        },
        "meta": {
          "population": 36842
        },
        "total": {
          "vaccinated1": 25394,
          "vaccinated2": 20313
        }
      },
      "North and Middle Andaman": {
        "delta": {
          "vaccinated2": 8
        },
        "delta7": {
          "vaccinated1": 90,
          "vaccinated2": 1839
        },
        "meta": {
          "population": 105597
        },
        "total": {
          "vaccinated1": 78945,
          "vaccinated2": 59522
        }
      },
      "South Andaman": {
        "delta": {
          "vaccinated1": 3,
          "vaccinated2": 28
        },
        "delta7": {
          "vaccinated1": 732,
          "vaccinated2": 8012
        },
        "meta": {
          "population": 238142
        },
        "total": {
          "vaccinated1": 189662,
          "vaccinated2": 120322
        }
      },
      "Unknown": {
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 5
        },
        "total": {
          "confirmed": 7651,
          "deceased": 129,
          "recovered": 7518
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T11:03:10+05:30",
      "population": 397000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://dhs.andaman.gov.in/NewEvents/851.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 7651,
      "deceased": 129,
      "recovered": 7518,
      "tested": 598033,
      "vaccinated1": 294001,
      "vaccinated2": 200157
    }
  },
  "AP": {
    "delta": {
      "confirmed": 385,
      "deceased": 4,
      "recovered": 675,
      "tested": 39848,
      "vaccinated1": 20497,
      "vaccinated2": 24137
    },
    "delta21_14": {
      "confirmed": 3220
    },
    "delta7": {
      "confirmed": 2873,
      "deceased": 30,
      "recovered": 3590,
      "tested": 254532,
      "vaccinated1": 1223010,
      "vaccinated2": 1887005
    },
    "districts": {
      "Anantapur": {
        "delta": {
          "confirmed": 4,
          "recovered": 5,
          "vaccinated1": 4575,
          "vaccinated2": 5370
        },
        "delta21_14": {
          "confirmed": 50
        },
        "delta7": {
          "confirmed": 38,
          "recovered": 58,
          "vaccinated1": 92803,
          "vaccinated2": 140903
        },
        "meta": {
          "population": 4083315,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 157843,
          "deceased": 1093,
          "recovered": 156699,
          "tested": 787085,
          "vaccinated1": 2690082,
          "vaccinated2": 1611476
        }
      },
      "Chittoor": {
        "delta": {
          "confirmed": 64,
          "deceased": 1,
          "recovered": 87,
          "vaccinated1": 878,
          "vaccinated2": 1306
        },
        "delta21_14": {
          "confirmed": 631
        },
        "delta7": {
          "confirmed": 516,
          "deceased": 6,
          "recovered": 629,
          "vaccinated1": 63824,
          "vaccinated2": 119541
        },
        "meta": {
          "population": 4170468,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 246935,
          "deceased": 1947,
          "recovered": 244144,
          "tested": 780322,
          "vaccinated1": 2832987,
          "vaccinated2": 1807873
        }
      },
      "East Godavari": {
        "delta": {
          "confirmed": 87,
          "recovered": 121,
          "vaccinated1": 41,
          "vaccinated2": 237
        },
        "delta21_14": {
          "confirmed": 401
        },
        "delta7": {
          "confirmed": 604,
          "recovered": 520,
          "vaccinated1": 36973,
          "vaccinated2": 223236
        },
        "meta": {
          "population": 5151549,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 293836,
          "deceased": 1290,
          "recovered": 291610,
          "tested": 944746,
          "vaccinated1": 3532220,
          "vaccinated2": 1990578
        }
      },
      "Foreign Evacuees": {
        "total": {
          "confirmed": 434,
          "recovered": 434
        }
      },
      "Guntur": {
        "delta": {
          "confirmed": 33,
          "recovered": 198,
          "vaccinated1": 1119,
          "vaccinated2": 1248
        },
        "delta21_14": {
          "confirmed": 509
        },
        "delta7": {
          "confirmed": 272,
          "deceased": 4,
          "recovered": 619,
          "vaccinated1": 285377,
          "vaccinated2": 156818
        },
        "meta": {
          "population": 4889230,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 178068,
          "deceased": 1237,
          "recovered": 176629,
          "tested": 833823,
          "vaccinated1": 3440118,
          "vaccinated2": 1891773
        }
      },
      "Krishna": {
        "delta": {
          "confirmed": 46,
          "deceased": 1,
          "recovered": 71,
          "vaccinated1": 51,
          "vaccinated2": 337
        },
        "delta21_14": {
          "confirmed": 405
        },
        "delta7": {
          "confirmed": 422,
          "deceased": 9,
          "recovered": 467,
          "vaccinated1": 75352,
          "vaccinated2": 230788
        },
        "meta": {
          "population": 4529009,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 119348,
          "deceased": 1430,
          "recovered": 117130,
          "tested": 782232,
          "vaccinated1": 2971604,
          "vaccinated2": 1914927
        }
      },
      "Kurnool": {
        "delta": {
          "confirmed": 6,
          "recovered": 3,
          "vaccinated1": 4716,
          "vaccinated2": 1538
        },
        "delta21_14": {
          "confirmed": 31
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 26,
          "vaccinated1": 178620,
          "vaccinated2": 73119
        },
        "meta": {
          "population": 4046601,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 124142,
          "deceased": 853,
          "recovered": 123264,
          "tested": 867361,
          "vaccinated1": 2672759,
          "vaccinated2": 1290419
        }
      },
      "Other State": {
        "total": {
          "confirmed": 2461,
          "recovered": 2461
        }
      },
      "Prakasam": {
        "delta": {
          "confirmed": 6,
          "recovered": 37,
          "vaccinated1": 3292,
          "vaccinated2": 5872
        },
        "delta21_14": {
          "confirmed": 243
        },
        "delta7": {
          "confirmed": 103,
          "deceased": 3,
          "recovered": 290,
          "vaccinated1": 137338,
          "vaccinated2": 130213
        },
        "meta": {
          "population": 3392764,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 138482,
          "deceased": 1124,
          "recovered": 136989,
          "tested": 697340,
          "vaccinated1": 2321031,
          "vaccinated2": 1521177
        }
      },
      "S.P.S. Nellore": {
        "delta": {
          "confirmed": 34,
          "deceased": 1,
          "recovered": 23,
          "vaccinated1": 2724,
          "vaccinated2": 1639
        },
        "delta21_14": {
          "confirmed": 283
        },
        "delta7": {
          "confirmed": 155,
          "deceased": 2,
          "recovered": 235,
          "vaccinated1": 96973,
          "vaccinated2": 114393
        },
        "meta": {
          "population": 2966082,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 146388,
          "deceased": 1053,
          "recovered": 144919,
          "tested": 682964,
          "vaccinated1": 2143402,
          "vaccinated2": 1403240
        }
      },
      "Srikakulam": {
        "delta": {
          "confirmed": 19,
          "recovered": 20,
          "vaccinated1": 2,
          "vaccinated2": 6
        },
        "delta21_14": {
          "confirmed": 47
        },
        "delta7": {
          "confirmed": 132,
          "recovered": 72,
          "vaccinated1": 18883,
          "vaccinated2": 129575
        },
        "meta": {
          "population": 2699471,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 123109,
          "deceased": 786,
          "recovered": 122136,
          "tested": 670899,
          "vaccinated1": 1630248,
          "vaccinated2": 974734
        }
      },
      "Visakhapatnam": {
        "delta": {
          "confirmed": 27,
          "recovered": 30,
          "vaccinated1": 1309,
          "vaccinated2": 2311
        },
        "delta21_14": {
          "confirmed": 273
        },
        "delta7": {
          "confirmed": 237,
          "deceased": 1,
          "recovered": 227,
          "vaccinated1": 65301,
          "vaccinated2": 207340
        },
        "meta": {
          "population": 4288113,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 157737,
          "deceased": 1127,
          "recovered": 156492,
          "tested": 744983,
          "vaccinated1": 2999432,
          "vaccinated2": 1864960
        }
      },
      "Vizianagaram": {
        "delta": {
          "confirmed": 7,
          "deceased": 1,
          "recovered": 11,
          "vaccinated1": 601,
          "vaccinated2": 1855
        },
        "delta21_14": {
          "confirmed": 30
        },
        "delta7": {
          "confirmed": 53,
          "deceased": 1,
          "recovered": 38,
          "vaccinated1": 44847,
          "vaccinated2": 123576
        },
        "meta": {
          "population": 2342868,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 82967,
          "deceased": 672,
          "recovered": 82231,
          "tested": 531433,
          "vaccinated1": 1393491,
          "vaccinated2": 996097
        }
      },
      "West Godavari": {
        "delta": {
          "confirmed": 40,
          "recovered": 44,
          "vaccinated1": 878,
          "vaccinated2": 1884
        },
        "delta21_14": {
          "confirmed": 171
        },
        "delta7": {
          "confirmed": 234,
          "deceased": 4,
          "recovered": 246,
          "vaccinated1": 61021,
          "vaccinated2": 146562
        },
        "meta": {
          "population": 3934782,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 179077,
          "deceased": 1117,
          "recovered": 177680,
          "tested": 793098,
          "vaccinated1": 2525317,
          "vaccinated2": 1778807
        }
      },
      "Y.S.R. Kadapa": {
        "delta": {
          "confirmed": 12,
          "recovered": 25,
          "vaccinated1": 1005,
          "vaccinated2": 1101
        },
        "delta21_14": {
          "confirmed": 146
        },
        "delta7": {
          "confirmed": 82,
          "recovered": 163,
          "vaccinated1": 65843,
          "vaccinated2": 90958
        },
        "meta": {
          "population": 2884524,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 115623,
          "deceased": 644,
          "recovered": 114904,
          "tested": 671761,
          "vaccinated1": 1824032,
          "vaccinated2": 1328711
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 52221000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/ArogyaAndhra/status/1454748197272711177"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 2066450,
      "deceased": 14373,
      "recovered": 2047722,
      "tested": 29518787,
      "vaccinated1": 32976969,
      "vaccinated2": 20375181
    }
  },
  "AR": {
    "delta": {
      "confirmed": 1,
      "recovered": 9,
      "tested": 334,
      "vaccinated1": 42,
      "vaccinated2": 195
    },
    "delta21_14": {
      "confirmed": 87
    },
    "delta7": {
      "confirmed": 66,
      "recovered": 97,
      "tested": 4788,
      "vaccinated1": 3312,
      "vaccinated2": 23647
    },
    "districts": {
      "Anjaw": {
        "delta7": {
          "vaccinated1": 45,
          "vaccinated2": 452
        },
        "meta": {
          "population": 21089,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1068,
          "deceased": 3,
          "recovered": 1065,
          "tested": 2845,
          "vaccinated1": 11695,
          "vaccinated2": 7957
        }
      },
      "Capital Complex": {
        "meta": {
          "tested": {
            "date": "2020-12-24"
          }
        },
        "total": {
          "tested": 115210
        }
      },
      "Changlang": {
        "delta": {
          "recovered": 1
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 298,
          "vaccinated2": 3803
        },
        "meta": {
          "population": 147951,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 3807,
          "deceased": 22,
          "recovered": 3780,
          "tested": 23861,
          "vaccinated1": 88857,
          "vaccinated2": 55361
        }
      },
      "East Kameng": {
        "delta": {
          "vaccinated2": 1
        },
        "delta7": {
          "vaccinated1": 76,
          "vaccinated2": 409
        },
        "meta": {
          "population": 78413,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1094,
          "recovered": 1094,
          "tested": 7489,
          "vaccinated1": 22931,
          "vaccinated2": 15646
        }
      },
      "East Siang": {
        "delta": {
          "recovered": 5
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 9,
          "recovered": 10,
          "vaccinated1": 365,
          "vaccinated2": 2013
        },
        "meta": {
          "population": 99019,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 3206,
          "deceased": 17,
          "recovered": 3183,
          "tested": 21867,
          "vaccinated1": 54001,
          "vaccinated2": 39434
        }
      },
      "Kamle": {
        "delta7": {
          "vaccinated1": 36,
          "vaccinated2": 185
        },
        "meta": {
          "population": 22256,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 512,
          "recovered": 512,
          "tested": 1385,
          "vaccinated1": 6946,
          "vaccinated2": 3874
        }
      },
      "Kra Daadi": {
        "delta7": {
          "vaccinated1": 5,
          "vaccinated2": 23
        },
        "meta": {
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 270,
          "recovered": 270,
          "tested": 3218,
          "vaccinated1": 6275,
          "vaccinated2": 3272
        }
      },
      "Kurung Kumey": {
        "delta7": {
          "vaccinated1": 27,
          "vaccinated2": 255
        },
        "meta": {
          "population": 89717,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 511,
          "deceased": 1,
          "recovered": 510,
          "tested": 4201,
          "vaccinated1": 9121,
          "vaccinated2": 5601
        }
      },
      "Lepa Rada": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 54
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 40,
          "vaccinated2": 307
        },
        "meta": {
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 874,
          "deceased": 3,
          "recovered": 871,
          "tested": 6747,
          "vaccinated1": 13328,
          "vaccinated2": 10176
        }
      },
      "Lohit": {
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 9,
          "recovered": 3,
          "vaccinated1": 221,
          "vaccinated2": 1494
        },
        "meta": {
          "population": 145538,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 2885,
          "deceased": 26,
          "recovered": 2851,
          "tested": 14945,
          "vaccinated1": 31120,
          "vaccinated2": 22003
        }
      },
      "Longding": {
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 46,
          "vaccinated2": 356
        },
        "meta": {
          "population": 60000,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 752,
          "deceased": 2,
          "recovered": 749,
          "tested": 10342,
          "vaccinated1": 19259,
          "vaccinated2": 7826
        }
      },
      "Lower Dibang Valley": {
        "delta": {
          "vaccinated1": 19,
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 14,
          "recovered": 3,
          "vaccinated1": 171,
          "vaccinated2": 931
        },
        "meta": {
          "population": 53986,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 2426,
          "deceased": 11,
          "recovered": 2397,
          "tested": 12169,
          "vaccinated1": 32639,
          "vaccinated2": 22089
        }
      },
      "Lower Siang": {
        "delta7": {
          "vaccinated1": 37,
          "vaccinated2": 317
        },
        "meta": {
          "population": 80597,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 738,
          "deceased": 8,
          "recovered": 730,
          "tested": 7070,
          "vaccinated1": 16565,
          "vaccinated2": 9990
        }
      },
      "Lower Subansiri": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 36
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 2,
          "vaccinated1": 85,
          "vaccinated2": 767
        },
        "meta": {
          "population": 82839,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 3036,
          "deceased": 15,
          "recovered": 3015,
          "tested": 10564,
          "vaccinated1": 26916,
          "vaccinated2": 18827
        }
      },
      "Namsai": {
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 16,
          "vaccinated1": 209,
          "vaccinated2": 2436
        },
        "meta": {
          "population": 95950,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 2124,
          "deceased": 17,
          "recovered": 2102,
          "tested": 19987,
          "vaccinated1": 63539,
          "vaccinated2": 47104
        }
      },
      "Pakke Kessang": {
        "delta": {
          "vaccinated2": 14
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 25,
          "vaccinated2": 262
        },
        "meta": {
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 453,
          "recovered": 453,
          "tested": 3327,
          "vaccinated1": 8004,
          "vaccinated2": 4998
        }
      },
      "Papum Pare": {
        "delta": {
          "confirmed": 1,
          "recovered": 1
        },
        "delta21_14": {
          "confirmed": 22
        },
        "delta7": {
          "confirmed": 7,
          "recovered": 12,
          "vaccinated1": 1055,
          "vaccinated2": 3799
        },
        "meta": {
          "population": 176385,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 18316,
          "deceased": 98,
          "recovered": 18212,
          "tested": 41960,
          "vaccinated1": 141168,
          "vaccinated2": 100258
        }
      },
      "Shi Yomi": {
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 10,
          "vaccinated1": 2,
          "vaccinated2": 153
        },
        "meta": {
          "population": 13310,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 262,
          "recovered": 261,
          "tested": 2169,
          "vaccinated1": 6910,
          "vaccinated2": 5663
        }
      },
      "Siang": {
        "delta7": {
          "vaccinated1": 40,
          "vaccinated2": 197
        },
        "meta": {
          "population": 31920,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 411,
          "deceased": 3,
          "recovered": 408,
          "tested": 4270,
          "vaccinated1": 14408,
          "vaccinated2": 9068
        }
      },
      "Tawang": {
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 12,
          "recovered": 8,
          "vaccinated1": 91,
          "vaccinated2": 759
        },
        "meta": {
          "population": 49950,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 2577,
          "deceased": 20,
          "recovered": 2533,
          "tested": 14224,
          "vaccinated1": 29553,
          "vaccinated2": 23287
        }
      },
      "Tirap": {
        "delta7": {
          "recovered": 2,
          "vaccinated1": 35,
          "vaccinated2": 631
        },
        "meta": {
          "population": 111997,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1109,
          "deceased": 5,
          "recovered": 1102,
          "tested": 14657,
          "vaccinated1": 31565,
          "vaccinated2": 21200
        }
      },
      "Upper Dibang Valley": {
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 3,
          "vaccinated2": 11
        },
        "meta": {
          "population": 7948,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 337,
          "deceased": 2,
          "recovered": 335,
          "tested": 1910,
          "vaccinated1": 4156,
          "vaccinated2": 2603
        }
      },
      "Upper Siang": {
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 38,
          "vaccinated2": 411
        },
        "meta": {
          "population": 35289,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1016,
          "deceased": 1,
          "recovered": 1015,
          "tested": 6564,
          "vaccinated1": 18594,
          "vaccinated2": 13671
        }
      },
      "Upper Subansiri": {
        "delta7": {
          "vaccinated1": 93,
          "vaccinated2": 1122
        },
        "meta": {
          "population": 83205,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1958,
          "deceased": 6,
          "recovered": 1952,
          "tested": 6217,
          "vaccinated1": 24842,
          "vaccinated2": 16390
        }
      },
      "West Kameng": {
        "delta": {
          "recovered": 7,
          "vaccinated1": 15,
          "vaccinated2": 89
        },
        "delta21_14": {
          "confirmed": 17
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 21,
          "vaccinated1": 206,
          "vaccinated2": 1914
        },
        "meta": {
          "population": 87013,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 3545,
          "deceased": 14,
          "recovered": 3518,
          "tested": 28155,
          "vaccinated1": 55710,
          "vaccinated2": 40321
        }
      },
      "West Siang": {
        "delta": {
          "recovered": -5
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 63,
          "vaccinated2": 640
        },
        "meta": {
          "population": 112272,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 1868,
          "deceased": 6,
          "recovered": 1856,
          "tested": 13192,
          "vaccinated1": 33773,
          "vaccinated2": 27867
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T11:20:24+05:30",
      "notes": "[July 25]: All numbers corresponding to Papum Pare and Captial Complex are tracked under Papum Pare district.",
      "population": 1504000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/DirHealth_ArPr/status/1454823191751233544?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 55155,
      "deceased": 280,
      "recovered": 54774,
      "tested": 1185436,
      "vaccinated1": 771875,
      "vaccinated2": 534486
    }
  },
  "AS": {
    "delta": {
      "confirmed": 212,
      "deceased": 1,
      "recovered": 236,
      "tested": 15060,
      "vaccinated1": 19124,
      "vaccinated2": 37463
    },
    "delta21_14": {
      "confirmed": 1499
    },
    "delta7": {
      "confirmed": 2056,
      "deceased": 24,
      "recovered": 2215,
      "tested": 269097,
      "vaccinated1": 274869,
      "vaccinated2": 849889
    },
    "districts": {
      "Baksa": {
        "delta": {
          "vaccinated1": 39,
          "vaccinated2": 172
        },
        "delta7": {
          "vaccinated1": 2992,
          "vaccinated2": 15169
        },
        "meta": {
          "population": 953773
        },
        "total": {
          "vaccinated1": 553967,
          "vaccinated2": 136574
        }
      },
      "Barpeta": {
        "delta": {
          "vaccinated1": 369,
          "vaccinated2": 1035
        },
        "delta7": {
          "vaccinated1": 10495,
          "vaccinated2": 48544
        },
        "meta": {
          "population": 1693190
        },
        "total": {
          "vaccinated1": 1095048,
          "vaccinated2": 448006
        }
      },
      "Biswanath": {
        "delta": {
          "vaccinated1": 507,
          "vaccinated2": 1655
        },
        "delta7": {
          "vaccinated1": 5661,
          "vaccinated2": 35727
        },
        "meta": {
          "population": 612491
        },
        "total": {
          "vaccinated1": 456088,
          "vaccinated2": 213437
        }
      },
      "Bongaigaon": {
        "delta": {
          "vaccinated1": 85,
          "vaccinated2": 1287
        },
        "delta7": {
          "vaccinated1": 2784,
          "vaccinated2": 18356
        },
        "meta": {
          "population": 732639
        },
        "total": {
          "vaccinated1": 493242,
          "vaccinated2": 183782
        }
      },
      "Cachar": {
        "delta": {
          "vaccinated1": 2149,
          "vaccinated2": 966
        },
        "delta7": {
          "vaccinated1": 26826,
          "vaccinated2": 21591
        },
        "meta": {
          "population": 1736319
        },
        "total": {
          "vaccinated1": 1101266,
          "vaccinated2": 402535
        }
      },
      "Charaideo": {
        "delta": {
          "vaccinated1": 3,
          "vaccinated2": 26
        },
        "delta7": {
          "vaccinated1": 1853,
          "vaccinated2": 16868
        },
        "total": {
          "vaccinated1": 309125,
          "vaccinated2": 111219
        }
      },
      "Chirang": {
        "delta": {
          "vaccinated1": 22,
          "vaccinated2": 89
        },
        "delta7": {
          "vaccinated1": 2488,
          "vaccinated2": 9573
        },
        "meta": {
          "population": 481818
        },
        "total": {
          "vaccinated1": 288696,
          "vaccinated2": 102397
        }
      },
      "Darrang": {
        "delta": {
          "vaccinated1": 365,
          "vaccinated2": 270
        },
        "delta7": {
          "vaccinated1": 17453,
          "vaccinated2": 21800
        },
        "meta": {
          "population": 908090
        },
        "total": {
          "vaccinated1": 596783,
          "vaccinated2": 183724
        }
      },
      "Dhemaji": {
        "delta": {
          "vaccinated1": 55,
          "vaccinated2": 47
        },
        "delta7": {
          "vaccinated1": 3423,
          "vaccinated2": 15318
        },
        "meta": {
          "population": 688077
        },
        "total": {
          "vaccinated1": 431792,
          "vaccinated2": 184251
        }
      },
      "Dhubri": {
        "delta": {
          "vaccinated1": 1042,
          "vaccinated2": 1906
        },
        "delta7": {
          "vaccinated1": 12450,
          "vaccinated2": 25644
        },
        "meta": {
          "population": 1948632
        },
        "total": {
          "vaccinated1": 945264,
          "vaccinated2": 229696
        }
      },
      "Dibrugarh": {
        "delta": {
          "vaccinated1": 699,
          "vaccinated2": 4007
        },
        "delta7": {
          "vaccinated1": 8869,
          "vaccinated2": 38695
        },
        "meta": {
          "population": 1327748,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "tested": 301657,
          "vaccinated1": 914640,
          "vaccinated2": 430800
        }
      },
      "Dima Hasao": {
        "delta": {
          "vaccinated1": 160,
          "vaccinated2": 59
        },
        "delta7": {
          "vaccinated1": 2532,
          "vaccinated2": 3737
        },
        "meta": {
          "population": 213529
        },
        "total": {
          "vaccinated1": 116318,
          "vaccinated2": 62593
        }
      },
      "Goalpara": {
        "delta": {
          "vaccinated1": 47,
          "vaccinated2": 81
        },
        "delta7": {
          "vaccinated1": 4013,
          "vaccinated2": 30725
        },
        "meta": {
          "population": 1008959
        },
        "total": {
          "vaccinated1": 662016,
          "vaccinated2": 195521
        }
      },
      "Golaghat": {
        "delta": {
          "vaccinated1": 504,
          "vaccinated2": 2676
        },
        "delta7": {
          "vaccinated1": 6525,
          "vaccinated2": 51417
        },
        "meta": {
          "population": 1058674
        },
        "total": {
          "vaccinated1": 711564,
          "vaccinated2": 306745
        }
      },
      "Hailakandi": {
        "delta": {
          "vaccinated1": 88,
          "vaccinated2": 705
        },
        "delta7": {
          "vaccinated1": 1724,
          "vaccinated2": 11247
        },
        "meta": {
          "population": 659260
        },
        "total": {
          "vaccinated1": 422295,
          "vaccinated2": 146888
        }
      },
      "Hojai": {
        "delta": {
          "vaccinated1": 512,
          "vaccinated2": 2979
        },
        "delta7": {
          "vaccinated1": 6217,
          "vaccinated2": 36724
        },
        "meta": {
          "population": 931218
        },
        "total": {
          "vaccinated1": 602504,
          "vaccinated2": 274035
        }
      },
      "Jorhat": {
        "delta": {
          "vaccinated1": 225,
          "vaccinated2": 2154
        },
        "delta7": {
          "vaccinated1": 3383,
          "vaccinated2": 39677
        },
        "meta": {
          "population": 1091295
        },
        "total": {
          "vaccinated1": 649267,
          "vaccinated2": 297724
        }
      },
      "Kamrup": {
        "delta": {
          "vaccinated1": 231,
          "vaccinated2": 253
        },
        "delta7": {
          "vaccinated1": 10451,
          "vaccinated2": 45828
        },
        "meta": {
          "population": 1517202
        },
        "total": {
          "vaccinated1": 1079092,
          "vaccinated2": 409628
        }
      },
      "Kamrup Metropolitan": {
        "delta": {
          "vaccinated1": 359,
          "vaccinated2": 1713
        },
        "delta7": {
          "vaccinated1": 6625,
          "vaccinated2": 38155
        },
        "meta": {
          "population": 1260419
        },
        "total": {
          "vaccinated1": 1246239,
          "vaccinated2": 875897
        }
      },
      "Karbi Anglong": {
        "delta": {
          "vaccinated1": 342,
          "vaccinated2": 280
        },
        "delta7": {
          "vaccinated1": 13744,
          "vaccinated2": 12778
        },
        "meta": {
          "population": 965280
        },
        "total": {
          "vaccinated1": 284600,
          "vaccinated2": 102798
        }
      },
      "Karimganj": {
        "delta": {
          "vaccinated1": 331,
          "vaccinated2": 1382
        },
        "delta7": {
          "vaccinated1": 5088,
          "vaccinated2": 20659
        },
        "meta": {
          "population": 1217002
        },
        "total": {
          "vaccinated1": 681216,
          "vaccinated2": 203575
        }
      },
      "Kokrajhar": {
        "delta": {
          "vaccinated1": 162,
          "vaccinated2": 823
        },
        "delta7": {
          "vaccinated1": 3935,
          "vaccinated2": 19711
        },
        "meta": {
          "population": 886999
        },
        "total": {
          "vaccinated1": 538901,
          "vaccinated2": 156488
        }
      },
      "Lakhimpur": {
        "delta": {
          "vaccinated1": 148,
          "vaccinated2": 1555
        },
        "delta7": {
          "vaccinated1": 5870,
          "vaccinated2": 42164
        },
        "meta": {
          "population": 1040644
        },
        "total": {
          "vaccinated1": 681386,
          "vaccinated2": 301369
        }
      },
      "Majuli": {
        "delta": {
          "vaccinated1": 36,
          "vaccinated2": 166
        },
        "delta7": {
          "vaccinated1": 1524,
          "vaccinated2": 7176
        },
        "meta": {
          "population": 167304
        },
        "total": {
          "vaccinated1": 117599,
          "vaccinated2": 82507
        }
      },
      "Morigaon": {
        "delta": {
          "vaccinated1": 264,
          "vaccinated2": 482
        },
        "delta7": {
          "vaccinated1": 5298,
          "vaccinated2": 27861
        },
        "meta": {
          "population": 957853
        },
        "total": {
          "vaccinated1": 592446,
          "vaccinated2": 212146
        }
      },
      "Nagaon": {
        "delta": {
          "vaccinated1": 758,
          "vaccinated2": 1481
        },
        "delta7": {
          "vaccinated1": 16396,
          "vaccinated2": 36734
        },
        "meta": {
          "population": 2826006
        },
        "total": {
          "vaccinated1": 1203831,
          "vaccinated2": 448081
        }
      },
      "Nalbari": {
        "delta": {
          "vaccinated1": 388,
          "vaccinated2": 1492
        },
        "delta7": {
          "vaccinated1": 6785,
          "vaccinated2": 25411
        },
        "meta": {
          "population": 769919
        },
        "total": {
          "vaccinated1": 483076,
          "vaccinated2": 168392
        }
      },
      "Sivasagar": {
        "delta": {
          "vaccinated1": 46,
          "vaccinated2": 714
        },
        "delta7": {
          "vaccinated1": 1946,
          "vaccinated2": 23104
        },
        "meta": {
          "population": 1150253
        },
        "total": {
          "vaccinated1": 478954,
          "vaccinated2": 223921
        }
      },
      "Sonitpur": {
        "delta": {
          "vaccinated1": 448,
          "vaccinated2": 2664
        },
        "delta7": {
          "vaccinated1": 8341,
          "vaccinated2": 48290
        },
        "meta": {
          "population": 1925975
        },
        "total": {
          "vaccinated1": 767841,
          "vaccinated2": 434213
        }
      },
      "South Salmara Mankachar": {
        "delta": {
          "vaccinated1": 260,
          "vaccinated2": 1288
        },
        "delta7": {
          "vaccinated1": 1978,
          "vaccinated2": 15304
        },
        "meta": {
          "population": 555114
        },
        "total": {
          "vaccinated1": 239906,
          "vaccinated2": 76599
        }
      },
      "Tinsukia": {
        "delta": {
          "vaccinated1": 6637,
          "vaccinated2": 1679
        },
        "delta7": {
          "vaccinated1": 45002,
          "vaccinated2": 22410
        },
        "meta": {
          "population": 1316948
        },
        "total": {
          "vaccinated1": 795057,
          "vaccinated2": 286170
        }
      },
      "Udalguri": {
        "delta": {
          "vaccinated1": 1935,
          "vaccinated2": 1396
        },
        "delta7": {
          "vaccinated1": 17371,
          "vaccinated2": 19343
        },
        "meta": {
          "population": 832769,
          "tested": {
            "date": "2020-09-16"
          }
        },
        "total": {
          "tested": 24661,
          "vaccinated1": 504439,
          "vaccinated2": 133919
        }
      },
      "Unknown": {
        "delta": {
          "confirmed": 212,
          "deceased": 1,
          "recovered": 236
        },
        "delta21_14": {
          "confirmed": 1499
        },
        "delta7": {
          "confirmed": 2056,
          "deceased": 24,
          "recovered": 2215
        },
        "total": {
          "confirmed": 610645,
          "deceased": 5997,
          "other": 1347,
          "recovered": 600974
        }
      },
      "West Karbi Anglong": {
        "delta": {
          "vaccinated1": 312,
          "vaccinated2": 147
        },
        "delta7": {
          "vaccinated1": 4593,
          "vaccinated2": 4186
        },
        "meta": {
          "population": 300320
        },
        "total": {
          "vaccinated1": 127612,
          "vaccinated2": 42942
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Jan 1]: 1347 cases i.e Covid +'tive patients dead for other reasons have been deducted fom active count.",
      "population": 34293000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/nhm_assam/status/1454837285032103940?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 610645,
      "deceased": 5997,
      "other": 1347,
      "recovered": 600974,
      "tested": 24712042,
      "vaccinated1": 20172463,
      "vaccinated2": 8068795
    }
  },
  "BR": {
    "delta": {
      "confirmed": 8,
      "recovered": 9,
      "tested": 226443,
      "vaccinated1": 114694,
      "vaccinated2": 145827
    },
    "delta21_14": {
      "confirmed": 30
    },
    "delta7": {
      "confirmed": 40,
      "recovered": 31,
      "tested": 1378539,
      "vaccinated1": 1286708,
      "vaccinated2": 2144970
    },
    "districts": {
      "Araria": {
        "delta": {
          "vaccinated1": 5177,
          "vaccinated2": 3067
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 51331,
          "vaccinated2": 69085
        },
        "meta": {
          "population": 2806200,
          "tested": {
            "date": "2020-10-03"
          }
        },
        "total": {
          "confirmed": 14978,
          "deceased": 116,
          "recovered": 14859,
          "tested": 219221,
          "vaccinated1": 1177154,
          "vaccinated2": 395227
        }
      },
      "Arwal": {
        "delta": {
          "vaccinated1": 262,
          "vaccinated2": 1360
        },
        "delta7": {
          "vaccinated1": 4059,
          "vaccinated2": 17125
        },
        "meta": {
          "population": 700843,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7381,
          "deceased": 74,
          "recovered": 7307,
          "tested": 101624,
          "vaccinated1": 345175,
          "vaccinated2": 116424
        }
      },
      "Aurangabad": {
        "delta": {
          "vaccinated1": 1264,
          "vaccinated2": 2657
        },
        "delta7": {
          "vaccinated1": 25561,
          "vaccinated2": 56431
        },
        "meta": {
          "population": 2511243,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 20011,
          "deceased": 75,
          "recovered": 19936,
          "tested": 412007,
          "vaccinated1": 1132482,
          "vaccinated2": 407913
        }
      },
      "Banka": {
        "delta": {
          "vaccinated1": 2635,
          "vaccinated2": 3138
        },
        "delta7": {
          "vaccinated1": 24239,
          "vaccinated2": 34077
        },
        "meta": {
          "population": 2029339,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7379,
          "deceased": 112,
          "recovered": 7267,
          "tested": 364776,
          "vaccinated1": 935177,
          "vaccinated2": 351254
        }
      },
      "Begusarai": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 1906,
          "vaccinated2": 2774
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 7,
          "vaccinated1": 33903,
          "vaccinated2": 65735
        },
        "meta": {
          "population": 2954367,
          "tested": {
            "date": "2020-09-26"
          }
        },
        "total": {
          "confirmed": 27212,
          "deceased": 457,
          "recovered": 26754,
          "tested": 213670,
          "vaccinated1": 1430906,
          "vaccinated2": 480982
        }
      },
      "Bhagalpur": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 2122,
          "vaccinated2": 3458
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 49875,
          "vaccinated2": 78088
        },
        "meta": {
          "population": 3032226,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 25840,
          "deceased": 309,
          "recovered": 25531,
          "tested": 582113,
          "vaccinated1": 1494951,
          "vaccinated2": 650332
        }
      },
      "Bhojpur": {
        "delta": {
          "vaccinated1": 3232,
          "vaccinated2": 4879
        },
        "delta7": {
          "vaccinated1": 31626,
          "vaccinated2": 53006
        },
        "meta": {
          "population": 2720155,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 10210,
          "deceased": 159,
          "recovered": 10051,
          "tested": 466438,
          "vaccinated1": 1291186,
          "vaccinated2": 382719
        }
      },
      "Buxar": {
        "delta": {
          "vaccinated1": 1083,
          "vaccinated2": 2516
        },
        "delta7": {
          "vaccinated1": 14794,
          "vaccinated2": 38792
        },
        "meta": {
          "population": 1707643,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9248,
          "deceased": 182,
          "recovered": 9066,
          "tested": 461428,
          "vaccinated1": 907374,
          "vaccinated2": 322555
        }
      },
      "Darbhanga": {
        "delta": {
          "vaccinated1": 2858,
          "vaccinated2": 5306
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 39165,
          "vaccinated2": 82276
        },
        "meta": {
          "population": 3921971,
          "tested": {
            "date": "2021-01-11"
          }
        },
        "total": {
          "confirmed": 10937,
          "deceased": 370,
          "recovered": 10567,
          "tested": 448442,
          "vaccinated1": 1869372,
          "vaccinated2": 741553
        }
      },
      "East Champaran": {
        "delta": {
          "vaccinated1": 2434,
          "vaccinated2": 8014
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 29316,
          "vaccinated2": 84760
        },
        "meta": {
          "population": 5082868,
          "tested": {
            "date": "2020-11-03"
          }
        },
        "total": {
          "confirmed": 19017,
          "deceased": 430,
          "recovered": 18585,
          "tested": 548132,
          "vaccinated1": 2498559,
          "vaccinated2": 1002939
        }
      },
      "Gaya": {
        "delta": {
          "vaccinated1": 1708,
          "vaccinated2": 1689
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 72504,
          "vaccinated2": 82490
        },
        "meta": {
          "population": 4379383,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 33952,
          "deceased": 280,
          "recovered": 33672,
          "tested": 872359,
          "vaccinated1": 1925234,
          "vaccinated2": 722746
        }
      },
      "Gopalganj": {
        "delta": {
          "vaccinated1": 5308,
          "vaccinated2": 8468
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 31750,
          "vaccinated2": 70093
        },
        "meta": {
          "population": 2558037,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 16685,
          "deceased": 94,
          "recovered": 16591,
          "tested": 562654,
          "vaccinated1": 1286763,
          "vaccinated2": 481968
        }
      },
      "Jamui": {
        "delta": {
          "vaccinated1": 1435,
          "vaccinated2": 1416
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 24440,
          "vaccinated2": 24005
        },
        "meta": {
          "population": 1756078,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9418,
          "deceased": 106,
          "recovered": 9312,
          "tested": 342005,
          "vaccinated1": 800488,
          "vaccinated2": 222093
        }
      },
      "Jehanabad": {
        "delta": {
          "vaccinated1": 498,
          "vaccinated2": 1617
        },
        "delta7": {
          "vaccinated1": 12986,
          "vaccinated2": 27200
        },
        "meta": {
          "population": 1124176,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 10783,
          "deceased": 109,
          "recovered": 10674,
          "tested": 492255,
          "vaccinated1": 498448,
          "vaccinated2": 184446
        }
      },
      "Kaimur": {
        "delta": {
          "vaccinated1": 1067,
          "vaccinated2": 2183
        },
        "delta7": {
          "vaccinated1": 19996,
          "vaccinated2": 28681
        },
        "meta": {
          "population": 1626900,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 4984,
          "deceased": 147,
          "recovered": 4837,
          "tested": 442332,
          "vaccinated1": 801438,
          "vaccinated2": 225437
        }
      },
      "Katihar": {
        "delta": {
          "vaccinated1": 2680,
          "vaccinated2": 2966
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 53448,
          "vaccinated2": 75733
        },
        "meta": {
          "population": 3068149,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 18145,
          "deceased": 94,
          "recovered": 18051,
          "tested": 556438,
          "vaccinated1": 1451838,
          "vaccinated2": 403046
        }
      },
      "Khagaria": {
        "delta": {
          "vaccinated1": 881,
          "vaccinated2": 2118
        },
        "delta7": {
          "vaccinated1": 15402,
          "vaccinated2": 32372
        },
        "meta": {
          "population": 1657599,
          "tested": {
            "date": "2020-10-04"
          }
        },
        "total": {
          "confirmed": 10064,
          "deceased": 88,
          "recovered": 9976,
          "tested": 148340,
          "vaccinated1": 775019,
          "vaccinated2": 222012
        }
      },
      "Kishanganj": {
        "delta": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 1997,
          "vaccinated2": 1445
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 2,
          "vaccinated1": 24597,
          "vaccinated2": 25592
        },
        "meta": {
          "population": 1690948,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 10128,
          "deceased": 66,
          "recovered": 10057,
          "tested": 294321,
          "vaccinated1": 757066,
          "vaccinated2": 205274
        }
      },
      "Lakhisarai": {
        "delta": {
          "vaccinated1": 595,
          "vaccinated2": 1005
        },
        "delta7": {
          "vaccinated1": 8894,
          "vaccinated2": 16437
        },
        "meta": {
          "population": 1000717,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7776,
          "deceased": 102,
          "recovered": 7674,
          "tested": 332434,
          "vaccinated1": 461970,
          "vaccinated2": 138407
        }
      },
      "Madhepura": {
        "delta": {
          "vaccinated1": 2700,
          "vaccinated2": 4459
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 28832,
          "vaccinated2": 43563
        },
        "meta": {
          "population": 1994618,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 12547,
          "deceased": 111,
          "recovered": 12435,
          "tested": 455482,
          "vaccinated1": 965767,
          "vaccinated2": 260408
        }
      },
      "Madhubani": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 2735,
          "vaccinated2": 6686
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 28535,
          "vaccinated2": 69785
        },
        "meta": {
          "population": 4476044,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 18365,
          "deceased": 339,
          "recovered": 18023,
          "tested": 715168,
          "vaccinated1": 1974159,
          "vaccinated2": 680214
        }
      },
      "Munger": {
        "delta": {
          "vaccinated1": 851,
          "vaccinated2": 2867
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 7445,
          "vaccinated2": 33005
        },
        "meta": {
          "population": 1359054,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 15111,
          "deceased": 158,
          "recovered": 14953,
          "tested": 325212,
          "vaccinated1": 707588,
          "vaccinated2": 264665
        }
      },
      "Muzaffarpur": {
        "delta": {
          "vaccinated1": 3545,
          "vaccinated2": 7023
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 40686,
          "vaccinated2": 80513
        },
        "meta": {
          "population": 4778610,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 31398,
          "deceased": 621,
          "recovered": 30777,
          "tested": 722651,
          "vaccinated1": 2253919,
          "vaccinated2": 717015
        }
      },
      "Nalanda": {
        "delta": {
          "vaccinated1": 2168,
          "vaccinated2": 1826
        },
        "delta7": {
          "vaccinated1": 36716,
          "vaccinated2": 66091
        },
        "meta": {
          "population": 2872523,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 23432,
          "deceased": 468,
          "recovered": 22964,
          "tested": 591346,
          "vaccinated1": 1393762,
          "vaccinated2": 638181
        }
      },
      "Nawada": {
        "delta": {
          "vaccinated1": 4176,
          "vaccinated2": 4338
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 46619,
          "vaccinated2": 35295
        },
        "meta": {
          "population": 2216653,
          "tested": {
            "date": "2020-11-16"
          }
        },
        "total": {
          "confirmed": 10353,
          "deceased": 178,
          "recovered": 10174,
          "tested": 322514,
          "vaccinated1": 1062349,
          "vaccinated2": 274319
        }
      },
      "Patna": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 737,
          "vaccinated2": 2024
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 14,
          "recovered": 8,
          "vaccinated1": 35436,
          "vaccinated2": 159875
        },
        "meta": {
          "population": 5772804,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 147007,
          "deceased": 2334,
          "recovered": 144651,
          "tested": 676238,
          "vaccinated1": 3421614,
          "vaccinated2": 2366474
        }
      },
      "Purnia": {
        "delta": {
          "vaccinated1": 2821,
          "vaccinated2": 1959
        },
        "delta7": {
          "vaccinated1": 61212,
          "vaccinated2": 74531
        },
        "meta": {
          "population": 3273127,
          "tested": {
            "date": "2021-01-05"
          }
        },
        "total": {
          "confirmed": 24427,
          "deceased": 180,
          "recovered": 24247,
          "tested": 568756,
          "vaccinated1": 1603099,
          "vaccinated2": 729224
        }
      },
      "Rohtas": {
        "delta": {
          "vaccinated1": 4911,
          "vaccinated2": 4149
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 40918,
          "vaccinated2": 59698
        },
        "meta": {
          "population": 2962593,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 13980,
          "deceased": 271,
          "recovered": 13707,
          "tested": 521553,
          "vaccinated1": 1498172,
          "vaccinated2": 465660
        }
      },
      "Saharsa": {
        "delta": {
          "vaccinated1": 28493,
          "vaccinated2": 18126
        },
        "delta7": {
          "vaccinated1": 106392,
          "vaccinated2": 80718
        },
        "meta": {
          "population": 1897102,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 17616,
          "deceased": 134,
          "recovered": 17482,
          "tested": 356327,
          "vaccinated1": 995618,
          "vaccinated2": 366567
        }
      },
      "Samastipur": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 3216,
          "vaccinated2": 5157
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 48167,
          "vaccinated2": 64119
        },
        "meta": {
          "population": 4254782,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 20020,
          "deceased": 155,
          "recovered": 19864,
          "tested": 614569,
          "vaccinated1": 1991102,
          "vaccinated2": 555728
        }
      },
      "Saran": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 4149,
          "vaccinated2": 6693
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 2,
          "vaccinated1": 41734,
          "vaccinated2": 82407
        },
        "meta": {
          "population": 3943098,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 23278,
          "deceased": 255,
          "recovered": 23020,
          "tested": 761473,
          "vaccinated1": 1868014,
          "vaccinated2": 736766
        }
      },
      "Sheikhpura": {
        "delta": {
          "vaccinated1": 345,
          "vaccinated2": 788
        },
        "delta7": {
          "vaccinated1": 4942,
          "vaccinated2": 10739
        },
        "meta": {
          "population": 634927,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7693,
          "deceased": 75,
          "recovered": 7618,
          "tested": 142348,
          "vaccinated1": 287209,
          "vaccinated2": 95322
        }
      },
      "Sheohar": {
        "delta": {
          "vaccinated1": 666,
          "vaccinated2": 1629
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 2946,
          "vaccinated2": 7111
        },
        "meta": {
          "population": 656916,
          "tested": {
            "date": "2020-11-16"
          }
        },
        "total": {
          "confirmed": 4404,
          "deceased": 36,
          "recovered": 4368,
          "tested": 199431,
          "vaccinated1": 300967,
          "vaccinated2": 108766
        }
      },
      "Sitamarhi": {
        "delta": {
          "vaccinated1": 3873,
          "vaccinated2": 5476
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 43474,
          "vaccinated2": 60677
        },
        "meta": {
          "population": 3419622,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9185,
          "deceased": 127,
          "recovered": 9058,
          "tested": 453227,
          "vaccinated1": 1511464,
          "vaccinated2": 424182
        }
      },
      "Siwan": {
        "delta": {
          "vaccinated1": 1163,
          "vaccinated2": 4030
        },
        "delta7": {
          "vaccinated1": 18385,
          "vaccinated2": 69069
        },
        "meta": {
          "population": 3318176,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 15195,
          "deceased": 170,
          "recovered": 15025,
          "tested": 536438,
          "vaccinated1": 1670590,
          "vaccinated2": 684755
        }
      },
      "Supaul": {
        "delta": {
          "vaccinated1": 3029,
          "vaccinated2": 5131
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 35486,
          "vaccinated2": 71754
        },
        "meta": {
          "population": 2228397,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 17222,
          "deceased": 129,
          "recovered": 17093,
          "tested": 456511,
          "vaccinated1": 1069993,
          "vaccinated2": 369925
        }
      },
      "Vaishali": {
        "delta": {
          "vaccinated1": 1522,
          "vaccinated2": 2621
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 45426,
          "vaccinated2": 59038
        },
        "meta": {
          "population": 3495021,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 19827,
          "deceased": 192,
          "other": 1,
          "recovered": 19632,
          "tested": 275884,
          "vaccinated1": 1671469,
          "vaccinated2": 478638
        }
      },
      "West Champaran": {
        "delta": {
          "vaccinated1": 7525,
          "vaccinated2": 6316
        },
        "delta7": {
          "vaccinated1": 42709,
          "vaccinated2": 52019
        },
        "meta": {
          "population": 3935042,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 20890,
          "deceased": 358,
          "recovered": 20532,
          "tested": 551778,
          "vaccinated1": 1784016,
          "vaccinated2": 469332
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[June 9] : 3951 deceased cases have been reported in the bulletin after reconciliation of records by the authorities",
      "population": 119520000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/BiharHealthDept/status/1454805874447290369?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 726098,
      "deceased": 9661,
      "other": 1,
      "recovered": 716390,
      "tested": 50531824,
      "vaccinated1": 49874828,
      "vaccinated2": 18346781
    }
  },
  "CH": {
    "delta": {
      "confirmed": 5,
      "recovered": 3,
      "tested": 1403,
      "vaccinated1": 211,
      "vaccinated2": 1282
    },
    "delta21_14": {
      "confirmed": 23
    },
    "delta7": {
      "confirmed": 28,
      "recovered": 20,
      "tested": 10726,
      "vaccinated1": 3680,
      "vaccinated2": 21641
    },
    "districts": {
      "Chandigarh": {
        "delta": {
          "confirmed": 5,
          "recovered": 3,
          "tested": 1403,
          "vaccinated1": 211,
          "vaccinated2": 1282
        },
        "delta21_14": {
          "confirmed": 23
        },
        "delta7": {
          "confirmed": 28,
          "recovered": 20,
          "tested": 10726,
          "vaccinated1": 3680,
          "vaccinated2": 21641
        },
        "meta": {
          "population": 1055450,
          "tested": {
            "date": "2021-10-31",
            "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11877"
          },
          "vaccinated": {
            "date": "2021-10-31"
          }
        },
        "total": {
          "confirmed": 65351,
          "deceased": 820,
          "recovered": 64495,
          "tested": 792851,
          "vaccinated1": 926035,
          "vaccinated2": 546981
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 1179000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11877"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 65351,
      "deceased": 820,
      "recovered": 64495,
      "tested": 792851,
      "vaccinated1": 926035,
      "vaccinated2": 546981
    }
  },
  "CT": {
    "delta": {
      "confirmed": 32,
      "deceased": 1,
      "recovered": 32,
      "tested": 11869,
      "vaccinated1": 21312,
      "vaccinated2": 39393
    },
    "delta21_14": {
      "confirmed": 124
    },
    "delta7": {
      "confirmed": 205,
      "deceased": 5,
      "recovered": 103,
      "tested": 147451,
      "vaccinated1": 379374,
      "vaccinated2": 604260
    },
    "districts": {
      "Balod": {
        "delta": {
          "vaccinated1": 523,
          "vaccinated2": 762
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 5983,
          "vaccinated2": 9451
        },
        "meta": {
          "population": 826165,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 27278,
          "deceased": 396,
          "recovered": 26880,
          "tested": 2749,
          "vaccinated1": 537459,
          "vaccinated2": 271570
        }
      },
      "Baloda Bazar": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 953,
          "vaccinated2": 605
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 25353,
          "vaccinated2": 17419
        },
        "meta": {
          "population": 1305343,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 43085,
          "deceased": 471,
          "recovered": 42611,
          "tested": 3816,
          "vaccinated1": 617777,
          "vaccinated2": 211945
        }
      },
      "Balrampur": {
        "delta": {
          "vaccinated1": 1654,
          "vaccinated2": 725
        },
        "delta7": {
          "vaccinated1": 21912,
          "vaccinated2": 17709
        },
        "meta": {
          "population": 598855,
          "tested": {
            "date": "2020-09-20"
          }
        },
        "total": {
          "confirmed": 20302,
          "deceased": 118,
          "recovered": 20182,
          "tested": 21481,
          "vaccinated1": 305554,
          "vaccinated2": 112777
        }
      },
      "Bametara": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 25,
          "vaccinated2": 25
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 14367,
          "vaccinated2": 7690
        },
        "meta": {
          "population": 197035,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 19963,
          "deceased": 236,
          "recovered": 19726,
          "tested": 3113,
          "vaccinated1": 405388,
          "vaccinated2": 132925
        }
      },
      "Bastar": {
        "delta": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 82,
          "vaccinated2": 129
        },
        "delta7": {
          "confirmed": 24,
          "recovered": 2,
          "vaccinated1": 10696,
          "vaccinated2": 9616
        },
        "meta": {
          "population": 1302253,
          "tested": {
            "date": "2020-05-23"
          }
        },
        "total": {
          "confirmed": 21066,
          "deceased": 188,
          "recovered": 20845,
          "tested": 4522,
          "vaccinated1": 443759,
          "vaccinated2": 178775
        }
      },
      "Bijapur": {
        "delta": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 47,
          "vaccinated2": 56
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 3,
          "vaccinated1": 1251,
          "vaccinated2": 913
        },
        "meta": {
          "population": 229832,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 8324,
          "deceased": 55,
          "recovered": 8263,
          "tested": 1239,
          "vaccinated1": 103247,
          "vaccinated2": 44245
        }
      },
      "Bilaspur": {
        "delta": {
          "confirmed": 1,
          "recovered": 3,
          "vaccinated1": 2404,
          "vaccinated2": 9113
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 17,
          "deceased": 2,
          "recovered": 8,
          "vaccinated1": 18318,
          "vaccinated2": 50320
        },
        "meta": {
          "population": 1961922,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 65681,
          "deceased": 1210,
          "recovered": 64448,
          "tested": 9823,
          "vaccinated1": 1031494,
          "vaccinated2": 525066
        }
      },
      "Dakshin Bastar Dantewada": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 143,
          "vaccinated2": 1299
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 2,
          "vaccinated1": 2225,
          "vaccinated2": 5410
        },
        "meta": {
          "population": 533638,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 10840,
          "deceased": 25,
          "recovered": 10809,
          "tested": 1168,
          "vaccinated1": 158243,
          "vaccinated2": 80855
        }
      },
      "Dhamtari": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 1,
          "vaccinated2": 18
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 6188,
          "vaccinated2": 7319
        },
        "meta": {
          "population": 799199,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 27239,
          "deceased": 545,
          "recovered": 26690,
          "tested": 1501,
          "vaccinated1": 509782,
          "vaccinated2": 224591
        }
      },
      "Durg": {
        "delta": {
          "confirmed": 4,
          "recovered": 6,
          "vaccinated1": 468,
          "vaccinated2": 908
        },
        "delta21_14": {
          "confirmed": 19
        },
        "delta7": {
          "confirmed": 26,
          "deceased": 1,
          "recovered": 18,
          "vaccinated1": 17012,
          "vaccinated2": 22719
        },
        "meta": {
          "population": 3343079,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 96880,
          "deceased": 1798,
          "recovered": 95028,
          "tested": 5020,
          "vaccinated1": 1012391,
          "vaccinated2": 525445
        }
      },
      "Gariaband": {
        "delta": {
          "vaccinated1": 440,
          "vaccinated2": 153
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 9982,
          "vaccinated2": 5872
        },
        "meta": {
          "population": 597653,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 19701,
          "deceased": 194,
          "recovered": 19506,
          "tested": 2096,
          "vaccinated1": 293987,
          "vaccinated2": 99137
        }
      },
      "Gaurela Pendra Marwahi": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 257,
          "vaccinated2": 297
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 4045,
          "vaccinated2": 4587
        },
        "meta": {
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 12011,
          "deceased": 146,
          "recovered": 11864,
          "tested": 273,
          "vaccinated1": 189474,
          "vaccinated2": 79788
        }
      },
      "Janjgir Champa": {
        "delta": {
          "confirmed": 2,
          "recovered": 4,
          "vaccinated1": 1722,
          "vaccinated2": 1341
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 19,
          "deceased": 1,
          "recovered": 8,
          "vaccinated1": 45568,
          "vaccinated2": 30991
        },
        "meta": {
          "population": 1620632,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 57636,
          "deceased": 838,
          "recovered": 56766,
          "tested": 4016,
          "vaccinated1": 896087,
          "vaccinated2": 317605
        }
      },
      "Jashpur": {
        "delta": {
          "recovered": 3,
          "vaccinated1": 187,
          "vaccinated2": 383
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 10,
          "recovered": 6,
          "vaccinated1": 10933,
          "vaccinated2": 13098
        },
        "meta": {
          "population": 852043,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 27093,
          "deceased": 212,
          "recovered": 26867,
          "tested": 2542,
          "vaccinated1": 435884,
          "vaccinated2": 182747
        }
      },
      "Kabeerdham": {
        "delta": {
          "vaccinated1": 1128,
          "vaccinated2": 1288
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 17511,
          "vaccinated2": 17876
        },
        "meta": {
          "population": 584667,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 22771,
          "deceased": 267,
          "recovered": 22503,
          "tested": 2829,
          "vaccinated1": 402362,
          "vaccinated2": 173494
        }
      },
      "Kondagaon": {
        "delta": {
          "vaccinated1": 243,
          "vaccinated2": 184
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 1,
          "vaccinated1": 8359,
          "vaccinated2": 7999
        },
        "meta": {
          "population": 578326,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 13139,
          "deceased": 99,
          "recovered": 13036,
          "tested": 1607,
          "vaccinated1": 317695,
          "vaccinated2": 100468
        }
      },
      "Korba": {
        "delta": {
          "confirmed": 5,
          "recovered": 2,
          "vaccinated1": 1086,
          "vaccinated2": 1126
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 23,
          "recovered": 11,
          "vaccinated1": 24033,
          "vaccinated2": 24911
        },
        "meta": {
          "population": 1206563,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 54847,
          "deceased": 580,
          "recovered": 54228,
          "tested": 10034,
          "vaccinated1": 650457,
          "vaccinated2": 287588
        }
      },
      "Koriya": {
        "delta": {
          "deceased": 1,
          "vaccinated1": 2370,
          "vaccinated2": 346
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 6,
          "deceased": 1,
          "vaccinated1": 15621,
          "vaccinated2": 5751
        },
        "meta": {
          "population": 659039,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 26980,
          "deceased": 177,
          "recovered": 26798,
          "tested": 2689,
          "vaccinated1": 375503,
          "vaccinated2": 128177
        }
      },
      "Mahasamund": {
        "delta": {
          "vaccinated1": 159,
          "vaccinated2": 6309
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 4416,
          "vaccinated2": 72466
        },
        "meta": {
          "population": 1032275,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 31365,
          "deceased": 365,
          "recovered": 31000,
          "tested": 2183,
          "vaccinated1": 738333,
          "vaccinated2": 428365
        }
      },
      "Mungeli": {
        "delta": {
          "vaccinated1": 1330,
          "vaccinated2": 981
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 15254,
          "vaccinated2": 12880
        },
        "meta": {
          "population": 701707,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 23921,
          "deceased": 167,
          "recovered": 23753,
          "tested": 2922,
          "vaccinated1": 282508,
          "vaccinated2": 109857
        }
      },
      "Narayanpur": {
        "delta": {
          "vaccinated1": 1075,
          "vaccinated2": 903
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 3057,
          "vaccinated2": 1858
        },
        "meta": {
          "population": 140206,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 4019,
          "deceased": 14,
          "recovered": 4005,
          "tested": 804,
          "vaccinated1": 53032,
          "vaccinated2": 19468
        }
      },
      "Other State": {
        "delta": {
          "confirmed": 1
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 3
        },
        "total": {
          "confirmed": 805,
          "deceased": 131,
          "recovered": 666
        }
      },
      "Raigarh": {
        "delta": {
          "confirmed": 2,
          "recovered": 4,
          "vaccinated1": 752,
          "vaccinated2": 6265
        },
        "delta21_14": {
          "confirmed": 10
        },
        "delta7": {
          "confirmed": 8,
          "recovered": 8,
          "vaccinated1": 5114,
          "vaccinated2": 122838
        },
        "meta": {
          "population": 1493627,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 62590,
          "deceased": 978,
          "recovered": 61597,
          "tested": 5084,
          "vaccinated1": 1074306,
          "vaccinated2": 967326
        }
      },
      "Raipur": {
        "delta": {
          "confirmed": 9,
          "recovered": 3,
          "vaccinated1": 789,
          "vaccinated2": 3193
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 33,
          "recovered": 15,
          "vaccinated1": 10441,
          "vaccinated2": 40794
        },
        "meta": {
          "population": 4062160,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 158035,
          "deceased": 3139,
          "recovered": 154852,
          "tested": 12704,
          "vaccinated1": 1557999,
          "vaccinated2": 915437
        }
      },
      "Rajnandgaon": {
        "delta": {
          "vaccinated1": 596,
          "vaccinated2": 650
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 3,
          "vaccinated1": 15753,
          "vaccinated2": 25270
        },
        "meta": {
          "population": 1537520,
          "tested": {
            "date": "2020-11-09"
          }
        },
        "total": {
          "confirmed": 56077,
          "deceased": 515,
          "recovered": 55557,
          "tested": 124947,
          "vaccinated1": 1028876,
          "vaccinated2": 530711
        }
      },
      "Sukma": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 140,
          "vaccinated2": 77
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 4,
          "vaccinated1": 3208,
          "vaccinated2": 5401
        },
        "meta": {
          "population": 249000,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 8066,
          "deceased": 20,
          "recovered": 8041,
          "tested": 1723,
          "vaccinated1": 134654,
          "vaccinated2": 81437
        }
      },
      "Surajpur": {
        "delta": {
          "vaccinated1": 442,
          "vaccinated2": 322
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 13506,
          "vaccinated2": 13873
        },
        "meta": {
          "population": 660280,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 29029,
          "deceased": 224,
          "recovered": 28805,
          "tested": 1830,
          "vaccinated1": 419247,
          "vaccinated2": 163526
        }
      },
      "Surguja": {
        "delta": {
          "vaccinated1": 1831,
          "vaccinated2": 1834
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 29827,
          "vaccinated2": 33226
        },
        "meta": {
          "population": 420661,
          "tested": {
            "date": "2020-11-18"
          }
        },
        "total": {
          "confirmed": 33673,
          "deceased": 245,
          "recovered": 33426,
          "tested": 103578,
          "vaccinated1": 468885,
          "vaccinated2": 277031
        }
      },
      "Uttar Bastar Kanker": {
        "delta": {
          "vaccinated1": 995,
          "vaccinated2": 645
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 17930,
          "vaccinated2": 14621
        },
        "meta": {
          "population": 748593,
          "tested": {
            "date": "2020-06-14"
          }
        },
        "total": {
          "confirmed": 23636,
          "deceased": 224,
          "recovered": 23407,
          "tested": 2051,
          "vaccinated1": 405744,
          "vaccinated2": 171484
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 28724000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/HealthCgGov/status/1454835690198298624?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 1006052,
      "deceased": 13577,
      "recovered": 992159,
      "tested": 13709510,
      "vaccinated1": 14851682,
      "vaccinated2": 7343273
    }
  },
  "DL": {
    "delta": {
      "confirmed": 45,
      "recovered": 46,
      "tested": 56751,
      "vaccinated1": 12482,
      "vaccinated2": 11839
    },
    "delta21_14": {
      "confirmed": 195
    },
    "delta7": {
      "confirmed": 267,
      "recovered": 239,
      "tested": 395086,
      "vaccinated1": 160323,
      "vaccinated2": 269146
    },
    "districts": {
      "Delhi": {
        "delta": {
          "confirmed": 45,
          "recovered": 46,
          "tested": 56751,
          "vaccinated1": 12482,
          "vaccinated2": 11839
        },
        "delta21_14": {
          "confirmed": 195
        },
        "delta7": {
          "confirmed": 267,
          "recovered": 239,
          "tested": 395086,
          "vaccinated1": 160323,
          "vaccinated2": 269146
        },
        "meta": {
          "population": 19814000,
          "tested": {
            "date": "2021-10-31",
            "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11885"
          },
          "vaccinated": {
            "date": "2021-10-31"
          }
        },
        "total": {
          "confirmed": 1439870,
          "deceased": 25091,
          "recovered": 1414431,
          "tested": 29427753,
          "vaccinated1": 13055636,
          "vaccinated2": 7425404
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[July 14]: Value for the total tests conducted has been reduced by 97008 in the state bulletin. Reason given : \"Reconciled with ICMR figures\". We have made the same change.",
      "population": 19814000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11885"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 1439870,
      "deceased": 25091,
      "recovered": 1414431,
      "tested": 29427753,
      "vaccinated1": 13055636,
      "vaccinated2": 7425404
    }
  },
  "DN": {
    "delta": {
      "recovered": 1,
      "vaccinated1": 3,
      "vaccinated2": 20
    },
    "delta21_14": {
      "confirmed": 4
    },
    "delta7": {
      "recovered": 2,
      "vaccinated1": 2802,
      "vaccinated2": 14244
    },
    "districts": {
      "Dadra and Nagar Haveli": {
        "delta": {
          "vaccinated1": 3,
          "vaccinated2": 18
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "vaccinated1": 870,
          "vaccinated2": 6759
        },
        "meta": {
          "population": 343709,
          "tested": {
            "date": "2020-10-20"
          }
        },
        "total": {
          "confirmed": 5920,
          "deceased": 3,
          "other": 5,
          "recovered": 5910,
          "tested": 44813,
          "vaccinated1": 387772,
          "vaccinated2": 183553
        }
      },
      "Daman": {
        "delta": {
          "recovered": 1
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 1880,
          "vaccinated2": 6793
        },
        "meta": {
          "population": 191173,
          "tested": {
            "date": "2020-10-20"
          }
        },
        "total": {
          "confirmed": 3543,
          "deceased": 1,
          "other": 26,
          "recovered": 3516,
          "tested": 19338,
          "vaccinated1": 234202,
          "vaccinated2": 155547
        }
      },
      "Diu": {
        "delta7": {
          "vaccinated1": 52,
          "vaccinated2": 690
        },
        "meta": {
          "population": 52074,
          "tested": {
            "date": "2020-10-20"
          }
        },
        "total": {
          "confirmed": 1218,
          "recovered": 1218,
          "tested": 8259,
          "vaccinated1": 38779,
          "vaccinated2": 31153
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 959000,
      "tested": {
        "date": "2020-10-20",
        "source": "https://dddcovid19.in/uploads/report/BulletinDNHDD20102020.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 10681,
      "deceased": 4,
      "other": 31,
      "recovered": 10644,
      "tested": 72410,
      "vaccinated1": 660753,
      "vaccinated2": 370255
    }
  },
  "GA": {
    "delta": {
      "confirmed": 23,
      "recovered": 53,
      "tested": 2361,
      "vaccinated1": 2572,
      "vaccinated2": 12404
    },
    "delta21_14": {
      "confirmed": 409
    },
    "delta7": {
      "confirmed": 222,
      "deceased": 6,
      "recovered": 409,
      "tested": 19026,
      "vaccinated1": 8418,
      "vaccinated2": 46494
    },
    "districts": {
      "North Goa": {
        "delta": {
          "vaccinated1": 1070,
          "vaccinated2": 5967
        },
        "delta7": {
          "vaccinated1": 4007,
          "vaccinated2": 23958
        },
        "meta": {
          "population": 817761
        },
        "total": {
          "vaccinated1": 600586,
          "vaccinated2": 424066
        }
      },
      "South Goa": {
        "delta": {
          "vaccinated1": 1492,
          "vaccinated2": 6405
        },
        "delta7": {
          "vaccinated1": 4401,
          "vaccinated2": 22504
        },
        "meta": {
          "population": 639962
        },
        "total": {
          "vaccinated1": 661972,
          "vaccinated2": 487016
        }
      },
      "Unknown": {
        "delta": {
          "confirmed": 23,
          "recovered": 53
        },
        "delta21_14": {
          "confirmed": 409
        },
        "delta7": {
          "confirmed": 222,
          "deceased": 6,
          "recovered": 409
        },
        "total": {
          "confirmed": 178108,
          "deceased": 3364,
          "recovered": 174392
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 1540000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://www.goa.gov.in/wp-content/uploads/2021/10/Media-Bulletin-31st-October-2021.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 178108,
      "deceased": 3364,
      "recovered": 174392,
      "tested": 1468399,
      "vaccinated1": 1262568,
      "vaccinated2": 911114
    }
  },
  "GJ": {
    "delta": {
      "confirmed": 20,
      "recovered": 23,
      "tested": 34282,
      "vaccinated1": 14685,
      "vaccinated2": 62096
    },
    "delta21_14": {
      "confirmed": 149
    },
    "delta7": {
      "confirmed": 159,
      "deceased": 2,
      "recovered": 116,
      "tested": 328489,
      "vaccinated1": 335172,
      "vaccinated2": 1660382
    },
    "districts": {
      "Ahmedabad": {
        "delta": {
          "confirmed": 4,
          "recovered": 2,
          "vaccinated1": 1765,
          "vaccinated2": 11394
        },
        "delta21_14": {
          "confirmed": 29
        },
        "delta7": {
          "confirmed": 22,
          "recovered": 14,
          "vaccinated1": 47316,
          "vaccinated2": 169891
        },
        "meta": {
          "population": 7208200,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 238334,
          "deceased": 3411,
          "recovered": 234889,
          "tested": 2556492,
          "vaccinated1": 5961594,
          "vaccinated2": 3439921
        }
      },
      "Amreli": {
        "delta": {
          "vaccinated1": 399,
          "vaccinated2": 3792
        },
        "delta7": {
          "vaccinated1": 5473,
          "vaccinated2": 39398
        },
        "meta": {
          "population": 1513614,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 10810,
          "deceased": 102,
          "recovered": 10708,
          "tested": 212265,
          "vaccinated1": 927389,
          "vaccinated2": 551970
        }
      },
      "Anand": {
        "delta": {
          "vaccinated1": 4876,
          "vaccinated2": 2866
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 1,
          "vaccinated1": 33012,
          "vaccinated2": 46764
        },
        "meta": {
          "population": 2090276,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 9637,
          "deceased": 49,
          "recovered": 9581,
          "tested": 171851,
          "vaccinated1": 1471865,
          "vaccinated2": 935893
        }
      },
      "Aravalli": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 106
        },
        "delta7": {
          "vaccinated1": 1439,
          "vaccinated2": 32201
        },
        "meta": {
          "population": 1051746,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 5186,
          "deceased": 78,
          "recovered": 5108,
          "tested": 122182,
          "vaccinated1": 717964,
          "vaccinated2": 522361
        }
      },
      "Banaskantha": {
        "delta": {
          "vaccinated1": 390,
          "vaccinated2": 3521
        },
        "delta7": {
          "vaccinated1": 16080,
          "vaccinated2": 82985
        },
        "meta": {
          "population": 3116045,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 13631,
          "deceased": 162,
          "recovered": 13469,
          "tested": 218527,
          "vaccinated1": 2140492,
          "vaccinated2": 1157901
        }
      },
      "Bharuch": {
        "delta": {
          "vaccinated1": 1539,
          "vaccinated2": 2936
        },
        "delta7": {
          "vaccinated1": 21270,
          "vaccinated2": 45926
        },
        "meta": {
          "population": 1550822,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 11426,
          "deceased": 118,
          "recovered": 11308,
          "tested": 156057,
          "vaccinated1": 1217587,
          "vaccinated2": 669742
        }
      },
      "Bhavnagar": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 359,
          "vaccinated2": 1470
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 19467,
          "vaccinated2": 81374
        },
        "meta": {
          "population": 2877961,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 21447,
          "deceased": 301,
          "recovered": 21143,
          "tested": 392834,
          "vaccinated1": 1680398,
          "vaccinated2": 986097
        }
      },
      "Botad": {
        "delta": {
          "vaccinated1": 13,
          "vaccinated2": 235
        },
        "delta7": {
          "vaccinated1": 929,
          "vaccinated2": 14235
        },
        "meta": {
          "population": 656005,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 2218,
          "deceased": 42,
          "recovered": 2176,
          "tested": 98559,
          "vaccinated1": 378232,
          "vaccinated2": 228691
        }
      },
      "Chhota Udaipur": {
        "delta": {
          "vaccinated1": 4,
          "vaccinated2": 818
        },
        "delta7": {
          "vaccinated1": 699,
          "vaccinated2": 19920
        },
        "meta": {
          "population": 1071831,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 3395,
          "deceased": 38,
          "recovered": 3357,
          "tested": 93838,
          "vaccinated1": 635695,
          "vaccinated2": 420157
        }
      },
      "Dahod": {
        "delta": {
          "vaccinated1": 8,
          "vaccinated2": 1930
        },
        "delta7": {
          "vaccinated1": 626,
          "vaccinated2": 53547
        },
        "meta": {
          "population": 2126558,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 9955,
          "deceased": 38,
          "recovered": 9917,
          "tested": 218259,
          "vaccinated1": 1499052,
          "vaccinated2": 631818
        }
      },
      "Dang": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": -2
        },
        "delta7": {
          "vaccinated1": 4140,
          "vaccinated2": 3726
        },
        "meta": {
          "population": 226769,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 866,
          "deceased": 18,
          "recovered": 848,
          "tested": 31921,
          "vaccinated1": 156334,
          "vaccinated2": 59262
        }
      },
      "Devbhumi Dwarka": {
        "delta": {
          "vaccinated1": 315,
          "vaccinated2": 373
        },
        "delta7": {
          "vaccinated1": 4666,
          "vaccinated2": 24924
        },
        "meta": {
          "population": 752484,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 4175,
          "deceased": 82,
          "recovered": 4093,
          "tested": 80424,
          "vaccinated1": 504501,
          "vaccinated2": 309771
        }
      },
      "Gandhinagar": {
        "delta": {
          "vaccinated1": 69,
          "vaccinated2": 367
        },
        "delta21_14": {
          "confirmed": -1
        },
        "delta7": {
          "vaccinated1": 5475,
          "vaccinated2": 36333
        },
        "meta": {
          "population": 1387478,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 20754,
          "deceased": 205,
          "recovered": 20549,
          "tested": 292598,
          "vaccinated1": 1175562,
          "vaccinated2": 706208
        }
      },
      "Gir Somnath": {
        "delta": {
          "vaccinated1": 912,
          "vaccinated2": 15
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 8524,
          "vaccinated2": 15341
        },
        "meta": {
          "population": 1217477,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 8570,
          "deceased": 67,
          "recovered": 8499,
          "tested": 121948,
          "vaccinated1": 845224,
          "vaccinated2": 363467
        }
      },
      "Jamnagar": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 367,
          "vaccinated2": 1366
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 3,
          "vaccinated1": 9406,
          "vaccinated2": 37158
        },
        "meta": {
          "population": 2159130,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 34978,
          "deceased": 478,
          "recovered": 34494,
          "tested": 307911,
          "vaccinated1": 1111813,
          "vaccinated2": 653950
        }
      },
      "Junagadh": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 62,
          "vaccinated2": 1232
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 2,
          "vaccinated1": 2660,
          "vaccinated2": 71531
        },
        "meta": {
          "population": 2742291,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 20505,
          "deceased": 272,
          "recovered": 20226,
          "tested": 199699,
          "vaccinated1": 1316479,
          "vaccinated2": 733025
        }
      },
      "Kheda": {
        "delta": {
          "vaccinated1": 124,
          "vaccinated2": 2105
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 11668,
          "vaccinated2": 73838
        },
        "meta": {
          "population": 2298934,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 10439,
          "deceased": 48,
          "recovered": 10391,
          "tested": 218140,
          "vaccinated1": 1454344,
          "vaccinated2": 893742
        }
      },
      "Kutch": {
        "delta": {
          "vaccinated1": 15,
          "vaccinated2": 351
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 1,
          "vaccinated1": 8920,
          "vaccinated2": 49662
        },
        "meta": {
          "population": 2090313,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 12631,
          "deceased": 145,
          "recovered": 12474,
          "tested": 267060,
          "vaccinated1": 1412923,
          "vaccinated2": 680232
        }
      },
      "Mahisagar": {
        "delta": {
          "vaccinated1": 1,
          "vaccinated2": 929
        },
        "delta7": {
          "vaccinated1": 62,
          "vaccinated2": 16517
        },
        "meta": {
          "population": 994624,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 8194,
          "deceased": 72,
          "recovered": 8122,
          "tested": 122796,
          "vaccinated1": 815594,
          "vaccinated2": 459520
        }
      },
      "Mehsana": {
        "delta": {
          "vaccinated1": 71,
          "vaccinated2": 723
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 7523,
          "vaccinated2": 48550
        },
        "meta": {
          "population": 2027727,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 24419,
          "deceased": 177,
          "recovered": 24242,
          "tested": 229904,
          "vaccinated1": 1405786,
          "vaccinated2": 869969
        }
      },
      "Morbi": {
        "delta": {
          "vaccinated1": 31,
          "vaccinated2": 118
        },
        "delta7": {
          "vaccinated1": 9950,
          "vaccinated2": 20297
        },
        "meta": {
          "population": 960329,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 6502,
          "deceased": 87,
          "recovered": 6415,
          "tested": 157321,
          "vaccinated1": 674000,
          "vaccinated2": 308840
        }
      },
      "Narmada": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 12
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 546,
          "vaccinated2": 13890
        },
        "meta": {
          "population": 590379,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 5955,
          "deceased": 15,
          "recovered": 5940,
          "tested": 76134,
          "vaccinated1": 413260,
          "vaccinated2": 279684
        }
      },
      "Navsari": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 62,
          "vaccinated2": 2009
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 13,
          "vaccinated1": 1852,
          "vaccinated2": 29095
        },
        "meta": {
          "population": 1330711,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 7215,
          "deceased": 24,
          "recovered": 7181,
          "tested": 129099,
          "vaccinated1": 948673,
          "vaccinated2": 647484
        }
      },
      "Other State": {
        "meta": {
          "tested": {
            "date": "2020-06-27"
          }
        },
        "total": {
          "confirmed": 162,
          "deceased": 3,
          "recovered": 159,
          "tested": 108
        }
      },
      "Panchmahal": {
        "delta": {
          "vaccinated1": 80,
          "vaccinated2": 1246
        },
        "delta7": {
          "vaccinated1": 7294,
          "vaccinated2": 44832
        },
        "meta": {
          "population": 2388267,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 11770,
          "deceased": 70,
          "recovered": 11700,
          "tested": 160981,
          "vaccinated1": 1105110,
          "vaccinated2": 626003
        }
      },
      "Patan": {
        "delta": {
          "vaccinated1": 20,
          "vaccinated2": 259
        },
        "delta7": {
          "vaccinated1": 3369,
          "vaccinated2": 37745
        },
        "meta": {
          "population": 1342746,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 11624,
          "deceased": 129,
          "recovered": 11495,
          "tested": 169059,
          "vaccinated1": 850462,
          "vaccinated2": 533438
        }
      },
      "Porbandar": {
        "delta": {
          "vaccinated1": 48,
          "vaccinated2": 1062
        },
        "delta7": {
          "vaccinated1": 1140,
          "vaccinated2": 13063
        },
        "meta": {
          "population": 586062,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 3486,
          "deceased": 19,
          "recovered": 3467,
          "tested": 97912,
          "vaccinated1": 419364,
          "vaccinated2": 256377
        }
      },
      "Rajkot": {
        "delta": {
          "recovered": 7,
          "vaccinated1": 43,
          "vaccinated2": 153
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 7,
          "recovered": 7,
          "vaccinated1": 17510,
          "vaccinated2": 53546
        },
        "meta": {
          "population": 3157676,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 57976,
          "deceased": 725,
          "recovered": 57243,
          "tested": 731251,
          "vaccinated1": 2227111,
          "vaccinated2": 1255012
        }
      },
      "Sabarkantha": {
        "delta": {
          "vaccinated1": 66,
          "vaccinated2": 1181
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 4232,
          "vaccinated2": 45789
        },
        "meta": {
          "population": 2427346,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 9317,
          "deceased": 157,
          "recovered": 9159,
          "tested": 182090,
          "vaccinated1": 1000517,
          "vaccinated2": 596705
        }
      },
      "Surat": {
        "delta": {
          "confirmed": 4,
          "recovered": 4,
          "vaccinated1": 2525,
          "vaccinated2": 7090
        },
        "delta21_14": {
          "confirmed": 38
        },
        "delta7": {
          "confirmed": 38,
          "deceased": 1,
          "recovered": 30,
          "vaccinated1": 35083,
          "vaccinated2": 115694
        },
        "meta": {
          "population": 4996391,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 143874,
          "deceased": 1956,
          "recovered": 141885,
          "tested": 1938229,
          "vaccinated1": 4781894,
          "vaccinated2": 2529712
        }
      },
      "Surendranagar": {
        "delta": {
          "vaccinated1": 51,
          "vaccinated2": 647
        },
        "delta7": {
          "vaccinated1": 18641,
          "vaccinated2": 79795
        },
        "meta": {
          "population": 1755873,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 8121,
          "deceased": 136,
          "recovered": 7985,
          "tested": 201153,
          "vaccinated1": 1113845,
          "vaccinated2": 715931
        }
      },
      "Tapi": {
        "delta": {
          "vaccinated1": 14,
          "vaccinated2": 111
        },
        "delta21_14": {
          "confirmed": -1
        },
        "delta7": {
          "vaccinated1": 3010,
          "vaccinated2": 23409
        },
        "meta": {
          "population": 806489,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 4441,
          "deceased": 24,
          "recovered": 4417,
          "tested": 92524,
          "vaccinated1": 527345,
          "vaccinated2": 303297
        }
      },
      "Vadodara": {
        "delta": {
          "confirmed": 6,
          "recovered": 2,
          "vaccinated1": 437,
          "vaccinated2": 12194
        },
        "delta21_14": {
          "confirmed": 16
        },
        "delta7": {
          "confirmed": 36,
          "recovered": 14,
          "vaccinated1": 16527,
          "vaccinated2": 182027
        },
        "meta": {
          "population": 3639775,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 78159,
          "deceased": 788,
          "recovered": 77335,
          "tested": 695670,
          "vaccinated1": 2612578,
          "vaccinated2": 1940514
        }
      },
      "Valsad": {
        "delta": {
          "confirmed": 3,
          "recovered": 6,
          "vaccinated1": 84,
          "vaccinated2": 46
        },
        "delta21_14": {
          "confirmed": 28
        },
        "delta7": {
          "confirmed": 25,
          "deceased": 1,
          "recovered": 25,
          "vaccinated1": 6616,
          "vaccinated2": 36430
        },
        "meta": {
          "population": 1703068,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 6405,
          "deceased": 53,
          "recovered": 6308,
          "tested": 155380,
          "vaccinated1": 1232139,
          "vaccinated2": 704675
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 67936000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11879"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 826577,
      "deceased": 10089,
      "recovered": 816283,
      "tested": 30928063,
      "vaccinated1": 44735217,
      "vaccinated2": 25972387
    }
  },
  "HP": {
    "delta": {
      "confirmed": 85,
      "deceased": 1,
      "recovered": 198,
      "tested": 3613,
      "vaccinated1": 371,
      "vaccinated2": 8192
    },
    "delta21_14": {
      "confirmed": 958
    },
    "delta7": {
      "confirmed": 1537,
      "deceased": 20,
      "other": -1,
      "recovered": 1154,
      "tested": 64352,
      "vaccinated1": 13244,
      "vaccinated2": 234011
    },
    "districts": {
      "Bilaspur": {
        "delta": {
          "confirmed": 11,
          "recovered": 12,
          "vaccinated1": 6,
          "vaccinated2": 329
        },
        "delta21_14": {
          "confirmed": 78
        },
        "delta7": {
          "confirmed": 133,
          "recovered": 77,
          "vaccinated1": 695,
          "vaccinated2": 15071
        },
        "meta": {
          "population": 382056,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 14374,
          "deceased": 85,
          "other": 1,
          "recovered": 14120,
          "tested": 39738,
          "vaccinated1": 323204,
          "vaccinated2": 234916
        }
      },
      "Chamba": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 146,
          "vaccinated2": 1749
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 27,
          "recovered": 13,
          "vaccinated1": 1439,
          "vaccinated2": 18796
        },
        "meta": {
          "population": 518844,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 13687,
          "deceased": 160,
          "other": 2,
          "recovered": 13492,
          "tested": 53505,
          "vaccinated1": 364258,
          "vaccinated2": 198146
        }
      },
      "Hamirpur": {
        "delta": {
          "confirmed": 11,
          "recovered": 50,
          "vaccinated2": 32
        },
        "delta21_14": {
          "confirmed": 177
        },
        "delta7": {
          "confirmed": 288,
          "deceased": 4,
          "recovered": 228,
          "vaccinated1": 713,
          "vaccinated2": 26076
        },
        "meta": {
          "population": 454293,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 17379,
          "deceased": 287,
          "other": 1,
          "recovered": 16741,
          "tested": 46407,
          "vaccinated1": 377332,
          "vaccinated2": 269143
        }
      },
      "Kangra": {
        "delta": {
          "confirmed": 40,
          "deceased": 1,
          "recovered": 108,
          "vaccinated1": 2,
          "vaccinated2": 23
        },
        "delta21_14": {
          "confirmed": 310
        },
        "delta7": {
          "confirmed": 657,
          "deceased": 10,
          "recovered": 454,
          "vaccinated1": 2399,
          "vaccinated2": 39940
        },
        "meta": {
          "population": 1507223,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 50818,
          "deceased": 1125,
          "other": 4,
          "recovered": 48872,
          "tested": 94910,
          "vaccinated1": 1182563,
          "vaccinated2": 725754
        }
      },
      "Kinnaur": {
        "delta": {
          "recovered": 1
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 6,
          "vaccinated1": 95,
          "vaccinated2": 517
        },
        "meta": {
          "population": 84298,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 3507,
          "deceased": 38,
          "recovered": 3465,
          "tested": 6730,
          "vaccinated1": 79673,
          "vaccinated2": 63209
        }
      },
      "Kullu": {
        "delta": {
          "recovered": 3
        },
        "delta21_14": {
          "confirmed": 17
        },
        "delta7": {
          "confirmed": 19,
          "other": -1,
          "recovered": 18,
          "vaccinated1": 889,
          "vaccinated2": 9323
        },
        "meta": {
          "population": 437474,
          "tested": {
            "date": "2020-09-29"
          }
        },
        "total": {
          "confirmed": 9692,
          "deceased": 158,
          "other": 2,
          "recovered": 9496,
          "tested": 12012,
          "vaccinated1": 351261,
          "vaccinated2": 203549
        }
      },
      "Lahaul and Spiti": {
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 30,
          "vaccinated2": 412
        },
        "meta": {
          "population": 31528,
          "tested": {
            "date": "2020-10-31"
          }
        },
        "total": {
          "confirmed": 2953,
          "deceased": 18,
          "recovered": 2935,
          "tested": 540,
          "vaccinated1": 31920,
          "vaccinated2": 20986
        }
      },
      "Mandi": {
        "delta": {
          "confirmed": 4,
          "recovered": 5,
          "vaccinated1": 99,
          "vaccinated2": 2275
        },
        "delta21_14": {
          "confirmed": 165
        },
        "delta7": {
          "confirmed": 140,
          "deceased": 3,
          "recovered": 141,
          "vaccinated1": 1156,
          "vaccinated2": 26214
        },
        "meta": {
          "population": 999518,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 31606,
          "deceased": 448,
          "recovered": 30983,
          "tested": 41895,
          "vaccinated1": 775242,
          "vaccinated2": 479355
        }
      },
      "Shimla": {
        "delta": {
          "confirmed": 4,
          "recovered": 9,
          "vaccinated1": 20,
          "vaccinated2": 1688
        },
        "delta21_14": {
          "confirmed": 72
        },
        "delta7": {
          "confirmed": 100,
          "deceased": 3,
          "recovered": 66,
          "vaccinated1": 2224,
          "vaccinated2": 37351
        },
        "meta": {
          "population": 813384,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 27549,
          "deceased": 641,
          "other": 1,
          "recovered": 26786,
          "tested": 32922,
          "vaccinated1": 678341,
          "vaccinated2": 412640
        }
      },
      "Sirmaur": {
        "delta": {
          "vaccinated1": 52,
          "vaccinated2": 1185
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 1388,
          "vaccinated2": 22247
        },
        "meta": {
          "population": 530164,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 15456,
          "deceased": 211,
          "recovered": 15244,
          "tested": 42564,
          "vaccinated1": 423793,
          "vaccinated2": 209631
        }
      },
      "Solan": {
        "delta": {
          "confirmed": 4,
          "recovered": 2,
          "vaccinated1": 33,
          "vaccinated2": 493
        },
        "delta21_14": {
          "confirmed": 25
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 27,
          "vaccinated1": 1393,
          "vaccinated2": 21242
        },
        "meta": {
          "population": 576670,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 22817,
          "deceased": 314,
          "recovered": 22472,
          "tested": 57200,
          "vaccinated1": 691163,
          "vaccinated2": 339630
        }
      },
      "Una": {
        "delta": {
          "confirmed": 11,
          "recovered": 6,
          "vaccinated1": 24,
          "vaccinated2": 396
        },
        "delta21_14": {
          "confirmed": 101
        },
        "delta7": {
          "confirmed": 145,
          "recovered": 124,
          "vaccinated1": 824,
          "vaccinated2": 16782
        },
        "meta": {
          "population": 521057,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 14268,
          "deceased": 253,
          "other": 2,
          "recovered": 13804,
          "tested": 52905,
          "vaccinated1": 434945,
          "vaccinated2": 286819
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 7300000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/nhm_hp/status/1454810267364200449?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 224106,
      "deceased": 3738,
      "other": 16,
      "recovered": 218410,
      "tested": 3685011,
      "vaccinated1": 5713695,
      "vaccinated2": 3443823
    }
  },
  "HR": {
    "delta": {
      "confirmed": 11,
      "recovered": 10,
      "tested": 20588,
      "vaccinated1": 7867,
      "vaccinated2": 15801
    },
    "delta21_14": {
      "confirmed": 83
    },
    "delta7": {
      "confirmed": 95,
      "recovered": 87,
      "tested": 148110,
      "vaccinated1": 160777,
      "vaccinated2": 368141
    },
    "districts": {
      "Ambala": {
        "delta": {
          "vaccinated1": 100,
          "vaccinated2": 587
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 3021,
          "vaccinated2": 25458
        },
        "meta": {
          "population": 1136784,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 30150,
          "deceased": 509,
          "recovered": 29639,
          "tested": 206003,
          "vaccinated1": 873020,
          "vaccinated2": 571772
        }
      },
      "Bhiwani": {
        "delta": {
          "vaccinated1": 578,
          "vaccinated2": 2454
        },
        "delta7": {
          "vaccinated1": 6166,
          "vaccinated2": 25664
        },
        "meta": {
          "population": 1629109,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 22409,
          "deceased": 652,
          "recovered": 21757,
          "tested": 176225,
          "vaccinated1": 741251,
          "vaccinated2": 317765
        }
      },
      "Charkhi Dadri": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 35
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 941,
          "vaccinated2": 11884
        },
        "meta": {
          "population": 502276,
          "tested": {
            "date": "2020-10-28"
          }
        },
        "total": {
          "confirmed": 5078,
          "deceased": 139,
          "recovered": 4939,
          "tested": 58525,
          "vaccinated1": 364599,
          "vaccinated2": 262184
        }
      },
      "Faridabad": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 818,
          "vaccinated2": 1577
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 7,
          "vaccinated1": 17515,
          "vaccinated2": 30156
        },
        "meta": {
          "population": 1798954,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 99902,
          "deceased": 716,
          "recovered": 99157,
          "tested": 504970,
          "vaccinated1": 1658940,
          "vaccinated2": 840997
        }
      },
      "Fatehabad": {
        "delta": {
          "vaccinated1": 30,
          "vaccinated2": 37
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 1800,
          "vaccinated2": 7458
        },
        "meta": {
          "population": 941522,
          "tested": {
            "date": "2020-08-29"
          }
        },
        "total": {
          "confirmed": 17875,
          "deceased": 481,
          "recovered": 17394,
          "tested": 27456,
          "vaccinated1": 574546,
          "vaccinated2": 201763
        }
      },
      "Gurugram": {
        "delta": {
          "confirmed": 7,
          "recovered": 8,
          "vaccinated1": 264,
          "vaccinated2": 1637
        },
        "delta21_14": {
          "confirmed": 47
        },
        "delta7": {
          "confirmed": 55,
          "recovered": 48,
          "vaccinated1": 20221,
          "vaccinated2": 48107
        },
        "meta": {
          "population": 1514085,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 181428,
          "deceased": 922,
          "recovered": 180454,
          "tested": 742619,
          "vaccinated1": 2193114,
          "vaccinated2": 1377160
        }
      },
      "Hisar": {
        "delta": {
          "vaccinated1": 58,
          "vaccinated2": 111
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 5821,
          "vaccinated2": 12364
        },
        "meta": {
          "population": 1742815,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 53995,
          "deceased": 1136,
          "recovered": 52857,
          "tested": 322039,
          "vaccinated1": 994213,
          "vaccinated2": 332162
        }
      },
      "Jhajjar": {
        "delta": {
          "vaccinated1": 569,
          "vaccinated2": 996
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 8229,
          "vaccinated2": 19599
        },
        "meta": {
          "population": 956907,
          "tested": {
            "date": "2020-11-30"
          }
        },
        "total": {
          "confirmed": 18849,
          "deceased": 328,
          "recovered": 18514,
          "tested": 186853,
          "vaccinated1": 684511,
          "vaccinated2": 293496
        }
      },
      "Jind": {
        "delta": {
          "vaccinated1": 490,
          "vaccinated2": 567
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 13366,
          "vaccinated2": 21662
        },
        "meta": {
          "population": 1332042,
          "tested": {
            "date": "2020-07-13"
          }
        },
        "total": {
          "confirmed": 21209,
          "deceased": 533,
          "recovered": 20675,
          "tested": 11157,
          "vaccinated1": 704573,
          "vaccinated2": 250859
        }
      },
      "Kaithal": {
        "delta": {
          "vaccinated1": 69,
          "vaccinated2": 149
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 4183,
          "vaccinated2": 11836
        },
        "meta": {
          "population": 1072861,
          "tested": {
            "date": "2020-07-13"
          }
        },
        "total": {
          "confirmed": 11244,
          "deceased": 346,
          "recovered": 10898,
          "tested": 11687,
          "vaccinated1": 615168,
          "vaccinated2": 217439
        }
      },
      "Karnal": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 617,
          "vaccinated2": 217
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 8109,
          "vaccinated2": 23328
        },
        "meta": {
          "population": 1506323,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 40037,
          "deceased": 552,
          "recovered": 39484,
          "tested": 185147,
          "vaccinated1": 1000120,
          "vaccinated2": 451876
        }
      },
      "Kurukshetra": {
        "delta": {
          "vaccinated1": 55,
          "vaccinated2": 199
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 4064,
          "vaccinated2": 9522
        },
        "meta": {
          "population": 964231,
          "tested": {
            "date": "2021-01-29"
          }
        },
        "total": {
          "confirmed": 22147,
          "deceased": 357,
          "recovered": 21789,
          "tested": 198881,
          "vaccinated1": 610380,
          "vaccinated2": 248125
        }
      },
      "Mahendragarh": {
        "delta": {
          "vaccinated1": 205,
          "vaccinated2": 529
        },
        "delta7": {
          "vaccinated1": 4857,
          "vaccinated2": 10632
        },
        "meta": {
          "population": 921680,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 21689,
          "deceased": 155,
          "recovered": 21534,
          "tested": 143253,
          "vaccinated1": 576527,
          "vaccinated2": 264911
        }
      },
      "Nuh": {
        "delta": {
          "vaccinated1": 2433,
          "vaccinated2": 583
        },
        "delta7": {
          "vaccinated1": 10812,
          "vaccinated2": 3789
        },
        "meta": {
          "population": 1089406,
          "tested": {
            "date": "2020-11-01"
          }
        },
        "total": {
          "confirmed": 5014,
          "deceased": 123,
          "recovered": 4890,
          "tested": 93389,
          "vaccinated1": 354422,
          "vaccinated2": 78081
        }
      },
      "Palwal": {
        "delta": {
          "vaccinated1": 358,
          "vaccinated2": 259
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 7558,
          "vaccinated2": 9496
        },
        "meta": {
          "population": 1040493,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 11025,
          "deceased": 153,
          "recovered": 10872,
          "tested": 139809,
          "vaccinated1": 608874,
          "vaccinated2": 221786
        }
      },
      "Panchkula": {
        "delta": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 127,
          "vaccinated2": 1033
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 10,
          "recovered": 12,
          "vaccinated1": 1786,
          "vaccinated2": 10743
        },
        "meta": {
          "population": 558890,
          "tested": {
            "date": "2020-12-05"
          }
        },
        "total": {
          "confirmed": 30770,
          "deceased": 378,
          "recovered": 30379,
          "tested": 118725,
          "vaccinated1": 456675,
          "vaccinated2": 279951
        }
      },
      "Panipat": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 375,
          "vaccinated2": 1054
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 7950,
          "vaccinated2": 12888
        },
        "meta": {
          "population": 1202811,
          "tested": {
            "date": "2020-10-06"
          }
        },
        "total": {
          "confirmed": 31150,
          "deceased": 638,
          "recovered": 30510,
          "tested": 58863,
          "vaccinated1": 830805,
          "vaccinated2": 273172
        }
      },
      "Rewari": {
        "delta": {
          "vaccinated1": 83,
          "vaccinated2": 353
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 4,
          "vaccinated1": 2550,
          "vaccinated2": 9877
        },
        "meta": {
          "population": 896129,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 20327,
          "deceased": 221,
          "recovered": 20106,
          "tested": 151363,
          "vaccinated1": 648724,
          "vaccinated2": 294989
        }
      },
      "Rohtak": {
        "delta": {
          "vaccinated1": 311,
          "vaccinated2": 953
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 11409,
          "vaccinated2": 17219
        },
        "meta": {
          "population": 1058683,
          "tested": {
            "date": "2020-07-13"
          }
        },
        "total": {
          "confirmed": 25903,
          "deceased": 534,
          "recovered": 25350,
          "tested": 25894,
          "vaccinated1": 674649,
          "vaccinated2": 305282
        }
      },
      "Sirsa": {
        "delta": {
          "vaccinated1": 47,
          "vaccinated2": 92
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 2,
          "vaccinated1": 4263,
          "vaccinated2": 8228
        },
        "meta": {
          "population": 1295114,
          "tested": {
            "date": "2020-12-06"
          }
        },
        "total": {
          "confirmed": 29282,
          "deceased": 508,
          "recovered": 28771,
          "tested": 150193,
          "vaccinated1": 786205,
          "vaccinated2": 278920
        }
      },
      "Sonipat": {
        "delta": {
          "vaccinated1": 785,
          "vaccinated2": 2190
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 9421,
          "vaccinated2": 21065
        },
        "meta": {
          "population": 1480080,
          "tested": {
            "date": "2020-12-06"
          }
        },
        "total": {
          "confirmed": 47138,
          "deceased": 254,
          "recovered": 46884,
          "tested": 238963,
          "vaccinated1": 989125,
          "vaccinated2": 411915
        }
      },
      "Yamunanagar": {
        "delta": {
          "vaccinated1": 102,
          "vaccinated2": 185
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 6,
          "vaccinated1": 6471,
          "vaccinated2": 16554
        },
        "meta": {
          "population": 1214162,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 24631,
          "deceased": 414,
          "recovered": 24215,
          "tested": 196131,
          "vaccinated1": 831598,
          "vaccinated2": 340196
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 28672000,
      "tested": {
        "date": "2021-10-31",
        "source": "http://www.nhmharyana.gov.in/WriteReadData/userfiles/file/CoronaVirus/Daily%20Bulletin%20of%20COVID%2019%20as%20on%2031-10-2021.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 771252,
      "deceased": 10049,
      "recovered": 761068,
      "tested": 13032504,
      "vaccinated1": 17772376,
      "vaccinated2": 8115463
    }
  },
  "JH": {
    "delta": {
      "confirmed": 10,
      "recovered": 8,
      "tested": 31238,
      "vaccinated1": 41034,
      "vaccinated2": 51488
    },
    "delta21_14": {
      "confirmed": 78
    },
    "delta7": {
      "confirmed": 137,
      "deceased": 3,
      "recovered": 250,
      "tested": 464579,
      "vaccinated1": 299587,
      "vaccinated2": 428313
    },
    "districts": {
      "Bokaro": {
        "delta": {
          "vaccinated1": 3236,
          "vaccinated2": 4363
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 15,
          "recovered": 13,
          "vaccinated1": 27554,
          "vaccinated2": 34375
        },
        "meta": {
          "population": 2061918,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 19461,
          "deceased": 286,
          "recovered": 19170,
          "tested": 11798,
          "vaccinated1": 994497,
          "vaccinated2": 333330
        }
      },
      "Chatra": {
        "delta": {
          "vaccinated1": 909,
          "vaccinated2": 1813
        },
        "delta7": {
          "vaccinated1": 5946,
          "vaccinated2": 11402
        },
        "meta": {
          "population": 1042304
        },
        "total": {
          "confirmed": 6033,
          "deceased": 53,
          "recovered": 5977,
          "vaccinated1": 454807,
          "vaccinated2": 126700
        }
      },
      "Deoghar": {
        "delta": {
          "vaccinated1": 985,
          "vaccinated2": 2299
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 9801,
          "vaccinated2": 19008
        },
        "meta": {
          "population": 1491879,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 10835,
          "deceased": 113,
          "recovered": 10721,
          "tested": 6951,
          "vaccinated1": 569167,
          "vaccinated2": 230458
        }
      },
      "Dhanbad": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 2811,
          "vaccinated2": 3597
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 24,
          "recovered": 13,
          "vaccinated1": 33374,
          "vaccinated2": 34095
        },
        "meta": {
          "population": 2682662
        },
        "total": {
          "confirmed": 16589,
          "deceased": 382,
          "recovered": 16196,
          "vaccinated1": 1185934,
          "vaccinated2": 446946
        }
      },
      "Dumka": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 1460,
          "vaccinated2": 2659
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 12679,
          "vaccinated2": 22872
        },
        "meta": {
          "population": 1321096,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 4636,
          "deceased": 47,
          "recovered": 4589,
          "tested": 5400,
          "vaccinated1": 638722,
          "vaccinated2": 229944
        }
      },
      "East Singhbhum": {
        "delta": {
          "recovered": 3,
          "vaccinated1": 1925,
          "vaccinated2": 4669
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 47,
          "deceased": 2,
          "recovered": 42,
          "vaccinated1": 11994,
          "vaccinated2": 29238
        },
        "meta": {
          "population": 2291032
        },
        "total": {
          "confirmed": 51974,
          "deceased": 1046,
          "recovered": 50907,
          "vaccinated1": 1424376,
          "vaccinated2": 661091
        }
      },
      "Garhwa": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 4770,
          "vaccinated2": 3027
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 7,
          "vaccinated1": 17210,
          "vaccinated2": 15386
        },
        "meta": {
          "population": 1322387
        },
        "total": {
          "confirmed": 6895,
          "deceased": 94,
          "recovered": 6801,
          "vaccinated1": 456056,
          "vaccinated2": 148421
        }
      },
      "Giridih": {
        "delta": {
          "vaccinated1": 2411,
          "vaccinated2": 3577
        },
        "delta7": {
          "vaccinated1": 16994,
          "vaccinated2": 29823
        },
        "meta": {
          "population": 2445203,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 8964,
          "deceased": 130,
          "recovered": 8834,
          "tested": 11132,
          "vaccinated1": 994417,
          "vaccinated2": 301193
        }
      },
      "Godda": {
        "delta": {
          "vaccinated1": 906,
          "vaccinated2": 1883
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 7385,
          "vaccinated2": 16537
        },
        "meta": {
          "population": 1311382,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 5840,
          "deceased": 87,
          "recovered": 5753,
          "tested": 10980,
          "vaccinated1": 527710,
          "vaccinated2": 198198
        }
      },
      "Gumla": {
        "delta": {
          "vaccinated1": 465,
          "vaccinated2": 744
        },
        "delta7": {
          "confirmed": 5,
          "vaccinated1": 4900,
          "vaccinated2": 8696
        },
        "meta": {
          "population": 1025656
        },
        "total": {
          "confirmed": 9900,
          "deceased": 38,
          "recovered": 9857,
          "vaccinated1": 387738,
          "vaccinated2": 156364
        }
      },
      "Hazaribagh": {
        "delta": {
          "vaccinated1": 678,
          "vaccinated2": 1243
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 11940,
          "vaccinated2": 21857
        },
        "meta": {
          "population": 1734005
        },
        "total": {
          "confirmed": 19593,
          "deceased": 186,
          "recovered": 19404,
          "vaccinated1": 865943,
          "vaccinated2": 317137
        }
      },
      "Jamtara": {
        "delta": {
          "vaccinated1": 973,
          "vaccinated2": 1373
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 4,
          "deceased": 1,
          "recovered": 3,
          "vaccinated1": 9614,
          "vaccinated2": 12331
        },
        "meta": {
          "population": 790207,
          "tested": {
            "date": "2020-07-21"
          }
        },
        "total": {
          "confirmed": 5599,
          "deceased": 61,
          "recovered": 5534,
          "tested": 2880,
          "vaccinated1": 381155,
          "vaccinated2": 137216
        }
      },
      "Khunti": {
        "delta": {
          "vaccinated1": 354,
          "vaccinated2": 367
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "vaccinated1": 3335,
          "vaccinated2": 3834
        },
        "meta": {
          "population": 530299,
          "tested": {
            "date": "2020-07-29"
          }
        },
        "total": {
          "confirmed": 7820,
          "deceased": 96,
          "recovered": 7724,
          "tested": 3852,
          "vaccinated1": 227503,
          "vaccinated2": 107053
        }
      },
      "Koderma": {
        "delta": {
          "vaccinated1": 45,
          "vaccinated2": 235
        },
        "delta7": {
          "vaccinated1": 3393,
          "vaccinated2": 11488
        },
        "meta": {
          "population": 717169
        },
        "total": {
          "confirmed": 12872,
          "deceased": 136,
          "recovered": 12736,
          "vaccinated1": 363078,
          "vaccinated2": 140609
        }
      },
      "Latehar": {
        "delta": {
          "vaccinated1": 1158,
          "vaccinated2": 773
        },
        "delta7": {
          "vaccinated1": 9565,
          "vaccinated2": 7719
        },
        "meta": {
          "population": 725673
        },
        "total": {
          "confirmed": 7871,
          "deceased": 57,
          "recovered": 7814,
          "vaccinated1": 294989,
          "vaccinated2": 84919
        }
      },
      "Lohardaga": {
        "delta": {
          "vaccinated1": 188,
          "vaccinated2": 166
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 3444,
          "vaccinated2": 3563
        },
        "meta": {
          "population": 461738,
          "tested": {
            "date": "2020-07-25"
          }
        },
        "total": {
          "confirmed": 6709,
          "deceased": 88,
          "recovered": 6621,
          "tested": 7526,
          "vaccinated1": 173109,
          "vaccinated2": 63130
        }
      },
      "Pakur": {
        "delta": {
          "vaccinated1": 3009,
          "vaccinated2": 2636
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 9945,
          "vaccinated2": 9107
        },
        "meta": {
          "population": 899200,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 2552,
          "deceased": 12,
          "recovered": 2539,
          "tested": 6429,
          "vaccinated1": 378048,
          "vaccinated2": 108941
        }
      },
      "Palamu": {
        "delta": {
          "vaccinated1": 5270,
          "vaccinated2": 6713
        },
        "delta7": {
          "vaccinated1": 21657,
          "vaccinated2": 37375
        },
        "meta": {
          "population": 1936319
        },
        "total": {
          "confirmed": 12294,
          "deceased": 110,
          "recovered": 12184,
          "vaccinated1": 788026,
          "vaccinated2": 311074
        }
      },
      "Ramgarh": {
        "delta": {
          "vaccinated1": 645,
          "vaccinated2": 944
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 7,
          "vaccinated1": 5306,
          "vaccinated2": 10927
        },
        "meta": {
          "population": 949159
        },
        "total": {
          "confirmed": 13923,
          "deceased": 197,
          "recovered": 13714,
          "vaccinated1": 522017,
          "vaccinated2": 185442
        }
      },
      "Ranchi": {
        "delta": {
          "confirmed": 10,
          "recovered": 2,
          "vaccinated1": 4743,
          "vaccinated2": 4594
        },
        "delta21_14": {
          "confirmed": 52
        },
        "delta7": {
          "confirmed": 182,
          "recovered": 228,
          "vaccinated1": 35099,
          "vaccinated2": 38856
        },
        "meta": {
          "population": 2912022
        },
        "total": {
          "confirmed": 86116,
          "deceased": 1585,
          "recovered": 84495,
          "vaccinated1": 1512114,
          "vaccinated2": 656001
        }
      },
      "Sahibganj": {
        "delta": {
          "vaccinated1": 1336,
          "vaccinated2": 947
        },
        "delta7": {
          "vaccinated1": 10449,
          "vaccinated2": 13687
        },
        "meta": {
          "population": 1150038,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 4834,
          "deceased": 42,
          "recovered": 4792,
          "tested": 5029,
          "vaccinated1": 430948,
          "vaccinated2": 132560
        }
      },
      "Saraikela-Kharsawan": {
        "delta": {
          "vaccinated1": 682,
          "vaccinated2": 490
        },
        "delta7": {
          "vaccinated1": 11215,
          "vaccinated2": 12399
        },
        "meta": {
          "population": 1063458,
          "tested": {
            "date": "2020-12-13"
          }
        },
        "total": {
          "confirmed": 7207,
          "deceased": 67,
          "recovered": 7137,
          "tested": 161796,
          "vaccinated1": 505417,
          "vaccinated2": 167980
        }
      },
      "Simdega": {
        "delta": {
          "vaccinated1": 67,
          "vaccinated2": 189
        },
        "delta7": {
          "vaccinated1": 1694,
          "vaccinated2": 4126
        },
        "meta": {
          "population": 599813
        },
        "total": {
          "confirmed": 7193,
          "deceased": 92,
          "recovered": 7101,
          "vaccinated1": 277357,
          "vaccinated2": 112059
        }
      },
      "Unknown": {
        "delta7": {
          "confirmed": -166,
          "recovered": -70
        }
      },
      "West Singhbhum": {
        "delta": {
          "vaccinated1": 895,
          "vaccinated2": 962
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 5,
          "vaccinated1": 12587,
          "vaccinated2": 16980
        },
        "meta": {
          "population": 1501619
        },
        "total": {
          "confirmed": 13054,
          "deceased": 133,
          "recovered": 12918,
          "vaccinated1": 630437,
          "vaccinated2": 225607
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 37403000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11884"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 348764,
      "deceased": 5138,
      "recovered": 343518,
      "tested": 15985878,
      "vaccinated1": 14986646,
      "vaccinated2": 5585648
    }
  },
  "JK": {
    "delta": {
      "confirmed": 95,
      "recovered": 79,
      "tested": 38915,
      "vaccinated1": 1584,
      "vaccinated2": 45202
    },
    "delta21_14": {
      "confirmed": 529
    },
    "delta7": {
      "confirmed": 611,
      "deceased": 3,
      "recovered": 572,
      "tested": 254608,
      "vaccinated1": 33383,
      "vaccinated2": 414843
    },
    "districts": {
      "Anantnag": {
        "delta": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 69,
          "vaccinated2": 4677
        },
        "delta21_14": {
          "confirmed": 19
        },
        "delta7": {
          "confirmed": 10,
          "recovered": 12,
          "vaccinated1": 1472,
          "vaccinated2": 30949
        },
        "meta": {
          "population": 1070144
        },
        "total": {
          "confirmed": 16603,
          "deceased": 205,
          "recovered": 16378,
          "vaccinated1": 759605,
          "vaccinated2": 402717
        }
      },
      "Bandipora": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 12,
          "vaccinated2": 639
        },
        "delta21_14": {
          "confirmed": 16
        },
        "delta7": {
          "confirmed": 13,
          "recovered": 19,
          "vaccinated1": 349,
          "vaccinated2": 6835
        },
        "meta": {
          "population": 385099
        },
        "total": {
          "confirmed": 9814,
          "deceased": 102,
          "recovered": 9693,
          "vaccinated1": 303665,
          "vaccinated2": 154345
        }
      },
      "Baramulla": {
        "delta": {
          "confirmed": 10,
          "recovered": 6,
          "vaccinated1": 42,
          "vaccinated2": 2327
        },
        "delta21_14": {
          "confirmed": 57
        },
        "delta7": {
          "confirmed": 96,
          "recovered": 64,
          "vaccinated1": 1665,
          "vaccinated2": 29357
        },
        "meta": {
          "population": 1015503
        },
        "total": {
          "confirmed": 24613,
          "deceased": 282,
          "recovered": 24196,
          "vaccinated1": 776258,
          "vaccinated2": 450002
        }
      },
      "Budgam": {
        "delta": {
          "confirmed": 10,
          "recovered": 10,
          "vaccinated1": 113,
          "vaccinated2": 2657
        },
        "delta21_14": {
          "confirmed": 48
        },
        "delta7": {
          "confirmed": 63,
          "recovered": 53,
          "vaccinated1": 1409,
          "vaccinated2": 22456
        },
        "meta": {
          "population": 735753
        },
        "total": {
          "confirmed": 23844,
          "deceased": 207,
          "recovered": 23548,
          "vaccinated1": 592075,
          "vaccinated2": 319587
        }
      },
      "Doda": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 74,
          "vaccinated2": 1079
        },
        "delta21_14": {
          "confirmed": 26
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 26,
          "vaccinated1": 1065,
          "vaccinated2": 19212
        },
        "meta": {
          "population": 409576
        },
        "total": {
          "confirmed": 7869,
          "deceased": 133,
          "recovered": 7704,
          "vaccinated1": 313983,
          "vaccinated2": 158751
        }
      },
      "Ganderbal": {
        "delta": {
          "confirmed": 7,
          "recovered": 2,
          "vaccinated1": 33,
          "vaccinated2": 1116
        },
        "delta21_14": {
          "confirmed": 10
        },
        "delta7": {
          "confirmed": 31,
          "recovered": 12,
          "vaccinated1": 370,
          "vaccinated2": 9271
        },
        "meta": {
          "population": 297003
        },
        "total": {
          "confirmed": 10436,
          "deceased": 79,
          "recovered": 10313,
          "vaccinated1": 227349,
          "vaccinated2": 133812
        }
      },
      "Jammu": {
        "delta": {
          "confirmed": 3,
          "recovered": 6,
          "vaccinated1": 86,
          "vaccinated2": 593
        },
        "delta21_14": {
          "confirmed": 27
        },
        "delta7": {
          "confirmed": 20,
          "recovered": 37,
          "vaccinated1": 4121,
          "vaccinated2": 16781
        },
        "meta": {
          "population": 1526406
        },
        "total": {
          "confirmed": 53324,
          "deceased": 1145,
          "recovered": 52145,
          "vaccinated1": 1168448,
          "vaccinated2": 610537
        }
      },
      "Kathua": {
        "delta": {
          "vaccinated1": 108,
          "vaccinated2": 2053
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "deceased": 1,
          "recovered": 5,
          "vaccinated1": 1867,
          "vaccinated2": 22270
        },
        "meta": {
          "population": 615711
        },
        "total": {
          "confirmed": 9327,
          "deceased": 152,
          "recovered": 9175,
          "vaccinated1": 482584,
          "vaccinated2": 249588
        }
      },
      "Kishtwar": {
        "delta": {
          "vaccinated1": 85,
          "vaccinated2": 320
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 3948,
          "vaccinated2": 3385
        },
        "meta": {
          "population": 230696
        },
        "total": {
          "confirmed": 4819,
          "deceased": 44,
          "recovered": 4773,
          "vaccinated1": 164754,
          "vaccinated2": 78041
        }
      },
      "Kulgam": {
        "delta": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 39,
          "vaccinated2": 1610
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 5,
          "vaccinated1": 632,
          "vaccinated2": 20244
        },
        "meta": {
          "population": 422786
        },
        "total": {
          "confirmed": 11489,
          "deceased": 117,
          "recovered": 11367,
          "vaccinated1": 401091,
          "vaccinated2": 202260
        }
      },
      "Kupwara": {
        "delta": {
          "confirmed": 5,
          "recovered": 4,
          "vaccinated1": 165,
          "vaccinated2": 8743
        },
        "delta21_14": {
          "confirmed": 32
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 25,
          "vaccinated1": 3959,
          "vaccinated2": 42820
        },
        "meta": {
          "population": 875564
        },
        "total": {
          "confirmed": 14463,
          "deceased": 166,
          "recovered": 14268,
          "vaccinated1": 673594,
          "vaccinated2": 348327
        }
      },
      "Pulwama": {
        "delta": {
          "confirmed": 4,
          "vaccinated1": 24,
          "vaccinated2": 1414
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 5,
          "vaccinated1": 1021,
          "vaccinated2": 16829
        },
        "meta": {
          "population": 570060,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 15512,
          "deceased": 194,
          "recovered": 15309,
          "tested": 139552,
          "vaccinated1": 430622,
          "vaccinated2": 244300
        }
      },
      "Punch": {
        "delta": {
          "vaccinated1": 45,
          "vaccinated2": 3190
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 7,
          "recovered": 14,
          "vaccinated1": 695,
          "vaccinated2": 27765
        },
        "meta": {
          "population": 476820
        },
        "total": {
          "confirmed": 6482,
          "deceased": 98,
          "recovered": 6371,
          "vaccinated1": 386098,
          "vaccinated2": 234540
        }
      },
      "Rajouri": {
        "delta": {
          "vaccinated1": 56,
          "vaccinated2": 752
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 7,
          "vaccinated1": 1247,
          "vaccinated2": 9544
        },
        "meta": {
          "population": 619266
        },
        "total": {
          "confirmed": 11272,
          "deceased": 237,
          "recovered": 11031,
          "vaccinated1": 498787,
          "vaccinated2": 241407
        }
      },
      "Ramban": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 155,
          "vaccinated2": 829
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 1498,
          "vaccinated2": 10369
        },
        "meta": {
          "population": 283313
        },
        "total": {
          "confirmed": 6043,
          "deceased": 67,
          "recovered": 5971,
          "vaccinated1": 220690,
          "vaccinated2": 147086
        }
      },
      "Reasi": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 240,
          "vaccinated2": 1808
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 10,
          "vaccinated1": 1644,
          "vaccinated2": 15636
        },
        "meta": {
          "population": 314714
        },
        "total": {
          "confirmed": 6626,
          "deceased": 43,
          "recovered": 6575,
          "vaccinated1": 244379,
          "vaccinated2": 133971
        }
      },
      "Samba": {
        "delta": {
          "vaccinated1": 40,
          "vaccinated2": 468
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 1207,
          "vaccinated2": 6224
        },
        "meta": {
          "population": 318611
        },
        "total": {
          "confirmed": 7152,
          "deceased": 120,
          "recovered": 7032,
          "vaccinated1": 280700,
          "vaccinated2": 122554
        }
      },
      "Shopiyan": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 302
        },
        "delta7": {
          "vaccinated1": 139,
          "vaccinated2": 7669
        },
        "meta": {
          "population": 265960
        },
        "total": {
          "confirmed": 5607,
          "deceased": 58,
          "recovered": 5549,
          "vaccinated1": 203036,
          "vaccinated2": 95122
        }
      },
      "Srinagar": {
        "delta": {
          "confirmed": 49,
          "recovered": 45,
          "vaccinated1": 394,
          "vaccinated2": 11547
        },
        "delta21_14": {
          "confirmed": 247
        },
        "delta7": {
          "confirmed": 305,
          "deceased": 2,
          "recovered": 274,
          "vaccinated1": 2788,
          "vaccinated2": 80075
        },
        "meta": {
          "population": 1269751
        },
        "total": {
          "confirmed": 75539,
          "deceased": 846,
          "recovered": 74242,
          "vaccinated1": 957347,
          "vaccinated2": 592016
        }
      },
      "Udhampur": {
        "delta": {
          "vaccinated1": 76,
          "vaccinated2": 700
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 2,
          "vaccinated1": 2420,
          "vaccinated2": 14763
        },
        "meta": {
          "population": 555357
        },
        "total": {
          "confirmed": 11415,
          "deceased": 137,
          "recovered": 11275,
          "vaccinated1": 425945,
          "vaccinated2": 227785
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 13203000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/diprjk/status/1454804735307894787?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 332249,
      "deceased": 4432,
      "recovered": 326915,
      "tested": 16202346,
      "vaccinated1": 9511073,
      "vaccinated2": 5149471
    }
  },
  "KA": {
    "delta": {
      "confirmed": 292,
      "deceased": 11,
      "recovered": 345,
      "tested": 106939,
      "vaccinated1": 17604,
      "vaccinated2": 28163
    },
    "delta21_14": {
      "confirmed": 2432
    },
    "delta7": {
      "confirmed": 2347,
      "deceased": 75,
      "recovered": 2339,
      "tested": 724215,
      "vaccinated1": 623591,
      "vaccinated2": 1373861
    },
    "districts": {
      "Bagalkote": {
        "delta": {
          "vaccinated1": 823,
          "vaccinated2": 98
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 57683,
          "vaccinated2": 22844
        },
        "meta": {
          "population": 1890826,
          "tested": {
            "date": "2020-08-23"
          }
        },
        "total": {
          "confirmed": 35178,
          "deceased": 333,
          "recovered": 34843,
          "tested": 49851,
          "vaccinated1": 1188016,
          "vaccinated2": 613422
        }
      },
      "Ballari": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 2415,
          "vaccinated2": 483
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 9,
          "recovered": 14,
          "vaccinated1": 54006,
          "vaccinated2": 84805
        },
        "meta": {
          "population": 2532383,
          "tested": {
            "date": "2020-12-28"
          }
        },
        "total": {
          "confirmed": 97763,
          "deceased": 1689,
          "recovered": 95961,
          "tested": 402407,
          "vaccinated1": 1758198,
          "vaccinated2": 864065
        }
      },
      "Belagavi": {
        "delta": {
          "confirmed": 6,
          "recovered": 1,
          "vaccinated1": 427,
          "vaccinated2": 825
        },
        "delta21_14": {
          "confirmed": 31
        },
        "delta7": {
          "confirmed": 20,
          "deceased": 1,
          "recovered": 21,
          "vaccinated1": 39701,
          "vaccinated2": 98350
        },
        "meta": {
          "population": 4778439,
          "tested": {
            "date": "2021-01-02"
          }
        },
        "total": {
          "confirmed": 79900,
          "deceased": 938,
          "recovered": 78879,
          "tested": 396565,
          "vaccinated1": 3165252,
          "vaccinated2": 1386668
        }
      },
      "Bengaluru Rural": {
        "delta": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 118,
          "vaccinated2": 994
        },
        "delta21_14": {
          "confirmed": 40
        },
        "delta7": {
          "confirmed": 23,
          "deceased": 2,
          "recovered": 27,
          "vaccinated1": 5196,
          "vaccinated2": 22700
        },
        "meta": {
          "population": 987257,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 62005,
          "deceased": 890,
          "recovered": 61073,
          "tested": 240277,
          "vaccinated1": 700825,
          "vaccinated2": 385704
        }
      },
      "Bengaluru Urban": {
        "delta": {
          "confirmed": 137,
          "deceased": 7,
          "recovered": 204,
          "vaccinated1": 2109,
          "vaccinated2": 11462
        },
        "delta21_14": {
          "confirmed": 1105
        },
        "delta7": {
          "confirmed": 1165,
          "deceased": 37,
          "recovered": 1093,
          "vaccinated1": 48836,
          "vaccinated2": 247281
        },
        "meta": {
          "population": 9588910,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 1251872,
          "deceased": 16281,
          "other": 1,
          "recovered": 1229059,
          "tested": 6883888,
          "vaccinated1": 9219875,
          "vaccinated2": 5903791
        }
      },
      "Bidar": {
        "delta": {
          "vaccinated1": 408,
          "vaccinated2": 740
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "recovered": 5,
          "vaccinated1": 13739,
          "vaccinated2": 30558
        },
        "meta": {
          "population": 1700018,
          "tested": {
            "date": "2020-08-29"
          }
        },
        "total": {
          "confirmed": 24340,
          "deceased": 400,
          "other": 4,
          "recovered": 23936,
          "tested": 67689,
          "vaccinated1": 929776,
          "vaccinated2": 515993
        }
      },
      "Chamarajanagara": {
        "delta": {
          "recovered": 4,
          "vaccinated1": 25,
          "vaccinated2": 399
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 15,
          "vaccinated1": 2102,
          "vaccinated2": 36658
        },
        "meta": {
          "population": 1020962,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 33001,
          "deceased": 500,
          "other": 11,
          "recovered": 32469,
          "tested": 5156,
          "vaccinated1": 647951,
          "vaccinated2": 351940
        }
      },
      "Chikkaballapura": {
        "delta": {
          "confirmed": 2,
          "deceased": 1,
          "vaccinated1": 16,
          "vaccinated2": 22
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 11,
          "deceased": 3,
          "recovered": 8,
          "vaccinated1": 4700,
          "vaccinated2": 19860
        },
        "meta": {
          "population": 1254377,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 43951,
          "deceased": 429,
          "other": 1,
          "recovered": 43501,
          "tested": 15089,
          "vaccinated1": 852473,
          "vaccinated2": 497674
        }
      },
      "Chikkamagaluru": {
        "delta": {
          "confirmed": 3,
          "recovered": 4,
          "vaccinated1": 14,
          "vaccinated2": 29
        },
        "delta21_14": {
          "confirmed": 46
        },
        "delta7": {
          "confirmed": 28,
          "recovered": 93,
          "vaccinated1": 4830,
          "vaccinated2": 13010
        },
        "meta": {
          "population": 1137753,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 51126,
          "deceased": 395,
          "recovered": 50662,
          "tested": 5467,
          "vaccinated1": 737417,
          "vaccinated2": 346002
        }
      },
      "Chitradurga": {
        "delta": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 2340,
          "vaccinated2": 1956
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 17,
          "recovered": 12,
          "vaccinated1": 45062,
          "vaccinated2": 47252
        },
        "meta": {
          "population": 1660378,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 36666,
          "deceased": 206,
          "recovered": 36412,
          "tested": 4393,
          "vaccinated1": 1020280,
          "vaccinated2": 618156
        }
      },
      "Dakshina Kannada": {
        "delta": {
          "confirmed": 24,
          "recovered": 20,
          "vaccinated1": 139,
          "vaccinated2": 858
        },
        "delta21_14": {
          "confirmed": 232
        },
        "delta7": {
          "confirmed": 192,
          "deceased": 9,
          "recovered": 193,
          "vaccinated1": 5124,
          "vaccinated2": 38765
        },
        "meta": {
          "population": 2083625,
          "tested": {
            "date": "2020-09-17"
          }
        },
        "total": {
          "confirmed": 115478,
          "deceased": 1680,
          "other": 7,
          "recovered": 113515,
          "tested": 131281,
          "vaccinated1": 1531107,
          "vaccinated2": 848253
        }
      },
      "Davanagere": {
        "delta": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 16,
          "vaccinated2": 33
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 10,
          "deceased": 1,
          "recovered": 11,
          "vaccinated1": 7079,
          "vaccinated2": 28149
        },
        "meta": {
          "population": 1946905,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 50989,
          "deceased": 608,
          "recovered": 50359,
          "tested": 17483,
          "vaccinated1": 1016827,
          "vaccinated2": 495371
        }
      },
      "Dharwad": {
        "delta": {
          "deceased": 1,
          "recovered": 3,
          "vaccinated1": 459,
          "vaccinated2": 323
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 4,
          "deceased": 3,
          "recovered": 10,
          "vaccinated1": 24515,
          "vaccinated2": 35313
        },
        "meta": {
          "population": 1846993,
          "tested": {
            "date": "2020-10-13"
          }
        },
        "total": {
          "confirmed": 60970,
          "deceased": 1315,
          "other": 2,
          "recovered": 59639,
          "tested": 137696,
          "vaccinated1": 1212295,
          "vaccinated2": 561504
        }
      },
      "Gadag": {
        "delta": {
          "vaccinated1": 1176,
          "vaccinated2": 167
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 12373,
          "vaccinated2": 16257
        },
        "meta": {
          "population": 1065235,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 26066,
          "deceased": 319,
          "recovered": 25747,
          "tested": 8904,
          "vaccinated1": 691646,
          "vaccinated2": 328477
        }
      },
      "Hassan": {
        "delta": {
          "confirmed": 26,
          "recovered": 28,
          "vaccinated1": 37,
          "vaccinated2": 123
        },
        "delta21_14": {
          "confirmed": 144
        },
        "delta7": {
          "confirmed": 147,
          "deceased": 5,
          "recovered": 125,
          "vaccinated1": 5434,
          "vaccinated2": 26697
        },
        "meta": {
          "population": 1776221,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 111785,
          "deceased": 1256,
          "other": 2,
          "recovered": 110294,
          "tested": 10800,
          "vaccinated1": 1224599,
          "vaccinated2": 614828
        }
      },
      "Haveri": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 2,
          "vaccinated2": 7
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "deceased": 1,
          "recovered": 2,
          "vaccinated1": 8794,
          "vaccinated2": 36386
        },
        "meta": {
          "population": 1598506,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 21947,
          "deceased": 644,
          "recovered": 21301,
          "tested": 11714,
          "vaccinated1": 999178,
          "vaccinated2": 383705
        }
      },
      "Kalaburagi": {
        "delta": {
          "confirmed": 3,
          "vaccinated1": 1631,
          "vaccinated2": 1001
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 9,
          "recovered": 5,
          "vaccinated1": 35135,
          "vaccinated2": 44220
        },
        "meta": {
          "population": 2564892,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 61926,
          "deceased": 819,
          "recovered": 61087,
          "tested": 409596,
          "vaccinated1": 1323039,
          "vaccinated2": 641641
        }
      },
      "Kodagu": {
        "delta": {
          "confirmed": 11,
          "recovered": 7,
          "vaccinated1": 26,
          "vaccinated2": 202
        },
        "delta21_14": {
          "confirmed": 79
        },
        "delta7": {
          "confirmed": 112,
          "recovered": 67,
          "vaccinated1": 1558,
          "vaccinated2": 12680
        },
        "meta": {
          "population": 554762,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 37095,
          "deceased": 329,
          "other": 1,
          "recovered": 36616,
          "tested": 143982,
          "vaccinated1": 385482,
          "vaccinated2": 212033
        }
      },
      "Kolar": {
        "delta": {
          "confirmed": 2,
          "recovered": 5,
          "vaccinated1": 748,
          "vaccinated2": 1088
        },
        "delta21_14": {
          "confirmed": 38
        },
        "delta7": {
          "confirmed": 18,
          "deceased": 3,
          "recovered": 31,
          "vaccinated1": 13745,
          "vaccinated2": 34211
        },
        "meta": {
          "population": 1540231,
          "tested": {
            "date": "2020-10-14"
          }
        },
        "total": {
          "confirmed": 46916,
          "deceased": 638,
          "recovered": 46266,
          "tested": 91924,
          "vaccinated1": 991957,
          "vaccinated2": 625918
        }
      },
      "Koppal": {
        "delta": {
          "vaccinated1": 116,
          "vaccinated2": 321
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 5,
          "vaccinated1": 16045,
          "vaccinated2": 33794
        },
        "meta": {
          "population": 1391292,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 35198,
          "deceased": 521,
          "recovered": 34660,
          "tested": 8708,
          "vaccinated1": 814373,
          "vaccinated2": 411092
        }
      },
      "Mandya": {
        "delta": {
          "confirmed": 8,
          "recovered": 2,
          "vaccinated1": 8,
          "vaccinated2": 123
        },
        "delta21_14": {
          "confirmed": 59
        },
        "delta7": {
          "confirmed": 48,
          "recovered": 36,
          "vaccinated1": 5411,
          "vaccinated2": 28944
        },
        "meta": {
          "population": 1808680,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 73753,
          "deceased": 650,
          "recovered": 73029,
          "tested": 14874,
          "vaccinated1": 1189318,
          "vaccinated2": 659066
        }
      },
      "Mysuru": {
        "delta": {
          "confirmed": 33,
          "deceased": 2,
          "recovered": 34,
          "vaccinated1": 798,
          "vaccinated2": 1258
        },
        "delta21_14": {
          "confirmed": 252
        },
        "delta7": {
          "confirmed": 234,
          "deceased": 7,
          "recovered": 247,
          "vaccinated1": 46664,
          "vaccinated2": 111457
        },
        "meta": {
          "population": 2994744,
          "tested": {
            "date": "2020-08-31"
          }
        },
        "total": {
          "confirmed": 179167,
          "deceased": 2416,
          "recovered": 176447,
          "tested": 107338,
          "vaccinated1": 2141764,
          "vaccinated2": 1239770
        }
      },
      "Other State": {
        "total": {
          "confirmed": 36,
          "deceased": 3,
          "recovered": 33
        }
      },
      "Raichur": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 151,
          "vaccinated2": 433
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 4,
          "vaccinated1": 19900,
          "vaccinated2": 34897
        },
        "meta": {
          "population": 1924773,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 39973,
          "deceased": 331,
          "recovered": 39641,
          "tested": 21011,
          "vaccinated1": 1021603,
          "vaccinated2": 448501
        }
      },
      "Ramanagara": {
        "delta": {
          "vaccinated1": 11,
          "vaccinated2": 61
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 8,
          "deceased": 2,
          "recovered": 10,
          "vaccinated1": 6303,
          "vaccinated2": 28767
        },
        "meta": {
          "population": 1082739,
          "tested": {
            "date": "2020-11-25"
          }
        },
        "total": {
          "confirmed": 24204,
          "deceased": 320,
          "recovered": 23869,
          "tested": 103399,
          "vaccinated1": 754463,
          "vaccinated2": 469335
        }
      },
      "Shivamogga": {
        "delta": {
          "confirmed": 3,
          "vaccinated1": 417,
          "vaccinated2": 957
        },
        "delta21_14": {
          "confirmed": 38
        },
        "delta7": {
          "confirmed": 30,
          "recovered": 66,
          "vaccinated1": 23220,
          "vaccinated2": 47086
        },
        "meta": {
          "population": 1755512,
          "tested": {
            "date": "2020-08-21"
          }
        },
        "total": {
          "confirmed": 69444,
          "deceased": 1088,
          "recovered": 68239,
          "tested": 48760,
          "vaccinated1": 1162073,
          "vaccinated2": 535447
        }
      },
      "Tumakuru": {
        "delta": {
          "confirmed": 17,
          "recovered": 12,
          "vaccinated1": 1842,
          "vaccinated2": 3742
        },
        "delta21_14": {
          "confirmed": 103
        },
        "delta7": {
          "confirmed": 136,
          "deceased": 1,
          "recovered": 112,
          "vaccinated1": 31038,
          "vaccinated2": 66650
        },
        "meta": {
          "population": 2681449,
          "tested": {
            "date": "2020-09-24"
          }
        },
        "total": {
          "confirmed": 120836,
          "deceased": 1127,
          "recovered": 119420,
          "tested": 106564,
          "vaccinated1": 1672730,
          "vaccinated2": 881580
        }
      },
      "Udupi": {
        "delta": {
          "confirmed": 2,
          "recovered": 6,
          "vaccinated1": 16,
          "vaccinated2": 137
        },
        "delta21_14": {
          "confirmed": 91
        },
        "delta7": {
          "confirmed": 49,
          "recovered": 75,
          "vaccinated1": 2422,
          "vaccinated2": 27889
        },
        "meta": {
          "population": 1177908,
          "tested": {
            "date": "2020-09-13"
          }
        },
        "total": {
          "confirmed": 76718,
          "deceased": 489,
          "recovered": 76181,
          "tested": 86092,
          "vaccinated1": 919074,
          "vaccinated2": 529427
        }
      },
      "Uttara Kannada": {
        "delta": {
          "confirmed": 6,
          "recovered": 4,
          "vaccinated1": 11,
          "vaccinated2": 155
        },
        "delta21_14": {
          "confirmed": 65
        },
        "delta7": {
          "confirmed": 66,
          "recovered": 48,
          "vaccinated1": 3955,
          "vaccinated2": 32067
        },
        "meta": {
          "population": 1353299,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 56218,
          "deceased": 766,
          "recovered": 55339,
          "tested": 13833,
          "vaccinated1": 980496,
          "vaccinated2": 505589
        }
      },
      "Vijayapura": {
        "delta": {
          "vaccinated1": 340,
          "vaccinated2": 583
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 59571,
          "vaccinated2": 50033
        },
        "meta": {
          "population": 2175102,
          "tested": {
            "date": "2020-06-28"
          }
        },
        "total": {
          "confirmed": 36267,
          "deceased": 495,
          "recovered": 35764,
          "tested": 25108,
          "vaccinated1": 1535235,
          "vaccinated2": 634270
        }
      },
      "Yadgir": {
        "delta": {
          "vaccinated1": 108,
          "vaccinated2": 62
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 18060,
          "vaccinated2": 15460
        },
        "meta": {
          "population": 1172985,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 27545,
          "deceased": 207,
          "recovered": 27337,
          "tested": 221485,
          "vaccinated1": 708887,
          "vaccinated2": 348094
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 65798000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.co/pjWOnWUs3q?amp=1"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 2988333,
      "deceased": 38082,
      "other": 29,
      "recovered": 2941578,
      "tested": 50873103,
      "vaccinated1": 42497761,
      "vaccinated2": 22858384
    }
  },
  "KL": {
    "delta": {
      "confirmed": 7167,
      "deceased": 167,
      "recovered": 6439,
      "tested": 65158,
      "vaccinated1": 2010,
      "vaccinated2": 11914
    },
    "delta21_14": {
      "confirmed": 59521
    },
    "delta7": {
      "confirmed": 53326,
      "deceased": 3089,
      "recovered": 48406,
      "tested": 506604,
      "vaccinated1": 109805,
      "vaccinated2": 792534
    },
    "districts": {
      "Alappuzha": {
        "delta": {
          "confirmed": 270,
          "deceased": 1,
          "recovered": 455,
          "vaccinated1": 65,
          "vaccinated2": 502
        },
        "delta21_14": {
          "confirmed": 3016
        },
        "delta7": {
          "confirmed": 2035,
          "deceased": 228,
          "recovered": 2526,
          "vaccinated1": 5337,
          "vaccinated2": 51712
        },
        "meta": {
          "population": 2121943
        },
        "total": {
          "confirmed": 316160,
          "deceased": 1862,
          "other": 40,
          "recovered": 313515,
          "vaccinated1": 1518055,
          "vaccinated2": 855411
        }
      },
      "Ernakulam": {
        "delta": {
          "confirmed": 1046,
          "deceased": 11,
          "recovered": 918,
          "vaccinated1": 573,
          "vaccinated2": 1977
        },
        "delta21_14": {
          "confirmed": 8747
        },
        "delta7": {
          "confirmed": 7647,
          "deceased": 742,
          "recovered": 8539,
          "vaccinated1": 13018,
          "vaccinated2": 91762
        },
        "meta": {
          "population": 3279860
        },
        "total": {
          "confirmed": 602800,
          "deceased": 3555,
          "other": 70,
          "recovered": 583842,
          "vaccinated1": 2953482,
          "vaccinated2": 1759232
        }
      },
      "Idukki": {
        "delta": {
          "confirmed": 550,
          "deceased": 1,
          "recovered": 195,
          "vaccinated1": 26,
          "vaccinated2": 208
        },
        "delta21_14": {
          "confirmed": 3256
        },
        "delta7": {
          "confirmed": 2876,
          "deceased": 71,
          "recovered": 1866,
          "vaccinated1": 2211,
          "vaccinated2": 27218
        },
        "meta": {
          "population": 1107453,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 147118,
          "deceased": 519,
          "other": 9,
          "recovered": 140292,
          "tested": 237691,
          "vaccinated1": 859116,
          "vaccinated2": 481911
        }
      },
      "Kannur": {
        "delta": {
          "confirmed": 304,
          "recovered": 451,
          "vaccinated1": 38,
          "vaccinated2": 325
        },
        "delta21_14": {
          "confirmed": 3456
        },
        "delta7": {
          "confirmed": 2611,
          "deceased": 301,
          "recovered": 3143,
          "vaccinated1": 7636,
          "vaccinated2": 71089
        },
        "meta": {
          "population": 2525637,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 275264,
          "deceased": 2325,
          "other": 53,
          "recovered": 269475,
          "tested": 392136,
          "vaccinated1": 1891004,
          "vaccinated2": 959656
        }
      },
      "Kasaragod": {
        "delta": {
          "confirmed": 137,
          "recovered": 147,
          "vaccinated1": 389,
          "vaccinated2": 1861
        },
        "delta21_14": {
          "confirmed": 1156
        },
        "delta7": {
          "confirmed": 1054,
          "deceased": 31,
          "recovered": 1082,
          "vaccinated1": 4942,
          "vaccinated2": 24290
        },
        "meta": {
          "population": 1302600
        },
        "total": {
          "confirmed": 138815,
          "deceased": 617,
          "other": 17,
          "recovered": 134824,
          "vaccinated1": 910194,
          "vaccinated2": 521754
        }
      },
      "Kollam": {
        "delta": {
          "confirmed": 592,
          "recovered": 848,
          "vaccinated1": 13,
          "vaccinated2": 215
        },
        "delta21_14": {
          "confirmed": 3991
        },
        "delta7": {
          "confirmed": 4753,
          "deceased": 161,
          "recovered": 6283,
          "vaccinated1": 7368,
          "vaccinated2": 62100
        },
        "meta": {
          "population": 2629703
        },
        "total": {
          "confirmed": 390872,
          "deceased": 2451,
          "other": 57,
          "recovered": 383923,
          "vaccinated1": 1951077,
          "vaccinated2": 1047951
        }
      },
      "Kottayam": {
        "delta": {
          "confirmed": 506,
          "deceased": 5,
          "recovered": 155,
          "vaccinated1": 11,
          "vaccinated2": 125
        },
        "delta21_14": {
          "confirmed": 4644
        },
        "delta7": {
          "confirmed": 4187,
          "deceased": 101,
          "recovered": 1611,
          "vaccinated1": 5298,
          "vaccinated2": 58083
        },
        "meta": {
          "population": 1979384
        },
        "total": {
          "confirmed": 322484,
          "deceased": 1356,
          "other": 18,
          "recovered": 315759,
          "vaccinated1": 1477425,
          "vaccinated2": 841596
        }
      },
      "Kozhikode": {
        "delta": {
          "confirmed": 742,
          "deceased": 23,
          "recovered": 760,
          "vaccinated1": 55,
          "vaccinated2": 449
        },
        "delta21_14": {
          "confirmed": 5631
        },
        "delta7": {
          "confirmed": 5386,
          "deceased": 513,
          "recovered": 5059,
          "vaccinated1": 11449,
          "vaccinated2": 57479
        },
        "meta": {
          "population": 3089543,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 527346,
          "deceased": 3374,
          "other": 44,
          "recovered": 519030,
          "tested": 955060,
          "vaccinated1": 2341296,
          "vaccinated2": 1154561
        }
      },
      "Malappuram": {
        "delta": {
          "confirmed": 334,
          "deceased": 48,
          "recovered": 560,
          "vaccinated1": 152,
          "vaccinated2": 523
        },
        "delta21_14": {
          "confirmed": 3497
        },
        "delta7": {
          "confirmed": 2634,
          "deceased": 108,
          "recovered": 2929,
          "vaccinated1": 20840,
          "vaccinated2": 52896
        },
        "meta": {
          "population": 4110956,
          "tested": {
            "date": "2020-12-30"
          }
        },
        "total": {
          "confirmed": 567584,
          "deceased": 2576,
          "other": 32,
          "recovered": 562111,
          "tested": 469850,
          "vaccinated1": 2833303,
          "vaccinated2": 1103557
        }
      },
      "Palakkad": {
        "delta": {
          "confirmed": 339,
          "deceased": 16,
          "recovered": 423,
          "vaccinated1": 37,
          "vaccinated2": 397
        },
        "delta21_14": {
          "confirmed": 3177
        },
        "delta7": {
          "confirmed": 2560,
          "deceased": 175,
          "recovered": 2544,
          "vaccinated1": 8712,
          "vaccinated2": 57261
        },
        "meta": {
          "population": 2810892,
          "tested": {
            "date": "2020-10-19"
          }
        },
        "total": {
          "confirmed": 373839,
          "deceased": 2881,
          "other": 24,
          "recovered": 364351,
          "tested": 226562,
          "vaccinated1": 1989222,
          "vaccinated2": 950909
        }
      },
      "Pathanamthitta": {
        "delta": {
          "confirmed": 447,
          "deceased": 2,
          "recovered": 406,
          "vaccinated1": 149,
          "vaccinated2": 1275
        },
        "delta21_14": {
          "confirmed": 2683
        },
        "delta7": {
          "confirmed": 2953,
          "deceased": 122,
          "recovered": 2635,
          "vaccinated1": 2637,
          "vaccinated2": 29343
        },
        "meta": {
          "population": 1195537,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 193406,
          "deceased": 1076,
          "other": 11,
          "recovered": 184979,
          "tested": 306034,
          "vaccinated1": 1048352,
          "vaccinated2": 677224
        }
      },
      "Thiruvananthapuram": {
        "delta": {
          "confirmed": 878,
          "deceased": 1,
          "recovered": 754,
          "vaccinated1": 418,
          "vaccinated2": 2986
        },
        "delta21_14": {
          "confirmed": 7626
        },
        "delta7": {
          "confirmed": 7056,
          "deceased": 118,
          "recovered": 4851,
          "vaccinated1": 9284,
          "vaccinated2": 89297
        },
        "meta": {
          "population": 3307284,
          "tested": {
            "date": "2020-10-23"
          }
        },
        "total": {
          "confirmed": 463977,
          "deceased": 4996,
          "other": 114,
          "recovered": 448304,
          "tested": 436661,
          "vaccinated1": 2578575,
          "vaccinated2": 1562343
        }
      },
      "Thrissur": {
        "delta": {
          "confirmed": 753,
          "deceased": 59,
          "recovered": 38,
          "vaccinated1": 107,
          "vaccinated2": 977
        },
        "delta21_14": {
          "confirmed": 6874
        },
        "delta7": {
          "confirmed": 5751,
          "deceased": 388,
          "recovered": 3647,
          "vaccinated1": 8853,
          "vaccinated2": 87643
        },
        "meta": {
          "population": 3110327,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 523260,
          "deceased": 3575,
          "other": 26,
          "recovered": 515481,
          "tested": 639055,
          "vaccinated1": 2295947,
          "vaccinated2": 1305873
        }
      },
      "Wayanad": {
        "delta": {
          "confirmed": 269,
          "recovered": 329,
          "vaccinated1": 12,
          "vaccinated2": 243
        },
        "delta21_14": {
          "confirmed": 1767
        },
        "delta7": {
          "confirmed": 1823,
          "deceased": 30,
          "recovered": 1691,
          "vaccinated1": 2223,
          "vaccinated2": 32359
        },
        "meta": {
          "population": 816558,
          "tested": {
            "date": "2021-01-01"
          }
        },
        "total": {
          "confirmed": 125732,
          "deceased": 518,
          "other": 14,
          "recovered": 121295,
          "tested": 211953,
          "vaccinated1": 659451,
          "vaccinated2": 436359
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 35125000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://dhs.kerala.gov.in/wp-content/uploads/2021/10/Bulletin-HFWD-English-October-31.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 4968657,
      "deceased": 31681,
      "other": 529,
      "recovered": 4857181,
      "tested": 37886378,
      "vaccinated1": 25306499,
      "vaccinated2": 13658343
    }
  },
  "LA": {
    "delta": {
      "confirmed": 11,
      "recovered": 9,
      "tested": 388,
      "vaccinated2": 2
    },
    "delta21_14": {
      "confirmed": 26
    },
    "delta7": {
      "confirmed": 58,
      "recovered": 28,
      "tested": 2475,
      "vaccinated1": 525,
      "vaccinated2": 1532
    },
    "districts": {
      "Kargil": {
        "delta": {
          "vaccinated2": 3
        },
        "delta7": {
          "confirmed": 4,
          "vaccinated1": 205,
          "vaccinated2": 748
        },
        "meta": {
          "population": 143000,
          "tested": {
            "date": "2021-01-14"
          }
        },
        "total": {
          "confirmed": 3619,
          "deceased": 58,
          "recovered": 3556,
          "tested": 37471,
          "vaccinated1": 87221,
          "vaccinated2": 64300
        }
      },
      "Leh": {
        "delta": {
          "confirmed": 11,
          "recovered": 9
        },
        "delta21_14": {
          "confirmed": 26
        },
        "delta7": {
          "confirmed": 54,
          "recovered": 28,
          "vaccinated1": 320,
          "vaccinated2": 785
        },
        "meta": {
          "population": 147000,
          "tested": {
            "date": "2021-01-14"
          }
        },
        "total": {
          "confirmed": 17343,
          "deceased": 150,
          "recovered": 17131,
          "tested": 72597,
          "vaccinated1": 121577,
          "vaccinated2": 87980
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 293000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/prasarbharti/status/1454872140436541444"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 20962,
      "deceased": 208,
      "recovered": 20687,
      "tested": 555568,
      "vaccinated1": 208798,
      "vaccinated2": 152280
    }
  },
  "LD": {
    "delta": {
      "tested": 31,
      "vaccinated2": 4
    },
    "delta7": {
      "tested": 1625,
      "vaccinated1": 69,
      "vaccinated2": 796
    },
    "districts": {
      "Lakshadweep": {
        "delta": {
          "tested": 31,
          "vaccinated2": 4
        },
        "delta7": {
          "tested": 1625,
          "vaccinated1": 69,
          "vaccinated2": 796
        },
        "meta": {
          "population": 64473,
          "tested": {
            "date": "2021-10-31",
            "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11888"
          },
          "vaccinated": {
            "date": "2021-10-31"
          }
        },
        "total": {
          "confirmed": 10365,
          "deceased": 51,
          "other": 44,
          "recovered": 10270,
          "tested": 263541,
          "vaccinated1": 55129,
          "vaccinated2": 45951
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T11:03:10+05:30",
      "population": 68000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11888"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 10365,
      "deceased": 51,
      "other": 44,
      "recovered": 10270,
      "tested": 263541,
      "vaccinated1": 55129,
      "vaccinated2": 45951
    }
  },
  "MH": {
    "delta": {
      "confirmed": 1172,
      "deceased": 20,
      "recovered": 1399,
      "tested": 108040,
      "vaccinated1": 53161,
      "vaccinated2": 31988
    },
    "delta21_14": {
      "confirmed": 13825
    },
    "delta7": {
      "confirmed": 8117,
      "deceased": 200,
      "other": 7,
      "recovered": 15146,
      "tested": 773516,
      "vaccinated1": 1611778,
      "vaccinated2": 1282938
    },
    "districts": {
      "Ahmednagar": {
        "delta": {
          "confirmed": 138,
          "deceased": 2,
          "recovered": 11,
          "vaccinated1": 535,
          "vaccinated2": 661
        },
        "delta21_14": {
          "confirmed": 2120
        },
        "delta7": {
          "confirmed": 866,
          "deceased": 26,
          "recovered": 728,
          "vaccinated1": 44180,
          "vaccinated2": 28319
        },
        "meta": {
          "population": 4543083,
          "tested": {
            "date": "2020-07-19"
          }
        },
        "total": {
          "confirmed": 339457,
          "deceased": 7043,
          "other": 1,
          "recovered": 330122,
          "tested": 11077,
          "vaccinated1": 2468837,
          "vaccinated2": 881402
        }
      },
      "Akola": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 576,
          "vaccinated2": 200
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 7,
          "vaccinated1": 26579,
          "vaccinated2": 10081
        },
        "meta": {
          "population": 1818617
        },
        "total": {
          "confirmed": 58764,
          "deceased": 1425,
          "other": 4,
          "recovered": 57318,
          "vaccinated1": 760099,
          "vaccinated2": 357931
        }
      },
      "Amravati": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 112,
          "vaccinated2": 66
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 29961,
          "vaccinated2": 21747
        },
        "meta": {
          "population": 2887826
        },
        "total": {
          "confirmed": 96231,
          "deceased": 1594,
          "other": 2,
          "recovered": 94618,
          "vaccinated1": 1241168,
          "vaccinated2": 548807
        }
      },
      "Aurangabad": {
        "delta": {
          "confirmed": 27,
          "vaccinated1": 759,
          "vaccinated2": 246
        },
        "delta21_14": {
          "confirmed": 140
        },
        "delta7": {
          "confirmed": 156,
          "deceased": 1,
          "recovered": 157,
          "vaccinated1": 46323,
          "vaccinated2": 34109
        },
        "meta": {
          "population": 3695928,
          "tested": {
            "date": "2020-05-30"
          }
        },
        "total": {
          "confirmed": 155331,
          "deceased": 4251,
          "other": 14,
          "recovered": 150615,
          "tested": 11800,
          "vaccinated1": 1772420,
          "vaccinated2": 723304
        }
      },
      "Beed": {
        "delta": {
          "confirmed": 12,
          "recovered": 7,
          "vaccinated1": 411,
          "vaccinated2": 473
        },
        "delta21_14": {
          "confirmed": 123
        },
        "delta7": {
          "confirmed": 69,
          "deceased": 5,
          "recovered": 35,
          "vaccinated1": 34333,
          "vaccinated2": 24584
        },
        "meta": {
          "population": 2585962,
          "tested": {
            "date": "2020-10-11"
          }
        },
        "total": {
          "confirmed": 103749,
          "deceased": 2806,
          "other": 7,
          "recovered": 100803,
          "tested": 111488,
          "vaccinated1": 1145382,
          "vaccinated2": 485615
        }
      },
      "Bhandara": {
        "delta": {
          "vaccinated1": 7,
          "vaccinated2": 13
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 5080,
          "vaccinated2": 16415
        },
        "meta": {
          "population": 1198810,
          "tested": {
            "date": "2020-10-11"
          }
        },
        "total": {
          "confirmed": 60080,
          "deceased": 1123,
          "other": 10,
          "recovered": 58945,
          "tested": 54195,
          "vaccinated1": 825867,
          "vaccinated2": 421585
        }
      },
      "Buldhana": {
        "delta": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 402,
          "vaccinated2": 153
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 16,
          "deceased": 1,
          "recovered": 16,
          "vaccinated1": 34272,
          "vaccinated2": 24089
        },
        "meta": {
          "population": 2588039,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 85520,
          "deceased": 797,
          "other": 6,
          "recovered": 84710,
          "tested": 115874,
          "vaccinated1": 1136679,
          "vaccinated2": 512944
        }
      },
      "Chandrapur": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 54,
          "vaccinated2": 24
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 7,
          "vaccinated1": 22248,
          "vaccinated2": 18994
        },
        "meta": {
          "population": 2194262,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 88968,
          "deceased": 1560,
          "other": 4,
          "recovered": 87387,
          "tested": 199809,
          "vaccinated1": 1335017,
          "vaccinated2": 458690
        }
      },
      "Dhule": {
        "delta": {
          "vaccinated1": 121,
          "vaccinated2": 230
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 4,
          "vaccinated1": 23261,
          "vaccinated2": 19364
        },
        "meta": {
          "population": 2048781,
          "tested": {
            "date": "2020-10-11"
          }
        },
        "total": {
          "confirmed": 46172,
          "deceased": 654,
          "other": 11,
          "recovered": 45501,
          "tested": 90092,
          "vaccinated1": 1007007,
          "vaccinated2": 476051
        }
      },
      "Gadchiroli": {
        "delta": {
          "vaccinated1": 424,
          "vaccinated2": 255
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 5,
          "vaccinated1": 14790,
          "vaccinated2": 10994
        },
        "meta": {
          "population": 1071795,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 30440,
          "deceased": 669,
          "other": 33,
          "recovered": 29735,
          "tested": 11993,
          "vaccinated1": 540319,
          "vaccinated2": 231208
        }
      },
      "Gondia": {
        "delta": {
          "vaccinated1": 32,
          "vaccinated2": 45
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 8593,
          "vaccinated2": 23092
        },
        "meta": {
          "population": 1322331,
          "tested": {
            "date": "2021-01-29"
          }
        },
        "total": {
          "confirmed": 40519,
          "deceased": 569,
          "other": 7,
          "recovered": 39941,
          "tested": 130146,
          "vaccinated1": 888961,
          "vaccinated2": 469980
        }
      },
      "Hingoli": {
        "delta": {
          "vaccinated1": 459,
          "vaccinated2": 166
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 42054,
          "vaccinated2": 16145
        },
        "meta": {
          "population": 1178973,
          "tested": {
            "date": "2020-08-03"
          }
        },
        "total": {
          "confirmed": 18475,
          "deceased": 506,
          "other": 1,
          "recovered": 17949,
          "tested": 6797,
          "vaccinated1": 537442,
          "vaccinated2": 201000
        }
      },
      "Jalgaon": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 6,
          "vaccinated2": 19
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 11,
          "vaccinated1": 37870,
          "vaccinated2": 21599
        },
        "meta": {
          "population": 4224442,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 139934,
          "deceased": 2714,
          "other": 32,
          "recovered": 137178,
          "tested": 429198,
          "vaccinated1": 2085101,
          "vaccinated2": 699544
        }
      },
      "Jalna": {
        "delta": {
          "vaccinated1": 121,
          "vaccinated2": 16
        },
        "delta21_14": {
          "confirmed": 44
        },
        "delta7": {
          "confirmed": 15,
          "recovered": 47,
          "vaccinated1": 112537,
          "vaccinated2": 35713
        },
        "meta": {
          "population": 1958483,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 60615,
          "deceased": 1209,
          "other": 1,
          "recovered": 59382,
          "tested": 117047,
          "vaccinated1": 1081253,
          "vaccinated2": 413822
        }
      },
      "Kolhapur": {
        "delta": {
          "confirmed": 12,
          "recovered": 5,
          "vaccinated1": 152,
          "vaccinated2": 337
        },
        "delta21_14": {
          "confirmed": 74
        },
        "delta7": {
          "confirmed": 55,
          "deceased": 2,
          "recovered": 115,
          "vaccinated1": 19104,
          "vaccinated2": 23088
        },
        "meta": {
          "population": 3874015
        },
        "total": {
          "confirmed": 206671,
          "deceased": 5847,
          "other": 5,
          "recovered": 200699,
          "vaccinated1": 2536731,
          "vaccinated2": 1043329
        }
      },
      "Latur": {
        "delta": {
          "confirmed": 5,
          "deceased": 1,
          "vaccinated1": 4676,
          "vaccinated2": 1424
        },
        "delta21_14": {
          "confirmed": 47
        },
        "delta7": {
          "confirmed": 39,
          "deceased": 3,
          "vaccinated1": 82644,
          "vaccinated2": 33519
        },
        "meta": {
          "population": 2455543
        },
        "total": {
          "confirmed": 92133,
          "deceased": 2437,
          "other": 6,
          "recovered": 89608,
          "vaccinated1": 1182476,
          "vaccinated2": 507616
        }
      },
      "Mumbai": {
        "delta": {
          "confirmed": 308,
          "deceased": 3,
          "recovered": 429,
          "vaccinated1": 2725,
          "vaccinated2": 2540
        },
        "delta21_14": {
          "confirmed": 3019
        },
        "delta7": {
          "confirmed": 2242,
          "deceased": 34,
          "other": 7,
          "recovered": 2604,
          "vaccinated1": 98915,
          "vaccinated2": 219736
        },
        "meta": {
          "notes": "[Sep 9]After reconciling COVID-19 cases in Mumbai, owing to the removal of duplicates and change of addresses as per the original residence, 239 cases have been removed from the progressive figures.",
          "population": 12442373,
          "tested": {
            "date": "2021-01-29"
          }
        },
        "total": {
          "confirmed": 756749,
          "deceased": 16247,
          "other": 2512,
          "recovered": 733318,
          "tested": 2789713,
          "vaccinated1": 9115615,
          "vaccinated2": 5564204
        }
      },
      "Nagpur": {
        "delta": {
          "confirmed": 4,
          "recovered": 5,
          "vaccinated1": 3039,
          "vaccinated2": 3360
        },
        "delta21_14": {
          "confirmed": 20
        },
        "delta7": {
          "confirmed": 35,
          "recovered": 43,
          "vaccinated1": 58567,
          "vaccinated2": 71818
        },
        "meta": {
          "notes": "District administration provides number of persons tested instead of the number of samples tested.",
          "population": 4653171,
          "tested": {
            "date": "2020-10-18"
          }
        },
        "total": {
          "confirmed": 493607,
          "deceased": 9128,
          "other": 71,
          "recovered": 484334,
          "tested": 382083,
          "vaccinated1": 3006439,
          "vaccinated2": 1460890
        }
      },
      "Nanded": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 8820,
          "vaccinated2": 2618
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 28,
          "recovered": 22,
          "vaccinated1": 144423,
          "vaccinated2": 41697
        },
        "meta": {
          "notes": "Number of active cases differs in the state bulletin and district bulletin. We follow the state bulletin.",
          "population": 3356566,
          "tested": {
            "date": "2020-11-03"
          }
        },
        "total": {
          "confirmed": 90409,
          "deceased": 2658,
          "other": 6,
          "recovered": 87721,
          "tested": 117319,
          "vaccinated1": 1560558,
          "vaccinated2": 560812
        }
      },
      "Nandurbar": {
        "delta": {
          "vaccinated1": 738,
          "vaccinated2": 178
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 19572,
          "vaccinated2": 12517
        },
        "meta": {
          "population": 1646177,
          "tested": {
            "date": "2020-12-12"
          }
        },
        "total": {
          "confirmed": 40006,
          "deceased": 948,
          "other": 3,
          "recovered": 39054,
          "tested": 37740,
          "vaccinated1": 723850,
          "vaccinated2": 342054
        }
      },
      "Nashik": {
        "delta": {
          "confirmed": 60,
          "deceased": 3,
          "recovered": 32,
          "vaccinated1": 2116,
          "vaccinated2": 473
        },
        "delta21_14": {
          "confirmed": 585
        },
        "delta7": {
          "confirmed": 456,
          "deceased": 12,
          "recovered": 519,
          "vaccinated1": 143768,
          "vaccinated2": 58112
        },
        "meta": {
          "notes": "Number of active cases differs in the state bulletin and district bulletin. We follow the state bulletin.",
          "population": 6109052,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 410681,
          "deceased": 8679,
          "other": 1,
          "recovered": 401418,
          "tested": 498397,
          "vaccinated1": 3471046,
          "vaccinated2": 1299122
        }
      },
      "Osmanabad": {
        "delta": {
          "confirmed": 16,
          "recovered": 3,
          "vaccinated1": 5549,
          "vaccinated2": 1039
        },
        "delta21_14": {
          "confirmed": 197
        },
        "delta7": {
          "confirmed": 89,
          "deceased": 1,
          "recovered": 154,
          "vaccinated1": 44954,
          "vaccinated2": 11658
        },
        "meta": {
          "population": 1660311,
          "tested": {
            "date": "2021-01-07"
          }
        },
        "total": {
          "confirmed": 67828,
          "deceased": 1963,
          "other": 114,
          "recovered": 65577,
          "tested": 109450,
          "vaccinated1": 803192,
          "vaccinated2": 308210
        }
      },
      "Other State": {
        "total": {
          "confirmed": 144,
          "deceased": 111,
          "other": 2,
          "recovered": 31
        }
      },
      "Palghar": {
        "delta": {
          "confirmed": 28,
          "recovered": 6,
          "vaccinated1": 863,
          "vaccinated2": 1749
        },
        "delta21_14": {
          "confirmed": 310
        },
        "delta7": {
          "confirmed": 204,
          "recovered": 326,
          "vaccinated1": 32112,
          "vaccinated2": 39231
        },
        "meta": {
          "population": 2990116,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 138013,
          "deceased": 3282,
          "other": 14,
          "recovered": 134309,
          "tested": 319724,
          "vaccinated1": 1869199,
          "vaccinated2": 678741
        }
      },
      "Parbhani": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 4016,
          "vaccinated2": 1361
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 13,
          "deceased": 1,
          "recovered": 9,
          "vaccinated1": 44477,
          "vaccinated2": 20480
        },
        "meta": {
          "population": 1835982,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 52362,
          "deceased": 1233,
          "other": 19,
          "recovered": 51078,
          "tested": 110937,
          "vaccinated1": 905874,
          "vaccinated2": 378183
        }
      },
      "Pune": {
        "delta": {
          "confirmed": 245,
          "recovered": 300,
          "vaccinated1": 2900,
          "vaccinated2": 4885
        },
        "delta21_14": {
          "confirmed": 2964
        },
        "delta7": {
          "confirmed": 1536,
          "deceased": 20,
          "recovered": 5294,
          "vaccinated1": 85256,
          "vaccinated2": 136336
        },
        "meta": {
          "notes": "Number of active cases differs in the state bulletin and district bulletin. We follow the state bulletin.",
          "population": 9426959,
          "tested": {
            "date": "2021-01-12"
          }
        },
        "total": {
          "confirmed": 1154776,
          "deceased": 19594,
          "other": 349,
          "recovered": 1131401,
          "tested": 97127,
          "vaccinated1": 7843130,
          "vaccinated2": 4264808
        }
      },
      "Raigad": {
        "delta": {
          "confirmed": 26,
          "recovered": 34,
          "vaccinated1": 326,
          "vaccinated2": 1214
        },
        "delta21_14": {
          "confirmed": 594
        },
        "delta7": {
          "confirmed": 267,
          "deceased": 10,
          "recovered": 359,
          "vaccinated1": 21737,
          "vaccinated2": 31684
        },
        "meta": {
          "notes": "Number of active cases differs in the state bulletin and district bulletin. We follow the state bulletin.",
          "population": 2635394,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 195958,
          "deceased": 4551,
          "other": 7,
          "recovered": 190759,
          "tested": 304088,
          "vaccinated1": 1859507,
          "vaccinated2": 774913
        }
      },
      "Ratnagiri": {
        "delta": {
          "confirmed": 8,
          "recovered": 14,
          "vaccinated1": 83,
          "vaccinated2": 224
        },
        "delta21_14": {
          "confirmed": 192
        },
        "delta7": {
          "confirmed": 91,
          "deceased": 4,
          "recovered": 160,
          "vaccinated1": 10880,
          "vaccinated2": 7924
        },
        "meta": {
          "population": 1612672
        },
        "total": {
          "confirmed": 78950,
          "deceased": 2478,
          "other": 5,
          "recovered": 76292,
          "vaccinated1": 920151,
          "vaccinated2": 388703
        }
      },
      "Sangli": {
        "delta": {
          "confirmed": 19,
          "vaccinated1": 128,
          "vaccinated2": 120
        },
        "delta21_14": {
          "confirmed": 380
        },
        "delta7": {
          "confirmed": 155,
          "deceased": 4,
          "recovered": 375,
          "vaccinated1": 11974,
          "vaccinated2": 19041
        },
        "meta": {
          "population": 2820575
        },
        "total": {
          "confirmed": 209771,
          "deceased": 5613,
          "other": 9,
          "recovered": 203673,
          "vaccinated1": 1810980,
          "vaccinated2": 802877
        }
      },
      "Satara": {
        "delta": {
          "confirmed": 35,
          "deceased": 1,
          "recovered": 4,
          "vaccinated1": 225,
          "vaccinated2": 298
        },
        "delta21_14": {
          "confirmed": 508
        },
        "delta7": {
          "confirmed": 157,
          "deceased": 17,
          "recovered": 501,
          "vaccinated1": 16690,
          "vaccinated2": 30950
        },
        "meta": {
          "population": 3003922,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 250414,
          "deceased": 6428,
          "other": 31,
          "recovered": 243482,
          "tested": 312742,
          "vaccinated1": 1963730,
          "vaccinated2": 865197
        }
      },
      "Sindhudurg": {
        "delta": {
          "confirmed": 12,
          "recovered": 6,
          "vaccinated1": -1,
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": 258
        },
        "delta7": {
          "confirmed": 91,
          "deceased": 4,
          "recovered": 259,
          "vaccinated1": 3915,
          "vaccinated2": 5195
        },
        "meta": {
          "population": 848868
        },
        "total": {
          "confirmed": 52783,
          "deceased": 1434,
          "other": 15,
          "recovered": 50987,
          "vaccinated1": 524896,
          "vaccinated2": 279051
        }
      },
      "Solapur": {
        "delta": {
          "confirmed": 51,
          "deceased": 4,
          "recovered": 7,
          "vaccinated1": 5956,
          "vaccinated2": 1381
        },
        "delta21_14": {
          "confirmed": 519
        },
        "delta7": {
          "confirmed": 253,
          "deceased": 11,
          "recovered": 370,
          "vaccinated1": 77398,
          "vaccinated2": 34204
        },
        "meta": {
          "population": 4315527,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 210466,
          "deceased": 5551,
          "other": 110,
          "recovered": 204364,
          "tested": 629266,
          "vaccinated1": 2242339,
          "vaccinated2": 690069
        }
      },
      "Thane": {
        "delta": {
          "confirmed": 153,
          "deceased": 6,
          "recovered": 525,
          "vaccinated1": 3664,
          "vaccinated2": 5578
        },
        "delta21_14": {
          "confirmed": 1629
        },
        "delta7": {
          "confirmed": 1241,
          "deceased": 44,
          "recovered": 3002,
          "vaccinated1": 108643,
          "vaccinated2": 120708
        },
        "meta": {
          "population": 11060148,
          "tested": {
            "date": "2020-11-04"
          }
        },
        "total": {
          "confirmed": 610128,
          "deceased": 11462,
          "other": 35,
          "recovered": 597141,
          "tested": 1229625,
          "vaccinated1": 5484839,
          "vaccinated2": 2751182
        }
      },
      "Wardha": {
        "delta": {
          "confirmed": 2,
          "recovered": 2,
          "vaccinated1": 18,
          "vaccinated2": 65
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 4,
          "vaccinated1": 16481,
          "vaccinated2": 14040
        },
        "meta": {
          "population": 1296157,
          "tested": {
            "date": "2020-10-31"
          }
        },
        "total": {
          "confirmed": 57344,
          "deceased": 1217,
          "other": 165,
          "recovered": 55956,
          "tested": 52365,
          "vaccinated1": 755863,
          "vaccinated2": 314899
        }
      },
      "Washim": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 1016,
          "vaccinated2": 516
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 5,
          "vaccinated1": 30932,
          "vaccinated2": 19238
        },
        "meta": {
          "population": 1196714
        },
        "total": {
          "confirmed": 41663,
          "deceased": 637,
          "other": 3,
          "recovered": 41020,
          "vaccinated1": 579042,
          "vaccinated2": 321710
        }
      },
      "Yavatmal": {
        "delta": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 2588,
          "vaccinated2": 697
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 7,
          "vaccinated1": 56233,
          "vaccinated2": 26091
        },
        "meta": {
          "population": 2775457,
          "tested": {
            "date": "2021-01-29"
          }
        },
        "total": {
          "confirmed": 75967,
          "deceased": 1798,
          "other": 4,
          "recovered": 74159,
          "tested": 141551,
          "vaccinated1": 1211321,
          "vaccinated2": 496306
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Dec 16]:10,218 duplicate cases & other state cases removed from total cases.791 recovered cases also removed from total recovered cases while reconciling \n[Sep 9] :239 cases have been removed from the hospitalized figures owing to the removal of duplicates and change of addresses as per the original residence\n[Aug 15] : MH bulletin has reduced 819 confirmed cases in Mumbai and 72 confirmed cases from 'Other States' from the tally\n[Jun 16] : 1328 deceased cases have been retroactively added to MH bulletin.\n[Jun 20] : 69 deceased cases have been reduced based on state bulletin.\n[Sep 9 2021]: 15066 positive cases and 15793 discharged cases have been reduced from state total based on reconciliation (as mentioned in the bulletin)",
      "population": 122153000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/PIBMumbai/status/1454819081123598345"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 6611078,
      "deceased": 140216,
      "other": 3619,
      "recovered": 6450585,
      "tested": 62667211,
      "vaccinated1": 67198794,
      "vaccinated2": 30975692
    }
  },
  "ML": {
    "delta": {
      "confirmed": 22,
      "deceased": 1,
      "recovered": 51,
      "tested": 1559,
      "vaccinated1": 38,
      "vaccinated2": 203
    },
    "delta21_14": {
      "confirmed": 530
    },
    "delta7": {
      "confirmed": 256,
      "deceased": 4,
      "recovered": 460,
      "tested": 13944,
      "vaccinated1": 7871,
      "vaccinated2": 41927
    },
    "districts": {
      "East Garo Hills": {
        "delta": {
          "recovered": 1
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 2,
          "vaccinated1": 482,
          "vaccinated2": 1424
        },
        "meta": {
          "population": 317618
        },
        "total": {
          "confirmed": 1867,
          "deceased": 13,
          "recovered": 1844,
          "vaccinated1": 47655,
          "vaccinated2": 20648
        }
      },
      "East Jaintia Hills": {
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 483,
          "vaccinated2": 2964
        },
        "meta": {
          "population": 122436
        },
        "total": {
          "confirmed": 2430,
          "deceased": 31,
          "recovered": 2395,
          "vaccinated1": 64432,
          "vaccinated2": 33259
        }
      },
      "East Khasi Hills": {
        "delta": {
          "confirmed": 14,
          "deceased": 1,
          "recovered": 18,
          "vaccinated2": 17
        },
        "delta21_14": {
          "confirmed": 348
        },
        "delta7": {
          "confirmed": 171,
          "deceased": 2,
          "recovered": 286,
          "vaccinated1": 1847,
          "vaccinated2": 10698
        },
        "meta": {
          "population": 824059
        },
        "total": {
          "confirmed": 41025,
          "deceased": 987,
          "recovered": 39754,
          "vaccinated1": 318381,
          "vaccinated2": 225526
        }
      },
      "North Garo Hills": {
        "delta": {
          "confirmed": 1
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 2,
          "vaccinated1": 596,
          "vaccinated2": 3614
        },
        "meta": {
          "population": 118325
        },
        "total": {
          "confirmed": 1685,
          "deceased": 8,
          "recovered": 1674,
          "vaccinated1": 62675,
          "vaccinated2": 28288
        }
      },
      "Ribhoi": {
        "delta": {
          "confirmed": 1,
          "recovered": 3,
          "vaccinated1": 15,
          "vaccinated2": 65
        },
        "delta21_14": {
          "confirmed": 20
        },
        "delta7": {
          "confirmed": 14,
          "recovered": 23,
          "vaccinated1": 884,
          "vaccinated2": 3492
        },
        "meta": {
          "population": 258380
        },
        "total": {
          "confirmed": 9697,
          "deceased": 89,
          "recovered": 9584,
          "vaccinated1": 92049,
          "vaccinated2": 48460
        }
      },
      "South Garo Hills": {
        "delta": {
          "vaccinated1": 13,
          "vaccinated2": 67
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 329,
          "vaccinated2": 1346
        },
        "meta": {
          "population": 142574
        },
        "total": {
          "confirmed": 1216,
          "deceased": 12,
          "recovered": 1203,
          "vaccinated1": 40103,
          "vaccinated2": 18937
        }
      },
      "South West Garo Hills": {
        "delta": {
          "recovered": 1
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 924,
          "vaccinated2": 4509
        },
        "meta": {
          "population": 172495
        },
        "total": {
          "confirmed": 1872,
          "deceased": 17,
          "recovered": 1852,
          "vaccinated1": 73397,
          "vaccinated2": 39210
        }
      },
      "South West Khasi Hills": {
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 1,
          "vaccinated1": 61,
          "vaccinated2": 552
        },
        "meta": {
          "population": 110152
        },
        "total": {
          "confirmed": 2548,
          "deceased": 17,
          "recovered": 2525,
          "vaccinated1": 33372,
          "vaccinated2": 17117
        }
      },
      "West Garo Hills": {
        "delta": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 7,
          "vaccinated2": 32
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 8,
          "recovered": 11,
          "vaccinated1": 1409,
          "vaccinated2": 8093
        },
        "meta": {
          "population": 642923
        },
        "total": {
          "confirmed": 9027,
          "deceased": 72,
          "recovered": 8943,
          "vaccinated1": 209662,
          "vaccinated2": 119725
        }
      },
      "West Jaintia Hills": {
        "delta": {
          "confirmed": 1
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 11,
          "deceased": 2,
          "recovered": 31,
          "vaccinated1": 411,
          "vaccinated2": 3480
        },
        "meta": {
          "population": 270352
        },
        "total": {
          "confirmed": 6803,
          "deceased": 133,
          "recovered": 6642,
          "vaccinated1": 84529,
          "vaccinated2": 47646
        }
      },
      "West Khasi Hills": {
        "delta": {
          "confirmed": 2,
          "recovered": 27,
          "vaccinated1": 1,
          "vaccinated2": 20
        },
        "delta21_14": {
          "confirmed": 118
        },
        "delta7": {
          "confirmed": 33,
          "recovered": 97,
          "vaccinated1": 443,
          "vaccinated2": 1763
        },
        "meta": {
          "population": 385601
        },
        "total": {
          "confirmed": 5457,
          "deceased": 71,
          "recovered": 5330,
          "vaccinated1": 77018,
          "vaccinated2": 43000
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 3224000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11881"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 83627,
      "deceased": 1450,
      "recovered": 81746,
      "tested": 1151665,
      "vaccinated1": 1103275,
      "vaccinated2": 641819
    }
  },
  "MN": {
    "delta": {
      "confirmed": 63,
      "deceased": 1,
      "recovered": 62,
      "tested": 1689,
      "vaccinated1": 705,
      "vaccinated2": 4283
    },
    "delta21_14": {
      "confirmed": 734
    },
    "delta7": {
      "confirmed": 439,
      "deceased": 10,
      "recovered": 652,
      "tested": 12787,
      "vaccinated1": 7665,
      "vaccinated2": 71276
    },
    "districts": {
      "Bishnupur": {
        "delta7": {
          "vaccinated1": 685,
          "vaccinated2": 8679
        },
        "meta": {
          "population": 240363
        },
        "total": {
          "vaccinated1": 128902,
          "vaccinated2": 64791
        }
      },
      "Chandel": {
        "delta": {
          "vaccinated1": 5,
          "vaccinated2": 134
        },
        "delta7": {
          "vaccinated1": 98,
          "vaccinated2": 1337
        },
        "meta": {
          "population": 144028
        },
        "total": {
          "vaccinated1": 26634,
          "vaccinated2": 15197
        }
      },
      "Churachandpur": {
        "delta": {
          "vaccinated1": 27,
          "vaccinated2": 370
        },
        "delta7": {
          "vaccinated1": 345,
          "vaccinated2": 3560
        },
        "meta": {
          "population": 271274,
          "tested": {
            "date": "2020-09-23"
          }
        },
        "total": {
          "tested": 13542,
          "vaccinated1": 104247,
          "vaccinated2": 62208
        }
      },
      "Imphal East": {
        "delta": {
          "vaccinated1": 183,
          "vaccinated2": 1268
        },
        "delta7": {
          "vaccinated1": 2402,
          "vaccinated2": 19169
        },
        "meta": {
          "population": 452661
        },
        "total": {
          "vaccinated1": 251626,
          "vaccinated2": 148953
        }
      },
      "Imphal West": {
        "delta": {
          "vaccinated1": 74,
          "vaccinated2": 841
        },
        "delta7": {
          "vaccinated1": 1861,
          "vaccinated2": 17353
        },
        "meta": {
          "population": 514683
        },
        "total": {
          "vaccinated1": 308782,
          "vaccinated2": 199404
        }
      },
      "Jiribam": {
        "delta7": {
          "vaccinated1": 70,
          "vaccinated2": 1927
        },
        "meta": {
          "population": 43818
        },
        "total": {
          "vaccinated1": 27911,
          "vaccinated2": 17262
        }
      },
      "Kakching": {
        "delta7": {
          "vaccinated1": 214,
          "vaccinated2": 2450
        },
        "meta": {
          "population": 135481
        },
        "total": {
          "vaccinated1": 84702,
          "vaccinated2": 49653
        }
      },
      "Kamjong": {
        "delta": {
          "vaccinated1": 75,
          "vaccinated2": 371
        },
        "delta7": {
          "vaccinated1": 129,
          "vaccinated2": 736
        },
        "meta": {
          "population": 45616
        },
        "total": {
          "vaccinated1": 10502,
          "vaccinated2": 5370
        }
      },
      "Kangpokpi": {
        "delta": {
          "vaccinated1": 73,
          "vaccinated2": 26
        },
        "delta7": {
          "vaccinated1": 291,
          "vaccinated2": 1472
        },
        "total": {
          "vaccinated1": 39027,
          "vaccinated2": 19015
        }
      },
      "Noney": {
        "delta": {
          "vaccinated1": 29,
          "vaccinated2": 388
        },
        "delta7": {
          "vaccinated1": 98,
          "vaccinated2": 1211
        },
        "total": {
          "vaccinated1": 16798,
          "vaccinated2": 9819
        }
      },
      "Pherzawl": {
        "delta": {
          "vaccinated2": 52
        },
        "delta7": {
          "vaccinated1": 55,
          "vaccinated2": 711
        },
        "meta": {
          "population": 47250
        },
        "total": {
          "vaccinated1": 12417,
          "vaccinated2": 9888
        }
      },
      "Senapati": {
        "delta": {
          "vaccinated1": 105,
          "vaccinated2": 291
        },
        "delta7": {
          "vaccinated1": 425,
          "vaccinated2": 1940
        },
        "meta": {
          "population": 354772
        },
        "total": {
          "vaccinated1": 28247,
          "vaccinated2": 18288
        }
      },
      "Tamenglong": {
        "delta": {
          "vaccinated1": 53,
          "vaccinated2": 76
        },
        "delta7": {
          "vaccinated1": 174,
          "vaccinated2": 1204
        },
        "meta": {
          "population": 140143
        },
        "total": {
          "vaccinated1": 19931,
          "vaccinated2": 10361
        }
      },
      "Tengnoupal": {
        "delta": {
          "vaccinated1": 14,
          "vaccinated2": 183
        },
        "delta7": {
          "vaccinated1": 93,
          "vaccinated2": 1176
        },
        "total": {
          "vaccinated1": 26209,
          "vaccinated2": 12163
        }
      },
      "Thoubal": {
        "delta": {
          "vaccinated1": 1,
          "vaccinated2": 22
        },
        "delta7": {
          "vaccinated1": 378,
          "vaccinated2": 6574
        },
        "meta": {
          "population": 420517
        },
        "total": {
          "vaccinated1": 141308,
          "vaccinated2": 62279
        }
      },
      "Ukhrul": {
        "delta": {
          "vaccinated1": 66,
          "vaccinated2": 258
        },
        "delta7": {
          "vaccinated1": 362,
          "vaccinated2": 1775
        },
        "meta": {
          "population": 183115
        },
        "total": {
          "vaccinated1": 22193,
          "vaccinated2": 14759
        }
      },
      "Unknown": {
        "delta": {
          "confirmed": 63,
          "deceased": 1,
          "recovered": 62
        },
        "delta21_14": {
          "confirmed": 734
        },
        "delta7": {
          "confirmed": 439,
          "deceased": 10,
          "recovered": 652
        },
        "total": {
          "confirmed": 123731,
          "deceased": 1921,
          "recovered": 121102
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Dec 14]:824 out of 980 recovered cases are backdated.",
      "population": 3103000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://nrhmmanipur.org/?p=8037"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 123731,
      "deceased": 1921,
      "recovered": 121102,
      "tested": 1367673,
      "vaccinated1": 1249436,
      "vaccinated2": 719413
    }
  },
  "MP": {
    "delta": {
      "confirmed": 16,
      "recovered": 8,
      "tested": 55368,
      "vaccinated1": 5713,
      "vaccinated2": 77062
    },
    "delta21_14": {
      "confirmed": 63
    },
    "delta7": {
      "confirmed": 105,
      "deceased": 1,
      "recovered": 74,
      "tested": 393209,
      "vaccinated1": 148817,
      "vaccinated2": 2034460
    },
    "districts": {
      "Agar Malwa": {
        "delta": {
          "vaccinated1": 12,
          "vaccinated2": 107
        },
        "delta7": {
          "vaccinated1": 965,
          "vaccinated2": 16911
        },
        "total": {
          "confirmed": 3303,
          "deceased": 68,
          "recovered": 3235,
          "vaccinated1": 424846,
          "vaccinated2": 128822
        }
      },
      "Alirajpur": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 40
        },
        "delta7": {
          "vaccinated1": 921,
          "vaccinated2": 8076
        },
        "meta": {
          "population": 728677
        },
        "total": {
          "confirmed": 3505,
          "deceased": 48,
          "recovered": 3453,
          "vaccinated1": 369571,
          "vaccinated2": 114601
        }
      },
      "Anuppur": {
        "delta": {
          "vaccinated1": 73,
          "vaccinated2": 1328
        },
        "delta7": {
          "vaccinated1": 995,
          "vaccinated2": 18360
        },
        "meta": {
          "population": 749521,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 9238,
          "deceased": 89,
          "recovered": 9140,
          "tested": 3424,
          "vaccinated1": 481238,
          "vaccinated2": 164712
        }
      },
      "Ashoknagar": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 131
        },
        "delta7": {
          "vaccinated1": 1258,
          "vaccinated2": 17334
        },
        "meta": {
          "population": 844979,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 3670,
          "deceased": 57,
          "recovered": 3613,
          "tested": 55792,
          "vaccinated1": 550087,
          "vaccinated2": 186066
        }
      },
      "Balaghat": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 25,
          "vaccinated2": 342
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 15838,
          "vaccinated2": 71692
        },
        "meta": {
          "population": 1701156,
          "tested": {
            "date": "2020-08-19"
          }
        },
        "total": {
          "confirmed": 9100,
          "deceased": 64,
          "recovered": 9017,
          "tested": 9654,
          "vaccinated1": 1278183,
          "vaccinated2": 549643
        }
      },
      "Barwani": {
        "delta": {
          "vaccinated1": 76,
          "vaccinated2": 542
        },
        "delta7": {
          "vaccinated1": 1615,
          "vaccinated2": 16619
        },
        "meta": {
          "population": 1385659,
          "tested": {
            "date": "2020-11-19"
          }
        },
        "total": {
          "confirmed": 8366,
          "deceased": 90,
          "recovered": 8267,
          "tested": 41588,
          "vaccinated1": 788872,
          "vaccinated2": 225336
        }
      },
      "Betul": {
        "delta": {
          "vaccinated1": 22,
          "vaccinated2": 547
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 2361,
          "vaccinated2": 31953
        },
        "meta": {
          "population": 1575247,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 12905,
          "deceased": 277,
          "recovered": 12590,
          "tested": 68036,
          "vaccinated1": 1042931,
          "vaccinated2": 343674
        }
      },
      "Bhind": {
        "delta": {
          "vaccinated1": 29,
          "vaccinated2": 1176
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 1525,
          "vaccinated2": 30042
        },
        "meta": {
          "population": 1703562,
          "tested": {
            "date": "2020-11-16"
          }
        },
        "total": {
          "confirmed": 2995,
          "deceased": 32,
          "recovered": 2960,
          "tested": 44395,
          "vaccinated1": 1034374,
          "vaccinated2": 351065
        }
      },
      "Bhopal": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 66,
          "vaccinated2": 646
        },
        "delta21_14": {
          "confirmed": 27
        },
        "delta7": {
          "confirmed": 38,
          "vaccinated1": 4130,
          "vaccinated2": 38750
        },
        "meta": {
          "population": 2368145,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 123552,
          "deceased": 972,
          "recovered": 122121,
          "tested": 245166,
          "vaccinated1": 2012966,
          "vaccinated2": 1168682
        }
      },
      "Burhanpur": {
        "delta": {
          "vaccinated1": 49,
          "vaccinated2": 138
        },
        "delta7": {
          "vaccinated1": 762,
          "vaccinated2": 6561
        },
        "meta": {
          "population": 756993,
          "tested": {
            "date": "2020-08-18"
          }
        },
        "total": {
          "confirmed": 2568,
          "deceased": 39,
          "recovered": 2529,
          "tested": 13040,
          "vaccinated1": 493618,
          "vaccinated2": 220909
        }
      },
      "Chhatarpur": {
        "delta": {
          "vaccinated1": 56,
          "vaccinated2": 1310
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 3103,
          "vaccinated2": 27937
        },
        "meta": {
          "population": 1762857,
          "tested": {
            "date": "2020-12-09"
          }
        },
        "total": {
          "confirmed": 7609,
          "deceased": 91,
          "recovered": 7506,
          "tested": 50518,
          "vaccinated1": 1093616,
          "vaccinated2": 336309
        }
      },
      "Chhindwara": {
        "delta": {
          "vaccinated1": 18,
          "vaccinated2": 261
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 4654,
          "vaccinated2": 93453
        },
        "meta": {
          "population": 2090306,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 6734,
          "deceased": 120,
          "recovered": 6612,
          "tested": 79090,
          "vaccinated1": 1624355,
          "vaccinated2": 591843
        }
      },
      "Damoh": {
        "delta": {
          "vaccinated1": 39,
          "vaccinated2": 982
        },
        "delta7": {
          "vaccinated1": 4298,
          "vaccinated2": 52314
        },
        "meta": {
          "population": 1263703,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 8120,
          "deceased": 186,
          "recovered": 7841,
          "tested": 16564,
          "vaccinated1": 844557,
          "vaccinated2": 326505
        }
      },
      "Datia": {
        "delta": {
          "vaccinated1": 521,
          "vaccinated2": 10316
        },
        "delta7": {
          "vaccinated1": 1963,
          "vaccinated2": 45226
        },
        "meta": {
          "population": 786375,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 6959,
          "deceased": 78,
          "recovered": 6874,
          "tested": 40322,
          "vaccinated1": 560238,
          "vaccinated2": 296233
        }
      },
      "Dewas": {
        "delta": {
          "vaccinated1": 11,
          "vaccinated2": 386
        },
        "delta7": {
          "vaccinated1": 1804,
          "vaccinated2": 22992
        },
        "meta": {
          "population": 1563107,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7723,
          "deceased": 51,
          "recovered": 7672,
          "tested": 96155,
          "vaccinated1": 1005266,
          "vaccinated2": 477219
        }
      },
      "Dhar": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 39,
          "vaccinated2": 306
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 7,
          "vaccinated1": 5034,
          "vaccinated2": 83699
        },
        "meta": {
          "population": 2184672,
          "tested": {
            "date": "2020-12-02"
          }
        },
        "total": {
          "confirmed": 12572,
          "deceased": 130,
          "recovered": 12388,
          "tested": 62597,
          "vaccinated1": 1371226,
          "vaccinated2": 536214
        }
      },
      "Dindori": {
        "delta": {
          "vaccinated1": 4,
          "vaccinated2": 96
        },
        "delta7": {
          "vaccinated1": 1342,
          "vaccinated2": 21481
        },
        "meta": {
          "population": 704218,
          "tested": {
            "date": "2020-07-08"
          }
        },
        "total": {
          "confirmed": 4623,
          "deceased": 29,
          "recovered": 4588,
          "tested": 3557,
          "vaccinated1": 481366,
          "vaccinated2": 186341
        }
      },
      "Guna": {
        "delta": {
          "vaccinated1": 630,
          "vaccinated2": 5023
        },
        "delta7": {
          "vaccinated1": 3347,
          "vaccinated2": 32837
        },
        "meta": {
          "population": 1240938,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 5132,
          "deceased": 44,
          "recovered": 5085,
          "tested": 40229,
          "vaccinated1": 821399,
          "vaccinated2": 284155
        }
      },
      "Gwalior": {
        "delta": {
          "vaccinated1": 531,
          "vaccinated2": 1715
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 8800,
          "vaccinated2": 41193
        },
        "meta": {
          "population": 2030543,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 53106,
          "deceased": 633,
          "recovered": 52427,
          "tested": 206696,
          "vaccinated1": 1452149,
          "vaccinated2": 730150
        }
      },
      "Harda": {
        "delta": {
          "vaccinated1": 14,
          "vaccinated2": 210
        },
        "delta7": {
          "vaccinated1": 1075,
          "vaccinated2": 24810
        },
        "meta": {
          "population": 570302,
          "tested": {
            "date": "2020-12-02"
          }
        },
        "total": {
          "confirmed": 5055,
          "deceased": 96,
          "recovered": 4954,
          "tested": 36708,
          "vaccinated1": 394641,
          "vaccinated2": 159293
        }
      },
      "Hoshangabad": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 206
        },
        "delta7": {
          "vaccinated1": 1498,
          "vaccinated2": 39507
        },
        "meta": {
          "population": 1240975,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 10688,
          "deceased": 99,
          "recovered": 10570,
          "tested": 46294,
          "vaccinated1": 865566,
          "vaccinated2": 369945
        }
      },
      "Indore": {
        "delta": {
          "confirmed": 8,
          "vaccinated1": 76,
          "vaccinated2": 894
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 39,
          "vaccinated1": 4233,
          "vaccinated2": 45203
        },
        "meta": {
          "population": 3272335,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 153230,
          "deceased": 1391,
          "recovered": 151410,
          "tested": 780266,
          "vaccinated1": 2951024,
          "vaccinated2": 1728945
        }
      },
      "Jabalpur": {
        "delta": {
          "vaccinated1": 726,
          "vaccinated2": 19681
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 5968,
          "vaccinated2": 156306
        },
        "meta": {
          "population": 2460714,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 50779,
          "deceased": 670,
          "recovered": 49896,
          "tested": 293923,
          "vaccinated1": 1957070,
          "vaccinated2": 1099359
        }
      },
      "Jhabua": {
        "delta": {
          "vaccinated1": 50,
          "vaccinated2": 222
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 3578,
          "vaccinated2": 21040
        },
        "meta": {
          "population": 1024091,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 7691,
          "deceased": 64,
          "recovered": 7619,
          "tested": 52146,
          "vaccinated1": 607542,
          "vaccinated2": 185320
        }
      },
      "Katni": {
        "delta": {
          "vaccinated1": 57,
          "vaccinated2": 879
        },
        "delta7": {
          "vaccinated1": 2926,
          "vaccinated2": 42360
        },
        "meta": {
          "population": 1291684,
          "tested": {
            "date": "2020-12-18"
          }
        },
        "total": {
          "confirmed": 9366,
          "deceased": 120,
          "recovered": 9242,
          "tested": 56828,
          "vaccinated1": 865274,
          "vaccinated2": 306259
        }
      },
      "Khandwa": {
        "delta7": {
          "vaccinated1": 880,
          "vaccinated2": 13668
        },
        "meta": {
          "population": 1309443,
          "tested": {
            "date": "2020-08-24"
          }
        },
        "total": {
          "confirmed": 4044,
          "deceased": 94,
          "recovered": 3946,
          "tested": 17090,
          "vaccinated1": 862885,
          "vaccinated2": 310248
        }
      },
      "Khargone": {
        "delta": {
          "vaccinated1": 922,
          "vaccinated2": 5304
        },
        "delta7": {
          "vaccinated1": 3049,
          "vaccinated2": 32932
        },
        "meta": {
          "population": 1872413,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 13970,
          "deceased": 239,
          "recovered": 13716,
          "tested": 38413,
          "vaccinated1": 1147444,
          "vaccinated2": 411114
        }
      },
      "Mandla": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 72
        },
        "delta7": {
          "vaccinated1": 2286,
          "vaccinated2": 53670
        },
        "meta": {
          "population": 1053522
        },
        "total": {
          "confirmed": 5188,
          "deceased": 25,
          "recovered": 5159,
          "vaccinated1": 684882,
          "vaccinated2": 246724
        }
      },
      "Mandsaur": {
        "delta": {
          "vaccinated1": 4,
          "vaccinated2": 130
        },
        "delta7": {
          "vaccinated1": 2058,
          "vaccinated2": 37337
        },
        "meta": {
          "population": 1339832,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 8637,
          "deceased": 84,
          "recovered": 8552,
          "tested": 52733,
          "vaccinated1": 948065,
          "vaccinated2": 330902
        }
      },
      "Morena": {
        "delta": {
          "vaccinated1": 50,
          "vaccinated2": 1667
        },
        "delta7": {
          "vaccinated1": 2814,
          "vaccinated2": 112629
        },
        "meta": {
          "population": 1965137,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 8236,
          "deceased": 95,
          "recovered": 8135,
          "tested": 90967,
          "vaccinated1": 1295658,
          "vaccinated2": 582833
        }
      },
      "Narsinghpur": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 224
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 5,
          "vaccinated1": 1266,
          "vaccinated2": 34365
        },
        "meta": {
          "population": 1092141,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 11209,
          "deceased": 81,
          "recovered": 11115,
          "tested": 90600,
          "vaccinated1": 803225,
          "vaccinated2": 318284
        }
      },
      "Neemuch": {
        "delta": {
          "vaccinated1": 16,
          "vaccinated2": 359
        },
        "delta7": {
          "vaccinated1": 970,
          "vaccinated2": 17955
        },
        "meta": {
          "population": 825958,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 7926,
          "deceased": 84,
          "recovered": 7828,
          "tested": 57292,
          "vaccinated1": 579489,
          "vaccinated2": 229183
        }
      },
      "Niwari": {
        "meta": {
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 3715,
          "deceased": 48,
          "recovered": 3654,
          "tested": 22574
        }
      },
      "Panna": {
        "delta": {
          "vaccinated1": 144,
          "vaccinated2": 985
        },
        "delta7": {
          "vaccinated1": 2633,
          "vaccinated2": 18657
        },
        "meta": {
          "population": 1016028
        },
        "total": {
          "confirmed": 7331,
          "deceased": 63,
          "recovered": 7250,
          "vaccinated1": 600823,
          "vaccinated2": 168120
        }
      },
      "Raigarh": {
        "total": {
          "confirmed": 1
        }
      },
      "Raisen": {
        "delta": {
          "vaccinated1": 39,
          "vaccinated2": 222
        },
        "delta7": {
          "vaccinated1": 1644,
          "vaccinated2": 22044
        },
        "meta": {
          "population": 1331699,
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 9238,
          "deceased": 194,
          "recovered": 9030,
          "tested": 44343,
          "vaccinated1": 885585,
          "vaccinated2": 333022
        }
      },
      "Rajgarh": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 10,
          "vaccinated2": 144
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 2483,
          "vaccinated2": 41531
        },
        "meta": {
          "population": 1546541,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 8729,
          "deceased": 172,
          "recovered": 8490,
          "tested": 46604,
          "vaccinated1": 1025584,
          "vaccinated2": 450099
        }
      },
      "Ratlam": {
        "delta": {
          "vaccinated1": 14,
          "vaccinated2": 251
        },
        "delta7": {
          "vaccinated1": 1894,
          "vaccinated2": 51080
        },
        "meta": {
          "population": 1454483,
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 17860,
          "deceased": 385,
          "recovered": 17438,
          "tested": 51736,
          "vaccinated1": 1026416,
          "vaccinated2": 457972
        }
      },
      "Rewa": {
        "delta": {
          "vaccinated1": 85,
          "vaccinated2": 1574
        },
        "delta7": {
          "vaccinated1": 6664,
          "vaccinated2": 104963
        },
        "meta": {
          "population": 2363744,
          "tested": {
            "date": "2020-08-18"
          }
        },
        "total": {
          "confirmed": 16433,
          "deceased": 155,
          "recovered": 16270,
          "tested": 22690,
          "vaccinated1": 1639826,
          "vaccinated2": 674779
        }
      },
      "Sagar": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 23,
          "vaccinated2": 343
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 6321,
          "vaccinated2": 60800
        },
        "meta": {
          "population": 2378295,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 16622,
          "deceased": 390,
          "recovered": 16154,
          "tested": 64801,
          "vaccinated1": 1563245,
          "vaccinated2": 760746
        }
      },
      "Satna": {
        "delta": {
          "vaccinated1": 37,
          "vaccinated2": 303
        },
        "delta7": {
          "vaccinated1": 3426,
          "vaccinated2": 40519
        },
        "meta": {
          "population": 2228619,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 11965,
          "deceased": 133,
          "recovered": 11829,
          "tested": 28159,
          "vaccinated1": 1532585,
          "vaccinated2": 481540
        }
      },
      "Sehore": {
        "delta": {
          "vaccinated1": 5,
          "vaccinated2": 256
        },
        "delta7": {
          "vaccinated1": 2325,
          "vaccinated2": 32101
        },
        "meta": {
          "population": 1311008,
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 10136,
          "deceased": 73,
          "recovered": 10057,
          "tested": 45061,
          "vaccinated1": 909045,
          "vaccinated2": 396375
        }
      },
      "Seoni": {
        "delta": {
          "vaccinated1": 15,
          "vaccinated2": 402
        },
        "delta7": {
          "vaccinated1": 2162,
          "vaccinated2": 38081
        },
        "meta": {
          "population": 1378876,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 6775,
          "deceased": 28,
          "recovered": 6739,
          "tested": 15024,
          "vaccinated1": 945564,
          "vaccinated2": 341871
        }
      },
      "Shahdol": {
        "delta": {
          "vaccinated1": 20,
          "vaccinated2": 426
        },
        "delta7": {
          "vaccinated1": 857,
          "vaccinated2": 22928
        },
        "meta": {
          "population": 1064989,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 10085,
          "deceased": 118,
          "recovered": 9958,
          "tested": 18177,
          "vaccinated1": 723227,
          "vaccinated2": 337272
        }
      },
      "Shajapur": {
        "delta": {
          "vaccinated1": 43,
          "vaccinated2": 851
        },
        "delta7": {
          "vaccinated1": 1971,
          "vaccinated2": 51596
        },
        "meta": {
          "population": 1512353,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 6349,
          "deceased": 74,
          "recovered": 6273,
          "tested": 56805,
          "vaccinated1": 620316,
          "vaccinated2": 278912
        }
      },
      "Sheopur": {
        "delta": {
          "vaccinated1": 236,
          "vaccinated2": 1788
        },
        "delta7": {
          "vaccinated1": 1338,
          "vaccinated2": 16952
        },
        "meta": {
          "population": 687952,
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 4000,
          "deceased": 78,
          "recovered": 3919,
          "tested": 31449,
          "vaccinated1": 413195,
          "vaccinated2": 140296
        }
      },
      "Shivpuri": {
        "delta": {
          "vaccinated1": 883,
          "vaccinated2": 13988
        },
        "delta7": {
          "vaccinated1": 3082,
          "vaccinated2": 38901
        },
        "meta": {
          "population": 1725818,
          "tested": {
            "date": "2020-11-19"
          }
        },
        "total": {
          "confirmed": 12398,
          "deceased": 125,
          "recovered": 12261,
          "tested": 47270,
          "vaccinated1": 1109976,
          "vaccinated2": 391707
        }
      },
      "Sidhi": {
        "delta": {
          "vaccinated1": 58,
          "vaccinated2": 512
        },
        "delta7": {
          "vaccinated1": 1867,
          "vaccinated2": 19145
        },
        "meta": {
          "population": 1126515,
          "tested": {
            "date": "2020-07-26"
          }
        },
        "total": {
          "confirmed": 9219,
          "deceased": 87,
          "recovered": 9132,
          "tested": 4660,
          "vaccinated1": 679862,
          "vaccinated2": 226632
        }
      },
      "Singrauli": {
        "delta": {
          "vaccinated1": 43,
          "vaccinated2": 305
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 3052,
          "vaccinated2": 21200
        },
        "meta": {
          "population": 1178132
        },
        "total": {
          "confirmed": 8801,
          "deceased": 82,
          "recovered": 8706,
          "vaccinated1": 740335,
          "vaccinated2": 224966
        }
      },
      "Tikamgarh": {
        "delta": {
          "vaccinated1": 60,
          "vaccinated2": 297
        },
        "delta7": {
          "vaccinated1": 3331,
          "vaccinated2": 24497
        },
        "meta": {
          "population": 1444920,
          "tested": {
            "date": "2020-11-29"
          }
        },
        "total": {
          "confirmed": 6863,
          "deceased": 114,
          "recovered": 6742,
          "tested": 43011,
          "vaccinated1": 919592,
          "vaccinated2": 293885
        }
      },
      "Ujjain": {
        "delta": {
          "vaccinated1": 27,
          "vaccinated2": 1323
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 4210,
          "vaccinated2": 65566
        },
        "meta": {
          "population": 1986864,
          "tested": {
            "date": "2020-09-19"
          }
        },
        "total": {
          "confirmed": 18903,
          "deceased": 172,
          "recovered": 18720,
          "tested": 31631,
          "vaccinated1": 1452247,
          "vaccinated2": 836514
        }
      },
      "Umaria": {
        "delta": {
          "vaccinated1": 9,
          "vaccinated2": 93
        },
        "delta7": {
          "vaccinated1": 955,
          "vaccinated2": 28084
        },
        "meta": {
          "population": 643579,
          "tested": {
            "date": "2020-11-19"
          }
        },
        "total": {
          "confirmed": 6294,
          "deceased": 63,
          "recovered": 6224,
          "tested": 54811,
          "vaccinated1": 455492,
          "vaccinated2": 196492
        }
      },
      "Unknown": {
        "delta": {
          "recovered": 8
        },
        "delta7": {
          "deceased": 1,
          "recovered": 74
        },
        "total": {
          "confirmed": 1416,
          "deceased": 1493,
          "recovered": 1632
        }
      },
      "Vidisha": {
        "delta": {
          "vaccinated1": 11,
          "vaccinated2": 253
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 1222,
          "vaccinated2": 26130
        },
        "meta": {
          "population": 1458212,
          "tested": {
            "date": "2020-12-04"
          }
        },
        "total": {
          "confirmed": 11922,
          "deceased": 237,
          "recovered": 11677,
          "tested": 65935,
          "vaccinated1": 975291,
          "vaccinated2": 349024
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[14 Oct'20]: 4469 confirmed cases and 4469 recoveries added in MP bulletin as reconciliation with private labs and hospitals\n[12 July'21] :1478 deceased cases have been added after reconciliation of deceased cases records from Home Isolation(208), Private Hospitals(762) and other districts data (508)",
      "population": 82232000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/healthminmp/status/1454818706534514697"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 792854,
      "deceased": 10524,
      "recovered": 782215,
      "tested": 20294225,
      "vaccinated1": 49911938,
      "vaccinated2": 20838045
    }
  },
  "MZ": {
    "delta": {
      "confirmed": 579,
      "deceased": 2,
      "recovered": 610,
      "tested": 5945,
      "vaccinated1": 10,
      "vaccinated2": 51
    },
    "delta21_14": {
      "confirmed": 6770
    },
    "delta7": {
      "confirmed": 4098,
      "deceased": 21,
      "recovered": 5685,
      "tested": 42841,
      "vaccinated1": 4302,
      "vaccinated2": 11262
    },
    "districts": {
      "Aizawl": {
        "delta": {
          "confirmed": 361,
          "deceased": 1,
          "recovered": 365
        },
        "delta21_14": {
          "confirmed": 3869
        },
        "delta7": {
          "confirmed": 1996,
          "deceased": 6,
          "recovered": 3014,
          "vaccinated1": 443,
          "vaccinated2": 3740
        },
        "meta": {
          "population": 404054
        },
        "total": {
          "confirmed": 75111,
          "deceased": 300,
          "recovered": 71337,
          "vaccinated1": 315706,
          "vaccinated2": 239593
        }
      },
      "Champhai": {
        "delta": {
          "confirmed": 33,
          "recovered": 40
        },
        "delta21_14": {
          "confirmed": 407
        },
        "delta7": {
          "confirmed": 299,
          "deceased": 3,
          "recovered": 319,
          "vaccinated1": 344,
          "vaccinated2": 572
        },
        "meta": {
          "population": 125370
        },
        "total": {
          "confirmed": 5188,
          "deceased": 11,
          "recovered": 4745,
          "vaccinated1": 74122,
          "vaccinated2": 55251
        }
      },
      "Hnahthial": {
        "delta": {
          "confirmed": 1,
          "recovered": 29
        },
        "delta21_14": {
          "confirmed": 136
        },
        "delta7": {
          "confirmed": 143,
          "recovered": 185
        },
        "total": {
          "confirmed": 1020,
          "deceased": 3,
          "recovered": 857
        }
      },
      "Khawzawl": {
        "delta": {
          "confirmed": 2
        },
        "delta21_14": {
          "confirmed": 33
        },
        "delta7": {
          "confirmed": 42,
          "recovered": 26
        },
        "total": {
          "confirmed": 733,
          "recovered": 688
        }
      },
      "Kolasib": {
        "delta": {
          "confirmed": 10,
          "recovered": 2
        },
        "delta21_14": {
          "confirmed": 165
        },
        "delta7": {
          "confirmed": 94,
          "recovered": 154,
          "vaccinated1": 153,
          "vaccinated2": 738
        },
        "meta": {
          "population": 83054
        },
        "total": {
          "confirmed": 7721,
          "deceased": 30,
          "recovered": 7561,
          "vaccinated1": 50525,
          "vaccinated2": 33101
        }
      },
      "Lawngtlai": {
        "delta": {
          "confirmed": 14,
          "recovered": 13,
          "vaccinated1": 129
        },
        "delta21_14": {
          "confirmed": 274
        },
        "delta7": {
          "confirmed": 98,
          "deceased": 1,
          "recovered": 245,
          "vaccinated1": 2765,
          "vaccinated2": 1838
        },
        "meta": {
          "population": 117444
        },
        "total": {
          "confirmed": 6740,
          "deceased": 23,
          "recovered": 6553,
          "vaccinated1": 55877,
          "vaccinated2": 25870
        }
      },
      "Lunglei": {
        "delta": {
          "confirmed": 71,
          "recovered": 36
        },
        "delta21_14": {
          "confirmed": 642
        },
        "delta7": {
          "confirmed": 662,
          "deceased": 1,
          "recovered": 507,
          "vaccinated1": 263,
          "vaccinated2": 1493
        },
        "meta": {
          "population": 154094
        },
        "total": {
          "confirmed": 9842,
          "deceased": 27,
          "recovered": 9053,
          "vaccinated1": 95129,
          "vaccinated2": 73298
        }
      },
      "Mamit": {
        "delta": {
          "confirmed": 19
        },
        "delta21_14": {
          "confirmed": 308
        },
        "delta7": {
          "confirmed": 241,
          "deceased": 5,
          "recovered": 265,
          "vaccinated1": 228,
          "vaccinated2": 1322
        },
        "meta": {
          "population": 85757
        },
        "total": {
          "confirmed": 4854,
          "deceased": 12,
          "recovered": 4448,
          "vaccinated1": 43678,
          "vaccinated2": 28873
        }
      },
      "Saiha": {
        "delta": {
          "deceased": 1,
          "recovered": 37,
          "vaccinated2": 39
        },
        "delta21_14": {
          "confirmed": 420
        },
        "delta7": {
          "confirmed": 107,
          "deceased": 5,
          "recovered": 345,
          "vaccinated1": 68,
          "vaccinated2": 1116
        },
        "meta": {
          "population": 56366
        },
        "total": {
          "confirmed": 5469,
          "deceased": 14,
          "recovered": 5304,
          "vaccinated1": 34626,
          "vaccinated2": 19984
        }
      },
      "Saitual": {
        "delta": {
          "confirmed": 3,
          "recovered": 21
        },
        "delta21_14": {
          "confirmed": 28
        },
        "delta7": {
          "confirmed": 30,
          "recovered": 53
        },
        "total": {
          "confirmed": 471,
          "deceased": 2,
          "recovered": 420
        }
      },
      "Serchhip": {
        "delta": {
          "confirmed": 65,
          "recovered": 67
        },
        "delta21_14": {
          "confirmed": 488
        },
        "delta7": {
          "confirmed": 386,
          "recovered": 572,
          "vaccinated1": 36,
          "vaccinated2": 431
        },
        "meta": {
          "population": 64875
        },
        "total": {
          "confirmed": 4210,
          "deceased": 10,
          "recovered": 3646,
          "vaccinated1": 41932,
          "vaccinated2": 36047
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 1192000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://dipr.mizoram.gov.in/post/covid-19-positive-thar-579-hmuhchhuah-a-ni"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 121359,
      "deceased": 432,
      "recovered": 114612,
      "tested": 1298444,
      "vaccinated1": 711597,
      "vaccinated2": 512029
    }
  },
  "NL": {
    "delta": {
      "confirmed": 11,
      "deceased": 1,
      "other": 1,
      "recovered": 21,
      "tested": 468,
      "vaccinated1": 193,
      "vaccinated2": 822
    },
    "delta21_14": {
      "confirmed": 162
    },
    "delta7": {
      "confirmed": 130,
      "deceased": 6,
      "other": 13,
      "recovered": 144,
      "tested": 4606,
      "vaccinated1": 4706,
      "vaccinated2": 23628
    },
    "districts": {
      "Dimapur": {
        "delta": {
          "confirmed": 3,
          "deceased": 1,
          "recovered": 13,
          "vaccinated1": -1,
          "vaccinated2": 2
        },
        "delta21_14": {
          "confirmed": 74
        },
        "delta7": {
          "confirmed": 68,
          "deceased": 2,
          "other": 10,
          "recovered": 73,
          "vaccinated1": 2827,
          "vaccinated2": 12731
        },
        "meta": {
          "population": 379769,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 14684,
          "deceased": 421,
          "other": 689,
          "recovered": 13471,
          "tested": 47020,
          "vaccinated1": 268405,
          "vaccinated2": 175502
        }
      },
      "Kiphire": {
        "delta": {
          "vaccinated1": 61,
          "vaccinated2": 124
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 116,
          "vaccinated2": 357
        },
        "meta": {
          "population": 74033,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 258,
          "deceased": 9,
          "other": 1,
          "recovered": 246,
          "tested": 1002,
          "vaccinated1": 13017,
          "vaccinated2": 8141
        }
      },
      "Kohima": {
        "delta": {
          "confirmed": 4,
          "other": 1
        },
        "delta21_14": {
          "confirmed": 33
        },
        "delta7": {
          "confirmed": 23,
          "other": 2,
          "recovered": 24,
          "vaccinated1": 509,
          "vaccinated2": 3038
        },
        "meta": {
          "population": 270063,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 9461,
          "deceased": 123,
          "other": 202,
          "recovered": 9095,
          "tested": 33986,
          "vaccinated1": 105758,
          "vaccinated2": 82602
        }
      },
      "Longleng": {
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "recovered": 7,
          "vaccinated1": 26,
          "vaccinated2": 181
        },
        "meta": {
          "population": 50593,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 307,
          "deceased": 2,
          "other": 18,
          "recovered": 286,
          "tested": 1193,
          "vaccinated1": 20577,
          "vaccinated2": 15446
        }
      },
      "Mokokchung": {
        "delta": {
          "confirmed": 3,
          "recovered": 2
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 23,
          "deceased": 2,
          "recovered": 5,
          "vaccinated1": 146,
          "vaccinated2": 2026
        },
        "meta": {
          "population": 193171,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 2333,
          "deceased": 54,
          "other": 62,
          "recovered": 2186,
          "tested": 3976,
          "vaccinated1": 69198,
          "vaccinated2": 54730
        }
      },
      "Mon": {
        "delta": {
          "vaccinated1": 20,
          "vaccinated2": 28
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 243,
          "vaccinated2": 1864
        },
        "meta": {
          "population": 259604,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 1159,
          "deceased": 14,
          "other": 17,
          "recovered": 1124,
          "tested": 12278,
          "vaccinated1": 70054,
          "vaccinated2": 48331
        }
      },
      "Peren": {
        "delta": {
          "vaccinated1": 1,
          "vaccinated2": 29
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 189,
          "vaccinated2": 613
        },
        "meta": {
          "population": 163294,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 920,
          "deceased": 6,
          "other": 15,
          "recovered": 897,
          "tested": 5717,
          "vaccinated1": 19956,
          "vaccinated2": 12514
        }
      },
      "Phek": {
        "delta": {
          "vaccinated1": 21,
          "vaccinated2": 168
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 4,
          "other": 1,
          "recovered": 1,
          "vaccinated1": 99,
          "vaccinated2": 496
        },
        "meta": {
          "population": 163294,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 601,
          "deceased": 18,
          "other": 9,
          "recovered": 568,
          "tested": 2779,
          "vaccinated1": 31241,
          "vaccinated2": 20746
        }
      },
      "Tuensang": {
        "delta": {
          "confirmed": 1,
          "recovered": 6,
          "vaccinated1": 41,
          "vaccinated2": 122
        },
        "delta21_14": {
          "confirmed": 28
        },
        "delta7": {
          "confirmed": 2,
          "deceased": 1,
          "recovered": 28,
          "vaccinated1": 106,
          "vaccinated2": 525
        },
        "meta": {
          "population": 414801,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 1094,
          "deceased": 12,
          "other": 3,
          "recovered": 1077,
          "tested": 4887,
          "vaccinated1": 38130,
          "vaccinated2": 26725
        }
      },
      "Wokha": {
        "delta": {
          "vaccinated1": 11,
          "vaccinated2": 232
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 4,
          "vaccinated1": 122,
          "vaccinated2": 1074
        },
        "meta": {
          "population": 166239,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 402,
          "deceased": 11,
          "other": 16,
          "recovered": 361,
          "tested": 1390,
          "vaccinated1": 35138,
          "vaccinated2": 23577
        }
      },
      "Zunheboto": {
        "delta": {
          "vaccinated1": 36,
          "vaccinated2": 106
        },
        "delta7": {
          "deceased": 1,
          "vaccinated1": 331,
          "vaccinated2": 807
        },
        "meta": {
          "population": 141014,
          "tested": {
            "date": "2020-12-11"
          }
        },
        "total": {
          "confirmed": 623,
          "deceased": 15,
          "other": 11,
          "recovered": 593,
          "tested": 2131,
          "vaccinated1": 38077,
          "vaccinated2": 22337
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 2150000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/MyGovNagaland/status/1454788808122138641"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 31842,
      "deceased": 685,
      "other": 1043,
      "recovered": 29904,
      "tested": 395416,
      "vaccinated1": 709553,
      "vaccinated2": 490663
    }
  },
  "OR": {
    "delta": {
      "confirmed": 488,
      "deceased": 4,
      "recovered": 450,
      "tested": 69675,
      "vaccinated1": 21420,
      "vaccinated2": 25651
    },
    "delta21_14": {
      "confirmed": 3381
    },
    "delta7": {
      "confirmed": 3046,
      "deceased": 24,
      "recovered": 3230,
      "tested": 473919,
      "vaccinated1": 731837,
      "vaccinated2": 917236
    },
    "districts": {
      "Angul": {
        "delta": {
          "confirmed": 1,
          "recovered": 3,
          "vaccinated1": 9,
          "vaccinated2": 38
        },
        "delta21_14": {
          "confirmed": 18
        },
        "delta7": {
          "confirmed": 16,
          "deceased": 2,
          "recovered": 20,
          "vaccinated1": 21629,
          "vaccinated2": 23378
        },
        "meta": {
          "population": 1271703,
          "tested": {
            "date": "2021-01-27"
          }
        },
        "total": {
          "confirmed": 43920,
          "deceased": 393,
          "recovered": 43506,
          "tested": 172873,
          "vaccinated1": 786278,
          "vaccinated2": 291800
        }
      },
      "Balangir": {
        "delta21_14": {
          "confirmed": 17
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 15,
          "vaccinated1": 20119,
          "vaccinated2": 39059
        },
        "meta": {
          "population": 1648574,
          "tested": {
            "date": "2020-10-11"
          }
        },
        "total": {
          "confirmed": 23397,
          "deceased": 126,
          "recovered": 23257,
          "tested": 87867,
          "vaccinated1": 960786,
          "vaccinated2": 299153
        }
      },
      "Balasore": {
        "delta": {
          "confirmed": 5,
          "recovered": 14,
          "vaccinated1": 929,
          "vaccinated2": 519
        },
        "delta21_14": {
          "confirmed": 94
        },
        "delta7": {
          "confirmed": 67,
          "deceased": 1,
          "recovered": 80,
          "vaccinated1": 78274,
          "vaccinated2": 35314
        },
        "meta": {
          "population": 2317419,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 40787,
          "deceased": 299,
          "recovered": 40389,
          "tested": 9843,
          "vaccinated1": 1351099,
          "vaccinated2": 534318
        }
      },
      "Bargarh": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 169,
          "vaccinated2": 30
        },
        "delta21_14": {
          "confirmed": 18
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 16,
          "vaccinated1": 52192,
          "vaccinated2": 32028
        },
        "meta": {
          "population": 1478833
        },
        "total": {
          "confirmed": 31126,
          "deceased": 335,
          "recovered": 30762,
          "vaccinated1": 829092,
          "vaccinated2": 283966
        }
      },
      "Bhadrak": {
        "delta": {
          "confirmed": 3,
          "recovered": 7,
          "vaccinated2": 17
        },
        "delta21_14": {
          "confirmed": 32
        },
        "delta7": {
          "confirmed": 44,
          "deceased": 1,
          "recovered": 39,
          "vaccinated1": 14511,
          "vaccinated2": 38206
        },
        "meta": {
          "population": 1506522,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 26480,
          "deceased": 150,
          "recovered": 26260,
          "tested": 258173,
          "vaccinated1": 1026493,
          "vaccinated2": 367945
        }
      },
      "Boudh": {
        "delta": {
          "vaccinated1": 496,
          "vaccinated2": 1585
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "recovered": 4,
          "vaccinated1": 7009,
          "vaccinated2": 16754
        },
        "meta": {
          "population": 439917,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 12634,
          "deceased": 112,
          "recovered": 12488,
          "tested": 496,
          "vaccinated1": 259325,
          "vaccinated2": 92297
        }
      },
      "Cuttack": {
        "delta": {
          "confirmed": 54,
          "recovered": 29,
          "vaccinated1": 2729,
          "vaccinated2": 1129
        },
        "delta21_14": {
          "confirmed": 326
        },
        "delta7": {
          "confirmed": 277,
          "deceased": 1,
          "recovered": 304,
          "vaccinated1": 75381,
          "vaccinated2": 45717
        },
        "meta": {
          "population": 2618708,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 94631,
          "deceased": 857,
          "recovered": 93404,
          "tested": 5720,
          "vaccinated1": 1434524,
          "vaccinated2": 702278
        }
      },
      "Deogarh": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 1,
          "vaccinated2": 136
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 41,
          "recovered": 10,
          "vaccinated1": 1126,
          "vaccinated2": 4779
        },
        "meta": {
          "population": 312164,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 6553,
          "deceased": 50,
          "recovered": 6460,
          "tested": 682,
          "vaccinated1": 223405,
          "vaccinated2": 63727
        }
      },
      "Dhenkanal": {
        "delta": {
          "confirmed": 5,
          "vaccinated1": 92,
          "vaccinated2": 104
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 16,
          "vaccinated1": 18302,
          "vaccinated2": 23327
        },
        "meta": {
          "population": 1192948,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 19871,
          "deceased": 243,
          "recovered": 19598,
          "tested": 179477,
          "vaccinated1": 738406,
          "vaccinated2": 282859
        }
      },
      "Gajapati": {
        "delta": {
          "confirmed": 5,
          "vaccinated1": 296,
          "vaccinated2": 1193
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 15,
          "recovered": 11,
          "vaccinated1": 4770,
          "vaccinated2": 10942
        },
        "meta": {
          "population": 575880,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 9657,
          "deceased": 84,
          "recovered": 9555,
          "tested": 715,
          "vaccinated1": 288963,
          "vaccinated2": 115535
        }
      },
      "Ganjam": {
        "delta": {
          "confirmed": 8,
          "recovered": 2,
          "vaccinated1": 438,
          "vaccinated2": 1848
        },
        "delta21_14": {
          "confirmed": 25
        },
        "delta7": {
          "confirmed": 22,
          "recovered": 18,
          "vaccinated1": 27002,
          "vaccinated2": 112716
        },
        "meta": {
          "population": 3520151,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 33849,
          "deceased": 485,
          "recovered": 33342,
          "tested": 750442,
          "vaccinated1": 2214981,
          "vaccinated2": 1698328
        }
      },
      "Jagatsinghpur": {
        "delta": {
          "confirmed": 9,
          "recovered": 12,
          "vaccinated1": -2,
          "vaccinated2": 2
        },
        "delta21_14": {
          "confirmed": 72
        },
        "delta7": {
          "confirmed": 76,
          "deceased": 1,
          "recovered": 78,
          "vaccinated1": 28276,
          "vaccinated2": 25051
        },
        "meta": {
          "population": 1136604,
          "tested": {
            "date": "2020-09-15"
          }
        },
        "total": {
          "confirmed": 27920,
          "deceased": 316,
          "recovered": 27510,
          "tested": 46648,
          "vaccinated1": 677675,
          "vaccinated2": 272499
        }
      },
      "Jajpur": {
        "delta": {
          "confirmed": 9,
          "recovered": 8,
          "vaccinated1": 2,
          "vaccinated2": 9
        },
        "delta21_14": {
          "confirmed": 76
        },
        "delta7": {
          "confirmed": 75,
          "recovered": 73,
          "vaccinated1": 30726,
          "vaccinated2": 37471
        },
        "meta": {
          "population": 1826275,
          "tested": {
            "date": "2020-08-23"
          }
        },
        "total": {
          "confirmed": 43735,
          "deceased": 172,
          "recovered": 43461,
          "tested": 53956,
          "vaccinated1": 1087735,
          "vaccinated2": 383313
        }
      },
      "Jharsuguda": {
        "delta": {
          "confirmed": 3
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 13,
          "recovered": 10,
          "vaccinated1": 7187,
          "vaccinated2": 14725
        },
        "meta": {
          "population": 579499,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 23863,
          "deceased": 176,
          "recovered": 23673,
          "tested": 1663,
          "vaccinated1": 399523,
          "vaccinated2": 189682
        }
      },
      "Kalahandi": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 1476,
          "vaccinated2": 537
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 15,
          "recovered": 1,
          "vaccinated1": 38214,
          "vaccinated2": 26926
        },
        "meta": {
          "population": 1573054,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 24314,
          "deceased": 210,
          "recovered": 24082,
          "tested": 1458,
          "vaccinated1": 921185,
          "vaccinated2": 304778
        }
      },
      "Kandhamal": {
        "delta": {
          "vaccinated1": 847,
          "vaccinated2": 529
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 5,
          "vaccinated1": 12881,
          "vaccinated2": 12319
        },
        "meta": {
          "population": 731952,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 11537,
          "deceased": 83,
          "recovered": 11453,
          "tested": 1516,
          "vaccinated1": 384009,
          "vaccinated2": 150737
        }
      },
      "Kendrapara": {
        "delta": {
          "confirmed": 8,
          "recovered": 8,
          "vaccinated1": 1452,
          "vaccinated2": 1179
        },
        "delta21_14": {
          "confirmed": 88
        },
        "delta7": {
          "confirmed": 62,
          "deceased": 1,
          "recovered": 52,
          "vaccinated1": 28635,
          "vaccinated2": 34297
        },
        "meta": {
          "population": 1439891,
          "tested": {
            "date": "2020-10-19"
          }
        },
        "total": {
          "confirmed": 24860,
          "deceased": 252,
          "recovered": 24545,
          "tested": 382732,
          "vaccinated1": 916169,
          "vaccinated2": 347854
        }
      },
      "Kendujhar": {
        "delta": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 483,
          "vaccinated2": 613
        },
        "delta21_14": {
          "confirmed": 20
        },
        "delta7": {
          "confirmed": 4,
          "deceased": 2,
          "recovered": 3,
          "vaccinated1": 25529,
          "vaccinated2": 46488
        },
        "meta": {
          "population": 1802777,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 20980,
          "deceased": 175,
          "recovered": 20798,
          "tested": 474504,
          "vaccinated1": 1087285,
          "vaccinated2": 376311
        }
      },
      "Khordha": {
        "delta": {
          "confirmed": 250,
          "deceased": 2,
          "recovered": 243,
          "vaccinated1": 568,
          "vaccinated2": 1482
        },
        "delta21_14": {
          "confirmed": 1704
        },
        "delta7": {
          "confirmed": 1492,
          "deceased": 8,
          "recovered": 1654,
          "vaccinated1": 34733,
          "vaccinated2": 49859
        },
        "meta": {
          "population": 2246341
        },
        "total": {
          "confirmed": 175335,
          "deceased": 1552,
          "recovered": 171938,
          "vaccinated1": 2063646,
          "vaccinated2": 1502538
        }
      },
      "Koraput": {
        "delta": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 935,
          "vaccinated2": 2024
        },
        "delta21_14": {
          "confirmed": 23
        },
        "delta7": {
          "confirmed": 11,
          "recovered": 20,
          "vaccinated1": 13011,
          "vaccinated2": 35701
        },
        "meta": {
          "population": 1376934,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 19137,
          "deceased": 78,
          "recovered": 19044,
          "tested": 1401,
          "vaccinated1": 860773,
          "vaccinated2": 399063
        }
      },
      "Malkangiri": {
        "delta": {
          "recovered": 3,
          "vaccinated1": 2497,
          "vaccinated2": 2000
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 4,
          "vaccinated1": 13449,
          "vaccinated2": 16141
        },
        "meta": {
          "population": 612727,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 11667,
          "deceased": 49,
          "recovered": 11613,
          "tested": 1841,
          "vaccinated1": 391790,
          "vaccinated2": 137925
        }
      },
      "Mayurbhanj": {
        "delta": {
          "confirmed": 19,
          "deceased": 1,
          "recovered": 8,
          "vaccinated1": 2985,
          "vaccinated2": 654
        },
        "delta21_14": {
          "confirmed": 129
        },
        "delta7": {
          "confirmed": 126,
          "deceased": 5,
          "recovered": 93,
          "vaccinated1": 86170,
          "vaccinated2": 36315
        },
        "meta": {
          "population": 2513895,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 40844,
          "deceased": 286,
          "recovered": 40416,
          "tested": 3307,
          "vaccinated1": 1222153,
          "vaccinated2": 413698
        }
      },
      "Nabarangapur": {
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 13213,
          "vaccinated2": 18025
        },
        "meta": {
          "population": 1218762,
          "tested": {
            "date": "2021-01-25"
          }
        },
        "total": {
          "confirmed": 23549,
          "deceased": 86,
          "recovered": 23461,
          "tested": 162154,
          "vaccinated1": 675601,
          "vaccinated2": 188457
        }
      },
      "Nayagarh": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 29,
          "vaccinated2": 117
        },
        "delta21_14": {
          "confirmed": 33
        },
        "delta7": {
          "confirmed": 28,
          "deceased": 1,
          "recovered": 24,
          "vaccinated1": 7145,
          "vaccinated2": 22575
        },
        "meta": {
          "population": 962215,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 23505,
          "deceased": 212,
          "recovered": 23261,
          "tested": 1104,
          "vaccinated1": 593612,
          "vaccinated2": 222606
        }
      },
      "Nuapada": {
        "delta": {
          "confirmed": 1,
          "recovered": 3,
          "vaccinated1": 6,
          "vaccinated2": 58
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 36,
          "recovered": 5,
          "vaccinated1": 3391,
          "vaccinated2": 14721
        },
        "meta": {
          "population": 606490,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 22924,
          "deceased": 84,
          "recovered": 22803,
          "tested": 310,
          "vaccinated1": 402248,
          "vaccinated2": 129685
        }
      },
      "Puri": {
        "delta": {
          "confirmed": 15,
          "deceased": 1,
          "recovered": 7,
          "vaccinated1": 2991,
          "vaccinated2": 6548
        },
        "delta21_14": {
          "confirmed": 91
        },
        "delta7": {
          "confirmed": 68,
          "deceased": 1,
          "recovered": 69,
          "vaccinated1": 25187,
          "vaccinated2": 40854
        },
        "meta": {
          "population": 1697983,
          "tested": {
            "date": "2020-12-01"
          }
        },
        "total": {
          "confirmed": 45431,
          "deceased": 459,
          "recovered": 44903,
          "tested": 173340,
          "vaccinated1": 1078666,
          "vaccinated2": 523160
        }
      },
      "Rayagada": {
        "delta": {
          "confirmed": 6,
          "recovered": 3,
          "vaccinated1": 537,
          "vaccinated2": 2019
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 16,
          "vaccinated1": 5781,
          "vaccinated2": 16558
        },
        "meta": {
          "population": 961959,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 20224,
          "deceased": 167,
          "recovered": 19981,
          "tested": 578,
          "vaccinated1": 549767,
          "vaccinated2": 184420
        }
      },
      "Sambalpur": {
        "delta": {
          "confirmed": 13,
          "recovered": 24,
          "vaccinated1": 574,
          "vaccinated2": 1479
        },
        "delta21_14": {
          "confirmed": 62
        },
        "delta7": {
          "confirmed": 88,
          "recovered": 113,
          "vaccinated1": 8960,
          "vaccinated2": 31518
        },
        "meta": {
          "population": 1044410,
          "tested": {
            "date": "2020-05-17"
          }
        },
        "total": {
          "confirmed": 31651,
          "deceased": 240,
          "recovered": 31315,
          "tested": 2007,
          "vaccinated1": 768989,
          "vaccinated2": 418110
        }
      },
      "State Pool": {
        "delta": {
          "confirmed": 53,
          "recovered": 57
        },
        "delta21_14": {
          "confirmed": 407
        },
        "delta7": {
          "confirmed": 338,
          "recovered": 401
        },
        "total": {
          "confirmed": 32048,
          "recovered": 31587
        }
      },
      "Subarnapur": {
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 5,
          "recovered": 3,
          "vaccinated1": 8102,
          "vaccinated2": 31803
        },
        "meta": {
          "population": 652107
        },
        "total": {
          "confirmed": 13187,
          "deceased": 61,
          "recovered": 13115,
          "vaccinated1": 418336,
          "vaccinated2": 192102
        }
      },
      "Sundargarh": {
        "delta": {
          "confirmed": 13,
          "recovered": 8,
          "vaccinated1": 824,
          "vaccinated2": 340
        },
        "delta21_14": {
          "confirmed": 58
        },
        "delta7": {
          "confirmed": 59,
          "recovered": 71,
          "vaccinated1": 19935,
          "vaccinated2": 22587
        },
        "meta": {
          "population": 2080664
        },
        "total": {
          "confirmed": 61841,
          "deceased": 594,
          "recovered": 61167,
          "vaccinated1": 1122762,
          "vaccinated2": 490428
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[July 12th] :20 non-covid deaths reported in state dashboard are included in the deceased count",
      "population": 43671000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11880"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 1041457,
      "deceased": 8386,
      "recovered": 1029147,
      "tested": 21994343,
      "vaccinated1": 25736641,
      "vaccinated2": 11560912
    }
  },
  "PB": {
    "delta": {
      "confirmed": 26,
      "deceased": 1,
      "recovered": 25,
      "tested": 34152,
      "vaccinated1": 3321,
      "vaccinated2": 4418
    },
    "delta21_14": {
      "confirmed": 159
    },
    "delta7": {
      "confirmed": 192,
      "deceased": 8,
      "recovered": 162,
      "tested": 221114,
      "vaccinated1": 200182,
      "vaccinated2": 223256
    },
    "districts": {
      "Amritsar": {
        "delta": {
          "confirmed": 4,
          "recovered": 1,
          "vaccinated1": 232,
          "vaccinated2": 251
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 23,
          "deceased": 2,
          "recovered": 9,
          "vaccinated1": 23376,
          "vaccinated2": 18084
        },
        "meta": {
          "population": 2490891,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 47379,
          "deceased": 1598,
          "recovered": 45757,
          "tested": 89227,
          "vaccinated1": 1263073,
          "vaccinated2": 446487
        }
      },
      "Barnala": {
        "delta": {
          "vaccinated1": 629,
          "vaccinated2": 291
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 9552,
          "vaccinated2": 5253
        },
        "meta": {
          "population": 596294,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 5950,
          "deceased": 244,
          "recovered": 5696,
          "tested": 63447,
          "vaccinated1": 328464,
          "vaccinated2": 104197
        }
      },
      "Bathinda": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 110,
          "vaccinated2": 182
        },
        "delta21_14": {
          "confirmed": 10
        },
        "delta7": {
          "confirmed": 15,
          "recovered": 8,
          "vaccinated1": 8246,
          "vaccinated2": 6940
        },
        "meta": {
          "population": 1388859,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 41728,
          "deceased": 1042,
          "recovered": 40668,
          "tested": 118489,
          "vaccinated1": 623604,
          "vaccinated2": 202311
        }
      },
      "Faridkot": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 154,
          "vaccinated2": 241
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 7,
          "recovered": 7,
          "vaccinated1": 3048,
          "vaccinated2": 4201
        },
        "meta": {
          "population": 618008,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 13927,
          "deceased": 315,
          "recovered": 13602,
          "tested": 23635,
          "vaccinated1": 330654,
          "vaccinated2": 128653
        }
      },
      "Fatehgarh Sahib": {
        "delta": {
          "vaccinated1": 9,
          "vaccinated2": 17
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "deceased": 1,
          "recovered": 1,
          "vaccinated1": 2513,
          "vaccinated2": 4804
        },
        "meta": {
          "population": 599814,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 8876,
          "deceased": 335,
          "recovered": 8538,
          "tested": 68436,
          "vaccinated1": 354921,
          "vaccinated2": 135247
        }
      },
      "Fazilka": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 249,
          "vaccinated2": 177
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 8,
          "recovered": 4,
          "vaccinated1": 8408,
          "vaccinated2": 5707
        },
        "meta": {
          "population": 1180483,
          "tested": {
            "date": "2020-12-10"
          }
        },
        "total": {
          "confirmed": 20271,
          "deceased": 528,
          "recovered": 19729,
          "tested": 63589,
          "vaccinated1": 490080,
          "vaccinated2": 131519
        }
      },
      "Ferozepur": {
        "delta": {
          "confirmed": 4,
          "recovered": 3,
          "vaccinated1": 130,
          "vaccinated2": 73
        },
        "delta21_14": {
          "confirmed": 6
        },
        "delta7": {
          "confirmed": 13,
          "recovered": 9,
          "vaccinated1": 4483,
          "vaccinated2": 4723
        },
        "meta": {
          "population": 2026831,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 14347,
          "deceased": 504,
          "recovered": 13832,
          "tested": 74880,
          "vaccinated1": 476343,
          "vaccinated2": 128043
        }
      },
      "Gurdaspur": {
        "delta": {
          "vaccinated1": 459,
          "vaccinated2": 351
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 3,
          "deceased": 1,
          "recovered": 3,
          "vaccinated1": 18212,
          "vaccinated2": 26825
        },
        "meta": {
          "population": 2299026,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 22381,
          "deceased": 801,
          "recovered": 21576,
          "tested": 249039,
          "vaccinated1": 862133,
          "vaccinated2": 415351
        }
      },
      "Hoshiarpur": {
        "delta": {
          "confirmed": 2,
          "deceased": 1,
          "recovered": 2,
          "vaccinated1": 87,
          "vaccinated2": 211
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 10,
          "deceased": 2,
          "recovered": 12,
          "vaccinated1": 6567,
          "vaccinated2": 17487
        },
        "meta": {
          "population": 1582793,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 30822,
          "deceased": 986,
          "recovered": 29828,
          "tested": 221261,
          "vaccinated1": 1000636,
          "vaccinated2": 574716
        }
      },
      "Jalandhar": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 167,
          "vaccinated2": 507
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 20,
          "deceased": 1,
          "recovered": 12,
          "vaccinated1": 13877,
          "vaccinated2": 22309
        },
        "meta": {
          "population": 2181753,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 63396,
          "deceased": 1496,
          "recovered": 61864,
          "tested": 443735,
          "vaccinated1": 1433553,
          "vaccinated2": 681370
        }
      },
      "Kapurthala": {
        "delta": {
          "vaccinated1": 93,
          "vaccinated2": 174
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 7,
          "vaccinated1": 5387,
          "vaccinated2": 6146
        },
        "meta": {
          "population": 817668,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 17852,
          "deceased": 556,
          "recovered": 17294,
          "tested": 38658,
          "vaccinated1": 465285,
          "vaccinated2": 187476
        }
      },
      "Ludhiana": {
        "delta": {
          "recovered": 4,
          "vaccinated1": 327,
          "vaccinated2": 276
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 16,
          "deceased": 1,
          "recovered": 24,
          "vaccinated1": 41184,
          "vaccinated2": 30055
        },
        "meta": {
          "population": 3487882,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 87608,
          "deceased": 2106,
          "recovered": 85484,
          "tested": 514691,
          "vaccinated1": 2473646,
          "vaccinated2": 943401
        }
      },
      "Mansa": {
        "delta": {
          "vaccinated1": 128,
          "vaccinated2": 166
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 5340,
          "vaccinated2": 4111
        },
        "meta": {
          "population": 768808,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 15606,
          "deceased": 380,
          "recovered": 15226,
          "tested": 26878,
          "vaccinated1": 372366,
          "vaccinated2": 89830
        }
      },
      "Moga": {
        "delta": {
          "vaccinated1": 9,
          "vaccinated2": 7
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 8,
          "vaccinated1": 5076,
          "vaccinated2": 6757
        },
        "meta": {
          "population": 992289,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 8675,
          "deceased": 233,
          "recovered": 8440,
          "tested": 77307,
          "vaccinated1": 541556,
          "vaccinated2": 178908
        }
      },
      "Pathankot": {
        "delta": {
          "confirmed": 6,
          "recovered": 1,
          "vaccinated1": 52,
          "vaccinated2": 278
        },
        "delta21_14": {
          "confirmed": 14
        },
        "delta7": {
          "confirmed": 20,
          "recovered": 7,
          "vaccinated1": 1762,
          "vaccinated2": 6090
        },
        "meta": {
          "population": 626154,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 18814,
          "deceased": 419,
          "recovered": 18373,
          "tested": 29112,
          "vaccinated1": 424889,
          "vaccinated2": 196822
        }
      },
      "Patiala": {
        "delta": {
          "recovered": 2,
          "vaccinated1": 239,
          "vaccinated2": 526
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 15,
          "vaccinated1": 7659,
          "vaccinated2": 10721
        },
        "meta": {
          "population": 2892282,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 48927,
          "deceased": 1358,
          "recovered": 47561,
          "tested": 273344,
          "vaccinated1": 1051467,
          "vaccinated2": 396473
        }
      },
      "Rupnagar": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 88,
          "vaccinated2": 202
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 20,
          "recovered": 7,
          "vaccinated1": 1965,
          "vaccinated2": 5708
        },
        "meta": {
          "population": 683349,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 12963,
          "deceased": 423,
          "recovered": 12517,
          "tested": 97745,
          "vaccinated1": 384637,
          "vaccinated2": 182919
        }
      },
      "S.A.S. Nagar": {
        "delta": {
          "confirmed": 3,
          "recovered": 5,
          "vaccinated1": 95,
          "vaccinated2": 425
        },
        "delta21_14": {
          "confirmed": 27
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 21,
          "vaccinated1": 4914,
          "vaccinated2": 9234
        },
        "meta": {
          "population": 986147,
          "tested": {
            "date": "2020-09-02"
          }
        },
        "total": {
          "confirmed": 68821,
          "deceased": 1068,
          "recovered": 67726,
          "tested": 41532,
          "vaccinated1": 872096,
          "vaccinated2": 402212
        }
      },
      "Sangrur": {
        "delta": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 219,
          "vaccinated2": 157
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 3,
          "vaccinated1": 13224,
          "vaccinated2": 9058
        },
        "meta": {
          "population": 1654408,
          "tested": {
            "date": "2020-12-19"
          }
        },
        "total": {
          "confirmed": 15762,
          "deceased": 875,
          "recovered": 14884,
          "tested": 166332,
          "vaccinated1": 730511,
          "vaccinated2": 218820
        }
      },
      "Shahid Bhagat Singh Nagar": {
        "delta": {
          "vaccinated1": 54,
          "vaccinated2": 78
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 2473,
          "vaccinated2": 4917
        },
        "meta": {
          "population": 614362,
          "tested": {
            "date": "2020-12-20"
          }
        },
        "total": {
          "confirmed": 11469,
          "deceased": 388,
          "recovered": 11080,
          "tested": 77715,
          "vaccinated1": 392113,
          "vaccinated2": 172294
        }
      },
      "Sri Muktsar Sahib": {
        "delta": {
          "vaccinated1": 91,
          "vaccinated2": 149
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 3942,
          "vaccinated2": 5830
        },
        "meta": {
          "population": 902702,
          "tested": {
            "date": "2020-12-12"
          }
        },
        "total": {
          "confirmed": 18784,
          "deceased": 524,
          "recovered": 18257,
          "tested": 67979,
          "vaccinated1": 473193,
          "vaccinated2": 142901
        }
      },
      "Tarn Taran": {
        "delta": {
          "vaccinated1": 251,
          "vaccinated2": 127
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 8846,
          "vaccinated2": 8145
        },
        "meta": {
          "population": 1120070,
          "tested": {
            "date": "2020-12-18"
          }
        },
        "total": {
          "confirmed": 8043,
          "deceased": 380,
          "recovered": 7659,
          "tested": 111446,
          "vaccinated1": 597303,
          "vaccinated2": 178839
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 29859000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11874"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 602401,
      "deceased": 16559,
      "recovered": 585591,
      "tested": 15429415,
      "vaccinated1": 15942714,
      "vaccinated2": 6238973
    }
  },
  "PY": {
    "delta": {
      "confirmed": 38,
      "recovered": 45,
      "tested": 2662,
      "vaccinated1": 171,
      "vaccinated2": 532
    },
    "delta21_14": {
      "confirmed": 343
    },
    "delta7": {
      "confirmed": 278,
      "recovered": 315,
      "tested": 21095,
      "vaccinated1": 8324,
      "vaccinated2": 20073
    },
    "districts": {
      "Karaikal": {
        "delta": {
          "confirmed": 6,
          "recovered": 9,
          "vaccinated1": 2,
          "vaccinated2": 22
        },
        "delta21_14": {
          "confirmed": 69
        },
        "delta7": {
          "confirmed": 53,
          "recovered": 63,
          "vaccinated1": 763,
          "vaccinated2": 2980
        },
        "meta": {
          "notes": "2 case of TN has been transferred,so has been reduced from the total count.",
          "population": 200222,
          "tested": {
            "date": "2021-01-27"
          }
        },
        "total": {
          "confirmed": 16488,
          "deceased": 250,
          "recovered": 16150,
          "tested": 73142,
          "vaccinated1": 111152,
          "vaccinated2": 57491
        }
      },
      "Mahe": {
        "delta": {
          "confirmed": 10,
          "recovered": 10
        },
        "delta21_14": {
          "confirmed": 44
        },
        "delta7": {
          "confirmed": 58,
          "recovered": 46,
          "vaccinated1": 109,
          "vaccinated2": 1003
        },
        "meta": {
          "notes": "1 case of KL have been transferred,so have been reduced from the total count",
          "population": 41816,
          "tested": {
            "date": "2021-01-27"
          }
        },
        "total": {
          "confirmed": 5867,
          "deceased": 47,
          "recovered": 5744,
          "tested": 42415,
          "vaccinated1": 34018,
          "vaccinated2": 25943
        }
      },
      "Puducherry": {
        "delta": {
          "confirmed": 22,
          "recovered": 25,
          "vaccinated1": 159,
          "vaccinated2": 477
        },
        "delta21_14": {
          "confirmed": 218
        },
        "delta7": {
          "confirmed": 163,
          "recovered": 202,
          "vaccinated1": 7191,
          "vaccinated2": 15005
        },
        "meta": {
          "notes": "209 cases(204 of TN, 1 of AP and 4 other) have been transferred,so have been reduced from the total count.[July 18]4 cases have transferred to TN and have been reduced from recovered cases.",
          "population": 950289,
          "tested": {
            "date": "2021-01-27"
          }
        },
        "total": {
          "confirmed": 98885,
          "deceased": 1453,
          "recovered": 97171,
          "tested": 425639,
          "vaccinated1": 558708,
          "vaccinated2": 305464
        }
      },
      "Yanam": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 8,
          "vaccinated2": 31
        },
        "delta21_14": {
          "confirmed": 12
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 4,
          "vaccinated1": 259,
          "vaccinated2": 1082
        },
        "meta": {
          "notes": "2 cases of AP have been transferred,so have been reduced from the total count",
          "population": 55626,
          "tested": {
            "date": "2021-01-27"
          }
        },
        "total": {
          "confirmed": 6773,
          "deceased": 107,
          "recovered": 6661,
          "tested": 26727,
          "vaccinated1": 30079,
          "vaccinated2": 15489
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 1504000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11866"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 128013,
      "deceased": 1857,
      "recovered": 125726,
      "tested": 1919060,
      "vaccinated1": 733922,
      "vaccinated2": 404355
    }
  },
  "RJ": {
    "delta": {
      "confirmed": 2,
      "recovered": 2,
      "tested": 13454,
      "vaccinated1": 9399,
      "vaccinated2": 29672
    },
    "delta21_14": {
      "confirmed": 31
    },
    "delta7": {
      "confirmed": 27,
      "recovered": 26,
      "tested": 95132,
      "vaccinated1": 271500,
      "vaccinated2": 864947
    },
    "districts": {
      "Ajmer": {
        "delta": {
          "vaccinated1": 110,
          "vaccinated2": 1101
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 8,
          "vaccinated1": 9133,
          "vaccinated2": 56199
        },
        "meta": {
          "population": 2584913,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 37769,
          "deceased": 410,
          "recovered": 37352,
          "tested": 261215,
          "vaccinated1": 1752308,
          "vaccinated2": 1042482
        }
      },
      "Alwar": {
        "delta": {
          "vaccinated1": 376,
          "vaccinated2": 1002
        },
        "delta7": {
          "vaccinated1": 21681,
          "vaccinated2": 29417
        },
        "meta": {
          "population": 3671999,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 59694,
          "deceased": 307,
          "recovered": 59387,
          "tested": 291879,
          "vaccinated1": 2237787,
          "vaccinated2": 1029095
        }
      },
      "BSF Camp": {
        "total": {
          "confirmed": 85,
          "recovered": 85
        }
      },
      "Banswara": {
        "delta": {
          "vaccinated1": 986,
          "vaccinated2": 1105
        },
        "delta7": {
          "vaccinated1": 10612,
          "vaccinated2": 22206
        },
        "meta": {
          "population": 1798194,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 10005,
          "deceased": 104,
          "recovered": 9901,
          "tested": 48781,
          "vaccinated1": 1024293,
          "vaccinated2": 525793
        }
      },
      "Baran": {
        "delta": {
          "vaccinated1": 44,
          "vaccinated2": 212
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 6599,
          "vaccinated2": 15157
        },
        "meta": {
          "population": 1223921,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 11996,
          "deceased": 61,
          "recovered": 11934,
          "tested": 46168,
          "vaccinated1": 763006,
          "vaccinated2": 297741
        }
      },
      "Barmer": {
        "delta": {
          "vaccinated1": 64,
          "vaccinated2": 247
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 5670,
          "vaccinated2": 16673
        },
        "meta": {
          "population": 2604453,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 15563,
          "deceased": 185,
          "recovered": 15377,
          "tested": 113868,
          "vaccinated1": 1455732,
          "vaccinated2": 621465
        }
      },
      "Bharatpur": {
        "delta": {
          "vaccinated1": 59,
          "vaccinated2": 176
        },
        "delta7": {
          "vaccinated1": 10069,
          "vaccinated2": 22595
        },
        "meta": {
          "population": 2549121,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 19601,
          "deceased": 260,
          "recovered": 19341,
          "tested": 201441,
          "vaccinated1": 1351114,
          "vaccinated2": 590401
        }
      },
      "Bhilwara": {
        "delta": {
          "vaccinated1": 161,
          "vaccinated2": 1752
        },
        "delta7": {
          "vaccinated1": 5405,
          "vaccinated2": 26146
        },
        "meta": {
          "population": 2410459,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 29781,
          "deceased": 156,
          "recovered": 29625,
          "tested": 148764,
          "vaccinated1": 1525323,
          "vaccinated2": 723691
        }
      },
      "Bikaner": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 76,
          "vaccinated2": 275
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 6565,
          "vaccinated2": 17712
        },
        "meta": {
          "population": 2367745,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 40339,
          "deceased": 545,
          "recovered": 39792,
          "tested": 278302,
          "vaccinated1": 1461174,
          "vaccinated2": 714590
        }
      },
      "Bundi": {
        "delta": {
          "vaccinated1": 424,
          "vaccinated2": 1216
        },
        "delta7": {
          "vaccinated1": 12488,
          "vaccinated2": 24243
        },
        "meta": {
          "population": 1113725,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 7967,
          "deceased": 48,
          "recovered": 7919,
          "tested": 58167,
          "vaccinated1": 709316,
          "vaccinated2": 362835
        }
      },
      "Chittorgarh": {
        "delta": {
          "vaccinated1": 21,
          "vaccinated2": 43
        },
        "delta7": {
          "vaccinated1": 6118,
          "vaccinated2": 29167
        },
        "meta": {
          "population": 1544392,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 19809,
          "deceased": 139,
          "recovered": 19670,
          "tested": 116002,
          "vaccinated1": 978713,
          "vaccinated2": 482350
        }
      },
      "Churu": {
        "delta": {
          "vaccinated1": 5,
          "vaccinated2": 32
        },
        "delta7": {
          "vaccinated1": 5483,
          "vaccinated2": 26038
        },
        "meta": {
          "population": 2041172,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 16720,
          "deceased": 107,
          "recovered": 16613,
          "tested": 131700,
          "vaccinated1": 1301558,
          "vaccinated2": 582443
        }
      },
      "Dausa": {
        "delta": {
          "vaccinated1": 182,
          "vaccinated2": 1072
        },
        "delta7": {
          "vaccinated1": 5627,
          "vaccinated2": 29672
        },
        "meta": {
          "population": 1637226,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 13351,
          "deceased": 62,
          "recovered": 13289,
          "tested": 61680,
          "vaccinated1": 941513,
          "vaccinated2": 395584
        }
      },
      "Dholpur": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 45,
          "vaccinated2": 83
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 4270,
          "vaccinated2": 11868
        },
        "meta": {
          "population": 1207293,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 11010,
          "deceased": 48,
          "recovered": 10962,
          "tested": 121308,
          "vaccinated1": 660103,
          "vaccinated2": 279501
        }
      },
      "Dungarpur": {
        "delta": {
          "vaccinated1": 90,
          "vaccinated2": 246
        },
        "delta7": {
          "vaccinated1": 6673,
          "vaccinated2": 19241
        },
        "meta": {
          "population": 1388906,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 18407,
          "deceased": 131,
          "recovered": 18276,
          "tested": 121917,
          "vaccinated1": 737200,
          "vaccinated2": 349762
        }
      },
      "Evacuees": {
        "total": {
          "confirmed": 61,
          "recovered": 61
        }
      },
      "Ganganagar": {
        "delta": {
          "vaccinated1": 749,
          "vaccinated2": 1957
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 11153,
          "vaccinated2": 29478
        },
        "meta": {
          "population": 1969520,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 19354,
          "deceased": 150,
          "recovered": 19203,
          "tested": 80706,
          "vaccinated1": 1278952,
          "vaccinated2": 525137
        }
      },
      "Hanumangarh": {
        "delta": {
          "vaccinated1": 72,
          "vaccinated2": 478
        },
        "delta7": {
          "vaccinated1": 5057,
          "vaccinated2": 30733
        },
        "meta": {
          "population": 1779650,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 16053,
          "deceased": 111,
          "recovered": 15942,
          "tested": 82542,
          "vaccinated1": 1230511,
          "vaccinated2": 588688
        }
      },
      "Italians": {
        "total": {
          "confirmed": 2,
          "recovered": 2
        }
      },
      "Jaipur": {
        "delta": {
          "confirmed": 2,
          "vaccinated1": 570,
          "vaccinated2": 1871
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 16,
          "recovered": 9,
          "vaccinated1": 24518,
          "vaccinated2": 63582
        },
        "meta": {
          "population": 6663971,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 187804,
          "deceased": 1970,
          "recovered": 185816,
          "tested": 968783,
          "vaccinated1": 4582410,
          "vaccinated2": 2189042
        }
      },
      "Jaisalmer": {
        "delta": {
          "vaccinated1": 199,
          "vaccinated2": 474
        },
        "delta7": {
          "vaccinated1": 2951,
          "vaccinated2": 9700
        },
        "meta": {
          "population": 672008,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 13639,
          "deceased": 66,
          "recovered": 13573,
          "tested": 80082,
          "vaccinated1": 416014,
          "vaccinated2": 194163
        }
      },
      "Jalore": {
        "delta": {
          "vaccinated1": 309,
          "vaccinated2": 738
        },
        "delta7": {
          "vaccinated1": 9304,
          "vaccinated2": 26896
        },
        "meta": {
          "population": 1830151,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 10067,
          "deceased": 72,
          "recovered": 9995,
          "tested": 184172,
          "vaccinated1": 987519,
          "vaccinated2": 393953
        }
      },
      "Jhalawar": {
        "delta": {
          "vaccinated1": 359,
          "vaccinated2": 2133
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 2527,
          "vaccinated2": 16443
        },
        "meta": {
          "population": 1411327,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 13612,
          "deceased": 187,
          "recovered": 13425,
          "tested": 97163,
          "vaccinated1": 922646,
          "vaccinated2": 363082
        }
      },
      "Jhunjhunu": {
        "delta": {
          "vaccinated1": 267,
          "vaccinated2": 1682
        },
        "delta7": {
          "vaccinated1": 7946,
          "vaccinated2": 42099
        },
        "meta": {
          "population": 2139658,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 14811,
          "deceased": 158,
          "recovered": 14653,
          "tested": 123433,
          "vaccinated1": 1449967,
          "vaccinated2": 787196
        }
      },
      "Jodhpur": {
        "delta": {
          "vaccinated1": 26,
          "vaccinated2": 93
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 7707,
          "vaccinated2": 22507
        },
        "meta": {
          "population": 3685681,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 112412,
          "deceased": 1103,
          "recovered": 111308,
          "tested": 600959,
          "vaccinated1": 2263325,
          "vaccinated2": 1036743
        }
      },
      "Karauli": {
        "delta": {
          "vaccinated1": 1578,
          "vaccinated2": 993
        },
        "delta7": {
          "vaccinated1": 19063,
          "vaccinated2": 20813
        },
        "meta": {
          "population": 1458459,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 7156,
          "deceased": 70,
          "recovered": 7086,
          "tested": 64481,
          "vaccinated1": 813922,
          "vaccinated2": 395700
        }
      },
      "Kota": {
        "delta": {
          "vaccinated1": 170,
          "vaccinated2": 2306
        },
        "delta7": {
          "vaccinated1": 2612,
          "vaccinated2": 26626
        },
        "meta": {
          "population": 1950491,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 57053,
          "deceased": 449,
          "recovered": 56603,
          "tested": 355509,
          "vaccinated1": 1269245,
          "vaccinated2": 655588
        }
      },
      "Nagaur": {
        "delta": {
          "vaccinated1": 636,
          "vaccinated2": 3335
        },
        "delta7": {
          "vaccinated1": 6806,
          "vaccinated2": 36157
        },
        "meta": {
          "population": 3309234,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 17737,
          "deceased": 177,
          "recovered": 17560,
          "tested": 229822,
          "vaccinated1": 2077555,
          "vaccinated2": 1016874
        }
      },
      "Other State": {
        "total": {
          "confirmed": 189,
          "deceased": 39,
          "recovered": 150
        }
      },
      "Pali": {
        "delta": {
          "vaccinated1": 704,
          "vaccinated2": 3089
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 7082,
          "vaccinated2": 26853
        },
        "meta": {
          "population": 2038533,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 27324,
          "deceased": 287,
          "recovered": 27037,
          "tested": 179463,
          "vaccinated1": 1200554,
          "vaccinated2": 513058
        }
      },
      "Pratapgarh": {
        "delta": {
          "vaccinated1": 39,
          "vaccinated2": 298
        },
        "delta7": {
          "vaccinated1": 1130,
          "vaccinated2": 25717
        },
        "meta": {
          "population": 868231,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 7143,
          "deceased": 63,
          "recovered": 7080,
          "tested": 52208,
          "vaccinated1": 655140,
          "vaccinated2": 345189
        }
      },
      "Rajsamand": {
        "delta": {
          "vaccinated1": 345,
          "vaccinated2": 988
        },
        "delta7": {
          "vaccinated1": 4092,
          "vaccinated2": 14945
        },
        "meta": {
          "population": 1158283,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 17044,
          "deceased": 169,
          "recovered": 16875,
          "tested": 91975,
          "vaccinated1": 691497,
          "vaccinated2": 299553
        }
      },
      "Sawai Madhopur": {
        "delta": {
          "vaccinated1": 268,
          "vaccinated2": 844
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 8475,
          "vaccinated2": 18843
        },
        "meta": {
          "population": 1338114,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 10618,
          "deceased": 61,
          "recovered": 10557,
          "tested": 84683,
          "vaccinated1": 756544,
          "vaccinated2": 347992
        }
      },
      "Sikar": {
        "delta": {
          "vaccinated1": 39,
          "vaccinated2": 130
        },
        "delta7": {
          "vaccinated1": 4520,
          "vaccinated2": 20308
        },
        "meta": {
          "population": 2677737,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 30618,
          "deceased": 335,
          "recovered": 30283,
          "tested": 165042,
          "vaccinated1": 1838263,
          "vaccinated2": 821713
        }
      },
      "Sirohi": {
        "delta": {
          "vaccinated1": 480,
          "vaccinated2": 589
        },
        "delta7": {
          "vaccinated1": 9007,
          "vaccinated2": 15482
        },
        "meta": {
          "population": 1037185,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 13732,
          "deceased": 79,
          "recovered": 13653,
          "tested": 84616,
          "vaccinated1": 610090,
          "vaccinated2": 348789
        }
      },
      "Tonk": {
        "delta": {
          "vaccinated1": 48,
          "vaccinated2": 268
        },
        "delta7": {
          "vaccinated1": 2623,
          "vaccinated2": 16223
        },
        "meta": {
          "population": 1421711,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 9498,
          "deceased": 92,
          "recovered": 9406,
          "tested": 74225,
          "vaccinated1": 884688,
          "vaccinated2": 419023
        }
      },
      "Udaipur": {
        "delta": {
          "vaccinated1": 1169,
          "vaccinated2": 2727
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "vaccinated1": 16803,
          "vaccinated2": 51655
        },
        "meta": {
          "population": 3067549,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 56405,
          "deceased": 753,
          "recovered": 55652,
          "tested": 251522,
          "vaccinated1": 1715072,
          "vaccinated2": 854773
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 77264000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11883"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 954429,
      "deceased": 8954,
      "recovered": 945443,
      "tested": 14807752,
      "vaccinated1": 42544909,
      "vaccinated2": 20097635
    }
  },
  "SK": {
    "delta": {
      "confirmed": 21,
      "deceased": 1,
      "recovered": 8,
      "tested": 389
    },
    "delta21_14": {
      "confirmed": 82
    },
    "delta7": {
      "confirmed": 79,
      "deceased": 2,
      "other": 6,
      "recovered": 76,
      "tested": 2847,
      "vaccinated1": 782,
      "vaccinated2": 14044
    },
    "districts": {
      "East Sikkim": {
        "delta7": {
          "vaccinated1": 528,
          "vaccinated2": 10519
        },
        "meta": {
          "population": 281293
        },
        "total": {
          "vaccinated1": 263526,
          "vaccinated2": 229361
        }
      },
      "North Sikkim": {
        "delta7": {
          "vaccinated1": 23,
          "vaccinated2": 447
        },
        "meta": {
          "population": 43354
        },
        "total": {
          "vaccinated1": 33137,
          "vaccinated2": 27820
        }
      },
      "South Sikkim": {
        "delta7": {
          "vaccinated1": 164,
          "vaccinated2": 2223
        },
        "meta": {
          "population": 146742
        },
        "total": {
          "vaccinated1": 121481,
          "vaccinated2": 105432
        }
      },
      "Unknown": {
        "delta": {
          "confirmed": 21,
          "deceased": 1,
          "recovered": 8
        },
        "delta21_14": {
          "confirmed": 82
        },
        "delta7": {
          "confirmed": 79,
          "deceased": 2,
          "other": 6,
          "recovered": 76
        },
        "total": {
          "confirmed": 31979,
          "deceased": 396,
          "other": 325,
          "recovered": 31063
        }
      },
      "West Sikkim": {
        "delta7": {
          "vaccinated1": 67,
          "vaccinated2": 855
        },
        "meta": {
          "population": 136299
        },
        "total": {
          "vaccinated1": 103619,
          "vaccinated2": 88896
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-10-31T20:49:45+05:30",
      "population": 664000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11867"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 31979,
      "deceased": 396,
      "other": 325,
      "recovered": 31063,
      "tested": 261343,
      "vaccinated1": 521763,
      "vaccinated2": 451509
    }
  },
  "TG": {
    "delta": {
      "confirmed": 121,
      "deceased": 1,
      "recovered": 183,
      "tested": 25021,
      "vaccinated1": 38781,
      "vaccinated2": 26738
    },
    "delta21_14": {
      "confirmed": 1068
    },
    "delta7": {
      "confirmed": 1189,
      "deceased": 9,
      "recovered": 1121,
      "tested": 261086,
      "vaccinated1": 1072389,
      "vaccinated2": 961422
    },
    "districts": {
      "Adilabad": {
        "delta": {
          "vaccinated1": 165,
          "vaccinated2": 138
        },
        "delta7": {
          "vaccinated1": 11894,
          "vaccinated2": 12694
        },
        "meta": {
          "population": 708952
        },
        "total": {
          "vaccinated1": 376263,
          "vaccinated2": 89337
        }
      },
      "Bhadradri Kothagudem": {
        "delta": {
          "vaccinated1": 1570,
          "vaccinated2": 1314
        },
        "delta7": {
          "vaccinated1": 30988,
          "vaccinated2": 31905
        },
        "meta": {
          "population": 1304811
        },
        "total": {
          "vaccinated1": 599183,
          "vaccinated2": 204318
        }
      },
      "Hyderabad": {
        "delta": {
          "vaccinated1": 3334,
          "vaccinated2": 5427
        },
        "delta7": {
          "vaccinated1": 48855,
          "vaccinated2": 123025
        },
        "meta": {
          "population": 3441992
        },
        "total": {
          "vaccinated1": 3150245,
          "vaccinated2": 1893217
        }
      },
      "Jagtial": {
        "delta7": {
          "vaccinated1": 50253,
          "vaccinated2": 17153
        },
        "meta": {
          "population": 983414
        },
        "total": {
          "vaccinated1": 580926,
          "vaccinated2": 190526
        }
      },
      "Jangaon": {
        "delta": {
          "vaccinated1": 2637,
          "vaccinated2": 363
        },
        "delta7": {
          "vaccinated1": 20821,
          "vaccinated2": 11508
        },
        "meta": {
          "population": 582457
        },
        "total": {
          "vaccinated1": 327527,
          "vaccinated2": 128207
        }
      },
      "Jayashankar Bhupalapally": {
        "delta": {
          "vaccinated1": 125,
          "vaccinated2": 262
        },
        "delta7": {
          "vaccinated1": 4191,
          "vaccinated2": 23712
        },
        "meta": {
          "population": 712257
        },
        "total": {
          "vaccinated1": 262313,
          "vaccinated2": 127108
        }
      },
      "Jogulamba Gadwal": {
        "delta": {
          "vaccinated1": 496,
          "vaccinated2": 253
        },
        "delta7": {
          "vaccinated1": 23908,
          "vaccinated2": 6281
        },
        "meta": {
          "population": 664971
        },
        "total": {
          "vaccinated1": 306919,
          "vaccinated2": 59886
        }
      },
      "Kamareddy": {
        "delta": {
          "vaccinated1": 320,
          "vaccinated2": 78
        },
        "delta7": {
          "vaccinated1": 14692,
          "vaccinated2": 16918
        },
        "meta": {
          "population": 972625
        },
        "total": {
          "vaccinated1": 557684,
          "vaccinated2": 183176
        }
      },
      "Karimnagar": {
        "delta": {
          "vaccinated1": 65,
          "vaccinated2": 486
        },
        "delta7": {
          "vaccinated1": 12731,
          "vaccinated2": 45384
        },
        "meta": {
          "population": 1016063
        },
        "total": {
          "vaccinated1": 657167,
          "vaccinated2": 384862
        }
      },
      "Khammam": {
        "delta": {
          "vaccinated1": 789,
          "vaccinated2": 1134
        },
        "delta7": {
          "vaccinated1": 41893,
          "vaccinated2": 68994
        },
        "meta": {
          "population": 1401639
        },
        "total": {
          "vaccinated1": 856707,
          "vaccinated2": 333812
        }
      },
      "Komaram Bheem": {
        "delta": {
          "vaccinated1": 569,
          "vaccinated2": 136
        },
        "delta7": {
          "vaccinated1": 17465,
          "vaccinated2": 4048
        },
        "meta": {
          "population": 515835
        },
        "total": {
          "vaccinated1": 275644,
          "vaccinated2": 51593
        }
      },
      "Mahabubabad": {
        "delta": {
          "vaccinated1": 3715,
          "vaccinated2": 1107
        },
        "delta7": {
          "vaccinated1": 36700,
          "vaccinated2": 27419
        },
        "meta": {
          "population": 1318110
        },
        "total": {
          "vaccinated1": 468199,
          "vaccinated2": 172007
        }
      },
      "Mahabubnagar": {
        "delta": {
          "vaccinated1": 609,
          "vaccinated2": 184
        },
        "delta7": {
          "vaccinated1": 32811,
          "vaccinated2": 19635
        },
        "total": {
          "vaccinated1": 482547,
          "vaccinated2": 150640
        }
      },
      "Mancherial": {
        "delta": {
          "vaccinated1": 65,
          "vaccinated2": 27
        },
        "delta7": {
          "vaccinated1": 22489,
          "vaccinated2": 15600
        },
        "meta": {
          "population": 807037
        },
        "total": {
          "vaccinated1": 480069,
          "vaccinated2": 170258
        }
      },
      "Medak": {
        "delta": {
          "vaccinated1": 704,
          "vaccinated2": 589
        },
        "delta7": {
          "vaccinated1": 34422,
          "vaccinated2": 25162
        },
        "meta": {
          "population": 767428
        },
        "total": {
          "vaccinated1": 458648,
          "vaccinated2": 140778
        }
      },
      "Medchal Malkajgiri": {
        "delta": {
          "vaccinated1": 5804,
          "vaccinated2": 8370
        },
        "delta7": {
          "vaccinated1": 54568,
          "vaccinated2": 93893
        },
        "meta": {
          "population": 2542203
        },
        "total": {
          "vaccinated1": 2149958,
          "vaccinated2": 1317832
        }
      },
      "Mulugu": {
        "delta": {
          "vaccinated1": 71,
          "vaccinated2": 85
        },
        "delta7": {
          "vaccinated1": 4190,
          "vaccinated2": 10660
        },
        "meta": {
          "population": 294671
        },
        "total": {
          "vaccinated1": 186104,
          "vaccinated2": 76648
        }
      },
      "Nagarkurnool": {
        "delta": {
          "vaccinated1": 730,
          "vaccinated2": 18
        },
        "delta7": {
          "vaccinated1": 30265,
          "vaccinated2": 5469
        },
        "meta": {
          "population": 893308
        },
        "total": {
          "vaccinated1": 464888,
          "vaccinated2": 106589
        }
      },
      "Nalgonda": {
        "delta": {
          "vaccinated1": 859,
          "vaccinated2": 448
        },
        "delta7": {
          "vaccinated1": 105864,
          "vaccinated2": 33747
        },
        "meta": {
          "population": 1631399
        },
        "total": {
          "vaccinated1": 891308,
          "vaccinated2": 254218
        }
      },
      "Narayanpet": {
        "delta": {
          "vaccinated1": 585,
          "vaccinated2": 48
        },
        "delta7": {
          "vaccinated1": 14266,
          "vaccinated2": 3428
        },
        "meta": {
          "population": 566874
        },
        "total": {
          "vaccinated1": 288388,
          "vaccinated2": 50219
        }
      },
      "Nirmal": {
        "delta": {
          "vaccinated1": 744,
          "vaccinated2": 255
        },
        "delta7": {
          "vaccinated1": 16044,
          "vaccinated2": 8396
        },
        "meta": {
          "population": 709415
        },
        "total": {
          "vaccinated1": 378315,
          "vaccinated2": 130107
        }
      },
      "Nizamabad": {
        "delta": {
          "vaccinated1": 276,
          "vaccinated2": 42
        },
        "delta7": {
          "vaccinated1": 67852,
          "vaccinated2": 21328
        },
        "meta": {
          "population": 1534428
        },
        "total": {
          "vaccinated1": 858574,
          "vaccinated2": 250862
        }
      },
      "Peddapalli": {
        "delta": {
          "vaccinated1": 79,
          "vaccinated2": 40
        },
        "delta7": {
          "vaccinated1": 18954,
          "vaccinated2": 19908
        },
        "meta": {
          "population": 795332
        },
        "total": {
          "vaccinated1": 463510,
          "vaccinated2": 201940
        }
      },
      "Rajanna Sircilla": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 100
        },
        "delta7": {
          "vaccinated1": 7398,
          "vaccinated2": 17056
        },
        "meta": {
          "population": 546121
        },
        "total": {
          "vaccinated1": 372065,
          "vaccinated2": 144680
        }
      },
      "Ranga Reddy": {
        "delta": {
          "vaccinated1": 217,
          "vaccinated2": 1168
        },
        "delta7": {
          "vaccinated1": 76853,
          "vaccinated2": 93482
        },
        "meta": {
          "population": 2551731
        },
        "total": {
          "vaccinated1": 2348542,
          "vaccinated2": 1291404
        }
      },
      "Sangareddy": {
        "delta": {
          "vaccinated1": 7628,
          "vaccinated2": 3083
        },
        "delta7": {
          "vaccinated1": 77693,
          "vaccinated2": 32539
        },
        "meta": {
          "population": 1527628
        },
        "total": {
          "vaccinated1": 851395,
          "vaccinated2": 299316
        }
      },
      "Siddipet": {
        "delta": {
          "vaccinated1": 197,
          "vaccinated2": 187
        },
        "delta7": {
          "vaccinated1": 35164,
          "vaccinated2": 25015
        },
        "meta": {
          "population": 993376
        },
        "total": {
          "vaccinated1": 582450,
          "vaccinated2": 242462
        }
      },
      "Suryapet": {
        "delta": {
          "vaccinated1": 20,
          "vaccinated2": 1
        },
        "delta7": {
          "vaccinated1": 38975,
          "vaccinated2": 24793
        },
        "meta": {
          "population": 1099560
        },
        "total": {
          "vaccinated1": 610724,
          "vaccinated2": 208278
        }
      },
      "Unknown": {
        "delta": {
          "confirmed": 121,
          "deceased": 1,
          "recovered": 183
        },
        "delta21_14": {
          "confirmed": 1068
        },
        "delta7": {
          "confirmed": 1189,
          "deceased": 9,
          "recovered": 1121
        },
        "total": {
          "confirmed": 671463,
          "deceased": 3956,
          "recovered": 663498
        }
      },
      "Vikarabad": {
        "delta": {
          "vaccinated1": 111,
          "vaccinated2": 12
        },
        "delta7": {
          "vaccinated1": 20014,
          "vaccinated2": 5848
        },
        "meta": {
          "population": 881250
        },
        "total": {
          "vaccinated1": 427669,
          "vaccinated2": 87989
        }
      },
      "Wanaparthy": {
        "delta": {
          "vaccinated1": 243,
          "vaccinated2": 119
        },
        "delta7": {
          "vaccinated1": 13905,
          "vaccinated2": 10313
        },
        "meta": {
          "population": 751553
        },
        "total": {
          "vaccinated1": 289412,
          "vaccinated2": 81870
        }
      },
      "Warangal Rural": {
        "delta": {
          "vaccinated1": 2416,
          "vaccinated2": 1350
        },
        "delta7": {
          "vaccinated1": 25045,
          "vaccinated2": 13208
        },
        "meta": {
          "population": 716457
        },
        "total": {
          "vaccinated1": 342881,
          "vaccinated2": 105289
        }
      },
      "Warangal Urban": {
        "delta": {
          "vaccinated1": 42,
          "vaccinated2": 101
        },
        "delta7": {
          "vaccinated1": 21854,
          "vaccinated2": 63907
        },
        "meta": {
          "population": 1135707
        },
        "total": {
          "vaccinated1": 687410,
          "vaccinated2": 418947
        }
      },
      "Yadadri Bhuvanagiri": {
        "delta": {
          "vaccinated1": 4429,
          "vaccinated2": 739
        },
        "delta7": {
          "vaccinated1": 38752,
          "vaccinated2": 28567
        },
        "meta": {
          "population": 726465
        },
        "total": {
          "vaccinated1": 463854,
          "vaccinated2": 223506
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[July 27] : Telangana bulletin for the previous day is released on the next day. We will add the cases for Telangana against the date of release, as that is the convention that we are following for other states.",
      "population": 37220000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/IPRTelangana/status/1454809941366083585"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 671463,
      "deceased": 3956,
      "recovered": 663498,
      "tested": 27569831,
      "vaccinated1": 22498559,
      "vaccinated2": 9772398
    }
  },
  "TN": {
    "delta": {
      "confirmed": 1009,
      "deceased": 19,
      "recovered": 1183,
      "tested": 123701,
      "vaccinated1": 77325,
      "vaccinated2": 106584
    },
    "delta21_14": {
      "confirmed": 8827
    },
    "delta7": {
      "confirmed": 7407,
      "deceased": 97,
      "recovered": 8852,
      "tested": 858304,
      "vaccinated1": 788134,
      "vaccinated2": 1578082
    },
    "districts": {
      "Airport Quarantine": {
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1
        },
        "total": {
          "confirmed": 2113,
          "deceased": 2,
          "recovered": 2107
        }
      },
      "Ariyalur": {
        "delta": {
          "confirmed": 5,
          "recovered": 3,
          "vaccinated1": 1127,
          "vaccinated2": 3941
        },
        "delta21_14": {
          "confirmed": 51
        },
        "delta7": {
          "confirmed": 35,
          "deceased": 1,
          "recovered": 44,
          "vaccinated1": 19203,
          "vaccinated2": 29689
        },
        "meta": {
          "population": 752481,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 16854,
          "deceased": 261,
          "recovered": 16548,
          "tested": 18285,
          "vaccinated1": 475390,
          "vaccinated2": 157166
        }
      },
      "Chengalpattu": {
        "delta": {
          "confirmed": 83,
          "deceased": 2,
          "recovered": 93,
          "vaccinated1": 3145,
          "vaccinated2": 3415
        },
        "delta21_14": {
          "confirmed": 658
        },
        "delta7": {
          "confirmed": 627,
          "deceased": 5,
          "recovered": 706,
          "vaccinated1": 26704,
          "vaccinated2": 39438
        },
        "meta": {
          "population": 2556244,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 171777,
          "deceased": 2506,
          "recovered": 168327,
          "tested": 51771,
          "vaccinated1": 1337641,
          "vaccinated2": 604784
        }
      },
      "Chennai": {
        "delta": {
          "confirmed": 118,
          "deceased": 4,
          "recovered": 143,
          "vaccinated1": 4126,
          "vaccinated2": 8535
        },
        "delta21_14": {
          "confirmed": 1162
        },
        "delta7": {
          "confirmed": 880,
          "deceased": 12,
          "recovered": 1093,
          "vaccinated1": 52515,
          "vaccinated2": 124932
        },
        "meta": {
          "notes": "[July 22]: 444 backdated deceased entries added to Chennai in TN bulletin.",
          "population": 7100000,
          "tested": {
            "date": "2021-02-01"
          }
        },
        "total": {
          "confirmed": 554672,
          "deceased": 8546,
          "recovered": 544701,
          "tested": 2667777,
          "vaccinated1": 4532809,
          "vaccinated2": 2671294
        }
      },
      "Coimbatore": {
        "delta": {
          "confirmed": 120,
          "deceased": 1,
          "recovered": 126,
          "vaccinated1": 770,
          "vaccinated2": 2853
        },
        "delta21_14": {
          "confirmed": 965
        },
        "delta7": {
          "confirmed": 869,
          "deceased": 15,
          "recovered": 988,
          "vaccinated1": 20971,
          "vaccinated2": 79387
        },
        "meta": {
          "population": 3472578,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 246780,
          "deceased": 2416,
          "recovered": 243070,
          "tested": 102107,
          "vaccinated1": 2717202,
          "vaccinated2": 1205484
        }
      },
      "Cuddalore": {
        "delta": {
          "confirmed": 16,
          "recovered": 18,
          "vaccinated1": 9299,
          "vaccinated2": 22186
        },
        "delta21_14": {
          "confirmed": 141
        },
        "delta7": {
          "confirmed": 129,
          "recovered": 132,
          "vaccinated1": 51773,
          "vaccinated2": 101735
        },
        "meta": {
          "population": 2600880,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 64085,
          "deceased": 867,
          "recovered": 62997,
          "tested": 36434,
          "vaccinated1": 1529591,
          "vaccinated2": 646400
        }
      },
      "Dharmapuri": {
        "delta": {
          "confirmed": 16,
          "recovered": 21,
          "vaccinated1": 811,
          "vaccinated2": 1674
        },
        "delta21_14": {
          "confirmed": 177
        },
        "delta7": {
          "confirmed": 110,
          "deceased": 1,
          "recovered": 161,
          "vaccinated1": 13388,
          "vaccinated2": 27153
        },
        "meta": {
          "population": 1502900,
          "tested": {
            "date": "2020-12-22"
          }
        },
        "total": {
          "confirmed": 28425,
          "deceased": 274,
          "recovered": 27957,
          "tested": 163803,
          "vaccinated1": 770955,
          "vaccinated2": 279901
        }
      },
      "Dindigul": {
        "delta": {
          "confirmed": 9,
          "recovered": 7,
          "vaccinated1": 321,
          "vaccinated2": 1040
        },
        "delta21_14": {
          "confirmed": 64
        },
        "delta7": {
          "confirmed": 58,
          "deceased": 1,
          "recovered": 51,
          "vaccinated1": 19630,
          "vaccinated2": 57260
        },
        "meta": {
          "population": 2161367,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 33099,
          "deceased": 645,
          "recovered": 32348,
          "tested": 27800,
          "vaccinated1": 1236504,
          "vaccinated2": 493453
        }
      },
      "Erode": {
        "delta": {
          "confirmed": 68,
          "deceased": 2,
          "recovered": 94,
          "vaccinated1": 244,
          "vaccinated2": 899
        },
        "delta21_14": {
          "confirmed": 549
        },
        "delta7": {
          "confirmed": 477,
          "deceased": 4,
          "recovered": 573,
          "vaccinated1": 16741,
          "vaccinated2": 46724
        },
        "meta": {
          "population": 2259608,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 104303,
          "deceased": 686,
          "recovered": 102836,
          "tested": 66240,
          "vaccinated1": 1370925,
          "vaccinated2": 552624
        }
      },
      "Kallakurichi": {
        "delta": {
          "confirmed": 14,
          "recovered": 23,
          "vaccinated1": 4089,
          "vaccinated2": 7322
        },
        "delta21_14": {
          "confirmed": 112
        },
        "delta7": {
          "confirmed": 66,
          "recovered": 118,
          "vaccinated1": 22603,
          "vaccinated2": 52087
        },
        "meta": {
          "population": 1370281,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 31364,
          "deceased": 210,
          "recovered": 31056,
          "tested": 28314,
          "vaccinated1": 696213,
          "vaccinated2": 299822
        }
      },
      "Kancheepuram": {
        "delta": {
          "confirmed": 30,
          "recovered": 37,
          "vaccinated1": 679,
          "vaccinated2": 1040
        },
        "delta21_14": {
          "confirmed": 237
        },
        "delta7": {
          "confirmed": 225,
          "deceased": 2,
          "recovered": 259,
          "vaccinated1": 13961,
          "vaccinated2": 24360
        },
        "meta": {
          "population": 1166401,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 74970,
          "deceased": 1258,
          "recovered": 73386,
          "tested": 37505,
          "vaccinated1": 663206,
          "vaccinated2": 250181
        }
      },
      "Kanyakumari": {
        "delta": {
          "confirmed": 17,
          "recovered": 12,
          "vaccinated1": 431,
          "vaccinated2": 1276
        },
        "delta21_14": {
          "confirmed": 132
        },
        "delta7": {
          "confirmed": 120,
          "recovered": 102,
          "vaccinated1": 17732,
          "vaccinated2": 51185
        },
        "meta": {
          "population": 1863178,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 62362,
          "deceased": 1048,
          "recovered": 61112,
          "tested": 79600,
          "vaccinated1": 1100888,
          "vaccinated2": 450620
        }
      },
      "Karur": {
        "delta": {
          "confirmed": 20,
          "recovered": 16,
          "vaccinated1": 74,
          "vaccinated2": 834
        },
        "delta21_14": {
          "confirmed": 80
        },
        "delta7": {
          "confirmed": 136,
          "deceased": 1,
          "recovered": 90,
          "vaccinated1": 5882,
          "vaccinated2": 32339
        },
        "meta": {
          "population": 1076588,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 24091,
          "deceased": 356,
          "recovered": 23523,
          "tested": 17190,
          "vaccinated1": 626136,
          "vaccinated2": 289120
        }
      },
      "Krishnagiri": {
        "delta": {
          "confirmed": 16,
          "recovered": 19,
          "vaccinated1": 404,
          "vaccinated2": 1731
        },
        "delta21_14": {
          "confirmed": 141
        },
        "delta7": {
          "confirmed": 134,
          "deceased": 1,
          "recovered": 160,
          "vaccinated1": 15883,
          "vaccinated2": 37027
        },
        "meta": {
          "population": 1883731,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 43570,
          "deceased": 348,
          "recovered": 43036,
          "tested": 14284,
          "vaccinated1": 1040491,
          "vaccinated2": 407695
        }
      },
      "Madurai": {
        "delta": {
          "confirmed": 13,
          "recovered": 17,
          "vaccinated1": 1060,
          "vaccinated2": 2012
        },
        "delta21_14": {
          "confirmed": 132
        },
        "delta7": {
          "confirmed": 99,
          "deceased": 3,
          "recovered": 122,
          "vaccinated1": 26340,
          "vaccinated2": 42498
        },
        "meta": {
          "population": 3991038,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 75215,
          "deceased": 1172,
          "recovered": 73853,
          "tested": 97279,
          "vaccinated1": 1500331,
          "vaccinated2": 583138
        }
      },
      "Mayiladuthurai": {
        "delta": {
          "confirmed": 3,
          "recovered": 10
        },
        "delta21_14": {
          "confirmed": 82
        },
        "delta7": {
          "confirmed": 41,
          "recovered": 80
        },
        "meta": {
          "population": 901000
        },
        "total": {
          "confirmed": 23280,
          "deceased": 316,
          "recovered": 22878
        }
      },
      "Nagapattinam": {
        "delta": {
          "confirmed": 16,
          "deceased": 1,
          "recovered": 20,
          "vaccinated1": 273,
          "vaccinated2": 953
        },
        "delta21_14": {
          "confirmed": 145
        },
        "delta7": {
          "confirmed": 97,
          "deceased": 10,
          "recovered": 121,
          "vaccinated1": 8662,
          "vaccinated2": 23176
        },
        "meta": {
          "population": 1614069,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 21074,
          "deceased": 346,
          "recovered": 20561,
          "tested": 20984,
          "vaccinated1": 813495,
          "vaccinated2": 289588
        }
      },
      "Namakkal": {
        "delta": {
          "confirmed": 43,
          "recovered": 51,
          "vaccinated1": 168,
          "vaccinated2": 442
        },
        "delta21_14": {
          "confirmed": 376
        },
        "delta7": {
          "confirmed": 315,
          "deceased": 2,
          "recovered": 397,
          "vaccinated1": 12694,
          "vaccinated2": 28265
        },
        "meta": {
          "population": 1721179,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 52245,
          "deceased": 498,
          "recovered": 51253,
          "tested": 24758,
          "vaccinated1": 987830,
          "vaccinated2": 397079
        }
      },
      "Nilgiris": {
        "delta": {
          "confirmed": 20,
          "deceased": 2,
          "recovered": 25,
          "vaccinated1": 71,
          "vaccinated2": 1092
        },
        "delta21_14": {
          "confirmed": 197
        },
        "delta7": {
          "confirmed": 124,
          "deceased": 3,
          "recovered": 220,
          "vaccinated1": 1613,
          "vaccinated2": 31952
        },
        "meta": {
          "population": 735071,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 33566,
          "deceased": 212,
          "recovered": 33164,
          "tested": 45839,
          "vaccinated1": 501986,
          "vaccinated2": 343811
        }
      },
      "Perambalur": {
        "delta": {
          "confirmed": 2,
          "recovered": 5,
          "vaccinated1": 383,
          "vaccinated2": 2161
        },
        "delta21_14": {
          "confirmed": 24
        },
        "delta7": {
          "confirmed": 26,
          "recovered": 27,
          "vaccinated1": 4307,
          "vaccinated2": 17440
        },
        "meta": {
          "population": 564511,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 12067,
          "deceased": 243,
          "recovered": 11790,
          "tested": 7981,
          "vaccinated1": 326872,
          "vaccinated2": 136491
        }
      },
      "Pudukkottai": {
        "delta": {
          "confirmed": 12,
          "recovered": 8,
          "vaccinated1": 554,
          "vaccinated2": 2862
        },
        "delta21_14": {
          "confirmed": 95
        },
        "delta7": {
          "confirmed": 75,
          "deceased": 2,
          "recovered": 68,
          "vaccinated1": 10691,
          "vaccinated2": 34202
        },
        "meta": {
          "population": 1918725,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 30183,
          "deceased": 416,
          "recovered": 29627,
          "tested": 20835,
          "vaccinated1": 827320,
          "vaccinated2": 314780
        }
      },
      "Railway Quarantine": {
        "total": {
          "confirmed": 428,
          "recovered": 428
        }
      },
      "Ramanathapuram": {
        "delta": {
          "confirmed": 3,
          "recovered": 6,
          "vaccinated1": 852,
          "vaccinated2": 2329
        },
        "delta21_14": {
          "confirmed": 59
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 55,
          "vaccinated1": 9961,
          "vaccinated2": 32447
        },
        "meta": {
          "population": 1337560,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 20564,
          "deceased": 357,
          "recovered": 20158,
          "tested": 23389,
          "vaccinated1": 660673,
          "vaccinated2": 280037
        }
      },
      "Ranipet": {
        "delta": {
          "confirmed": 14,
          "recovered": 14,
          "vaccinated1": 506,
          "vaccinated2": 485
        },
        "delta21_14": {
          "confirmed": 85
        },
        "delta7": {
          "confirmed": 69,
          "deceased": 2,
          "recovered": 73,
          "vaccinated1": 10793,
          "vaccinated2": 13744
        },
        "meta": {
          "population": 1210277,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 43436,
          "deceased": 775,
          "recovered": 42557,
          "tested": 20118,
          "vaccinated1": 557267,
          "vaccinated2": 174051
        }
      },
      "Salem": {
        "delta": {
          "confirmed": 62,
          "deceased": 1,
          "recovered": 67,
          "vaccinated1": 396,
          "vaccinated2": 2125
        },
        "delta21_14": {
          "confirmed": 395
        },
        "delta7": {
          "confirmed": 427,
          "deceased": 3,
          "recovered": 442,
          "vaccinated1": 25814,
          "vaccinated2": 66134
        },
        "meta": {
          "population": 3480008,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 99893,
          "deceased": 1685,
          "recovered": 97619,
          "tested": 79660,
          "vaccinated1": 1925084,
          "vaccinated2": 791376
        }
      },
      "Sivaganga": {
        "delta": {
          "confirmed": 13,
          "recovered": 9,
          "vaccinated1": 195,
          "vaccinated2": 564
        },
        "delta21_14": {
          "confirmed": 75
        },
        "delta7": {
          "confirmed": 82,
          "recovered": 78,
          "vaccinated1": 10170,
          "vaccinated2": 31816
        },
        "meta": {
          "population": 1341250,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 20195,
          "deceased": 206,
          "recovered": 19854,
          "tested": 25824,
          "vaccinated1": 726010,
          "vaccinated2": 287468
        }
      },
      "Tenkasi": {
        "delta": {
          "confirmed": 4,
          "recovered": 4,
          "vaccinated1": 291,
          "vaccinated2": 446
        },
        "delta21_14": {
          "confirmed": 13
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 14,
          "vaccinated1": 16935,
          "vaccinated2": 21454
        },
        "meta": {
          "population": 1407627,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 27357,
          "deceased": 484,
          "recovered": 26834,
          "tested": 26338,
          "vaccinated1": 736882,
          "vaccinated2": 233177
        }
      },
      "Thanjavur": {
        "delta": {
          "confirmed": 37,
          "recovered": 59,
          "vaccinated1": 12155,
          "vaccinated2": 2378
        },
        "delta21_14": {
          "confirmed": 426
        },
        "delta7": {
          "confirmed": 310,
          "deceased": 6,
          "recovered": 428,
          "vaccinated1": 49025,
          "vaccinated2": 31228
        },
        "meta": {
          "population": 2402781,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 75352,
          "deceased": 972,
          "recovered": 73874,
          "tested": 67445,
          "vaccinated1": 1224986,
          "vaccinated2": 486660
        }
      },
      "Theni": {
        "delta": {
          "confirmed": 1,
          "deceased": 1,
          "recovered": 5,
          "vaccinated1": 379,
          "vaccinated2": 1536
        },
        "delta21_14": {
          "confirmed": 30
        },
        "delta7": {
          "confirmed": 15,
          "deceased": 1,
          "recovered": 23,
          "vaccinated1": 11199,
          "vaccinated2": 33309
        },
        "meta": {
          "population": 1243684,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 43571,
          "deceased": 521,
          "recovered": 43018,
          "tested": 45839,
          "vaccinated1": 660187,
          "vaccinated2": 304832
        }
      },
      "Thiruvallur": {
        "delta": {
          "confirmed": 28,
          "recovered": 55,
          "vaccinated1": 2328,
          "vaccinated2": 4382
        },
        "delta21_14": {
          "confirmed": 421
        },
        "delta7": {
          "confirmed": 252,
          "deceased": 3,
          "recovered": 396,
          "vaccinated1": 25332,
          "vaccinated2": 47695
        },
        "meta": {
          "population": 3725697,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 119370,
          "deceased": 1842,
          "recovered": 117138,
          "tested": 67948,
          "vaccinated1": 1425728,
          "vaccinated2": 563426
        }
      },
      "Thiruvarur": {
        "delta": {
          "confirmed": 23,
          "deceased": 2,
          "recovered": 22,
          "vaccinated1": 291,
          "vaccinated2": 624
        },
        "delta21_14": {
          "confirmed": 242
        },
        "delta7": {
          "confirmed": 170,
          "deceased": 5,
          "recovered": 253,
          "vaccinated1": 13453,
          "vaccinated2": 29614
        },
        "meta": {
          "population": 1268094,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 41461,
          "deceased": 442,
          "recovered": 40760,
          "tested": 67445,
          "vaccinated1": 630274,
          "vaccinated2": 246969
        }
      },
      "Thoothukkudi": {
        "delta": {
          "confirmed": 11,
          "deceased": 1,
          "recovered": 9,
          "vaccinated1": 11497,
          "vaccinated2": 1612
        },
        "delta21_14": {
          "confirmed": 105
        },
        "delta7": {
          "confirmed": 85,
          "deceased": 1,
          "recovered": 90,
          "vaccinated1": 46323,
          "vaccinated2": 22453
        },
        "meta": {
          "population": 1738376,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 56304,
          "deceased": 409,
          "recovered": 55757,
          "tested": 49288,
          "vaccinated1": 984706,
          "vaccinated2": 328797
        }
      },
      "Tiruchirappalli": {
        "delta": {
          "confirmed": 37,
          "recovered": 49,
          "vaccinated1": 2445,
          "vaccinated2": 892
        },
        "delta21_14": {
          "confirmed": 331
        },
        "delta7": {
          "confirmed": 302,
          "deceased": 5,
          "recovered": 334,
          "vaccinated1": 32150,
          "vaccinated2": 48874
        },
        "meta": {
          "population": 2713858,
          "tested": {
            "date": "2020-08-07"
          }
        },
        "total": {
          "confirmed": 77534,
          "deceased": 1059,
          "recovered": 76038,
          "tested": 92586,
          "vaccinated1": 1468456,
          "vaccinated2": 636356
        }
      },
      "Tirunelveli": {
        "delta": {
          "confirmed": 11,
          "deceased": 1,
          "recovered": 13,
          "vaccinated1": 940,
          "vaccinated2": 627
        },
        "delta21_14": {
          "confirmed": 115
        },
        "delta7": {
          "confirmed": 93,
          "deceased": 1,
          "recovered": 125,
          "vaccinated1": 22582,
          "vaccinated2": 19904
        },
        "meta": {
          "population": 1665253,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 49374,
          "deceased": 432,
          "recovered": 48812,
          "tested": 54208,
          "vaccinated1": 815687,
          "vaccinated2": 275985
        }
      },
      "Tirupathur": {
        "delta": {
          "confirmed": 10,
          "recovered": 8,
          "vaccinated1": 311,
          "vaccinated2": 525
        },
        "delta21_14": {
          "confirmed": 61
        },
        "delta7": {
          "confirmed": 50,
          "recovered": 66,
          "vaccinated1": 11111,
          "vaccinated2": 24743
        },
        "meta": {
          "population": 1111812,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 29301,
          "deceased": 625,
          "recovered": 28600,
          "tested": 23998,
          "vaccinated1": 541496,
          "vaccinated2": 205219
        }
      },
      "Tiruppur": {
        "delta": {
          "confirmed": 69,
          "deceased": 1,
          "recovered": 53,
          "vaccinated1": 133,
          "vaccinated2": 443
        },
        "delta21_14": {
          "confirmed": 556
        },
        "delta7": {
          "confirmed": 504,
          "deceased": 5,
          "recovered": 537,
          "vaccinated1": 20414,
          "vaccinated2": 50762
        },
        "meta": {
          "population": 2471222,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 95405,
          "deceased": 979,
          "recovered": 93683,
          "tested": 36301,
          "vaccinated1": 1671392,
          "vaccinated2": 611015
        }
      },
      "Tiruvannamalai": {
        "delta": {
          "confirmed": 18,
          "recovered": 28,
          "vaccinated1": 4455,
          "vaccinated2": 10228
        },
        "delta21_14": {
          "confirmed": 142
        },
        "delta7": {
          "confirmed": 120,
          "recovered": 158,
          "vaccinated1": 31415,
          "vaccinated2": 73235
        },
        "meta": {
          "population": 2468965,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 54968,
          "deceased": 667,
          "recovered": 54122,
          "tested": 76170,
          "vaccinated1": 1270049,
          "vaccinated2": 533376
        }
      },
      "Vellore": {
        "delta": {
          "confirmed": 12,
          "recovered": 15,
          "vaccinated1": 953,
          "vaccinated2": 1825
        },
        "delta21_14": {
          "confirmed": 119
        },
        "delta7": {
          "confirmed": 117,
          "deceased": 1,
          "recovered": 139,
          "vaccinated1": 18978,
          "vaccinated2": 31716
        },
        "meta": {
          "population": 1614242,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 49864,
          "deceased": 1131,
          "recovered": 48564,
          "tested": 47936,
          "vaccinated1": 763735,
          "vaccinated2": 336366
        }
      },
      "Viluppuram": {
        "delta": {
          "confirmed": 10,
          "recovered": 11,
          "vaccinated1": 12953,
          "vaccinated2": 11812
        },
        "delta21_14": {
          "confirmed": 84
        },
        "delta7": {
          "confirmed": 79,
          "deceased": 1,
          "recovered": 83,
          "vaccinated1": 53748,
          "vaccinated2": 67153
        },
        "meta": {
          "population": 2093003,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 45857,
          "deceased": 356,
          "recovered": 45382,
          "tested": 52064,
          "vaccinated1": 1085842,
          "vaccinated2": 444502
        }
      },
      "Virudhunagar": {
        "delta": {
          "confirmed": 5,
          "recovered": 8,
          "vaccinated1": 1007,
          "vaccinated2": 3437
        },
        "delta21_14": {
          "confirmed": 45
        },
        "delta7": {
          "confirmed": 38,
          "recovered": 45,
          "vaccinated1": 16628,
          "vaccinated2": 50467
        },
        "meta": {
          "population": 1943309,
          "tested": {
            "date": "2020-07-23"
          }
        },
        "total": {
          "confirmed": 46294,
          "deceased": 548,
          "recovered": 45687,
          "tested": 28620,
          "vaccinated1": 1072788,
          "vaccinated2": 505098
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[June 29 2021]: TN has introduced a new district \"Mayiladuthurai\" in the bulletin and has assigned cases from Nagapattinam to the new district.\n[July 22]: 444 backdated deceased entries added to Chennai in TN bulletin.\n2 deaths cross notified to other states from Chennai and Coimbatore.\n1 patient died after turning negative for infection in Chengalpattu.\nThese cases have been added to TN deceased tally",
      "population": 75695000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11882"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 2702623,
      "deceased": 36116,
      "recovered": 2655015,
      "tested": 51159242,
      "vaccinated1": 41279432,
      "vaccinated2": 17619141
    }
  },
  "TR": {
    "delta": {
      "confirmed": 12,
      "recovered": 2,
      "tested": 3501,
      "vaccinated1": 3,
      "vaccinated2": 650
    },
    "delta21_14": {
      "confirmed": 49
    },
    "delta7": {
      "confirmed": 87,
      "recovered": 62,
      "tested": 22126,
      "vaccinated1": 4155,
      "vaccinated2": 74642
    },
    "districts": {
      "Dhalai": {
        "delta": {
          "vaccinated1": 5,
          "vaccinated2": 531
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 264,
          "vaccinated2": 11234
        },
        "meta": {
          "population": 377988,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 7037,
          "deceased": 35,
          "other": 1,
          "recovered": 7000,
          "tested": 61582,
          "vaccinated1": 258334,
          "vaccinated2": 164654
        }
      },
      "Gomati": {
        "delta": {
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 8,
          "recovered": 3,
          "vaccinated1": 319,
          "vaccinated2": 9611
        },
        "meta": {
          "population": 436868,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 8134,
          "deceased": 74,
          "other": 4,
          "recovered": 8043,
          "tested": 47437,
          "vaccinated1": 279099,
          "vaccinated2": 161408
        }
      },
      "Khowai": {
        "delta": {
          "confirmed": 2
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 373,
          "vaccinated2": 5866
        },
        "meta": {
          "population": 327391,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 4559,
          "deceased": 54,
          "recovered": 4500,
          "tested": 24046,
          "vaccinated1": 202148,
          "vaccinated2": 111955
        }
      },
      "North Tripura": {
        "delta": {
          "confirmed": 2
        },
        "delta21_14": {
          "confirmed": 8
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 8,
          "vaccinated1": 352,
          "vaccinated2": 4099
        },
        "meta": {
          "population": 415946,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 7250,
          "deceased": 34,
          "other": 7,
          "recovered": 7199,
          "tested": 100931,
          "vaccinated1": 283802,
          "vaccinated2": 190594
        }
      },
      "Sipahijala": {
        "delta": {
          "vaccinated2": 9
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 8,
          "recovered": 4,
          "vaccinated1": 451,
          "vaccinated2": 10397
        },
        "meta": {
          "population": 484233,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 6360,
          "deceased": 75,
          "other": 1,
          "recovered": 6273,
          "tested": 53067,
          "vaccinated1": 330932,
          "vaccinated2": 211903
        }
      },
      "South Tripura": {
        "delta": {
          "confirmed": 1,
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 1,
          "vaccinated1": 267,
          "vaccinated2": 5639
        },
        "meta": {
          "population": 433737,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 10168,
          "deceased": 53,
          "other": 3,
          "recovered": 10104,
          "tested": 83030,
          "vaccinated1": 303987,
          "vaccinated2": 209259
        }
      },
      "Unokoti": {
        "delta": {
          "confirmed": 1,
          "vaccinated2": 5
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 3,
          "vaccinated1": 762,
          "vaccinated2": 10307
        },
        "meta": {
          "population": 277335,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 8609,
          "deceased": 68,
          "other": 4,
          "recovered": 8530,
          "tested": 34930,
          "vaccinated1": 173390,
          "vaccinated2": 101178
        }
      },
      "West Tripura": {
        "delta": {
          "confirmed": 6,
          "recovered": 2,
          "vaccinated1": 5,
          "vaccinated2": 13
        },
        "delta21_14": {
          "confirmed": 33
        },
        "delta7": {
          "confirmed": 55,
          "recovered": 41,
          "vaccinated1": 1366,
          "vaccinated2": 17141
        },
        "meta": {
          "population": 917534,
          "tested": {
            "date": "2021-02-02"
          }
        },
        "total": {
          "confirmed": 32351,
          "deceased": 420,
          "other": 43,
          "recovered": 31817,
          "tested": 202939,
          "vaccinated1": 676784,
          "vaccinated2": 470030
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Aug 4]: Tripura bulletin for the previous day is released on the next day. We will add the cases for Tripura against the date of release, as that is the convention that we are following for other states.",
      "population": 3992000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11868"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 84468,
      "deceased": 813,
      "other": 63,
      "recovered": 83466,
      "tested": 1983127,
      "vaccinated1": 2508477,
      "vaccinated2": 1621329
    }
  },
  "TT": {
    "delta": {
      "confirmed": 12907,
      "deceased": 251,
      "other": 1,
      "recovered": 13152,
      "tested": 881379,
      "vaccinated1": 750410,
      "vaccinated2": 933460
    },
    "delta21_14": {
      "confirmed": 109755
    },
    "delta7": {
      "confirmed": 96071,
      "deceased": 3727,
      "other": 37,
      "recovered": 101753,
      "tested": 8431577,
      "vaccinated1": 15883780,
      "vaccinated2": 24527530
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T11:20:24+05:30",
      "population": 1332900000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/ICMRDELHI/status/1455013648355577862?s=20"
      },
      "vaccinated": {
        "date": "2021-10-31",
        "source": "https://www.pib.gov.in/PressReleasePage.aspx?PRID=1768299"
      }
    },
    "total": {
      "confirmed": 34285612,
      "deceased": 458470,
      "other": 13197,
      "recovered": 33661339,
      "tested": 609201294,
      "vaccinated1": 732371508,
      "vaccinated2": 330752697
    }
  },
  "UP": {
    "delta": {
      "confirmed": 6,
      "recovered": 6,
      "tested": 161458,
      "vaccinated1": 53401,
      "vaccinated2": 57556
    },
    "delta21_14": {
      "confirmed": 74
    },
    "delta7": {
      "confirmed": 63,
      "deceased": 1,
      "recovered": 58,
      "tested": 1140736,
      "vaccinated1": 2266921,
      "vaccinated2": 3130828
    },
    "districts": {
      "Agra": {
        "delta": {
          "vaccinated1": 178,
          "vaccinated2": 265
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 23657,
          "vaccinated2": 42953
        },
        "meta": {
          "population": 4380793,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 25765,
          "deceased": 457,
          "recovered": 25308,
          "tested": 491361,
          "vaccinated1": 2172907,
          "vaccinated2": 746386
        }
      },
      "Aligarh": {
        "delta": {
          "vaccinated1": 9,
          "vaccinated2": 25
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "vaccinated1": 34650,
          "vaccinated2": 57576
        },
        "meta": {
          "population": 3673849,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 21280,
          "deceased": 108,
          "recovered": 21172,
          "tested": 482825,
          "vaccinated1": 1589498,
          "vaccinated2": 498586
        }
      },
      "Ambedkar Nagar": {
        "delta": {
          "vaccinated1": 138,
          "vaccinated2": 145
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 21528,
          "vaccinated2": 32042
        },
        "meta": {
          "population": 2398709,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 5040,
          "deceased": 152,
          "recovered": 4885,
          "tested": 123151,
          "vaccinated1": 1135268,
          "vaccinated2": 349925
        }
      },
      "Amethi": {
        "delta": {
          "vaccinated1": 165,
          "vaccinated2": 11
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 19777,
          "vaccinated2": 37617
        },
        "meta": {
          "population": 2549935,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9972,
          "deceased": 143,
          "recovered": 9828,
          "tested": 267014,
          "vaccinated1": 1015454,
          "vaccinated2": 375261
        }
      },
      "Amroha": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 8
        },
        "delta7": {
          "vaccinated1": 16080,
          "vaccinated2": 23048
        },
        "meta": {
          "population": 1838771,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 16616,
          "deceased": 203,
          "recovered": 16412,
          "tested": 254038,
          "vaccinated1": 871164,
          "vaccinated2": 265607
        }
      },
      "Auraiya": {
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 6878,
          "vaccinated2": 16443
        },
        "meta": {
          "population": 1372287,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 10090,
          "deceased": 203,
          "recovered": 9887,
          "tested": 107079,
          "vaccinated1": 614711,
          "vaccinated2": 180775
        }
      },
      "Ayodhya": {
        "delta": {
          "vaccinated1": 217,
          "vaccinated2": 452
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 26036,
          "vaccinated2": 37279
        },
        "meta": {
          "population": 2468371,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 16919,
          "deceased": 290,
          "recovered": 16629,
          "tested": 376735,
          "vaccinated1": 1270889,
          "vaccinated2": 418182
        }
      },
      "Azamgarh": {
        "delta": {
          "vaccinated1": 1764,
          "vaccinated2": 3111
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 41754,
          "vaccinated2": 63205
        },
        "meta": {
          "population": 4616509,
          "tested": {
            "date": "2020-12-27"
          }
        },
        "total": {
          "confirmed": 17906,
          "deceased": 228,
          "recovered": 17675,
          "tested": 12474,
          "vaccinated1": 2165409,
          "vaccinated2": 643824
        }
      },
      "Baghpat": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 52
        },
        "delta7": {
          "vaccinated1": 7829,
          "vaccinated2": 24151
        },
        "meta": {
          "population": 1302156,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9132,
          "deceased": 141,
          "recovered": 8991,
          "tested": 327192,
          "vaccinated1": 692255,
          "vaccinated2": 337171
        }
      },
      "Bahraich": {
        "delta": {
          "vaccinated1": 648,
          "vaccinated2": 1565
        },
        "delta7": {
          "vaccinated1": 54069,
          "vaccinated2": 106010
        },
        "meta": {
          "population": 2384239,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 11549,
          "deceased": 178,
          "recovered": 11371,
          "tested": 308225,
          "vaccinated1": 1752196,
          "vaccinated2": 642554
        }
      },
      "Ballia": {
        "delta": {
          "vaccinated1": 86,
          "vaccinated2": 170
        },
        "delta7": {
          "vaccinated1": 29248,
          "vaccinated2": 48334
        },
        "meta": {
          "population": 3223642,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 21610,
          "deceased": 234,
          "recovered": 21376,
          "tested": 267420,
          "vaccinated1": 1433455,
          "vaccinated2": 388341
        }
      },
      "Balrampur": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 747,
          "vaccinated2": 630
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 21033,
          "vaccinated2": 56322
        },
        "meta": {
          "population": 2149066,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7494,
          "deceased": 138,
          "recovered": 7354,
          "tested": 276237,
          "vaccinated1": 995084,
          "vaccinated2": 438892
        }
      },
      "Banda": {
        "delta": {
          "vaccinated1": 486,
          "vaccinated2": 432
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 38560,
          "vaccinated2": 36938
        },
        "meta": {
          "population": 1799541,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 10992,
          "deceased": 158,
          "recovered": 10832,
          "tested": 303185,
          "vaccinated1": 795903,
          "vaccinated2": 236840
        }
      },
      "Barabanki": {
        "delta": {
          "vaccinated1": 11,
          "vaccinated2": 44
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 51121,
          "vaccinated2": 59870
        },
        "meta": {
          "population": 3257983,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 19850,
          "deceased": 225,
          "recovered": 19624,
          "tested": 147422,
          "vaccinated1": 1589704,
          "vaccinated2": 448292
        }
      },
      "Bareilly": {
        "delta": {
          "vaccinated1": 6458,
          "vaccinated2": 255
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 68245,
          "vaccinated2": 64148
        },
        "meta": {
          "population": 4465344,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 44028,
          "deceased": 377,
          "recovered": 43650,
          "tested": 465209,
          "vaccinated1": 2221830,
          "vaccinated2": 749751
        }
      },
      "Basti": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 3555,
          "vaccinated2": 4769
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 24797,
          "vaccinated2": 39395
        },
        "meta": {
          "population": 2461056,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 11717,
          "deceased": 330,
          "recovered": 11385,
          "tested": 296570,
          "vaccinated1": 1189235,
          "vaccinated2": 399451
        }
      },
      "Bhadohi": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 7
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 15479,
          "vaccinated2": 20211
        },
        "meta": {
          "population": 1554203,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 7720,
          "deceased": 163,
          "recovered": 7557,
          "tested": 119023,
          "vaccinated1": 793094,
          "vaccinated2": 244431
        }
      },
      "Bijnor": {
        "delta": {
          "vaccinated1": -1,
          "vaccinated2": 1
        },
        "delta7": {
          "vaccinated1": 27491,
          "vaccinated2": 53680
        },
        "meta": {
          "population": 3683896,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 14794,
          "deceased": 126,
          "recovered": 14668,
          "tested": 312985,
          "vaccinated1": 1756682,
          "vaccinated2": 600482
        }
      },
      "Budaun": {
        "delta": {
          "vaccinated1": 581,
          "vaccinated2": 417
        },
        "delta7": {
          "vaccinated1": 53729,
          "vaccinated2": 43678
        },
        "meta": {
          "population": 3712738,
          "tested": {
            "date": "2021-01-23"
          }
        },
        "total": {
          "confirmed": 14941,
          "deceased": 98,
          "recovered": 14843,
          "tested": 224207,
          "vaccinated1": 1408673,
          "vaccinated2": 364360
        }
      },
      "Bulandshahr": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 46
        },
        "delta7": {
          "deceased": 1,
          "vaccinated1": 18195,
          "vaccinated2": 42644
        },
        "meta": {
          "population": 3498507,
          "tested": {
            "date": "2020-12-07"
          }
        },
        "total": {
          "confirmed": 20215,
          "deceased": 243,
          "recovered": 19972,
          "tested": 269090,
          "vaccinated1": 1647985,
          "vaccinated2": 646236
        }
      },
      "Chandauli": {
        "delta": {
          "vaccinated1": 192,
          "vaccinated2": 395
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 19998,
          "vaccinated2": 31247
        },
        "meta": {
          "population": 1952713,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 16208,
          "deceased": 356,
          "recovered": 15852,
          "tested": 211249,
          "vaccinated1": 939599,
          "vaccinated2": 238646
        }
      },
      "Chitrakoot": {
        "delta": {
          "vaccinated1": 329,
          "vaccinated2": 536
        },
        "delta7": {
          "vaccinated1": 13007,
          "vaccinated2": 16383
        },
        "meta": {
          "population": 990626,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 7110,
          "deceased": 79,
          "recovered": 7031,
          "tested": 234060,
          "vaccinated1": 447303,
          "vaccinated2": 129157
        }
      },
      "Deoria": {
        "delta": {
          "vaccinated1": 81,
          "vaccinated2": 167
        },
        "delta7": {
          "vaccinated1": 29495,
          "vaccinated2": 67895
        },
        "meta": {
          "population": 3098637,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 20223,
          "deceased": 220,
          "recovered": 20003,
          "tested": 304520,
          "vaccinated1": 1597034,
          "vaccinated2": 537293
        }
      },
      "Etah": {
        "delta": {
          "vaccinated1": 475,
          "vaccinated2": 170
        },
        "delta7": {
          "vaccinated1": 16622,
          "vaccinated2": 25756
        },
        "meta": {
          "population": 1761152,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9968,
          "deceased": 99,
          "recovered": 9868,
          "tested": 263295,
          "vaccinated1": 788675,
          "vaccinated2": 213371
        }
      },
      "Etawah": {
        "delta": {
          "vaccinated1": 873,
          "vaccinated2": 984
        },
        "delta7": {
          "vaccinated1": 52312,
          "vaccinated2": 35349
        },
        "meta": {
          "population": 1579160,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 13933,
          "deceased": 293,
          "recovered": 13640,
          "tested": 297761,
          "vaccinated1": 708258,
          "vaccinated2": 253661
        }
      },
      "Farrukhabad": {
        "delta": {
          "vaccinated1": 81,
          "vaccinated2": 439
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 15703,
          "vaccinated2": 28433
        },
        "meta": {
          "population": 1887577,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 10348,
          "deceased": 194,
          "recovered": 10153,
          "tested": 231856,
          "vaccinated1": 833824,
          "vaccinated2": 229745
        }
      },
      "Fatehpur": {
        "delta": {
          "vaccinated1": 53,
          "vaccinated2": 168
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 13675,
          "vaccinated2": 42615
        },
        "meta": {
          "population": 2632684,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 6814,
          "deceased": 139,
          "recovered": 6674,
          "tested": 82928,
          "vaccinated1": 1246314,
          "vaccinated2": 410120
        }
      },
      "Firozabad": {
        "delta": {
          "vaccinated1": 5881,
          "vaccinated2": 3105
        },
        "delta7": {
          "vaccinated1": 66838,
          "vaccinated2": 47728
        },
        "meta": {
          "population": 2496761,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 8720,
          "deceased": 135,
          "recovered": 8585,
          "tested": 322656,
          "vaccinated1": 1005224,
          "vaccinated2": 328351
        }
      },
      "Gautam Buddha Nagar": {
        "delta": {
          "confirmed": 1,
          "recovered": 2,
          "vaccinated1": 100,
          "vaccinated2": 816
        },
        "delta21_14": {
          "confirmed": 11
        },
        "delta7": {
          "confirmed": 6,
          "recovered": 13,
          "vaccinated1": 22023,
          "vaccinated2": 43162
        },
        "meta": {
          "population": 1674714,
          "tested": {
            "date": "2021-01-24"
          }
        },
        "total": {
          "confirmed": 63353,
          "deceased": 467,
          "recovered": 62876,
          "tested": 675396,
          "vaccinated1": 1799728,
          "vaccinated2": 974353
        }
      },
      "Ghaziabad": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 3698,
          "vaccinated2": 4330
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 2,
          "vaccinated1": 47837,
          "vaccinated2": 71692
        },
        "meta": {
          "population": 4661452,
          "tested": {
            "date": "2021-01-24"
          }
        },
        "total": {
          "confirmed": 55673,
          "deceased": 461,
          "recovered": 55207,
          "tested": 712611,
          "vaccinated1": 2247039,
          "vaccinated2": 1071908
        }
      },
      "Ghazipur": {
        "delta": {
          "vaccinated1": 241,
          "vaccinated2": 524
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 22615,
          "vaccinated2": 43797
        },
        "meta": {
          "population": 3622727,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 21641,
          "deceased": 282,
          "recovered": 21359,
          "tested": 265737,
          "vaccinated1": 1690195,
          "vaccinated2": 509886
        }
      },
      "Gonda": {
        "delta": {
          "vaccinated1": 40,
          "vaccinated2": 1698
        },
        "delta7": {
          "vaccinated1": 22042,
          "vaccinated2": 51150
        },
        "meta": {
          "population": 3431386,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 12282,
          "deceased": 266,
          "recovered": 12016,
          "tested": 241234,
          "vaccinated1": 1604382,
          "vaccinated2": 555773
        }
      },
      "Gorakhpur": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 96,
          "vaccinated2": 377
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 4,
          "vaccinated1": 33169,
          "vaccinated2": 69539
        },
        "meta": {
          "population": 4436275,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 59439,
          "deceased": 848,
          "recovered": 58588,
          "tested": 480536,
          "vaccinated1": 2347051,
          "vaccinated2": 889085
        }
      },
      "Hamirpur": {
        "delta": {
          "vaccinated1": 3
        },
        "delta7": {
          "vaccinated1": 11985,
          "vaccinated2": 14350
        },
        "meta": {
          "population": 1104021,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 5232,
          "deceased": 102,
          "recovered": 5130,
          "tested": 240382,
          "vaccinated1": 561456,
          "vaccinated2": 185949
        }
      },
      "Hapur": {
        "delta": {
          "vaccinated1": 127,
          "vaccinated2": 307
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 15823,
          "vaccinated2": 21964
        },
        "meta": {
          "population": 1338211,
          "tested": {
            "date": "2021-01-03"
          }
        },
        "total": {
          "confirmed": 12638,
          "deceased": 217,
          "recovered": 12421,
          "tested": 299725,
          "vaccinated1": 658863,
          "vaccinated2": 254519
        }
      },
      "Hardoi": {
        "delta": {
          "vaccinated1": 221,
          "vaccinated2": 594
        },
        "delta7": {
          "vaccinated1": 29546,
          "vaccinated2": 66612
        },
        "meta": {
          "population": 4091380,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 13755,
          "deceased": 349,
          "recovered": 13406,
          "tested": 224784,
          "vaccinated1": 1852490,
          "vaccinated2": 537647
        }
      },
      "Hathras": {
        "delta": {
          "vaccinated2": 1
        },
        "delta7": {
          "vaccinated1": 16507,
          "vaccinated2": 25542
        },
        "meta": {
          "population": 1565678,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 2920,
          "deceased": 43,
          "recovered": 2877,
          "tested": 260525,
          "vaccinated1": 701190,
          "vaccinated2": 234481
        }
      },
      "Jalaun": {
        "delta": {
          "vaccinated1": 18,
          "vaccinated2": 30
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 3,
          "vaccinated1": 14119,
          "vaccinated2": 21614
        },
        "meta": {
          "population": 1670718,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 11687,
          "deceased": 202,
          "recovered": 11482,
          "tested": 221719,
          "vaccinated1": 819651,
          "vaccinated2": 251406
        }
      },
      "Jaunpur": {
        "delta": {
          "vaccinated1": 209,
          "vaccinated2": 3689
        },
        "delta7": {
          "recovered": 2,
          "vaccinated1": 41689,
          "vaccinated2": 67101
        },
        "meta": {
          "population": 4476072,
          "tested": {
            "date": "2021-01-20"
          }
        },
        "total": {
          "confirmed": 22584,
          "deceased": 235,
          "recovered": 22349,
          "tested": 322824,
          "vaccinated1": 2189622,
          "vaccinated2": 667013
        }
      },
      "Jhansi": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 14,
          "vaccinated2": 14
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 10719,
          "vaccinated2": 25914
        },
        "meta": {
          "population": 2000755,
          "tested": {
            "date": "2020-11-26"
          }
        },
        "total": {
          "confirmed": 36556,
          "deceased": 663,
          "recovered": 35892,
          "tested": 312540,
          "vaccinated1": 1132511,
          "vaccinated2": 379818
        }
      },
      "Kannauj": {
        "delta": {
          "vaccinated1": 82,
          "vaccinated2": 431
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "vaccinated1": 24440,
          "vaccinated2": 44639
        },
        "meta": {
          "population": 1658005,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 9231,
          "deceased": 114,
          "recovered": 9115,
          "tested": 124019,
          "vaccinated1": 755119,
          "vaccinated2": 257048
        }
      },
      "Kanpur Dehat": {
        "delta": {
          "vaccinated1": 47,
          "vaccinated2": 85
        },
        "delta7": {
          "vaccinated1": 27985,
          "vaccinated2": 38783
        },
        "meta": {
          "population": 1795092,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 6197,
          "deceased": 110,
          "recovered": 6087,
          "tested": 344697,
          "vaccinated1": 923661,
          "vaccinated2": 290898
        }
      },
      "Kanpur Nagar": {
        "delta": {
          "vaccinated1": 38,
          "vaccinated2": 96
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 1,
          "vaccinated1": 64788,
          "vaccinated2": 66517
        },
        "meta": {
          "population": 4572951,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 82933,
          "deceased": 1905,
          "recovered": 81024,
          "tested": 685820,
          "vaccinated1": 2251558,
          "vaccinated2": 859280
        }
      },
      "Kasganj": {
        "delta": {
          "vaccinated1": 51,
          "vaccinated2": 29
        },
        "delta7": {
          "vaccinated1": 8148,
          "vaccinated2": 13675
        },
        "meta": {
          "population": 1438156,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 4250,
          "deceased": 53,
          "recovered": 4197,
          "tested": 271969,
          "vaccinated1": 608818,
          "vaccinated2": 147948
        }
      },
      "Kaushambi": {
        "delta": {
          "vaccinated1": 94,
          "vaccinated2": 35
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 38263,
          "vaccinated2": 28403
        },
        "meta": {
          "population": 1596909,
          "tested": {
            "date": "2021-01-14"
          }
        },
        "total": {
          "confirmed": 4424,
          "deceased": 70,
          "recovered": 4353,
          "tested": 207064,
          "vaccinated1": 760960,
          "vaccinated2": 218775
        }
      },
      "Kushinagar": {
        "delta": {
          "vaccinated1": 211,
          "vaccinated2": 585
        },
        "delta7": {
          "vaccinated1": 16785,
          "vaccinated2": 46465
        },
        "meta": {
          "population": 3560830,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 15617,
          "deceased": 228,
          "recovered": 15389,
          "tested": 314772,
          "vaccinated1": 1632782,
          "vaccinated2": 458054
        }
      },
      "Lakhimpur Kheri": {
        "delta": {
          "vaccinated1": 1183,
          "vaccinated2": 1370
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 46453,
          "vaccinated2": 51586
        },
        "meta": {
          "population": 4013634,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 24410,
          "deceased": 292,
          "recovered": 24117,
          "tested": 368533,
          "vaccinated1": 1829019,
          "vaccinated2": 382178
        }
      },
      "Lalitpur": {
        "delta": {
          "vaccinated1": 4,
          "vaccinated2": 8
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 8010,
          "vaccinated2": 13539
        },
        "meta": {
          "population": 1218002,
          "tested": {
            "date": "2020-08-07"
          }
        },
        "total": {
          "confirmed": 12742,
          "deceased": 128,
          "recovered": 12613,
          "tested": 21781,
          "vaccinated1": 627553,
          "vaccinated2": 143519
        }
      },
      "Lucknow": {
        "delta": {
          "vaccinated1": 10826,
          "vaccinated2": 11083
        },
        "delta21_14": {
          "confirmed": 15
        },
        "delta7": {
          "confirmed": 10,
          "recovered": 10,
          "vaccinated1": 69404,
          "vaccinated2": 107763
        },
        "meta": {
          "population": 4588455,
          "tested": {
            "date": "2020-12-13"
          }
        },
        "total": {
          "confirmed": 238839,
          "deceased": 2651,
          "recovered": 236165,
          "tested": 1237583,
          "vaccinated1": 3106658,
          "vaccinated2": 1488333
        }
      },
      "Maharajganj": {
        "delta": {
          "vaccinated1": 53,
          "vaccinated2": 316
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 20643,
          "vaccinated2": 36312
        },
        "meta": {
          "population": 2665292,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 12440,
          "deceased": 140,
          "recovered": 12300,
          "tested": 334716,
          "vaccinated1": 1283534,
          "vaccinated2": 372559
        }
      },
      "Mahoba": {
        "delta": {
          "vaccinated1": 10,
          "vaccinated2": 9
        },
        "delta7": {
          "vaccinated1": 4765,
          "vaccinated2": 8960
        },
        "meta": {
          "population": 876055,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 4268,
          "deceased": 86,
          "recovered": 4182,
          "tested": 142992,
          "vaccinated1": 444352,
          "vaccinated2": 148388
        }
      },
      "Mainpuri": {
        "delta": {
          "vaccinated1": 647,
          "vaccinated2": 1354
        },
        "delta7": {
          "vaccinated1": 31507,
          "vaccinated2": 37443
        },
        "meta": {
          "population": 1847194,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 10028,
          "deceased": 182,
          "recovered": 9846,
          "tested": 228496,
          "vaccinated1": 860461,
          "vaccinated2": 219990
        }
      },
      "Mathura": {
        "delta": {
          "vaccinated1": 63,
          "vaccinated2": 164
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 10807,
          "vaccinated2": 23027
        },
        "meta": {
          "population": 2541894,
          "tested": {
            "date": "2021-01-29"
          }
        },
        "total": {
          "confirmed": 20297,
          "deceased": 402,
          "recovered": 19893,
          "tested": 198379,
          "vaccinated1": 1207578,
          "vaccinated2": 418117
        }
      },
      "Mau": {
        "delta": {
          "vaccinated1": 787,
          "vaccinated2": 453
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 1,
          "vaccinated1": 25202,
          "vaccinated2": 32390
        },
        "meta": {
          "population": 2205170,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 8333,
          "deceased": 80,
          "recovered": 8252,
          "tested": 281445,
          "vaccinated1": 1017497,
          "vaccinated2": 307052
        }
      },
      "Meerut": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 25,
          "vaccinated2": 79
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 13,
          "recovered": 3,
          "vaccinated1": 25100,
          "vaccinated2": 57600
        },
        "meta": {
          "population": 3447405,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 69480,
          "deceased": 898,
          "recovered": 68567,
          "tested": 798404,
          "vaccinated1": 1764744,
          "vaccinated2": 842448
        }
      },
      "Mirzapur": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 787,
          "vaccinated2": 419
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 24968,
          "vaccinated2": 41785
        },
        "meta": {
          "population": 2494533,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 11088,
          "deceased": 116,
          "recovered": 10972,
          "tested": 312764,
          "vaccinated1": 1335308,
          "vaccinated2": 462157
        }
      },
      "Moradabad": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 3951,
          "vaccinated2": 2357
        },
        "delta7": {
          "recovered": 1,
          "vaccinated1": 52013,
          "vaccinated2": 39070
        },
        "meta": {
          "population": 4773138,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 39102,
          "deceased": 349,
          "recovered": 38752,
          "tested": 400459,
          "vaccinated1": 1390249,
          "vaccinated2": 443211
        }
      },
      "Muzaffarnagar": {
        "delta": {
          "vaccinated1": 979,
          "vaccinated2": 707
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 15476,
          "vaccinated2": 38924
        },
        "meta": {
          "population": 4138605,
          "tested": {
            "date": "2021-01-25"
          }
        },
        "total": {
          "confirmed": 31009,
          "deceased": 269,
          "recovered": 30737,
          "tested": 161704,
          "vaccinated1": 1264005,
          "vaccinated2": 467387
        }
      },
      "Pilibhit": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 1
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 9611,
          "vaccinated2": 17989
        },
        "meta": {
          "population": 2037225,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 11032,
          "deceased": 193,
          "recovered": 10838,
          "tested": 291538,
          "vaccinated1": 978332,
          "vaccinated2": 256931
        }
      },
      "Pratapgarh": {
        "delta": {
          "vaccinated1": 1796,
          "vaccinated2": 1482
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 40603,
          "vaccinated2": 47832
        },
        "meta": {
          "population": 3173752,
          "tested": {
            "date": "2021-01-14"
          }
        },
        "total": {
          "confirmed": 16038,
          "deceased": 163,
          "recovered": 15875,
          "tested": 100500,
          "vaccinated1": 1480021,
          "vaccinated2": 456869
        }
      },
      "Prayagraj": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 17,
          "vaccinated2": 48
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 1,
          "recovered": 6,
          "vaccinated1": 75719,
          "vaccinated2": 79660
        },
        "meta": {
          "population": 5959798,
          "tested": {
            "date": "2021-01-14"
          }
        },
        "total": {
          "confirmed": 78699,
          "deceased": 1088,
          "recovered": 77609,
          "tested": 729300,
          "vaccinated1": 2731341,
          "vaccinated2": 862244
        }
      },
      "Rae Bareli": {
        "delta": {
          "vaccinated1": 576,
          "vaccinated2": 429
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 33906,
          "vaccinated2": 46996
        },
        "meta": {
          "population": 3404004,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 17104,
          "deceased": 343,
          "recovered": 16761,
          "tested": 387408,
          "vaccinated1": 1436175,
          "vaccinated2": 344694
        }
      },
      "Rampur": {
        "delta": {
          "vaccinated1": 3,
          "vaccinated2": 1
        },
        "delta7": {
          "confirmed": 2,
          "vaccinated1": 23526,
          "vaccinated2": 28753
        },
        "meta": {
          "population": 2335398,
          "tested": {
            "date": "2021-01-16"
          }
        },
        "total": {
          "confirmed": 11826,
          "deceased": 148,
          "recovered": 11676,
          "tested": 274288,
          "vaccinated1": 989666,
          "vaccinated2": 250420
        }
      },
      "Saharanpur": {
        "delta": {
          "vaccinated1": 6,
          "vaccinated2": 17
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 19216,
          "vaccinated2": 33326
        },
        "meta": {
          "population": 3464228,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 32730,
          "deceased": 420,
          "recovered": 32309,
          "tested": 266387,
          "vaccinated1": 1638111,
          "vaccinated2": 576986
        }
      },
      "Sambhal": {
        "delta": {
          "vaccinated1": 1708,
          "vaccinated2": 411
        },
        "delta7": {
          "vaccinated1": 27630,
          "vaccinated2": 23914
        },
        "meta": {
          "population": 2217020,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 9438,
          "deceased": 106,
          "recovered": 9331,
          "tested": 309333,
          "vaccinated1": 893786,
          "vaccinated2": 204352
        }
      },
      "Sant Kabir Nagar": {
        "delta": {
          "vaccinated1": 82,
          "vaccinated2": 202
        },
        "delta7": {
          "vaccinated1": 44511,
          "vaccinated2": 26920
        },
        "meta": {
          "population": 1714300,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 8159,
          "deceased": 98,
          "recovered": 8061,
          "tested": 292606,
          "vaccinated1": 799506,
          "vaccinated2": 195105
        }
      },
      "Shahjahanpur": {
        "delta": {
          "vaccinated1": 3563,
          "vaccinated2": 969
        },
        "delta7": {
          "vaccinated1": 185421,
          "vaccinated2": 79519
        },
        "meta": {
          "population": 3002376,
          "tested": {
            "date": "2021-01-13"
          }
        },
        "total": {
          "confirmed": 20361,
          "deceased": 444,
          "recovered": 19916,
          "tested": 437195,
          "vaccinated1": 1743273,
          "vaccinated2": 538827
        }
      },
      "Shamli": {
        "delta": {
          "vaccinated1": 24,
          "vaccinated2": 14
        },
        "delta7": {
          "vaccinated1": 12602,
          "vaccinated2": 16389
        },
        "meta": {
          "population": 1274815,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 12976,
          "deceased": 45,
          "recovered": 12931,
          "tested": 246597,
          "vaccinated1": 604968,
          "vaccinated2": 206438
        }
      },
      "Shrawasti": {
        "delta": {
          "vaccinated1": 37,
          "vaccinated2": 120
        },
        "delta7": {
          "vaccinated1": 7342,
          "vaccinated2": 17808
        },
        "meta": {
          "population": 1114615,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 4388,
          "deceased": 35,
          "recovered": 4353,
          "tested": 221566,
          "vaccinated1": 515155,
          "vaccinated2": 181654
        }
      },
      "Siddharthnagar": {
        "delta": {
          "vaccinated1": 250,
          "vaccinated2": 2209
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 18746,
          "vaccinated2": 53973
        },
        "meta": {
          "population": 2553526,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 9373,
          "deceased": 100,
          "recovered": 9273,
          "tested": 295047,
          "vaccinated1": 1225133,
          "vaccinated2": 479630
        }
      },
      "Sitapur": {
        "delta": {
          "vaccinated1": 81,
          "vaccinated2": 197
        },
        "delta7": {
          "vaccinated1": 33825,
          "vaccinated2": 52112
        },
        "meta": {
          "population": 4474446,
          "tested": {
            "date": "2021-01-28"
          }
        },
        "total": {
          "confirmed": 12398,
          "deceased": 185,
          "recovered": 12211,
          "tested": 289473,
          "vaccinated1": 2139996,
          "vaccinated2": 497241
        }
      },
      "Sonbhadra": {
        "delta": {
          "vaccinated1": 200,
          "vaccinated2": 157
        },
        "delta7": {
          "vaccinated1": 21438,
          "vaccinated2": 24430
        },
        "meta": {
          "population": 1862612,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 16807,
          "deceased": 251,
          "recovered": 16556,
          "tested": 306175,
          "vaccinated1": 812891,
          "vaccinated2": 236871
        }
      },
      "Sultanpur": {
        "delta": {
          "vaccinated1": 2,
          "vaccinated2": 18
        },
        "delta7": {
          "vaccinated1": 14962,
          "vaccinated2": 31247
        },
        "meta": {
          "population": 3790922,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 14915,
          "deceased": 138,
          "recovered": 14777,
          "tested": 309395,
          "vaccinated1": 1178195,
          "vaccinated2": 370998
        }
      },
      "Unnao": {
        "delta": {
          "vaccinated1": 201,
          "vaccinated2": 948
        },
        "delta7": {
          "vaccinated1": 26506,
          "vaccinated2": 41790
        },
        "meta": {
          "population": 3110595,
          "tested": {
            "date": "2021-01-10"
          }
        },
        "total": {
          "confirmed": 15011,
          "deceased": 254,
          "recovered": 14757,
          "tested": 298886,
          "vaccinated1": 1554190,
          "vaccinated2": 420513
        }
      },
      "Varanasi": {
        "delta": {
          "vaccinated1": 159,
          "vaccinated2": 441
        },
        "delta21_14": {
          "confirmed": 2
        },
        "delta7": {
          "confirmed": 2,
          "recovered": 1,
          "vaccinated1": 38187,
          "vaccinated2": 55104
        },
        "meta": {
          "population": 3682194,
          "tested": {
            "date": "2021-01-31"
          }
        },
        "total": {
          "confirmed": 85501,
          "deceased": 971,
          "recovered": 84528,
          "tested": 595510,
          "vaccinated1": 2109381,
          "vaccinated2": 843905
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Jan 1]:As no bulletin was provided for 31'st Dec'20,its count has been combined with 1st Jan'21\n[Jan 9]:Due to reconcillation there are 1286 cases.",
      "population": 224979000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://twitter.com/ShishirGoUP/status/1454716134503055360"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 1710158,
      "deceased": 22900,
      "recovered": 1687151,
      "tested": 83635222,
      "vaccinated1": 98178865,
      "vaccinated2": 32681895
    }
  },
  "UT": {
    "delta": {
      "confirmed": 5,
      "recovered": 9,
      "tested": 9524,
      "vaccinated1": 1065,
      "vaccinated2": 12934
    },
    "delta21_14": {
      "confirmed": 88
    },
    "delta7": {
      "confirmed": 75,
      "deceased": 1,
      "other": 12,
      "recovered": 74,
      "tested": 83377,
      "vaccinated1": 25250,
      "vaccinated2": 258381
    },
    "districts": {
      "Almora": {
        "delta": {
          "vaccinated1": 37,
          "vaccinated2": 416
        },
        "delta7": {
          "confirmed": 7,
          "other": 2,
          "recovered": 7,
          "vaccinated1": 729,
          "vaccinated2": 10440
        },
        "meta": {
          "population": 621927,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 12190,
          "deceased": 196,
          "other": 614,
          "recovered": 11378,
          "tested": 84443,
          "vaccinated1": 378242,
          "vaccinated2": 215715
        }
      },
      "Bageshwar": {
        "delta": {
          "vaccinated1": 75,
          "vaccinated2": 1286
        },
        "delta7": {
          "confirmed": 1,
          "vaccinated1": 371,
          "vaccinated2": 6323
        },
        "meta": {
          "population": 259840,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 5764,
          "deceased": 60,
          "other": 25,
          "recovered": 5678,
          "tested": 55626,
          "vaccinated1": 183447,
          "vaccinated2": 131244
        }
      },
      "Chamoli": {
        "delta": {
          "vaccinated1": 13,
          "vaccinated2": 268
        },
        "delta21_14": {
          "confirmed": 3
        },
        "delta7": {
          "confirmed": 4,
          "recovered": 4,
          "vaccinated1": 822,
          "vaccinated2": 11652
        },
        "meta": {
          "population": 391114,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 12242,
          "deceased": 62,
          "other": 204,
          "recovered": 11972,
          "tested": 90390,
          "vaccinated1": 273850,
          "vaccinated2": 191420
        }
      },
      "Champawat": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 44,
          "vaccinated2": 613
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 3,
          "other": 5,
          "vaccinated1": 754,
          "vaccinated2": 6007
        },
        "meta": {
          "population": 259315,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 7603,
          "deceased": 53,
          "other": 189,
          "recovered": 7358,
          "tested": 95068,
          "vaccinated1": 183354,
          "vaccinated2": 119870
        }
      },
      "Dehradun": {
        "delta": {
          "confirmed": 3,
          "recovered": 4,
          "vaccinated1": 308,
          "vaccinated2": 3611
        },
        "delta21_14": {
          "confirmed": 28
        },
        "delta7": {
          "confirmed": 30,
          "other": 2,
          "recovered": 24,
          "vaccinated1": 5963,
          "vaccinated2": 49795
        },
        "meta": {
          "population": 1698560,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 112363,
          "deceased": 3521,
          "other": 598,
          "recovered": 108137,
          "tested": 401496,
          "vaccinated1": 1465464,
          "vaccinated2": 793803
        }
      },
      "Haridwar": {
        "delta": {
          "confirmed": 1,
          "vaccinated1": 224,
          "vaccinated2": 1907
        },
        "delta21_14": {
          "confirmed": 5
        },
        "delta7": {
          "confirmed": 10,
          "deceased": 1,
          "other": 1,
          "recovered": 8,
          "vaccinated1": 3960,
          "vaccinated2": 52191
        },
        "meta": {
          "population": 1927029,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 51498,
          "deceased": 1019,
          "other": 1376,
          "recovered": 49096,
          "tested": 369542,
          "vaccinated1": 1456257,
          "vaccinated2": 635360
        }
      },
      "Nainital": {
        "delta": {
          "recovered": 3,
          "vaccinated1": 31,
          "vaccinated2": 288
        },
        "delta21_14": {
          "confirmed": 25
        },
        "delta7": {
          "confirmed": 10,
          "recovered": 14,
          "vaccinated1": 2285,
          "vaccinated2": 16850
        },
        "meta": {
          "population": 955128,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 39232,
          "deceased": 944,
          "other": 134,
          "recovered": 38140,
          "tested": 204422,
          "vaccinated1": 722854,
          "vaccinated2": 398680
        }
      },
      "Pauri Garhwal": {
        "delta": {
          "vaccinated1": 25,
          "vaccinated2": 108
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 5,
          "vaccinated1": 2116,
          "vaccinated2": 14253
        },
        "meta": {
          "population": 686527,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 17686,
          "deceased": 315,
          "other": 701,
          "recovered": 16668,
          "tested": 138878,
          "vaccinated1": 431320,
          "vaccinated2": 229262
        }
      },
      "Pithoragarh": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 89,
          "vaccinated2": 609
        },
        "delta21_14": {
          "confirmed": 4
        },
        "delta7": {
          "confirmed": 3,
          "recovered": 6,
          "vaccinated1": 930,
          "vaccinated2": 10608
        },
        "meta": {
          "population": 485993,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 10260,
          "deceased": 181,
          "other": 108,
          "recovered": 9962,
          "tested": 72686,
          "vaccinated1": 318644,
          "vaccinated2": 183765
        }
      },
      "Rudraprayag": {
        "delta": {
          "recovered": 1,
          "vaccinated1": 30,
          "vaccinated2": 326
        },
        "delta21_14": {
          "confirmed": 7
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 416,
          "vaccinated2": 6212
        },
        "meta": {
          "population": 236857,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 8800,
          "deceased": 106,
          "other": 159,
          "recovered": 8535,
          "tested": 52378,
          "vaccinated1": 170911,
          "vaccinated2": 113480
        }
      },
      "Tehri Garhwal": {
        "delta": {
          "vaccinated1": 12,
          "vaccinated2": 120
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "vaccinated1": 2235,
          "vaccinated2": 15658
        },
        "meta": {
          "population": 616409,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 15835,
          "deceased": 108,
          "other": 900,
          "recovered": 14827,
          "tested": 105111,
          "vaccinated1": 381493,
          "vaccinated2": 206527
        }
      },
      "Udham Singh Nagar": {
        "delta": {
          "vaccinated1": 167,
          "vaccinated2": 3581
        },
        "delta7": {
          "recovered": 3,
          "vaccinated1": 3588,
          "vaccinated2": 48283
        },
        "meta": {
          "population": 1648367,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 37875,
          "deceased": 761,
          "other": 799,
          "recovered": 36315,
          "tested": 337292,
          "vaccinated1": 1277738,
          "vaccinated2": 518326
        }
      },
      "Uttarkashi": {
        "delta": {
          "vaccinated1": 12,
          "vaccinated2": 83
        },
        "delta21_14": {
          "confirmed": 1
        },
        "delta7": {
          "confirmed": 4,
          "other": 2,
          "vaccinated1": 1063,
          "vaccinated2": 9910
        },
        "meta": {
          "population": 329686,
          "tested": {
            "date": "2021-01-30"
          }
        },
        "total": {
          "confirmed": 12548,
          "deceased": 74,
          "other": 343,
          "recovered": 12129,
          "tested": 120026,
          "vaccinated1": 234425,
          "vaccinated2": 160687
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "notes": "[Oct 30]: Metric of capturing the testing data has switched to \"Samples Tested\" from \"Samples Collected\"\n[Jun 30th'21]:145 confirmed cases and 218 deceased cases added of previous days after reconciliation with district and ICMR portal",
      "population": 11141000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://t.me/Covid19india_Auxiliary_Test_Data/11870"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 343896,
      "deceased": 7400,
      "other": 6150,
      "recovered": 330195,
      "tested": 7781148,
      "vaccinated1": 7478017,
      "vaccinated2": 3898342
    }
  },
  "WB": {
    "delta": {
      "confirmed": 914,
      "deceased": 15,
      "recovered": 913,
      "tested": 47417,
      "vaccinated1": 209609,
      "vaccinated2": 58881
    },
    "delta21_14": {
      "confirmed": 4193
    },
    "delta7": {
      "confirmed": 6453,
      "deceased": 86,
      "recovered": 5953,
      "tested": 300114,
      "vaccinated1": 3809597,
      "vaccinated2": 1871612
    },
    "districts": {
      "Alipurduar": {
        "delta": {
          "confirmed": 4,
          "recovered": 5,
          "vaccinated1": 579,
          "vaccinated2": 1298
        },
        "delta21_14": {
          "confirmed": 26
        },
        "delta7": {
          "confirmed": 31,
          "recovered": 35,
          "vaccinated1": 38488,
          "vaccinated2": 29790
        },
        "meta": {
          "population": 1700000
        },
        "total": {
          "confirmed": 15589,
          "deceased": 102,
          "recovered": 15441,
          "vaccinated1": 949775,
          "vaccinated2": 353666
        }
      },
      "Bankura": {
        "delta": {
          "confirmed": 30,
          "recovered": 21,
          "vaccinated1": 38854,
          "vaccinated2": 5692
        },
        "delta21_14": {
          "confirmed": 83
        },
        "delta7": {
          "confirmed": 161,
          "deceased": 1,
          "recovered": 133,
          "vaccinated1": 220390,
          "vaccinated2": 76120
        },
        "meta": {
          "population": 3596292
        },
        "total": {
          "confirmed": 36313,
          "deceased": 274,
          "recovered": 35839,
          "vaccinated1": 2245147,
          "vaccinated2": 706177
        }
      },
      "Birbhum": {
        "delta": {
          "confirmed": 20,
          "recovered": 20,
          "vaccinated1": 6911,
          "vaccinated2": 2868
        },
        "delta21_14": {
          "confirmed": 51
        },
        "delta7": {
          "confirmed": 176,
          "recovered": 102,
          "vaccinated1": 99629,
          "vaccinated2": 84919
        },
        "meta": {
          "population": 3502387
        },
        "total": {
          "confirmed": 41197,
          "deceased": 286,
          "recovered": 40727,
          "vaccinated1": 2152966,
          "vaccinated2": 846286
        }
      },
      "Cooch Behar": {
        "delta": {
          "confirmed": 10,
          "recovered": 13,
          "vaccinated1": 3386,
          "vaccinated2": 395
        },
        "delta21_14": {
          "confirmed": 82
        },
        "delta7": {
          "confirmed": 77,
          "recovered": 93,
          "vaccinated1": 122592,
          "vaccinated2": 26214
        },
        "meta": {
          "population": 2822780
        },
        "total": {
          "confirmed": 29275,
          "deceased": 97,
          "recovered": 29060,
          "vaccinated1": 1444232,
          "vaccinated2": 421663
        }
      },
      "Dakshin Dinajpur": {
        "delta": {
          "confirmed": 14,
          "recovered": 16,
          "vaccinated1": 724,
          "vaccinated2": 998
        },
        "delta21_14": {
          "confirmed": 80
        },
        "delta7": {
          "confirmed": 111,
          "deceased": 1,
          "recovered": 108,
          "vaccinated1": 53398,
          "vaccinated2": 21657
        },
        "meta": {
          "population": 1670931
        },
        "total": {
          "confirmed": 17889,
          "deceased": 170,
          "recovered": 17573,
          "vaccinated1": 1063493,
          "vaccinated2": 363056
        }
      },
      "Darjeeling": {
        "delta": {
          "confirmed": 23,
          "recovered": 31,
          "vaccinated1": 945,
          "vaccinated2": 1844
        },
        "delta21_14": {
          "confirmed": 160
        },
        "delta7": {
          "confirmed": 189,
          "deceased": 1,
          "recovered": 214,
          "vaccinated1": 21148,
          "vaccinated2": 69087
        },
        "meta": {
          "population": 1842034
        },
        "total": {
          "confirmed": 57143,
          "deceased": 539,
          "recovered": 56326,
          "vaccinated1": 1324555,
          "vaccinated2": 664306
        }
      },
      "Hooghly": {
        "delta": {
          "confirmed": 58,
          "recovered": 74,
          "vaccinated1": 41006,
          "vaccinated2": 9034
        },
        "delta21_14": {
          "confirmed": 358
        },
        "delta7": {
          "confirmed": 472,
          "deceased": 2,
          "recovered": 497,
          "vaccinated1": 274722,
          "vaccinated2": 105570
        },
        "meta": {
          "population": 5520389
        },
        "total": {
          "confirmed": 86300,
          "deceased": 990,
          "recovered": 84650,
          "vaccinated1": 3368156,
          "vaccinated2": 1343978
        }
      },
      "Howrah": {
        "delta": {
          "confirmed": 73,
          "recovered": 73,
          "vaccinated1": 14299,
          "vaccinated2": 4502
        },
        "delta21_14": {
          "confirmed": 344
        },
        "delta7": {
          "confirmed": 518,
          "deceased": 2,
          "recovered": 473,
          "vaccinated1": 207351,
          "vaccinated2": 95203
        },
        "meta": {
          "population": 4841638
        },
        "total": {
          "confirmed": 98757,
          "deceased": 1524,
          "recovered": 96567,
          "vaccinated1": 2905925,
          "vaccinated2": 1254076
        }
      },
      "Jalpaiguri": {
        "delta": {
          "confirmed": 16,
          "deceased": 1,
          "recovered": 17,
          "vaccinated1": 9642,
          "vaccinated2": 3130
        },
        "delta21_14": {
          "confirmed": 110
        },
        "delta7": {
          "confirmed": 102,
          "deceased": 6,
          "recovered": 120,
          "vaccinated1": 53967,
          "vaccinated2": 63773
        },
        "meta": {
          "population": 3869675
        },
        "total": {
          "confirmed": 41982,
          "deceased": 572,
          "recovered": 41256,
          "vaccinated1": 1144138,
          "vaccinated2": 410719
        }
      },
      "Jhargram": {
        "delta": {
          "confirmed": 3,
          "recovered": 5,
          "vaccinated1": 477,
          "vaccinated2": 700
        },
        "delta21_14": {
          "confirmed": 37
        },
        "delta7": {
          "confirmed": 25,
          "recovered": 39,
          "vaccinated1": 39020,
          "vaccinated2": 19553
        },
        "meta": {
          "population": 1136548
        },
        "total": {
          "confirmed": 12135,
          "deceased": 27,
          "recovered": 12063,
          "vaccinated1": 714456,
          "vaccinated2": 211586
        }
      },
      "Kalimpong": {
        "delta": {
          "confirmed": 2,
          "recovered": 4,
          "vaccinated1": 8,
          "vaccinated2": 429
        },
        "delta21_14": {
          "confirmed": 30
        },
        "delta7": {
          "confirmed": 18,
          "recovered": 28,
          "vaccinated1": 513,
          "vaccinated2": 10626
        },
        "meta": {
          "population": 251642
        },
        "total": {
          "confirmed": 7036,
          "deceased": 54,
          "recovered": 6950,
          "vaccinated1": 180713,
          "vaccinated2": 124420
        }
      },
      "Kolkata": {
        "delta": {
          "confirmed": 274,
          "deceased": 6,
          "recovered": 244,
          "vaccinated1": 334,
          "vaccinated2": 1626
        },
        "delta21_14": {
          "confirmed": 1044
        },
        "delta7": {
          "confirmed": 1843,
          "deceased": 25,
          "recovered": 1553,
          "vaccinated1": 36977,
          "vaccinated2": 206020
        },
        "meta": {
          "population": 4486679
        },
        "total": {
          "confirmed": 322541,
          "deceased": 5152,
          "recovered": 315146,
          "vaccinated1": 4784084,
          "vaccinated2": 3039486
        }
      },
      "Malda": {
        "delta": {
          "confirmed": 32,
          "recovered": 8,
          "vaccinated1": 2191,
          "vaccinated2": 1771
        },
        "delta21_14": {
          "confirmed": 58
        },
        "delta7": {
          "confirmed": 77,
          "recovered": 51,
          "vaccinated1": 227391,
          "vaccinated2": 55976
        },
        "meta": {
          "population": 3997970
        },
        "total": {
          "confirmed": 33406,
          "deceased": 186,
          "recovered": 33121,
          "vaccinated1": 2029144,
          "vaccinated2": 590497
        }
      },
      "Murshidabad": {
        "delta": {
          "confirmed": 5,
          "recovered": 8,
          "vaccinated1": 17667,
          "vaccinated2": 1587
        },
        "delta21_14": {
          "confirmed": 31
        },
        "delta7": {
          "confirmed": 48,
          "deceased": 1,
          "recovered": 40,
          "vaccinated1": 621102,
          "vaccinated2": 86224
        },
        "meta": {
          "population": 7102430
        },
        "total": {
          "confirmed": 33993,
          "deceased": 328,
          "recovered": 33605,
          "vaccinated1": 3952659,
          "vaccinated2": 976111
        }
      },
      "Nadia": {
        "delta": {
          "confirmed": 31,
          "deceased": 1,
          "recovered": 48,
          "vaccinated1": 15875,
          "vaccinated2": 1863
        },
        "delta21_14": {
          "confirmed": 228
        },
        "delta7": {
          "confirmed": 302,
          "deceased": 8,
          "recovered": 326,
          "vaccinated1": 251739,
          "vaccinated2": 89327
        },
        "meta": {
          "population": 5168488
        },
        "total": {
          "confirmed": 73333,
          "deceased": 859,
          "recovered": 72054,
          "vaccinated1": 2798942,
          "vaccinated2": 884320
        }
      },
      "North 24 Parganas": {
        "delta": {
          "confirmed": 144,
          "deceased": 6,
          "recovered": 147,
          "vaccinated1": 5231,
          "vaccinated2": 7658
        },
        "delta21_14": {
          "confirmed": 763
        },
        "delta7": {
          "confirmed": 1066,
          "deceased": 27,
          "recovered": 961,
          "vaccinated1": 235852,
          "vaccinated2": 241201
        },
        "meta": {
          "population": 10082852
        },
        "total": {
          "confirmed": 329257,
          "deceased": 4833,
          "recovered": 323097,
          "vaccinated1": 6547702,
          "vaccinated2": 2720315
        }
      },
      "Other State": {
        "total": {
          "confirmed": 66,
          "deceased": 3,
          "recovered": 63
        }
      },
      "Paschim Bardhaman": {
        "delta": {
          "confirmed": 32,
          "recovered": 25,
          "vaccinated1": 286,
          "vaccinated2": 786
        },
        "delta21_14": {
          "confirmed": 74
        },
        "delta7": {
          "confirmed": 213,
          "deceased": 1,
          "recovered": 149,
          "vaccinated1": 94473,
          "vaccinated2": 72103
        },
        "meta": {
          "population": 2882031
        },
        "total": {
          "confirmed": 57778,
          "deceased": 356,
          "recovered": 57184,
          "vaccinated1": 1789611,
          "vaccinated2": 677747
        }
      },
      "Paschim Medinipur": {
        "delta": {
          "confirmed": 26,
          "recovered": 28,
          "vaccinated1": 6512,
          "vaccinated2": 1457
        },
        "delta21_14": {
          "confirmed": 136
        },
        "delta7": {
          "confirmed": 181,
          "deceased": 1,
          "recovered": 198,
          "vaccinated1": 270458,
          "vaccinated2": 66132
        },
        "meta": {
          "population": 5094238
        },
        "total": {
          "confirmed": 53581,
          "deceased": 507,
          "recovered": 52820,
          "vaccinated1": 2758576,
          "vaccinated2": 877978
        }
      },
      "Purba Bardhaman": {
        "delta": {
          "confirmed": 16,
          "recovered": 25,
          "vaccinated1": 17168,
          "vaccinated2": 4002
        },
        "delta21_14": {
          "confirmed": 132
        },
        "delta7": {
          "confirmed": 147,
          "deceased": 2,
          "recovered": 176,
          "vaccinated1": 260764,
          "vaccinated2": 51741
        },
        "meta": {
          "population": 4835532
        },
        "total": {
          "confirmed": 42005,
          "deceased": 198,
          "recovered": 41588,
          "vaccinated1": 2596246,
          "vaccinated2": 859528
        }
      },
      "Purba Medinipur": {
        "delta": {
          "confirmed": 16,
          "recovered": 17,
          "vaccinated1": 5370,
          "vaccinated2": 2226
        },
        "delta21_14": {
          "confirmed": 65
        },
        "delta7": {
          "confirmed": 94,
          "deceased": 1,
          "recovered": 120,
          "vaccinated1": 71724,
          "vaccinated2": 144185
        },
        "meta": {
          "population": 4417377
        },
        "total": {
          "confirmed": 63098,
          "deceased": 397,
          "recovered": 62549,
          "vaccinated1": 3560589,
          "vaccinated2": 1471674
        }
      },
      "Purulia": {
        "delta": {
          "confirmed": 2,
          "recovered": 3,
          "vaccinated1": 13266,
          "vaccinated2": 1866
        },
        "delta21_14": {
          "confirmed": 9
        },
        "delta7": {
          "confirmed": 17,
          "recovered": 21,
          "vaccinated1": 159111,
          "vaccinated2": 40922
        },
        "meta": {
          "population": 2927965
        },
        "total": {
          "confirmed": 19419,
          "deceased": 113,
          "recovered": 19283,
          "vaccinated1": 1679941,
          "vaccinated2": 492310
        }
      },
      "South 24 Parganas": {
        "delta": {
          "confirmed": 75,
          "deceased": 1,
          "recovered": 74,
          "vaccinated1": 7086,
          "vaccinated2": 3270
        },
        "delta21_14": {
          "confirmed": 267
        },
        "delta7": {
          "confirmed": 542,
          "deceased": 5,
          "recovered": 470,
          "vaccinated1": 310444,
          "vaccinated2": 169231
        },
        "meta": {
          "population": 8153176
        },
        "total": {
          "confirmed": 100957,
          "deceased": 1336,
          "recovered": 98950,
          "vaccinated1": 4850898,
          "vaccinated2": 1832073
        }
      },
      "Uttar Dinajpur": {
        "delta": {
          "confirmed": 8,
          "recovered": 7
        },
        "delta21_14": {
          "confirmed": 25
        },
        "delta7": {
          "confirmed": 43,
          "deceased": 2,
          "recovered": 46,
          "vaccinated1": 130243,
          "vaccinated2": 44686
        },
        "meta": {
          "population": 3000849
        },
        "total": {
          "confirmed": 19858,
          "deceased": 238,
          "recovered": 19559,
          "vaccinated1": 1341457,
          "vaccinated2": 436182
        }
      }
    },
    "meta": {
      "date": "2021-10-31",
      "last_updated": "2021-11-01T09:54:14+05:30",
      "population": 96906000,
      "tested": {
        "date": "2021-10-31",
        "source": "https://www.wbhealth.gov.in/uploaded_files/corona/WB_DHFW_Bulletin_31ST_OCT_REPORT_FINAL.pdf"
      },
      "vaccinated": {
        "date": "2021-10-31"
      }
    },
    "total": {
      "confirmed": 1592908,
      "deceased": 19141,
      "recovered": 1565471,
      "tested": 19228303,
      "vaccinated1": 56192166,
      "vaccinated2": 21559747
    }
  }
}

 */
