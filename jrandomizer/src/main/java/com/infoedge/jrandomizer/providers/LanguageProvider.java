package com.infoedge.jrandomizer.providers;

/**
 * Created by gagandeep on 31/7/16.
 */

public class LanguageProvider extends Provider<String[]> {
    private LanguageProvider(Class<String[]> clazz) {
        super(clazz);
    }

    @Override
    public String[] provide() {
        if (mLoadedData == null) {
            mLoadedData = new String[]{
                    "German",
                    "Malagasy",
                    "Chinese",
                    "Kazakh",
                    "New Zealand Sign Language",
                    "Telugu",
                    "Fijian",
                    "Hebrew",
                    "Finnish",
                    "Papiamento",
                    "Korean",
                    "Estonian",
                    "Catalan",
                    "Kashmiri",
                    "Māori",
                    "Zulu",
                    "Armenian",
                    "Georgian",
                    "Tajik",
                    "Haitian Creole",
                    "Bengali",
                    "Icelandic",
                    "Dutch",
                    "Greek",
                    "Marathi",
                    "Guaraní",
                    "Hindi",
                    "Afrikaans",
                    "Northern Sotho",
                    "Tetum",
                    "Filipino",
                    "Somali",
                    "Punjabi",
                    "Tsonga",
                    "Polish",
                    "Italian",
                    "Lithuanian",
                    "Oriya",
                    "Dhivehi",
                    "Spanish",
                    "Dzongkha",
                    "Irish Gaelic",
                    "Nepali",
                    "Portuguese",
                    "Bislama",
                    "Luxembourgish",
                    "Malayalam",
                    "Tok Pisin",
                    "Albanian",
                    "Gagauz",
                    "Burmese",
                    "Lao",
                    "Gujarati",
                    "Assamese",
                    "French",
                    "Malay",
                    "Dari",
                    "Swati",
                    "Aymara",
                    "Latvian",
                    "Moldovan",
                    "Yiddish",
                    "Maltese",
                    "English",
                    "Danish",
                    "Japanese",
                    "Amharic",
                    "Bulgarian",
                    "Czech",
                    "Swedish",
                    "Montenegrin",
                    "Romanian",
                    "Swahili",
                    "West Frisian",
                    "Azeri",
                    "Thai",
                    "Tamil",
                    "Arabic",
                    "Tswana",
                    "Persian",
                    "Quechua",
                    "Kannada",
                    "Sotho",
                    "Pashto",
                    "Ndebele",
                    "Indonesian",
                    "Macedonian",
                    "Norwegian",
                    "Hungarian",
                    "Belarusian",
                    "Bosnian",
                    "Hiri Motu",
                    "Mongolian",
                    "Croatian",
                    "Kurdish",
                    "Kyrgyz",
                    "Khmer"
            };
        }
        return mLoadedData;
    }
}
