

package com.example.android.xyztouristattractions.provider;

import android.net.Uri;

import com.example.android.xyztouristattractions.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_SYDNEY = "Sydney";
    public static final String CITY_India = "Dehli";

    public static final String TEST_CITY = CITY_SYDNEY;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_SYDNEY, new LatLng(-33.873651, 151.2068896));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_SYDNEY, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction("Taj Mahel",
                    "17th-century, Mughal-style, marble mausoleum with minarets, a mosque & famously symmetrical gardens..",
                    "The Taj Mahal is an ivory-white marble mausoleum on the south bank of the Yamuna river in the Indian city of Agra. It was commissioned in 1632 by the Mughal emperor, Shah Jahan, to house the tomb of his favourite wife, Mumtaz Mahal.",
                    Uri.parse("https://lh3.googleusercontent.com/S-RsoG5pHkTTfV_rNf0wrS9N4twccKW-MlpVmn9FfGttBXRaF2_tgU-KyP1GGEdr0Gr2KhErhlNq_tXyLcCzGXW5IS3O9rS95bKNU7o60UyV7xs7WuLVc7i3M3YWK5XnKbabf1zoLJwEwS_wF2nW9JAqVj7Zl0Pm5bakbHKqiMHV9Sk0ufYh4Z_W2auGQIO9VAG7EY5y6kTQdJOsQMkI00t_di3OCAeuqQa5se3_J1zcv59aBQYQWVKKTASD9YAGeAF_Rrk3fDSzWv1Ritgoorh9JBKl9VBUntdulwoA515mySF2YQ4xrfb95Ew9Wmuv2A08Zmu93SR3rX0jS1A1zsnqLyCSJG__yAA-EysulXMJwHGfv5Y65dlk49503dmiCecGlN6jTQ8Bj_JKk-KcP72-8zVuqZo7T8kBgDwDdiUd-wVvKM-nEPgXwYD9QhiTlw6gqTqdJcHLNdlU1-FHiXv_KD3aRaz7Ymt5qjDmDka5lTCAOP7EjKTDgsu3K2J4tEyEOgiide7OVzRu9EsOqt47VUUA3oQGjwv9GCERcauMg49hsC2VduWybdx9huhIq7lnxdMGIYKS7nZPsr_qz4bEpLSHT5WCroyPYn4=w421-h245-no"),
                    Uri.parse("https://lh3.googleusercontent.com/S-RsoG5pHkTTfV_rNf0wrS9N4twccKW-MlpVmn9FfGttBXRaF2_tgU-KyP1GGEdr0Gr2KhErhlNq_tXyLcCzGXW5IS3O9rS95bKNU7o60UyV7xs7WuLVc7i3M3YWK5XnKbabf1zoLJwEwS_wF2nW9JAqVj7Zl0Pm5bakbHKqiMHV9Sk0ufYh4Z_W2auGQIO9VAG7EY5y6kTQdJOsQMkI00t_di3OCAeuqQa5se3_J1zcv59aBQYQWVKKTASD9YAGeAF_Rrk3fDSzWv1Ritgoorh9JBKl9VBUntdulwoA515mySF2YQ4xrfb95Ew9Wmuv2A08Zmu93SR3rX0jS1A1zsnqLyCSJG__yAA-EysulXMJwHGfv5Y65dlk49503dmiCecGlN6jTQ8Bj_JKk-KcP72-8zVuqZo7T8kBgDwDdiUd-wVvKM-nEPgXwYD9QhiTlw6gqTqdJcHLNdlU1-FHiXv_KD3aRaz7Ymt5qjDmDka5lTCAOP7EjKTDgsu3K2J4tEyEOgiide7OVzRu9EsOqt47VUUA3oQGjwv9GCERcauMg49hsC2VduWybdx9huhIq7lnxdMGIYKS7nZPsr_qz4bEpLSHT5WCroyPYn4=w421-h245-no"),
                    new LatLng(27.1750, 78.0422),
                    CITY_India
                    ));
            add(new Attraction("Somnath temple",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh3.googleusercontent.com/sIHRyq75_Gz3CbA8-m8_Xv7qLhxrsPhF2Tvn8aPxs7pRnADQz2uGH9Ts_gMr5ci7Qq0qVRx6rhcLMEuyo3B8T287tge_ZEQX0Gn1VHqGhwgzRD_GZ_HvejgsTwTlt2XyIPbe5YyxSkcxlpdwa6r-VkvBYgCiHKSS3w3VNDrqTBVMrddCccIFMbTAlNkgSDyZJZoqw70vrhLaL-BwP3SLYqGGHsqIKJFUiIU0MdyRxQeRTwmZA9v5-u6dQ0EVe_5cCMe5lOQ0RtMhQ6QEFgVLW6emr4rDjTfP3yL1loe-BxUtxJOgNmZvlvJXwxxkXfSN7SkWxpNc4gO-I0YxYOBmOgaZCgIHo4_5WrQd7E-r3G_BZSN_EISBb0USeG-7dTsbyNor-i-TfXalmOXh17XzYGGwGkrVO1K8kIItxnQSABxEuLYHxMVXD3G-rrgMbs4HouXqlt8qanMlVPyivcrKqF1YiKl3_sNBRpox3ox_-XdkVHweb2m2yeoEsmZEzJnRKvgMEYJsYN1EhEmSyEj7gIgxqVn4B02-3UTUdcLyGrE93Z6T2gOlm0Y13iHvtHgJ10mbwHUiU8Z7BRY1gaYQJa_8KNByNYFg0pHkOf8=w500-h333-no"),
                    Uri.parse("https://lh3.googleusercontent.com/sIHRyq75_Gz3CbA8-m8_Xv7qLhxrsPhF2Tvn8aPxs7pRnADQz2uGH9Ts_gMr5ci7Qq0qVRx6rhcLMEuyo3B8T287tge_ZEQX0Gn1VHqGhwgzRD_GZ_HvejgsTwTlt2XyIPbe5YyxSkcxlpdwa6r-VkvBYgCiHKSS3w3VNDrqTBVMrddCccIFMbTAlNkgSDyZJZoqw70vrhLaL-BwP3SLYqGGHsqIKJFUiIU0MdyRxQeRTwmZA9v5-u6dQ0EVe_5cCMe5lOQ0RtMhQ6QEFgVLW6emr4rDjTfP3yL1loe-BxUtxJOgNmZvlvJXwxxkXfSN7SkWxpNc4gO-I0YxYOBmOgaZCgIHo4_5WrQd7E-r3G_BZSN_EISBb0USeG-7dTsbyNor-i-TfXalmOXh17XzYGGwGkrVO1K8kIItxnQSABxEuLYHxMVXD3G-rrgMbs4HouXqlt8qanMlVPyivcrKqF1YiKl3_sNBRpox3ox_-XdkVHweb2m2yeoEsmZEzJnRKvgMEYJsYN1EhEmSyEj7gIgxqVn4B02-3UTUdcLyGrE93Z6T2gOlm0Y13iHvtHgJ10mbwHUiU8Z7BRY1gaYQJa_8KNByNYFg0pHkOf8=w500-h333-no"),
                    new LatLng(20.8880, 70.4012),
                    CITY_India
            ));
            add(new Attraction("Adalaj Stepwell",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh3.googleusercontent.com/4Rpg4DZSVEV35htNb62nM5zrmbDn6k_H2-4GwlTmf3NreUx_R69aZ1P4tQHl9okojN49VBYyA1cDoAHkU880b84-IHi-tZVWJ15NTKpqod-aeai1UrBbvBaYwx3ThwsC8u9leCePznBh5mzhYW-Ueo7SBVNgehonKomj6ZWiaesij4eGECUKvmNkPsqe3S0LIZM3d_i5ovWKWOkaSucC0BIC8TQ3CYiCas_I63auNu8OWRTtfDLua6p_L1nQ3MQRpnA33eAHc0Ao2Bl9Acsb36QZ3nHktarVinA9jp024Z-lDNPF_RPmdB-kRxT4eP0ZY8-XVNPT0QJvhSgWO5mrieIBnydUuTF34geTND_1MR9aw1-0CxNyww1ZR9_OWHFjCsttJW1AOzKJAFTVG4DzQr2hxco6290XXmw7azrheuSoUfzCK8uwVRftGhpIGmA7TL5MZ2nThvcXA6ZeKrTPkFkPGW1txu7_45F14otNcspW0uRRh5RQ_9ivdzn0ckH_WrgdtJiY5k2ynTQs5sp995pXz8v6WfVA4LRY8o1qRYYQ1rOoNrR6b0_j8deyKnhPfOVjyG_d8LYCqbz3Fv-E9i6_dzkIMEEWWfEXabo=w1039-h737-no"),
                    Uri.parse("https://lh3.googleusercontent.com/4Rpg4DZSVEV35htNb62nM5zrmbDn6k_H2-4GwlTmf3NreUx_R69aZ1P4tQHl9okojN49VBYyA1cDoAHkU880b84-IHi-tZVWJ15NTKpqod-aeai1UrBbvBaYwx3ThwsC8u9leCePznBh5mzhYW-Ueo7SBVNgehonKomj6ZWiaesij4eGECUKvmNkPsqe3S0LIZM3d_i5ovWKWOkaSucC0BIC8TQ3CYiCas_I63auNu8OWRTtfDLua6p_L1nQ3MQRpnA33eAHc0Ao2Bl9Acsb36QZ3nHktarVinA9jp024Z-lDNPF_RPmdB-kRxT4eP0ZY8-XVNPT0QJvhSgWO5mrieIBnydUuTF34geTND_1MR9aw1-0CxNyww1ZR9_OWHFjCsttJW1AOzKJAFTVG4DzQr2hxco6290XXmw7azrheuSoUfzCK8uwVRftGhpIGmA7TL5MZ2nThvcXA6ZeKrTPkFkPGW1txu7_45F14otNcspW0uRRh5RQ_9ivdzn0ckH_WrgdtJiY5k2ynTQs5sp995pXz8v6WfVA4LRY8o1qRYYQ1rOoNrR6b0_j8deyKnhPfOVjyG_d8LYCqbz3Fv-E9i6_dzkIMEEWWfEXabo=w1039-h737-no"),
                    new LatLng(23.1667, 72.5801),
                    CITY_India
            ));
            add(new Attraction("Akshardham",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh3.googleusercontent.com/1B9ITCnzyAVSvvDyNl6GEHE652pYB1sLIteZ84n61sYErDnpB5YHEn6uiF99cmCu-5naLVPogb7dq_vWalsU2OIEK3n_h0Dz9tXxRP_UizcK0gaikiIHhXXztLVcMgYCbtoO0pSF6161vMBrnjMjnAQ4xFjgTJ42lkPQH2c6YHrj-bEqQg7CRi5Qjmfe1kz7LphZdBmSKf6YfdQklnUWWzrEO_OB0IczU4zE9PYMdqyST7RqzSiHvLyuFvoPo5b9dKwuNCLHJjWcE4MgC0Z58Wc_j3af_S8GjyWqanS7Q5sSUngZAMQAulcO87CBMrxR9aTBvKBESlYbkrbg86mNODp5x3aXhIYfot80T_wNgAWYRal_85_kcFxQh8R-0Kl76nM_pLN-0BqPydxexGCS6kHod6q3AZqPZOrLBfiZTAg0-uv87SGJ17bMx1AMxdkz8Kp5QPWP3eLdrFARdzC_NqTuI_nT-B3P1hF6IIZjmNIODewnxkxuJIB88pGjhtz48IAqwczYCL1B0CWaxTneGu6MQ1fhH3YB5po_so5sQPeqlmnBnJix_JS1Zx0yrevp3JEujSKDFMPTQEwlBqVeNVDMde9uRCZ1KIg2IUM=w562-h374-no"),
                    Uri.parse("https://lh3.googleusercontent.com/1B9ITCnzyAVSvvDyNl6GEHE652pYB1sLIteZ84n61sYErDnpB5YHEn6uiF99cmCu-5naLVPogb7dq_vWalsU2OIEK3n_h0Dz9tXxRP_UizcK0gaikiIHhXXztLVcMgYCbtoO0pSF6161vMBrnjMjnAQ4xFjgTJ42lkPQH2c6YHrj-bEqQg7CRi5Qjmfe1kz7LphZdBmSKf6YfdQklnUWWzrEO_OB0IczU4zE9PYMdqyST7RqzSiHvLyuFvoPo5b9dKwuNCLHJjWcE4MgC0Z58Wc_j3af_S8GjyWqanS7Q5sSUngZAMQAulcO87CBMrxR9aTBvKBESlYbkrbg86mNODp5x3aXhIYfot80T_wNgAWYRal_85_kcFxQh8R-0Kl76nM_pLN-0BqPydxexGCS6kHod6q3AZqPZOrLBfiZTAg0-uv87SGJ17bMx1AMxdkz8Kp5QPWP3eLdrFARdzC_NqTuI_nT-B3P1hF6IIZjmNIODewnxkxuJIB88pGjhtz48IAqwczYCL1B0CWaxTneGu6MQ1fhH3YB5po_so5sQPeqlmnBnJix_JS1Zx0yrevp3JEujSKDFMPTQEwlBqVeNVDMde9uRCZ1KIg2IUM=w562-h374-no"),
                    new LatLng(23.2310, 72.6741),
                    CITY_India
            ));
            add(new Attraction("The Red Fort",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh3.googleusercontent.com/FSgd3CvxkbKYGTpv8JgYKOtpJYo7H0vRqsggztTutwk459S1MSu2-Z7WZdmCVAKzyfIUJ31suUQoXRKToumDJMYXyChuVYUULntwcViMnltMp1H1PjiPdtXQlgc_GYyqsVB4wgihCEA3v36mvrPp-lcykQ-18C41_rCPfURiROlXPxtGhQTwYQNdV8MjFqiud2DW1Rz4m6QeDs5RmWvaosGEijnUMgov0VtUA2tk06sYb0Z_tISUdEh6pb7ZU89BgMlGh44dOsBco8jC5nZGnexE6tOj2_rovW6WUWjromFMV04FfceMTqIKs6sn0YNf2sa4lncj0c9U9Y7b-EA2HPlGrVGM-HfMiZ5PB2J4GTGES1RlDtEM2Ea8DCP7LjMQj89MyCzyn7aeb7cJ_yHoQ4rnkgzOdnBeMRKtLUT_jsMRDoOFqiCWnUX-if9_uCzpQKqIOVVNcBXal9Mo3Ohxqd3xlu16idINCS1AtAbXhhTJdne1dpLkFDJz83wyVYYwqPjEamLcucHxGmzOJOtiwr-49mWlj_TYJpzYleSXrnhRtnivIBGn5vYqbh0d-yXW6V2UE2SR2j_Rk4BqlRuHwl8XJuz6kymkIRtrcgI=w431-h242-no"),
                    Uri.parse("https://lh3.googleusercontent.com/FSgd3CvxkbKYGTpv8JgYKOtpJYo7H0vRqsggztTutwk459S1MSu2-Z7WZdmCVAKzyfIUJ31suUQoXRKToumDJMYXyChuVYUULntwcViMnltMp1H1PjiPdtXQlgc_GYyqsVB4wgihCEA3v36mvrPp-lcykQ-18C41_rCPfURiROlXPxtGhQTwYQNdV8MjFqiud2DW1Rz4m6QeDs5RmWvaosGEijnUMgov0VtUA2tk06sYb0Z_tISUdEh6pb7ZU89BgMlGh44dOsBco8jC5nZGnexE6tOj2_rovW6WUWjromFMV04FfceMTqIKs6sn0YNf2sa4lncj0c9U9Y7b-EA2HPlGrVGM-HfMiZ5PB2J4GTGES1RlDtEM2Ea8DCP7LjMQj89MyCzyn7aeb7cJ_yHoQ4rnkgzOdnBeMRKtLUT_jsMRDoOFqiCWnUX-if9_uCzpQKqIOVVNcBXal9Mo3Ohxqd3xlu16idINCS1AtAbXhhTJdne1dpLkFDJz83wyVYYwqPjEamLcucHxGmzOJOtiwr-49mWlj_TYJpzYleSXrnhRtnivIBGn5vYqbh0d-yXW6V2UE2SR2j_Rk4BqlRuHwl8XJuz6kymkIRtrcgI=w431-h242-no"),
                    new LatLng(28.6562, 77.2410),
                    CITY_India
            ));
            add(new Attraction("Ellora Caves",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh3.googleusercontent.com/Vy2FbBXzlNCt81K56l3FepOygFPazTXHe76qTSzq--JjQ0YU5wbVAuqBrhpauIUp63CxwdG8AcqgFvY4Ei3nA54rGfJI-6fH5CRpY9R_RpakMMuUIvYZO48y8SAUD3qlty3XNBaB-j_TiTBnpYIpP3x-8aLvo6cx9P5vUb03FfYO2WWO6MCb7wZCO6OWB8STghmb6TGAOQq7Mi_U9KHoy3y9r7O1jH5FFDiHU685uRUIgMk7KT-uKZNz_3m4EojBxFORHkPNTetWEweDk3dEfHkGbtKjagY5VAS5HbxzPmTw9-rK6palPznK_XNx3aDanjTK9RpDqfrzVO7ZP4LrlkSdvMqujGDu7CvNWRjMDpipyfUHaig0aK9bQW4XlVDmEf20SXYnWt4AxtKdQDOoeDsV4liFmUgzI_JcZ9PBNcUcaGR4kD3RFvcfAMN4zWXsanLYeCFIaZ2m_BjEKFb1O7NQFzckcJBqxYUhIzzNMWtax573Jz-NJ2mvg1RMeMG6X9ign_64JqK8UKILAxQsenMqIxY4xp1OKK1v5Asmm4fegxDf0HYLsZZDEJjWrxoIZf-vK4VeHgbyz2jSBjk6dUwGEPjtSEDJqF-hc0U=w259-h194-no"),
                    Uri.parse("https://lh3.googleusercontent.com/Vy2FbBXzlNCt81K56l3FepOygFPazTXHe76qTSzq--JjQ0YU5wbVAuqBrhpauIUp63CxwdG8AcqgFvY4Ei3nA54rGfJI-6fH5CRpY9R_RpakMMuUIvYZO48y8SAUD3qlty3XNBaB-j_TiTBnpYIpP3x-8aLvo6cx9P5vUb03FfYO2WWO6MCb7wZCO6OWB8STghmb6TGAOQq7Mi_U9KHoy3y9r7O1jH5FFDiHU685uRUIgMk7KT-uKZNz_3m4EojBxFORHkPNTetWEweDk3dEfHkGbtKjagY5VAS5HbxzPmTw9-rK6palPznK_XNx3aDanjTK9RpDqfrzVO7ZP4LrlkSdvMqujGDu7CvNWRjMDpipyfUHaig0aK9bQW4XlVDmEf20SXYnWt4AxtKdQDOoeDsV4liFmUgzI_JcZ9PBNcUcaGR4kD3RFvcfAMN4zWXsanLYeCFIaZ2m_BjEKFb1O7NQFzckcJBqxYUhIzzNMWtax573Jz-NJ2mvg1RMeMG6X9ign_64JqK8UKILAxQsenMqIxY4xp1OKK1v5Asmm4fegxDf0HYLsZZDEJjWrxoIZf-vK4VeHgbyz2jSBjk6dUwGEPjtSEDJqF-hc0U=w259-h194-no"),
                    new LatLng(20.0269, 75.1772),
                    CITY_India
            ));
            add(new Attraction("Golden Temple",
                    "Central worship place for Sikhs around the world, built from white marble overlaid with gold leaf.",
                    "The Golden Temple, also known as Sri Harmandir Sahib or Darbar Sahib, is a Gurdwara located in the city of Amritsar, Punjab, India. It is the holiest Gurdwara and the most important pilgrimage site of Sikhism.",
                    Uri.parse("https://lh3.googleusercontent.com/8bkBwzMr5gEV9CcIP-EyQ90DB5FGjVmVCovrNKORrXfrJ9X6d1-eCLwD-MQdoAcBFNauaROZB_gxV4LSs7I1a5HnRD1rSN4GuunRCbOWqk6T1R2jHgvakZOmOh12uuCAYS-mLidMyqT7uMpM-ZNEiP2OmLDpcTaBWgK2n_oCGcvrV7Wv4HAjOyR5drOhWvEbJwejyJTQZkTSYSZvdJdEbxSDULKfBt5jpthzb2qGtbuClcUmFOHxGZxI_Ew26VEWuCi5s89FJnU4DFws-N-cg8IIE1rI8mJqbir-nKjzFDaIzuZaxvxeJF6vl40sz6ng2baQfBkOSwWOuLNP_7lqfB55cv8WID6ynG9KYdWeGZIow82chX6MAM9FBlWBPbN7A27h8lU6iiXb7wxOSxkFPf4OQs4omKF-HiEqWIpoyhAL7pNvWgKSFeOf2sY0N60RlG966OB1GgN4hOiE4rK1_zl2vlzY3pPvdnbKlhGt0ftdaIUMD8pO0mPzIXdttwjUhFcpj4SVcej22qTEfl5koSLC3pCNJBBAU_-Bf6BaZZPoGGif8GPLWI0P0m28JV_6VZRy4_7ulOZJutNTByewxKhVSBT31xeKs08opwM=w500-h333-no"),
                    Uri.parse("https://lh3.googleusercontent.com/8bkBwzMr5gEV9CcIP-EyQ90DB5FGjVmVCovrNKORrXfrJ9X6d1-eCLwD-MQdoAcBFNauaROZB_gxV4LSs7I1a5HnRD1rSN4GuunRCbOWqk6T1R2jHgvakZOmOh12uuCAYS-mLidMyqT7uMpM-ZNEiP2OmLDpcTaBWgK2n_oCGcvrV7Wv4HAjOyR5drOhWvEbJwejyJTQZkTSYSZvdJdEbxSDULKfBt5jpthzb2qGtbuClcUmFOHxGZxI_Ew26VEWuCi5s89FJnU4DFws-N-cg8IIE1rI8mJqbir-nKjzFDaIzuZaxvxeJF6vl40sz6ng2baQfBkOSwWOuLNP_7lqfB55cv8WID6ynG9KYdWeGZIow82chX6MAM9FBlWBPbN7A27h8lU6iiXb7wxOSxkFPf4OQs4omKF-HiEqWIpoyhAL7pNvWgKSFeOf2sY0N60RlG966OB1GgN4hOiE4rK1_zl2vlzY3pPvdnbKlhGt0ftdaIUMD8pO0mPzIXdttwjUhFcpj4SVcej22qTEfl5koSLC3pCNJBBAU_-Bf6BaZZPoGGif8GPLWI0P0m28JV_6VZRy4_7ulOZJutNTByewxKhVSBT31xeKs08opwM=w500-h333-no"),
                    new LatLng(31.6200, 74.8765),
                    CITY_India
            ));
            add(new Attraction("Qutb Minar",
                    "73m tapering tower built in 1193 by Qutab-ud-din Aibak after defeat of Delhi's last Hindu kingdom.",
                    "The Qutub Minar, also spelled as Qutab Minar, or Qutb Minar, is the tallest minaret in the world made up of bricks. The minaret forms a part of the Qutab complex, a UNESCO World Heritage Site in the Mehrauli area of Delhi, India.",
                    Uri.parse("https://lh3.googleusercontent.com/0szFoKY2dcr5HwYqPQA2by-_yCphrCVbHlNhI88mXlY1-_Uh_MjVgVFrcl3o-11sJ1tEVc7hpByB2drO5HmRnZOeylM30nx-lhggJY5cp5Hr86C1xax3ejeolIWtQivgJVjdCeqjprvMK_J_ZCq0okmUxQLQHd1B2ryeSadPDICfjzK2chf-6quY8Oo-m8Y59Vp-k2fzR21qk705DZc3C4Y9kkFI7u_rCftyBzmDHOK9vXe-6dOTNlo6WXVhu7nN9wqJLkitYePbJPccGQ0yovX0XYXnCCDN6ffxeQtVQXdiL2EkjbSsPiti0W0w0bMlZpbH1QFltQIJ0JEk-NTvD3Z_R4F4RPKe0KFR8crEJXkpLNyWJXRhwaIe_tkdQ0n8_GM7MTAyPF9P70lBaDFDuKkG-UylqlCEXrfMd8cHVkkxys5o26yaNcKheqfcmi2f77w_kBXKHY_Tt8HWCHdWnsMnohZrs_nVIzgt7IBvAkKpYueNXqdWcdvW3VOVXbkq-5yIeW0MzfYEPP5f0mkR-gNuyhA5loF6UMz3KevrU1qBuLUx5dXsMfLY9ev5d0vhFhKeX4bq0KUOTmC6MO8u-olOqX1C7VufKf-CfSE=w275-h183-no"),
                    Uri.parse("https://lh3.googleusercontent.com/0szFoKY2dcr5HwYqPQA2by-_yCphrCVbHlNhI88mXlY1-_Uh_MjVgVFrcl3o-11sJ1tEVc7hpByB2drO5HmRnZOeylM30nx-lhggJY5cp5Hr86C1xax3ejeolIWtQivgJVjdCeqjprvMK_J_ZCq0okmUxQLQHd1B2ryeSadPDICfjzK2chf-6quY8Oo-m8Y59Vp-k2fzR21qk705DZc3C4Y9kkFI7u_rCftyBzmDHOK9vXe-6dOTNlo6WXVhu7nN9wqJLkitYePbJPccGQ0yovX0XYXnCCDN6ffxeQtVQXdiL2EkjbSsPiti0W0w0bMlZpbH1QFltQIJ0JEk-NTvD3Z_R4F4RPKe0KFR8crEJXkpLNyWJXRhwaIe_tkdQ0n8_GM7MTAyPF9P70lBaDFDuKkG-UylqlCEXrfMd8cHVkkxys5o26yaNcKheqfcmi2f77w_kBXKHY_Tt8HWCHdWnsMnohZrs_nVIzgt7IBvAkKpYueNXqdWcdvW3VOVXbkq-5yIeW0MzfYEPP5f0mkR-gNuyhA5loF6UMz3KevrU1qBuLUx5dXsMfLY9ev5d0vhFhKeX4bq0KUOTmC6MO8u-olOqX1C7VufKf-CfSE=w275-h183-no"),
                    new LatLng(28.5244, 77.1855),
                    CITY_India
            ));
            add(new Attraction("Ranthambore National Park",
                    "Major destination for seeing tigers in their natural habitat plus other wildlife, with scenic ruins.",
                    "Ranthambore National Park is a vast wildlife reserve near the town of Sawai Madhopur in Rajasthan, northern India. It is a former royal hunting ground and home to tigers, leopards and marsh crocodiles. Its landmarks include the imposing 10th-century Ranthambore Fort, on a hilltop, and the Ganesh Mandir temple. Also in the park, Padam Talao Lake is known for its abundance of water lilies..",
                    Uri.parse("https://lh3.googleusercontent.com/MNvil2uOJgqaKlFTAdjBi61NJA30hDcauAKHiyZrk3LyjuJXX_lw-K7BT_QwGDWGR9Q4BH_mKUsbD3eEJjgXhCyuEnbhK797rNIUGZCfozX6vBotUs1LNv9iiD-2go7JI4UqMUUH6F-wH4X6V4WulEvcdLfMHmw8FefTh1zgghyqK-0CgPDd5NFA7nj3rmAC_BoNUIqN1Emwb1wfEml5XSq-AQralJtuyewRsRNt_XFtLSCf6-eUXJmuCNXsfrPjVVaBNmyOucchU-30_beaUUhuqRmKPX8GPSud3XXC0Ec6yC9wr8FB6YhRXGfrzECOYjewDjeKq9xYX7mIrGOyrd_Bh2Xz1yNtPQOFPLLukTYpS-BWJOyJYRBb3R5Co81i8ktzu2H2-blJkcKVmHc1qv9X9Em_i3jAuRX2k1JaHVbsS1Vul0tvbjd86tleZm9TSGQCz9sOWL04uL1QtOCrT4saTV5d-WwMNCDJagdfvQHfCVDD4gAXun_gWXDGvwS4D1AtgV5OUv987nCGc95qU89xIDm3ZVdfSCqAmnXiQsoxunK-cmVrS1jj3xzjUiQzPw_l4pVJQ5rpPA0JIAYjRuYjB1_9YdWozsudJsw=w296-h170-no"),
                    Uri.parse("https://lh3.googleusercontent.com/MNvil2uOJgqaKlFTAdjBi61NJA30hDcauAKHiyZrk3LyjuJXX_lw-K7BT_QwGDWGR9Q4BH_mKUsbD3eEJjgXhCyuEnbhK797rNIUGZCfozX6vBotUs1LNv9iiD-2go7JI4UqMUUH6F-wH4X6V4WulEvcdLfMHmw8FefTh1zgghyqK-0CgPDd5NFA7nj3rmAC_BoNUIqN1Emwb1wfEml5XSq-AQralJtuyewRsRNt_XFtLSCf6-eUXJmuCNXsfrPjVVaBNmyOucchU-30_beaUUhuqRmKPX8GPSud3XXC0Ec6yC9wr8FB6YhRXGfrzECOYjewDjeKq9xYX7mIrGOyrd_Bh2Xz1yNtPQOFPLLukTYpS-BWJOyJYRBb3R5Co81i8ktzu2H2-blJkcKVmHc1qv9X9Em_i3jAuRX2k1JaHVbsS1Vul0tvbjd86tleZm9TSGQCz9sOWL04uL1QtOCrT4saTV5d-WwMNCDJagdfvQHfCVDD4gAXun_gWXDGvwS4D1AtgV5OUv987nCGc95qU89xIDm3ZVdfSCqAmnXiQsoxunK-cmVrS1jj3xzjUiQzPw_l4pVJQ5rpPA0JIAYjRuYjB1_9YdWozsudJsw=w296-h170-no"),
                    new LatLng(26.0173, 76.5026),
                    CITY_India
            ));
            add(new Attraction("Amer Fort",
                    "Structure known as both Amer and Amber, with Hindu & Muslim elements & offering elephant rides.",
                    "Amer Fort is a fort located in Amer, Rajasthan, India. Amer is a town with an area of 4 square kilometres located 11 kilometres from Jaipur, the capital of Rajasthan. Located high on a hill, it is the principal tourist attraction in Jaipur. ",
                    Uri.parse("https://lh3.googleusercontent.com/st3Y3QLHY-VYfYM0EmBy16gLJxGTifFwHAXu6r2a4QW7DdlN-XUEctbKb5ttzpTP7QsCPLsupLT3DUudrg3Aq0EHk3sXdLo1ryMQaRKvyHYGHE70FhcqqJql45fO2lQmiYIGHOX0RY6HzkDK9gf-rBFSYSBl1lQ21kdLwxbHZ3ApWRFg1qId6vtC6pwmKYeyF6Y40RFPMBhj8XaKxyaZrY6vbWDpbsfDJg5vKTncUSLWy1Y04zUY0IG2fKM9vHbEDqaTiki7YxfMVOmJlSHMpkwG_pGqbij5c3zYuQJXEE5xKpIujcCxRzdLLSdpModqc8uT5ZAc83TzeGr88Imon9OZ-qcUkQ6J91Z4evWBx9lPM-Y5LCpXNy36ukgXotsik1-lXcg0Oh7aI2G3UZdR3fgrnhKKGVmi01oewQDDcSiTbBh-bvFHJRZWk4fPnNMxJicY_2I6XMlLLxrOvq5uEa4-fw7L17L2igTsSt4qncd3sIwCQ0qYfp9j9Y9i0P5Sv3Kg5w08vEjo7wQ8DtaxvTaogWh3VqZ_2WAXw5BrbXevwLNo8ErNRmpVLjonUuYLick8y9p6fSt2KcrBAWSXgBcnnL4eg2aDcpTduOw=w500-h281-no"),
                    Uri.parse("https://lh3.googleusercontent.com/st3Y3QLHY-VYfYM0EmBy16gLJxGTifFwHAXu6r2a4QW7DdlN-XUEctbKb5ttzpTP7QsCPLsupLT3DUudrg3Aq0EHk3sXdLo1ryMQaRKvyHYGHE70FhcqqJql45fO2lQmiYIGHOX0RY6HzkDK9gf-rBFSYSBl1lQ21kdLwxbHZ3ApWRFg1qId6vtC6pwmKYeyF6Y40RFPMBhj8XaKxyaZrY6vbWDpbsfDJg5vKTncUSLWy1Y04zUY0IG2fKM9vHbEDqaTiki7YxfMVOmJlSHMpkwG_pGqbij5c3zYuQJXEE5xKpIujcCxRzdLLSdpModqc8uT5ZAc83TzeGr88Imon9OZ-qcUkQ6J91Z4evWBx9lPM-Y5LCpXNy36ukgXotsik1-lXcg0Oh7aI2G3UZdR3fgrnhKKGVmi01oewQDDcSiTbBh-bvFHJRZWk4fPnNMxJicY_2I6XMlLLxrOvq5uEa4-fw7L17L2igTsSt4qncd3sIwCQ0qYfp9j9Y9i0P5Sv3Kg5w08vEjo7wQ8DtaxvTaogWh3VqZ_2WAXw5BrbXevwLNo8ErNRmpVLjonUuYLick8y9p6fSt2KcrBAWSXgBcnnL4eg2aDcpTduOw=w500-h281-no"),
                    new LatLng(26.9855, 75.8513),
                    CITY_India
            ));
            add(new Attraction("Hawa Mahal",
                    "Palace built in the form of a high wall to screen royal ladies as they watched street festivities.",
                    "Hawa Mahal is a palace in Jaipur, India. It is constructed of red and pink sandstone. The palace sits on the edge of the City Palace, Jaipur, and extends to the zenana, or women's chambers. ",
                    Uri.parse("https://lh3.googleusercontent.com/pI-WpAetncA3d4IwOyutwQJ8zw1qCP9gg9P-8ht-GSX-U-iVP9MuDy1w_d3W7ZgBkMptOJPoiqhH7cxQQrX3Rp56i0LtKr4GINzYN_jStYWsuL-rMCyqXz3-oyTrj-h5-tSbFBZX2zwteXLwcDFa5QArDkLZaUtUMIWJD_SNB0_ZrTIO14fXtIp8Rf-FaulyeIYAWYv75idKzgRDDUgaULs2JurHN4u0pg8xG4Cf81c3shUIpHjN2_CxYEWKhUeLLhLjTiaLlF4YOMAmtiZz0LszIS_asY0mCvwVE2AqHHO_aqD5Vei0wNdISz0K8v-3vhpJseZsOL1-TUZ0TfbsltTSwtcwAf5okf_jLLSDxf1K572CeGvEgvzDzH6xj5d51jHSpHC3hK7cy95OfIcthFekrIyv7xy_IawUlHSXJw7u2vALeRlXURJl3W01VFpHJQNjZGnPQASW7m6Jmb9qFop3byDhysWztWWtt5a6DYfgamsgYLd0H9CBEBLmYK2Snsoht_hSPOPjaXY3dLa-Crfm8C18_K25nuCMtZCunM3ityrZyWa6Vb64YkCcXWbRmZpAIducBfg3pTuZn1DbRP0WZBeIGgqCqg_4RGc=w387-h237-no"),
                    Uri.parse("https://lh3.googleusercontent.com/pI-WpAetncA3d4IwOyutwQJ8zw1qCP9gg9P-8ht-GSX-U-iVP9MuDy1w_d3W7ZgBkMptOJPoiqhH7cxQQrX3Rp56i0LtKr4GINzYN_jStYWsuL-rMCyqXz3-oyTrj-h5-tSbFBZX2zwteXLwcDFa5QArDkLZaUtUMIWJD_SNB0_ZrTIO14fXtIp8Rf-FaulyeIYAWYv75idKzgRDDUgaULs2JurHN4u0pg8xG4Cf81c3shUIpHjN2_CxYEWKhUeLLhLjTiaLlF4YOMAmtiZz0LszIS_asY0mCvwVE2AqHHO_aqD5Vei0wNdISz0K8v-3vhpJseZsOL1-TUZ0TfbsltTSwtcwAf5okf_jLLSDxf1K572CeGvEgvzDzH6xj5d51jHSpHC3hK7cy95OfIcthFekrIyv7xy_IawUlHSXJw7u2vALeRlXURJl3W01VFpHJQNjZGnPQASW7m6Jmb9qFop3byDhysWztWWtt5a6DYfgamsgYLd0H9CBEBLmYK2Snsoht_hSPOPjaXY3dLa-Crfm8C18_K25nuCMtZCunM3ityrZyWa6Vb64YkCcXWbRmZpAIducBfg3pTuZn1DbRP0WZBeIGgqCqg_4RGc=w387-h237-no"),
                    new LatLng(26.9239, 75.8267),
                    CITY_India
            ));
            add(new Attraction("City Palace, Jaipur",
                    "Opulent 18th-century palace of Maharaja Sawai Jai Singh II, now a museum & royal residence.",
                    "City Palace, Jaipur, which includes the Chandra Mahal and Mubarak Mahal palaces and other buildings, is a palace complex in Jaipur, the capital of the Rajasthan state, India. ",
                    Uri.parse("https://lh3.googleusercontent.com/SglkZsPjf-xL3ekbELTG5JufHNdft3tWQQRNpSQdX2-HH2Z9Yqp0dzIWItc1COkfr0rWxl3jNeeYa8l2HWzDSvTLdFiSM60psj7ka563aZSr9i8I0CWi548phIgRiCn8gDevahwUfM9k9ST1e-l6HMg7N9Zgbbg7ZJxDT6n4HJc4fZR2fkOXkkUl5iV4q-ENySXuO3E26exlt-3pfsIhd-6jCxJ-Etz06GWdSA6i6y8dw1p6afVUj__VlAC-bVj45JJ0Nylr4o9mMjfIcnsF0Arxta88HX0t5H_e1PKzrCAixkWagKh_WkzJI7erVh4N-IoKerT6089VEyQrS68XqaSbriJP5VILvdkekVHg15fVCbeMZTYNoQJYNuctqu9SyTt9BdC1atMmTWC5oURcg5jXR5J79fXbLX0n1irE_O9BvbNVsmDum1mcWaRMVrRMEqT5ZJ5XT6CEmaT7isRxuU8olKlTGHzTCaEdcJVjgG6bowS8RQPxAxWErGwZuQaTE97GNMvPi0TXQXcxDjOukQAMZawu4v9JYRB0xZfkiPKCF6Sfaox3A37aGc6VKCbZxxPS4FMP3Qr_YfBEnucNHDXdghaCey-4-xmUxuU=w646-h356-no"),
                    Uri.parse("https://lh3.googleusercontent.com/SglkZsPjf-xL3ekbELTG5JufHNdft3tWQQRNpSQdX2-HH2Z9Yqp0dzIWItc1COkfr0rWxl3jNeeYa8l2HWzDSvTLdFiSM60psj7ka563aZSr9i8I0CWi548phIgRiCn8gDevahwUfM9k9ST1e-l6HMg7N9Zgbbg7ZJxDT6n4HJc4fZR2fkOXkkUl5iV4q-ENySXuO3E26exlt-3pfsIhd-6jCxJ-Etz06GWdSA6i6y8dw1p6afVUj__VlAC-bVj45JJ0Nylr4o9mMjfIcnsF0Arxta88HX0t5H_e1PKzrCAixkWagKh_WkzJI7erVh4N-IoKerT6089VEyQrS68XqaSbriJP5VILvdkekVHg15fVCbeMZTYNoQJYNuctqu9SyTt9BdC1atMmTWC5oURcg5jXR5J79fXbLX0n1irE_O9BvbNVsmDum1mcWaRMVrRMEqT5ZJ5XT6CEmaT7isRxuU8olKlTGHzTCaEdcJVjgG6bowS8RQPxAxWErGwZuQaTE97GNMvPi0TXQXcxDjOukQAMZawu4v9JYRB0xZfkiPKCF6Sfaox3A37aGc6VKCbZxxPS4FMP3Qr_YfBEnucNHDXdghaCey-4-xmUxuU=w646-h356-no"),
                    new LatLng(26.9258, 75.8237),
            CITY_India
            ));
            add(new Attraction("India Gate",
                    "Imposing Arc de Triomphe-style gate commemorating the Indian soliders killed in the First World War.",
                    "The India Gate is a war memorial located astride the Rajpath, on the eastern edge of the \"ceremonial axis\" of New Delhi, India, formerly called Kingsway. ",
                    Uri.parse("https://lh3.googleusercontent.com/qetO2Jj3tBVvlcqMfFgSnUl0IXo_uUZhVn0MX2yePXhC6QSzPQ-SRpaRquJLorCa58zEW6WPmDS2v72ju_rIuJJwDzItXmCXETkoRqAsXYFEOxKzmYFGl3nNYFk7ExxC9ib5NeN7red5prsFCBPXhsdl336Ugr7MoFvlcHzDQ5Oqcx88hM2t3VUqm-3y3YkJckv7TRAwa5TFdBjPU0xDumwC5CdSk1g43ROtCAd1lZUsFEXHR382eHJmDimj-3UEQhNkj-ZMQu9Uu0QJXzc0jQfVD8YX7kO7SSvKDAc0eiQOJrRJlCCJLdKj_526Tt7WtzED_4KbyPwi2i15B4yobJpXcuVYpEmSkhlYIT-aw_FeKoTQs-KvGjxz2PVqFfQdAsj9kRjLEi2SBH1TNuL-ea4ngoVU2RolgsXXQX_tMzEZ0i3LFWlCvKVFKsEUapZz0O9fc5HurP-6qsMbUO0y14K2EPyBu6dTjh4SbTT63ZUhUHcgDPaYVS9Fijv0eKs5-MsQ4o6XCxS8MzhvI9tRoa04Rg8lTZdfYyPhzc09A2Jhm9IRL0qLsLq6E6QWWn8vRYh68InZPiS8h1mKhHCSD93mPaOnxbpZgNAMCJg=w341-h256-no"),
                    Uri.parse("https://lh3.googleusercontent.com/qetO2Jj3tBVvlcqMfFgSnUl0IXo_uUZhVn0MX2yePXhC6QSzPQ-SRpaRquJLorCa58zEW6WPmDS2v72ju_rIuJJwDzItXmCXETkoRqAsXYFEOxKzmYFGl3nNYFk7ExxC9ib5NeN7red5prsFCBPXhsdl336Ugr7MoFvlcHzDQ5Oqcx88hM2t3VUqm-3y3YkJckv7TRAwa5TFdBjPU0xDumwC5CdSk1g43ROtCAd1lZUsFEXHR382eHJmDimj-3UEQhNkj-ZMQu9Uu0QJXzc0jQfVD8YX7kO7SSvKDAc0eiQOJrRJlCCJLdKj_526Tt7WtzED_4KbyPwi2i15B4yobJpXcuVYpEmSkhlYIT-aw_FeKoTQs-KvGjxz2PVqFfQdAsj9kRjLEi2SBH1TNuL-ea4ngoVU2RolgsXXQX_tMzEZ0i3LFWlCvKVFKsEUapZz0O9fc5HurP-6qsMbUO0y14K2EPyBu6dTjh4SbTT63ZUhUHcgDPaYVS9Fijv0eKs5-MsQ4o6XCxS8MzhvI9tRoa04Rg8lTZdfYyPhzc09A2Jhm9IRL0qLsLq6E6QWWn8vRYh68InZPiS8h1mKhHCSD93mPaOnxbpZgNAMCJg=w341-h256-no"),
                    new LatLng(28.6129, 77.2295),
                    CITY_India
            ));
            add(new Attraction("Agra Fort",
                    "Richly decorated semi-circular red sandstone fort complex with double ramparts and monuments.",
                    "Agra Fort is a historical fort in the city of Agra in India. It was the main residence of the emperors of the Mughal Dynasty till 1638, when the capital was shifted from Agra to Delhi. The Agra fort is a UNESCO World Heritage site. ",
                    Uri.parse("https://lh3.googleusercontent.com/Hst8DDyp8UqMmuam55kiESpDEtI313Qhi4iGm6e0aXO9BFRdwHoKiTuD6AAgy4H6Mvc0bv54K_WpTp0ojxOSla06_fC_OKuUzGyxXUqI-hqKQl7z-3mkQ4N1GUwYJin1mMbrbpYejxcI4UC4sTufmWSpbjN68ouMYtGDSsYsj8D5nzBwdbU1CVC8O7BAxs7Fonl5fUlSsf3nYVqu6D4oqk8tPyMPQeKmRsR8qY9nXl0rsv_eO6T_Ssdzku3sQoCqlCLNlMpGLuUxpg-gNIBGpD9YKzNM8EEz7T-3_pb3qXByhqCMj7b899Hju4HjQXVoMFj7HYRprhbdu5AgrTd46Yjj29G645vophV-3yVCoMxZfwIdoDRdx3uqz5mTQrwEZOXdNTlqS9aBb7z9H0rWjG_CDLAOC21CbqwB8WcjeL2BLAiZXjEA-W0KTzhLyVrNqfkPhV-XlH-41nTn432HkdomqoOIq0luvdB7EVaoM0FN1CM7IzHFlaSE7AMRGVTx3dLzREBby8aWVGRhGY1CugKOSlNbGgP9JdH-1sGjMX7HlRq-aS-WsCznm95FIl-JH9Z3zYBwkf98KKuKOLVGEaw9zJ7LvhoWrwQCO1Q=w299-h168-no"),
                    Uri.parse("https://lh3.googleusercontent.com/Hst8DDyp8UqMmuam55kiESpDEtI313Qhi4iGm6e0aXO9BFRdwHoKiTuD6AAgy4H6Mvc0bv54K_WpTp0ojxOSla06_fC_OKuUzGyxXUqI-hqKQl7z-3mkQ4N1GUwYJin1mMbrbpYejxcI4UC4sTufmWSpbjN68ouMYtGDSsYsj8D5nzBwdbU1CVC8O7BAxs7Fonl5fUlSsf3nYVqu6D4oqk8tPyMPQeKmRsR8qY9nXl0rsv_eO6T_Ssdzku3sQoCqlCLNlMpGLuUxpg-gNIBGpD9YKzNM8EEz7T-3_pb3qXByhqCMj7b899Hju4HjQXVoMFj7HYRprhbdu5AgrTd46Yjj29G645vophV-3yVCoMxZfwIdoDRdx3uqz5mTQrwEZOXdNTlqS9aBb7z9H0rWjG_CDLAOC21CbqwB8WcjeL2BLAiZXjEA-W0KTzhLyVrNqfkPhV-XlH-41nTn432HkdomqoOIq0luvdB7EVaoM0FN1CM7IzHFlaSE7AMRGVTx3dLzREBby8aWVGRhGY1CugKOSlNbGgP9JdH-1sGjMX7HlRq-aS-WsCznm95FIl-JH9Z3zYBwkf98KKuKOLVGEaw9zJ7LvhoWrwQCO1Q=w299-h168-no"),
                    new LatLng(27.1795, 78.0211),
                    CITY_India
            ));
            add(new Attraction("Jim Corbett National Park",
                    "India's oldest national park, opened in 1936, with a Bengal tiger reserve, visitor centre & safaris.",
                    "Jim Corbett National Park is a forested wildlife sanctuary in northern India’s Uttarakhand State. Rich in flora and fauna, it’s known for its Bengal tigers. Animals, including tigers, leopards and wild elephants, roam the Dhikala zone. On the banks of the Ramganga Reservoir, the Sonanadi zone is home to elephants and leopards, along with hundreds of species of birds. ",
                    Uri.parse("https://lh3.googleusercontent.com/1TrCYlSWMk_vH_4XPpSPiOowcSzbEtrLsDP9K3GxbpflEQLJRlymjgJQSGQDgBkTe0HI4ZBFITeLpd3NtxEmjom8WYEsdLGyhV8YcgfqbY3lPTlGlkZOHveBl649N7C-XUeG3R-Mkd3apD0VsXNNP6vEvkt3CP4lrTHbIBJIDzW0OKdxWQFCu79WNbf5yE6BMF_-NpYxCyiMGyK0cx5oYa2QokgjNtYT0hCgek_rAJvfo6dkBftCV_KjLshN6iF_bjcwh4R2d3szk5rrEywyUPm2_q2CNciNlcd2VsPAHpfBwOrQ4IUnIy5EP-2Ail_kQqV6zSgmNSrCLXDyG_JVrHKOiMf30cfz-Kk9RPim3-dr9re50e06AmhyRJGYdmnnJyA6qw9kmeX2bnhUhpYX__JoM7JuGtp1fnY-cwVspaWNGG7boFwGcfKRA2HVvQ04QZgxG38X48jS8gISjFGaAqtEcoqZ_OFRT3heAmnluEEgNBZDmNH9u-cuksWNHGXy4e2QCysUz5acnr6Esv9WmLvE7kxNdgbmtiu4yPS2aD6bgp2JAkTyn6XfaPhCUIlIPLDcdE_PU3UJAQBH0J_h8mf8KWxiCsL2g5vXnCQ=w275-h183-no"),
                    Uri.parse("https://lh3.googleusercontent.com/1TrCYlSWMk_vH_4XPpSPiOowcSzbEtrLsDP9K3GxbpflEQLJRlymjgJQSGQDgBkTe0HI4ZBFITeLpd3NtxEmjom8WYEsdLGyhV8YcgfqbY3lPTlGlkZOHveBl649N7C-XUeG3R-Mkd3apD0VsXNNP6vEvkt3CP4lrTHbIBJIDzW0OKdxWQFCu79WNbf5yE6BMF_-NpYxCyiMGyK0cx5oYa2QokgjNtYT0hCgek_rAJvfo6dkBftCV_KjLshN6iF_bjcwh4R2d3szk5rrEywyUPm2_q2CNciNlcd2VsPAHpfBwOrQ4IUnIy5EP-2Ail_kQqV6zSgmNSrCLXDyG_JVrHKOiMf30cfz-Kk9RPim3-dr9re50e06AmhyRJGYdmnnJyA6qw9kmeX2bnhUhpYX__JoM7JuGtp1fnY-cwVspaWNGG7boFwGcfKRA2HVvQ04QZgxG38X48jS8gISjFGaAqtEcoqZ_OFRT3heAmnluEEgNBZDmNH9u-cuksWNHGXy4e2QCysUz5acnr6Esv9WmLvE7kxNdgbmtiu4yPS2aD6bgp2JAkTyn6XfaPhCUIlIPLDcdE_PU3UJAQBH0J_h8mf8KWxiCsL2g5vXnCQ=w275-h183-no"),
                    new LatLng(29.5300, 78.7747),
                    CITY_India
            ));
            add(new Attraction("Jama Masjid, Delhi",
                    "17th-century, red sandstone Mughal-style mosque with a 25,000 capacity & 40m high minarets.",
                    "The Masjid-i Jahān-Numā, commonly known as the Jama Masjid devnagrii: जामा मस्जिद, Urdu: جامع مسجد of Delhi, is one of the largest mosques in India. ",
                    Uri.parse("https://lh3.googleusercontent.com/jGZESM2QTcECJKPGH5yM23MP5tVN4dKd3gvaHuXw990ERXm8MyCzbxmDNDX2VssziyromBb-JkCy8gFXJ0Pj5J_5YeqlZz-NHinwZAtxqsf3irPiCyvzC7-c-025DH4ZLsHEXiShWGVnBVCl2rnWIMq8f7YXvDcGvqlcHPrGEPLhFP9MWbvtVBpqeo-5Q8dIXbz98yzZNY5jivejCKhX1N22fY-OixtfMCN-NeEBTtgInLai916x6Sj0XKbSYHcumRZnrJvtPuqgyk3_242Wki_ynlUD22_OD9H8N2FKq0n1-f1yreooMU82JKFThVEK2IS2BVj_jiyEktOrsz80js-9mqSyG7KcW4o_p0UBg_YiVg489PVWyxg3-3X2nmWF7bjB9N-iWASt3xPBMflwH_D9ySYsy6OCel43NDAcpEbqF2JRwk5dAtCcO2g4TGO9-s2neuvbiTSurNHCiVzJT5uoA_ph7M48ninUWQaso5o59lmA1R6v1SGSQb6CsRo4qjx0W6RG-s__L4U1AEPUzuoqrSm8cMYMVkgranHPdrbF5xA3goIg8WVpV94JHjl-xXzFkuaa8qX7Ntqo5dDLc-fgbfrmuT_N3I_Or1I=w385-h256-no"),
                    Uri.parse("https://lh3.googleusercontent.com/jGZESM2QTcECJKPGH5yM23MP5tVN4dKd3gvaHuXw990ERXm8MyCzbxmDNDX2VssziyromBb-JkCy8gFXJ0Pj5J_5YeqlZz-NHinwZAtxqsf3irPiCyvzC7-c-025DH4ZLsHEXiShWGVnBVCl2rnWIMq8f7YXvDcGvqlcHPrGEPLhFP9MWbvtVBpqeo-5Q8dIXbz98yzZNY5jivejCKhX1N22fY-OixtfMCN-NeEBTtgInLai916x6Sj0XKbSYHcumRZnrJvtPuqgyk3_242Wki_ynlUD22_OD9H8N2FKq0n1-f1yreooMU82JKFThVEK2IS2BVj_jiyEktOrsz80js-9mqSyG7KcW4o_p0UBg_YiVg489PVWyxg3-3X2nmWF7bjB9N-iWASt3xPBMflwH_D9ySYsy6OCel43NDAcpEbqF2JRwk5dAtCcO2g4TGO9-s2neuvbiTSurNHCiVzJT5uoA_ph7M48ninUWQaso5o59lmA1R6v1SGSQb6CsRo4qjx0W6RG-s__L4U1AEPUzuoqrSm8cMYMVkgranHPdrbF5xA3goIg8WVpV94JHjl-xXzFkuaa8qX7Ntqo5dDLc-fgbfrmuT_N3I_Or1I=w385-h256-no"),
                    new LatLng(28.6507, 77.2334),
                    CITY_India
            ));
            add(new Attraction("Rohtang Pass",
                    "This well-known hiking & driving route in the Himalayas can be treacherous depending on the weather.",
                    "Rohtang Pass, is a high mountain pass on the eastern Pir Panjal Range of the Himalayas around 51 km from Manali. It connects the Kullu Valley with the Lahaul and Spiti Valleys of Himachal Pradesh, India.",
                    Uri.parse("https://lh3.googleusercontent.com/U2fXyzkAN91ADQCa0f6UU34ysqG2qpUJdyGzBpYJL-hOb1LamQpsY-_KzjD6nAzH6m5Tpt0JzbuJ0o6fPicvaY7eIEGbzYReF5Nv8rEUQuEhYZwKNN_SoliF7X_tJxdxKyqtjREQd2QzroyaVoGl2X2yDoFDMgOIWFgRO39JIDd3G11YyXaWAO7YBei1pTjEUL2ZvgMizzhY_XdzAi-2_loK_YCuB_aknWWlsU1F3ZOkvmS3kI6gvQSYV4imbmVbEGKjpsnVfRd2RzDf2HeWqdJGPQJyfK12oCIZONvD-6xtbEe6oJrxBnWXuPGzE5QTyA1QgALN_4JClsLVzoLVI5mWJ6AtSIlYnmP9YYzSjClUd_2puR1nCEO25lDEPUxj38FXBC8qQ0-TSuFLZvpyBTn997wNNuny-4BIsDdDvxn-0Drucuzhv4HSFgI068j8s5nNNSLgB0bb2SL48fQwtIJp4ymV0_EJuTdXRm0Xm1FMR6ZhQiqQUn370RRClQMN1_pr7_m8C7XjWDBluhEPTkdhbxptj2M1tozTofvZOWaTM_9STUvYZ91CsKlmFOCX42pN2MQVM7oVhtPNOKIloznZhj7HNdBC2Um2syQ=w408-h271-no"),
                    Uri.parse("https://lh3.googleusercontent.com/U2fXyzkAN91ADQCa0f6UU34ysqG2qpUJdyGzBpYJL-hOb1LamQpsY-_KzjD6nAzH6m5Tpt0JzbuJ0o6fPicvaY7eIEGbzYReF5Nv8rEUQuEhYZwKNN_SoliF7X_tJxdxKyqtjREQd2QzroyaVoGl2X2yDoFDMgOIWFgRO39JIDd3G11YyXaWAO7YBei1pTjEUL2ZvgMizzhY_XdzAi-2_loK_YCuB_aknWWlsU1F3ZOkvmS3kI6gvQSYV4imbmVbEGKjpsnVfRd2RzDf2HeWqdJGPQJyfK12oCIZONvD-6xtbEe6oJrxBnWXuPGzE5QTyA1QgALN_4JClsLVzoLVI5mWJ6AtSIlYnmP9YYzSjClUd_2puR1nCEO25lDEPUxj38FXBC8qQ0-TSuFLZvpyBTn997wNNuny-4BIsDdDvxn-0Drucuzhv4HSFgI068j8s5nNNSLgB0bb2SL48fQwtIJp4ymV0_EJuTdXRm0Xm1FMR6ZhQiqQUn370RRClQMN1_pr7_m8C7XjWDBluhEPTkdhbxptj2M1tozTofvZOWaTM_9STUvYZ91CsKlmFOCX42pN2MQVM7oVhtPNOKIloznZhj7HNdBC2Um2syQ=w408-h271-no"),
                    new LatLng(32.3716, 77.2466),
                    CITY_India
            ));
            add(new Attraction("Gateway of India",
                    "Grand, Indo-Saracenic-style, 26m-tall triumphal stone arch, built on the waterfront in 1924.",
                    "The Gateway of India is an arch monument built during the 20th century in Bombay, India. The monument was erected to commemorate the landing of King George V and Queen Mary at Apollo Bunder on their visit to India in 1911.",
                    Uri.parse("https://lh3.googleusercontent.com/uSl5TOxvPO-DmB3eHhPsI07GpSzsLn0vH0P8hSsMD7WkXNz7P0HEnb5mhS2rGwgCvlKfLUvT7eERgV_SzgKYw8pvyQG0WTAt95E7Fc74thYeUcKghe8tYTzlwNr9H6JNBmgqjnyEyxJNkr5_B9ug4dm_XW4rPuM0Ha4L0TAVH4rHqJ_sQQHsZcVZcwKw68oSP1qkuaDDRe5dGO4J3xyVPZhrgt12i9A9sdbr3IK6LAwp9X2bwMSyXCBbPNxTZwFwmPFYW9NLxktIDLhcCuwKLbILez-yh75XV9357Nt8VR-poPCly9koQq5cfTD7e5_6os5ZOfikmuwXSPMxXB8QnWJWMpKKfJfDr57TPcoOBTZV0KOFw5tv59Aj-gua8z7Sf-mChAhl4q3jU0iAuDtaZD3hHmP-9WDXC2cdo2rGuRkpyiQyyFcJynOV-bItgXjM-BsFhDITtSNFttudn-H-GAS8K6pauxbYWcG45-Lo-GhBM26K_MdB73YD2rwuCmmWYJHKqqgGIlU3Vv_aHltdfkylgQYHi6rSi27NNY-Q90htBD8HXW9KuKKW1F7BpCAckWDk5zRTWK7_JgLTDSYXEgH003yhVTI4hNK_Xq8=w275-h183-no"),
                    Uri.parse("https://lh3.googleusercontent.com/uSl5TOxvPO-DmB3eHhPsI07GpSzsLn0vH0P8hSsMD7WkXNz7P0HEnb5mhS2rGwgCvlKfLUvT7eERgV_SzgKYw8pvyQG0WTAt95E7Fc74thYeUcKghe8tYTzlwNr9H6JNBmgqjnyEyxJNkr5_B9ug4dm_XW4rPuM0Ha4L0TAVH4rHqJ_sQQHsZcVZcwKw68oSP1qkuaDDRe5dGO4J3xyVPZhrgt12i9A9sdbr3IK6LAwp9X2bwMSyXCBbPNxTZwFwmPFYW9NLxktIDLhcCuwKLbILez-yh75XV9357Nt8VR-poPCly9koQq5cfTD7e5_6os5ZOfikmuwXSPMxXB8QnWJWMpKKfJfDr57TPcoOBTZV0KOFw5tv59Aj-gua8z7Sf-mChAhl4q3jU0iAuDtaZD3hHmP-9WDXC2cdo2rGuRkpyiQyyFcJynOV-bItgXjM-BsFhDITtSNFttudn-H-GAS8K6pauxbYWcG45-Lo-GhBM26K_MdB73YD2rwuCmmWYJHKqqgGIlU3Vv_aHltdfkylgQYHi6rSi27NNY-Q90htBD8HXW9KuKKW1F7BpCAckWDk5zRTWK7_JgLTDSYXEgH003yhVTI4hNK_Xq8=w275-h183-no"),
                    new LatLng(18.9220, 72.8347),
                    CITY_India
            ));
            add(new Attraction("Mehrangarh",
                    "Built circa 1460, one of India's largest forts offers a lift & galleries, plus guided tours & shops.",
                    "Mehrangarh, located in Jodhpur, Rajasthan, is one of the largest forts in India. Built around 1460 by Rao Jodha, the fort is situated 410 feet above the city and is enclosed by imposing thick walls.",
                    Uri.parse("https://lh3.googleusercontent.com/kHkw37O-yWq_JJSfyadGzS8QWvcp4ScYVaMqU6ip2hyWKKzP4zF5Y5SOGQ3JRbhIe4wbU2yl_-L7aKYDOwfOZB7mNfir7SIhhqq_nz0HJFqZ615_LShjRKpk-vxuENqgmGX6IPzAsb0hNCWZYp45q3IyX8SKfuBj5HehQ5zghHgBfKKupIweqnAMA37gtB2dbvpvm2K2fUWHrR6rwvnCb1yMeZ7OHugEthyeVgrft_BLK64Trpxf10SH7BWLwEkGP2LtnI7xHBrqnB6kFCdSiRR5N3qVZlwH-Qei3cLPzikD0lw51LlwtTXf4ZdeNFLPhA2_WOTT3moHjLknIrSV6G8hvDoJ98weAWkX5hC0MRT9JWqvTE4A00A3QzOKw2aZu_lsITCZCRtVP2QmhocKjrs0YjQjpOhSQQ46lGeBV0aW0t6TI1CvuN-7mPxyz-igzvOTIcVrIKD3lddRyZsK2Im9Qv9GmSLGTLqbjCE7Bg89cEg_hFeQxSEU6-wVilE1xAsEj9vT0iyPoIw8iyms_ERxDnTPJCbGNrq8kAWxzd7hOTxFD-e0F3pbDeUAtsBlAuOi4Ucr146ArzPyFTSkqMUFzyZpjuOXmQ28D3M=w294-h172-no"),
                    Uri.parse("https://lh3.googleusercontent.com/kHkw37O-yWq_JJSfyadGzS8QWvcp4ScYVaMqU6ip2hyWKKzP4zF5Y5SOGQ3JRbhIe4wbU2yl_-L7aKYDOwfOZB7mNfir7SIhhqq_nz0HJFqZ615_LShjRKpk-vxuENqgmGX6IPzAsb0hNCWZYp45q3IyX8SKfuBj5HehQ5zghHgBfKKupIweqnAMA37gtB2dbvpvm2K2fUWHrR6rwvnCb1yMeZ7OHugEthyeVgrft_BLK64Trpxf10SH7BWLwEkGP2LtnI7xHBrqnB6kFCdSiRR5N3qVZlwH-Qei3cLPzikD0lw51LlwtTXf4ZdeNFLPhA2_WOTT3moHjLknIrSV6G8hvDoJ98weAWkX5hC0MRT9JWqvTE4A00A3QzOKw2aZu_lsITCZCRtVP2QmhocKjrs0YjQjpOhSQQ46lGeBV0aW0t6TI1CvuN-7mPxyz-igzvOTIcVrIKD3lddRyZsK2Im9Qv9GmSLGTLqbjCE7Bg89cEg_hFeQxSEU6-wVilE1xAsEj9vT0iyPoIw8iyms_ERxDnTPJCbGNrq8kAWxzd7hOTxFD-e0F3pbDeUAtsBlAuOi4Ucr146ArzPyFTSkqMUFzyZpjuOXmQ28D3M=w294-h172-no"),
                    new LatLng(26.2981, 73.0184),
                    CITY_India
            ));
            add(new Attraction("Jantar Mantar, Jaipur",
                    "18th-century park & heritage site with fixed instruments for making astronomical observations.",
                    "The Jantar Mantar monument in Jaipur, Rajasthan is a collection of nineteen architectural astronomical instruments built by the Rajput king Sawai Jai Singh II, and completed in 1734.",
                    Uri.parse("https://lh3.googleusercontent.com/qcyZOgobpqaKzZJRMtAHVnj7dx68xXcoGlKn1Gvq9RZyDColC_5S3bAMebe3rAlLO3CNxNbL45kIyvIARbOu0YGMfNuihk4YPcNiiwcjS5NzcRAjI8q9ZDWbal17m_a9H-ZmF9pYPDFu6yZyPwYRCMnKkCdg9ayfjIMunNkAUzKckatJysttYxPaXRtw-9PcZLp7Lq54_kAM8tVI6BJVas4yLBQJz2SDv8_E0WADXOHMQFug9Z8LYg-D9eDukpFizixEMjyLudFwarwhGRV22tpyia7o8-csQqIx5tA1Fn-kY2VSbot0kk4xw7JBpkCANk1HoAhXulaR2SSzN-u6Hs1lS0OI9qBFoZQQiVDvetNye4pvLO2uh66OfxG_o0Nl18AwqnGEvxLzGXqGT9963dGtNg9wNzmYrHOvvXIkkFpVX6NV3Q1TQdsdvQ_h1mA5D8OHUgBDIEylM6eNAjc-54d2P3t_iDtLRWjCG1hyhfBNjtr75Yp_3-BZTUWz8FmvrQZyXmnmyr1zXPM3bmkohlu1WWxmWTU29LawldbdOjAIPnwVTURbmjLvvTGEOQ6l-pVSVak9r2ETgvQg1QjYXSaNDMM8MV7LPao06a0=w286-h176-no"),
                    Uri.parse("https://lh3.googleusercontent.com/qcyZOgobpqaKzZJRMtAHVnj7dx68xXcoGlKn1Gvq9RZyDColC_5S3bAMebe3rAlLO3CNxNbL45kIyvIARbOu0YGMfNuihk4YPcNiiwcjS5NzcRAjI8q9ZDWbal17m_a9H-ZmF9pYPDFu6yZyPwYRCMnKkCdg9ayfjIMunNkAUzKckatJysttYxPaXRtw-9PcZLp7Lq54_kAM8tVI6BJVas4yLBQJz2SDv8_E0WADXOHMQFug9Z8LYg-D9eDukpFizixEMjyLudFwarwhGRV22tpyia7o8-csQqIx5tA1Fn-kY2VSbot0kk4xw7JBpkCANk1HoAhXulaR2SSzN-u6Hs1lS0OI9qBFoZQQiVDvetNye4pvLO2uh66OfxG_o0Nl18AwqnGEvxLzGXqGT9963dGtNg9wNzmYrHOvvXIkkFpVX6NV3Q1TQdsdvQ_h1mA5D8OHUgBDIEylM6eNAjc-54d2P3t_iDtLRWjCG1hyhfBNjtr75Yp_3-BZTUWz8FmvrQZyXmnmyr1zXPM3bmkohlu1WWxmWTU29LawldbdOjAIPnwVTURbmjLvvTGEOQ6l-pVSVak9r2ETgvQg1QjYXSaNDMM8MV7LPao06a0=w286-h176-no"),
                    new LatLng(26.9248, 75.8246),
                    CITY_India
            ));
            add(new Attraction("Ajanta Caves",
                    "Richly decorated caves dating from 2nd & 1st centuries BC, home to masterpieces of religious art.",
                    "The Ajanta Caves are 29 rock-cut Buddhist cave monuments which date from the 2nd century BCE to about 480 CE in Aurangabad district of Maharashtra state of India.",
                    Uri.parse("https://lh3.googleusercontent.com/RoUSHNTvzmrssWyIvs0bf2W5P0XLDfqwHhyL1G1Q5eWah2-qNlh5Fi6NhIdS5ka7UhQ1VGGiyp4CW9ORSSEyLqIlGpHdZUD7GCZisS0_K-L5FOO5W9okEA8q8F92fj1IAz_ZBDYdF-NIEnPAiEoPqveJBQHndJXU5A5U9L56PwvMhxlW0w2MDnsSwbNgi9yNa7aKx9Lrt3zHPO_iu-H3vT8-JBRtiYdeGXx7yH40G-iXbpRJFcUL9niZNypWl3YWa2RNod1-jCbVLNp-JNlRq6j3-u54--2Yg-7ZYRnePJA-WYNlgNKg0GCnxM4gO-hQg9xgjd-Lp9lLb-8dwENcTw66QdmXcJb2XXq2ZXeQgACd1qy7m5fCfvzsdSVlBz-Uq3YbrOGuw8e_jNbOKdF2Krt8ycJNi5zRTmUwxzLaeLdgPxJxKEON08hsfVMf6nOFyz7OakRAQGM-Prhi5anm4lA0bTRAWabFk-aamJk5lelRaFA-x5G5MbD3WblV_pdNHLtvo6bvhoy9k2zc2q514zKRqvcC0ZtqzFfIz5b-fxSMebp5gAwaoo_VlIQ-rQuPC7cbcL9ffN0q0uJsjNQR9TlGrxyFJeLVZEC4XH4=w382-h253-no"),
                    Uri.parse("https://lh3.googleusercontent.com/RoUSHNTvzmrssWyIvs0bf2W5P0XLDfqwHhyL1G1Q5eWah2-qNlh5Fi6NhIdS5ka7UhQ1VGGiyp4CW9ORSSEyLqIlGpHdZUD7GCZisS0_K-L5FOO5W9okEA8q8F92fj1IAz_ZBDYdF-NIEnPAiEoPqveJBQHndJXU5A5U9L56PwvMhxlW0w2MDnsSwbNgi9yNa7aKx9Lrt3zHPO_iu-H3vT8-JBRtiYdeGXx7yH40G-iXbpRJFcUL9niZNypWl3YWa2RNod1-jCbVLNp-JNlRq6j3-u54--2Yg-7ZYRnePJA-WYNlgNKg0GCnxM4gO-hQg9xgjd-Lp9lLb-8dwENcTw66QdmXcJb2XXq2ZXeQgACd1qy7m5fCfvzsdSVlBz-Uq3YbrOGuw8e_jNbOKdF2Krt8ycJNi5zRTmUwxzLaeLdgPxJxKEON08hsfVMf6nOFyz7OakRAQGM-Prhi5anm4lA0bTRAWabFk-aamJk5lelRaFA-x5G5MbD3WblV_pdNHLtvo6bvhoy9k2zc2q514zKRqvcC0ZtqzFfIz5b-fxSMebp5gAwaoo_VlIQ-rQuPC7cbcL9ffN0q0uJsjNQR9TlGrxyFJeLVZEC4XH4=w382-h253-no"),
                    new LatLng(20.5519, 75.7033),
                    CITY_India
            ));
            add(new Attraction("Periyar National Park",
                    "Reserve with a mountain, forests and lakes making a habitat for protected tigers and elephants.",
                    "Periyar National Park, also known as Periyar Tiger Reserve, is in the mountainous Western Ghats of Kerala, southern India. This wildlife sanctuary is home to tigers and a significant elephant population, as well as rare lion-tailed macaques, sambar deer, leopards and Indian bison. In the park's north, Periyar Lake is popular for boat rides. Farther north, spice plantations surround the town of Kumily.",
                    Uri.parse("https://lh3.googleusercontent.com/ZOJiPHDzHx1pG86h0bqDDuEYwSndm_KLUremXK0iE-5Dk1dzOmL7bzjc0-B3FfRfJHfgCwr_JKj8_0oE_UShDAYdNqxXxo5v3PhqgMOEpTb4dgNS9qRwFR_HwuBwgHXE3YtAJYgt5BDHvJzD9EZ8ehzb6TV9Gux0gZLs4iYZMivjI625ubaFwXoL0S3gQRvCZuuB04zWFHlDHvBkagKe_EONGJ2TmknxVNIc2GJceeSzCx2VaQnFJgmVliePk2SQM8RarMGeZJ7tn-Opl2jp-XO6IT38KGxFEXs-6GwyHaZrXvgIQSc42GsRPV-4YHn3lLavVneG8MXnEV0_5u1sAfavjrD4J4eLUX12N1aJ_s_Nw4qalkSKC_-4Zu5pzaidMSg5kHiWBpiQLY79LjYgtduId0mFkTFOFiS5xjPyP9UgRucc1UW_72ebsK4BoISq1nUEi5gwDkNknQIxJw5FvJGui5FwAk8be4LdwIDvnEnLSzLpHR-J7V4jgXZemsxjl8JeMTkBV7whUjZ6eMcKgbHYFgWHxM8wLlstgRAzqAwFuUOFhFPon1x4VsDWRhykbPI363bfU16PULijMjktxidimMJyZXip5cYhBB0=w600-h400-no"),
                    Uri.parse("https://lh3.googleusercontent.com/RoUSHNTvzmrssWyIvs0bf2W5P0XLDfqwHhyL1G1Q5eWah2-qNlh5Fi6NhIdS5ka7UhQ1VGGiyp4CW9ORSSEyLqIlGpHdZUD7GCZisS0_K-L5FOO5W9okEA8q8F92fj1IAz_ZBDYdF-NIEnPAiEoPqveJBQHndJXU5A5U9L56PwvMhxlW0w2MDnsSwbNgi9yNa7aKx9Lrt3zHPO_iu-H3vT8-JBRtiYdeGXx7yH40G-iXbpRJFcUL9niZNypWl3YWa2RNod1-jCbVLNp-JNlRq6j3-u54--2Yg-7ZYRnePJA-WYNlgNKg0GCnxM4gO-hQg9xgjd-Lp9lLb-8dwENcTw66QdmXcJb2XXq2ZXeQgACd1qy7m5fCfvzsdSVlBz-Uq3YbrOGuw8e_jNbOKdF2Krt8ycJNi5zRTmUwxzLaeLdgPxJxKEON08hsfVMf6nOFyz7OakRAQGM-Prhi5anm4lA0bTRAWabFk-aamJk5lelRaFA-x5G5MbD3WblV_pdNHLtvo6bvhoy9k2zc2q514zKRqvcC0ZtqzFfIz5b-fxSMebp5gAwaoo_VlIQ-rQuPC7cbcL9ffN0q0uJsjNQR9TlGrxyFJeLVZEC4XH4=w382-h253-no"),
                    new LatLng(9.4622, 77.2368),
                    CITY_India
            ));
            add(new Attraction("Meenakshi Amman Temple",
                    "Ancient, walled, Hindu place of worship with sacred water tank and colourful, sculpted gate towers.",
                    "Meenakshi Temple, also referred to as Meenakshi Amman or Minakshi-Sundareshwara Temple, is a historic Hindu temple located on the southern bank of the Vaigai River in the temple city of Madurai, Tamil Nadu, India.",
                    Uri.parse("https://lh3.googleusercontent.com/FBR13i54y_wzmMFstmNBJWGfiEdO6ASZbsIq7j8Y2xU-2gWhhuvEAgpROVz2A6td5gMoT45-VNR5frR541y-rF5vvLIrGFotPTVwqltR4mfapI5ZsSC3fLvDlXn1i-gJR15uYJMjCXSgrvaiwsmthvTRfDp2sS9TSisUwotvUpJQg-1a9G4KZQQrgWMsA6-qub5fofrAw0IpI0qfm7-yUK48AjM7I-c3fxeKMsfQMZhNMY8wdERiGEppJXin86H5pTMz57W-VXvu4FJXELx91nECa48Je65VycetBTu53yPvqjhfO4dcvK_3YV9xjwUXpyPb1pWP2Crbe7OWu_HXKaKGoLVHF0TX9ZaUQGWYqB2P1ey9smEEYC8ObplWBHIP9CZu6tvxtvQGUmwbUylEvBMAO8J1RBQE0f7R7TwvPFN-hlNfR70uNiKkw9FdSKsZbHt6LMBZzMWQh7ulcav1On1Wr4Q2WktfUIUK7iEpYfhjM45b8b591sDcBQu8XoXCvfGLMkU5zivNAIMev7Te1JnkMrWwWcqxPuBDNxBLhiWcfA4sCKpuXyO-3-S7Z5SmEhf_TvXiVkXfc9obpSRNKTQMuFy1g8D9RmoFQcM=w275-h183-no"),
                    Uri.parse("https://lh3.googleusercontent.com/FBR13i54y_wzmMFstmNBJWGfiEdO6ASZbsIq7j8Y2xU-2gWhhuvEAgpROVz2A6td5gMoT45-VNR5frR541y-rF5vvLIrGFotPTVwqltR4mfapI5ZsSC3fLvDlXn1i-gJR15uYJMjCXSgrvaiwsmthvTRfDp2sS9TSisUwotvUpJQg-1a9G4KZQQrgWMsA6-qub5fofrAw0IpI0qfm7-yUK48AjM7I-c3fxeKMsfQMZhNMY8wdERiGEppJXin86H5pTMz57W-VXvu4FJXELx91nECa48Je65VycetBTu53yPvqjhfO4dcvK_3YV9xjwUXpyPb1pWP2Crbe7OWu_HXKaKGoLVHF0TX9ZaUQGWYqB2P1ey9smEEYC8ObplWBHIP9CZu6tvxtvQGUmwbUylEvBMAO8J1RBQE0f7R7TwvPFN-hlNfR70uNiKkw9FdSKsZbHt6LMBZzMWQh7ulcav1On1Wr4Q2WktfUIUK7iEpYfhjM45b8b591sDcBQu8XoXCvfGLMkU5zivNAIMev7Te1JnkMrWwWcqxPuBDNxBLhiWcfA4sCKpuXyO-3-S7Z5SmEhf_TvXiVkXfc9obpSRNKTQMuFy1g8D9RmoFQcM=w275-h183-no"),
                    new LatLng(9.9195, 78.1193),
                    CITY_India
            ));
            add(new Attraction("Lotus Temple",
                    "Religious site also known as the Lotus Temple, opened in 1986 and open to those of all religions.",
                    "The Lotus Temple, located in Delhi, India, is a Bahá'í House of Worship that was dedicated in December 1986, costing $10 million. Notable for its flowerlike shape, it has become a prominent attraction in the city.",
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(28.5535, 77.2588),
                    CITY_India
            ));
            add(new Attraction("Jal Mahal",
                    "In the middle of Man Sagar Lake sits this grand palace made of red sandstone, most of it submerged.",
                    "Jal Mahal is a palace in the middle of the Man Sagar Lake in Jaipur city, the capital of the state of Rajasthan, India. The palace and the lake around it were renovated and enlarged in the 18th century by Maharaja Jai Singh II of Amber.",
                    Uri.parse("https://lh3.googleusercontent.com/yub-W8WAHeA9XszWFFnoZ0TJcxCALyAnjlp2fbJkA9trg4PLRThTcVmQj-I8B1UMVZZMDf51J2YnoMAM6RTWbhOVjeCWBK6td0ozilobeOvCZkjaQdwoJRlx1pi-BeoaYV_uQO3pN4ChDK7fQ4dFFn3mfL46e1emjGtVwDJVUHJVM8tZ6I2pEH-apOUv50LRKuuPUyTl-a4nIIlHP9lLDzFlYkgmmirGxfDjlbmGiQJCZcjHzcT5mF4v2VD-1dDTVIs0763U_6prRey2Z85b8H_mvy-or6ky3Kk7SiA3mhxRKzqZpr_kKXOES2Eu3Lj64AGnv3N7q-JlfD9Fy_4eeNrI_KzqnSEP_yaMPH36X7zT6P0Zr5nj9Wm7FUB3-s6FOUzEu6sITI_AxYKRsaJCQv7qr86qYt3EXzcyAFciGPOwXTN1znabZz1qpUaL8fJGdNX48HsDdO1u6Bnq6_hGTGoEMkrub6YAQmYO01bfXaH7L_YOI-n1F4aWakzirozphVSwffQncdEpcz36B0-tVgQpOtcdk54zyrPOo-qgq-I3hUFGZ5kb3t-yDdlBCSXQYkZMdjAeH-_DK2n_R29tmoPWAZl-jSEHAKfip3U=w500-h292-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(26.9535, 75.8462),
                    CITY_India
            ));
            add(new Attraction("Elephanta Caves",
                    "Island with an ornately sculpted, 7th-century cave temple dedicated to the Hindu god Shiva.",
                    "Elephanta Caves are a UNESCO World Heritage Site and a collection of cave temples predominantly dedicated to the Hindu god Shiva.",
                    Uri.parse("https://lh3.googleusercontent.com/bhkEoUIf4_LBzkwHrNRQYqAF7n7FYSPdYsZQoJaj9ELFNSYaYpyybYkUJMINI3aH33qSHTfX2CN3tT_s7qn9IBkriYyufhQkAdaKFIjY8hm3CYr9hqmVAFLcytP04U-mnMWmD0zRPo6LtEFyiFFoE0xSjm6bmlsjJ8272YIjEX2-kTUUUpeNHhjWh5fQypyWecOC9bWspDKTfGGybNw8ju8bpzEJ0Vs1Ir2l_mKR6vBwVZYDD1ei8hFcIE9R-ec8OeP4_8OuQAFr49sJhkCeSvN2-W-B0ZDLQjU5uBO780DrCzzDbrDMddrDAyriIwOcfmhsrJ4WoY8As23FK5Fpn67Vk2N5eFe2BfTdaOiU3a77E_iJNq_hHSyUvcTpK2NZcLcAsUt9OXIxHxYf8kel3iCtdusGL_HgUQNqYLoIAkEPzWXUOSXX82Z08VfwxGZFRl_YBThivbdsKWDoD7fVJg7v6KiSQ1Ndh5Bb7ojme_dsT5EYVe9gdi_4nhLf9VHzHal9p7lbYbg1rjajOHqcr852thvfYEc34JotHHF39ITpEi0gxzF1hpXMCISatelMP_swVuqhLnHjJWl_3RcogbEd30Cub0QqYxKaPmQ=w417-h277-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(18.9633, 72.9315),
                    CITY_India
            ));
            add(new Attraction("Tomb of I'timād-ud-Daulah",
                    "Mughal style white marble mausoleum, inlaid with semi-precious stones & nicknamed the 'Baby Taj'.",
                    "Tomb of I'timād-ud-Daulah is a Mughal mausoleum in the city of Agra in the Indian state of Uttar Pradesh. Often described as a \"jewel box\", sometimes called the \"Baby Tāj\", the tomb of I'timād-ud-Daulah is often regarded as a draft of the Tāj Mahal.",
                    Uri.parse("https://lh3.googleusercontent.com/gIAXHPJP4cOGq6otg0yiIBZyQX-DEcqD7gQ8NTQiFiCWoBR3Eotov1Dbbv2OUeYUXxIaXRpiYQZaA5QJnlbbcdh1X5ogrTY8YSj0Vd9Y43j6byMotQhOjWvbZtd-bYT09GGUeOR8Knjrt8XqD053AnYt6QF6uZ1XmH8TnRUXBF5PugcWVNj5Jm1coIg3f33AfAkYWill0N2SG7U0LJbs8eS_Le4gZUXYShqj9Wn9KuHhZXBGcy4z6_9RS-0M-RpWxPbyxwo4L1l-mDyh1Cxc8-ISEcD_NGte7RRpia-Rq4mhW5gCox987YqHfEE8nVolBmSThkrsLOIEF0je2OhJsMWFWW_JBMBvKBQ8TWJf7fYMGO_GpAGlgkyPplEyzuVTk24eGA9CZUoY7nyFu6RK8wS5nakG5OjMsMtYh6eiSlW5kdLQOxGyAIXFwG9giMfDl-ZFaQ3sO8nb4nyylpzy0aWkqbIzxgia-tkSyAmuy3n_02hoZF7rk2AIf4XAprdEV7dtuKApBkWWVjCIajC_B0eoSQ_dVEpscBJYwZERCys4BOrl_yWxeC5XPjt1R8bLNsA3IxeohnSGbbCDHbRnA79HEzF6Cyrimh1dQts=w500-h333-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(27.1929, 78.0310),
                    CITY_India
            ));
            add(new Attraction("Jaisalmer Fort",
                    "Massive, 12th-century fortified city featuring ornate Jain temples with idols & stone carvings.",
                    "Jaisalmer Fort is situated in the city of Jaisalmer, in the Indian state of Rajasthan. It is believed to be one of the very few “living forts” in the world, as nearly one fourth of the old city's population still resides within the fort.",
                    Uri.parse("https://lh3.googleusercontent.com/szICEtu5Q32IEkEJkl8pYh6b_kiOoMKesRKc49NlcgHFlt2_KlvhtztmRfOBSFTbPG3IIPByBTjScb6k23yML5GFPTtEke8PwKWJSNwaUuntp1bQ5jRBIInXL2tv5gtWR3bHgYs4XFOu46SAORDxN2WAu3Pv6JQsRKXTUq9RoJv6mT94F8wNmi71xbhJn33BKd7U4dq_WNz7iherrg74PQnhZnTCwKLCiAkMUjk2Y2rhwE2LNzFkB2SCn75qWygA67P1SjefmzntOYgGvPLDtjuteX68XME1gxxLiyPBk9zIzq8CRLWV3Y4JSyIBygktYSsLS1dRRN3ZsTBYyIwQC4qmTlqjqVmjBcBqU7jeLs56g4I16FencUwR9kNLbhlAHcAQXBuHXAAw545PxFYUikekWUdrvH4oLMrG-_5DzvpTV98xvsXBBoFk9Dwy7U0zR_YWpWOJe8mR6T3IjvuYOi_2Y9tSS-MGyS-dX7BbnLhq9XCNRY-SFz8XHvBgpW_LitaX96vysOdVYb4gYPhf0VxD6JwG-BQuNLOSOCDCF6o6dDHPTISvXySuG0vQYlgTb8iuCvmX8vT4RZc-xs57rbb_dpiT6tXTXPIDfVY=w500-h250-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(26.9128, 70.9131),
                    CITY_India
            ));
            add(new Attraction("Jaigarh Fort",
                    "Built to protect the Amber Fort complex below, this 3-km-long fort offers a museum & view.",
                    "Jaigarh Fort is situated on the promontory called the Cheel ka Teela of the Aravalli range; it overlooks the Amer Fort and the Maota Lake, near Amer in Jaipur, Rajasthan, India.",
                    Uri.parse("https://lh3.googleusercontent.com/pixZwV69gIM1hkL7CywhkgEvbaxFUiukskCB1usK2kokyWSu5icJrASrxLs7uzF-zQmIK_1TfZqRwUyau290N1Q7DC-mxuOx5rBb9_CoepzVmVhT-_pqcEH0xJMZcDuXdHPUmtkbJ-UKU-7p8mTLCG7wdpp_hGVDbGbeyu0sjbnZrrSE7U4o4xcUnrLg8HGsbIH1VryO8Xg1wc4nKniHnnL2IqFvTlnukW-TXarPbasaIk99oo3p0HUveZ9VcfgFcjUc0BeJXpN94RatB67nbWeonqfuN2bQxbZjGFG7nz7-jdWqj1WPDlXufaDpuvotZ_pAPIfIPPHTBVZfWA72vTusnqUcjFctDCHC5H1zXBpyDv2PsJ_hIhKD0pNAv_8Elg2ZqfNsmhr1J8X9sc5LjXYgkeXNJi93x9bNbjLGM2JULBs5oDdTIHwIDt7R-or5wG5QFPc3-xcN27mQ6iBJ_IY4cla5EDkK0OUyMaSf0MwXK66rnlcaqklNIeZYKbvZV0Js8TmQ8ZCREjrBBHX1b3mmuI1CxU8C43wk8fHqmqccuaFlsjs8qjfGO6kLr3lfQwMxGAHlIshgCbQPY4ds4tsqyLj37uVEXD97Ay8=w368-h245-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(26.9851, 75.8456),
                    CITY_India
            ));
            add(new Attraction("Dudhsagar Falls",
                    "3-streamed waterfall, named for its milky waters, with swimming pools surrounded by forest.",
                    "Dudhsagar Falls is a four-tiered waterfall located on the Mandovi River in the Indian state of Goa. It is 60 km from Panaji by road and is located on the Madgaon-Belgavi rail route about 46 km east of Madgaon and 80 km south of Belgavi.",
                    Uri.parse("https://lh3.googleusercontent.com/hnSntJsEP3PjYvmMM3D-FVeTQKxAKS3QUP5ComynT41VScEw8rT3WIqH3K7qcq5ze8l2MjC3krIcFncdCB8amgYE34PHkhfWk-Rf8XIW7J4A9PfXIS6JJ-ll9vqhyAdDwHB4p8IQo3j8OBHOG1r5Ku0bwiFyCKWgUjOLUtIqjoRhA2Gwg4evEcCPChTbbM-LNUxA1fzUNCwfXeshZvROCReXjBzKYo7HBJn3Eq-2CDK8O_Sbm0SEOW2qJ2v46ARPWBqQEZJCEuKSnq3kdqhNGT9zspaVPHKCfPzbgqzYgWUBEFzsPfwpal9mjvK_JYGqPBoa9itpuXKknozq-Czjzj_0aEcOjCg_KE-5tCMRhkAiC05CEsvDi7klf4XX2VvV5nCSunKD8T7AkMWPgsbyoJWg7qxu2UrLGrPtRPz4OK2tPZGYstlXedR8X2dQ3nZHSexm2DJYdrMAhNm4HTolvSv4NlUOXd2EihriMnWUHqsqygXOLdf6xoHumZbhuzTttOGrkvtDXoa7IwY5Fa5mgA-VJodS52XDPYMrIJcCGdJ0ZLPFxG5LqmLWI9Eq2HFch-_p0EureRDBLgc2ZJjPzTpp2YLGkfc25de370E=w247-h296-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(15.3144, 74.3143),
                    CITY_India
            ));
            add(new Attraction("Valley of Flowers National Park",
                    "Hiking trails cross this lush Himalayan valley, known for its bright alpine flora and rare animals.",
                    "Valley of Flowers National Park is an Indian national park, located in West Himalaya, in the state of Uttarakhand and is known for its meadows of endemic alpine flowers and the variety of flora.",
                    Uri.parse("https://lh3.googleusercontent.com/CgjlgMqgL9DvCZocoA1KqHweznixpfDE5Zvo3A8F9p20ERLlKm9yYr60xix2iUc6Cx-tFs3YcXlqpVdg31MEjR61Uf-1mWWZec1xB6mRquEWIH5pBYoX5A_yhLW9YsMSzMg0WOJSdtrfZb3wF-f-qfTrmlv5b6pg7jDTFOHatepWHDrDgfH_hJyFEGeAN5kwLN1MA_9ZwQJEagYBAWC6VIIIdfhV_MtTCwNsoIjgSCRLL3O6lDR_I1it8ml6WYJI0r2vq6a13HcdGxohnsNzO4u7Nixkmiq76QheLLSUhkt6D3v1dl0O6TTN2hBNqza24uETA_8xFH6rOXJsiW1kMohzBhmhZmNvqH6rJvCjPhXhUokULIXW8xPqo7Px_lOsBe7TZ5dRTsHipATPcs26nXC6xv3MVHDrIEQf1GroyhvJ4tzPoyPT9lhte5OR1YFNGRN9rVCERuSqKAo-QEHh8IkoAODiCz5sa9s0nQlATZ5aNuBKZIJ-tosmE-pLsf8kilF24w6z2Ea0SusSLlREKObmU8_varPgtq-L3rWL52L9agF-REQFJ2BurYvc8Xa074OHSCB47bgeEFy96LBtES1H36AVLIBE5lruX7Q=w500-h281-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(30.7280, 79.6053),
                    CITY_India
            ));
            add(new Attraction("Kumbhalgarh",
                    "15th-century, hilltop fort and UNESCO-listed site surrounded by a massive, 36km-long perimeter wall.",
                    "Kumbhalgarh fort is a Mewar fortress on the westerly range of Aravalli Hills, in the Rajsamand district near Udaipur of Rajasthan state in western India. It is a World Heritage Site included in Hill Forts of Rajasthan.",
                    Uri.parse("https://lh3.googleusercontent.com/oNcm58F9NLueIEzB_g7s2ZvbGbG_sWQ5LWhlR2xMrju6pvE2v_ej00-BGw0Xg9kNqERA8YYZIwQn239vUNLknvG9sGKzS9LXLWoieETom-o3elgb4GypG5SYoMQq0xtW5K9f9fWQ71_0wMiuo25jNxlrIDcNnA9QzsiTlleGxCvarFtfMCJOHLdKp9oXmihAfTW3Rh2UAnjra4i4ZX9rdSbmLzDQu-HpVdyC6zlmZk61L4HoLwgvKqhj3UJFLUUTObNGx8nbp72Cd-wlp41UsCunAf64rxA3jiJyxupzNWkJqKIA3aWU3SGbsYqjfR4n0auvElt-j2waTfFDODznG39AL-i5CubwSWLVrmHWJeSEjQe6aH9A0E-MW9JM0ZVUYlL-g9wTRsgccRULm3lcLtBn1vv9Cx90RuC5DjDNEjTgJbXTG6-SQu1eVxt9enDRaoSTAFouHrcMgbtPEYfiqTiyvWXW3vInECOlQZ6YP8OqOD2GHEhNffrK4-qoxd7KoIyNotDt-v3GCQTwHZBS5sFigoftwqdJrsFe31vlzmjmEjNSSJzJ1OBgPGdvJUWDy-Wwi-XbADxcsMYwyTg2glTgF4rFJbE_UZWwD88=w500-h262-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(25.1528, 73.5870),
                    CITY_India
            ));
            add(new Attraction("Konark Sun Temple",
                    "Ornately sculpted, 13th-century Hindu place of worship depicting the vast chariot of sun god, Surya.",
                    "Konark Sun Temple is a 13th-century CE sun temple at Konark about 35 kilometres northeast from Puri on the coastline of Odisha, India. The temple is attributed to king Narasimhadeva I of the Eastern Ganga Dynasty about 1250 CE.",
                    Uri.parse("https://lh3.googleusercontent.com/q3_N-LZrkPCSFIpRtyA_QeHjclXY4mVS-1Vpl-fPdWVEvF2fkXrfHpjteIQF0nwBfLE_oSKxMvDiM33W2reFKsbuVVV10H_0KKKzp1eZ2KSK85v8zNwxo_Fok5yrVhp0_sRELO7SIPRRf9K0hcMKDa5Zz55db9CzftryccS1KgyQfb6_Oe1aIOjA-AI9vIFFPJZgBGYY9ZCSn2yVPKpZNTcnppyiJD0J2suN87ub4xb9t-0u3SO0drQuJ8wYepA3kvwvvt1UxtKkz9Ff5u8H_gSIpPU1zvzMbeE29E1T5xmDlrn6VyniBlpfCrI3LAsVAQpkC3CPWOB_XCDkcfx5x1SRwB7UYVlVzcDv75FygtcK3lWywt_lX4xfDD8auKNasTAD2sZJodiHFnLCZhzlQ4EdCtDHqOnWnidhmoVGJUcWZzyOMbY9k2a9PzmMa5yt44ACFSAvvZSWUrm99rSUocal84CGCHte4F-UY_h0VHihxZkQlja0DqfEXFWMvZlY8dD_NJr1TYwyYwLqMqF_gDWHSAQJ_xzzRt7RvhBn6D1dN2RlpxPmoxWj99JADjtKMYzHNOS1fZdZ6NjoevejscP4Sv8AVyEhCAev-Mc=w444-h296-no"),
                    Uri.parse("https://lh3.googleusercontent.com/GofeZs8vybume2q6VanKX-FyeRR3uBwqA1N2uH1C6Tsqo5n-jYHnGrJf2B7jYopTmuyXK6-Uz7QgwE1gw722_W8vXQ9tsLbBFscOjPpbsYgOu-2UoK1kPDlK4zVeeQNKVMFzRJAKaX_F8TJxSiJDk7lspirwMK5sW2c39N7BVg10usqj0kJDgUUmiiJn8yt58PTfUb33_EOsZlw08kNxYTklWY8KMUt_3ykvfD0DbVIsYM7gZJNf5ZVhUuznPViXpMmPpjbLh2PrYRWIz2NefSEFfenqvMA_6PQOR__073pDTPXeGzVEQqAwaP2bIwqpahqvCFoOY-K1FMF4S1E5iQCUYrY1s2TqCrH4dh-301_cRpxtjbxqZC145k37wSyLOhpiL7feEHY49jUZoAEikShjmYAfX_UlFHzh2WQjB3QSVU1B2pSD4ukBNemZhoRJaBr8xlfknOZP4sEHdfFGxfbyCI321QmDfstQOhuDPsCYwlo-JNzteU8ojYel_l23JTuvD120_Q-NeJ3pfgY5sOIcdz3gcUTIUN6sCc_t_EMJLj_yX9Wsmmi99S8Q5u1TaidGLDy_GpimtlwBaWPKoUrOOKlKIv0Qr5ZnCIU=w284-h178-no"),
                    new LatLng(19.8876, 86.0945),
                    CITY_India
            ));

        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
