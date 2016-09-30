package com.infoedge.jrandomizer.providers;

/**
 * Created by gagandeep on 30/7/16.
 */

public class DomainNameProvider extends FromJsonProvider<DomainNameProvider.DomainNameData> {

    private DomainNameProvider(Class<DomainNameData> clazz) {
        super(clazz);
    }

    @Override
    protected String json() {
        return "{\n" +
                "  \"subDomains\": [\n" +
                "    \"rakuten\",\n" +
                "    \"xing\",\n" +
                "    \"twitpic\",\n" +
                "    \"4shared\",\n" +
                "    \"trellian\",\n" +
                "    \"behance\",\n" +
                "    \"ebay\",\n" +
                "    \"economist\",\n" +
                "    \"paypal\",\n" +
                "    \"cpanel\",\n" +
                "    \"artisteer\",\n" +
                "    \"mlb\",\n" +
                "    \"nationalgeographic\",\n" +
                "    \"google\",\n" +
                "    \"tmall\",\n" +
                "    \"tiny\",\n" +
                "    \"whitehouse\",\n" +
                "    \"patch\",\n" +
                "    \"go\",\n" +
                "    \"wix\",\n" +
                "    \"cdbaby\",\n" +
                "    \"google\",\n" +
                "    \"theatlantic\",\n" +
                "    \"twitter\",\n" +
                "    \"skype\",\n" +
                "    \"sfgate\",\n" +
                "    \"oracle\",\n" +
                "    \"woothemes\",\n" +
                "    \"youtu\",\n" +
                "    \"google\",\n" +
                "    \"hhs\",\n" +
                "    \"drupal\",\n" +
                "    \"t-online\",\n" +
                "    \"java\",\n" +
                "    \"baidu\",\n" +
                "    \"canalblog\",\n" +
                "    \"cyberchimps\",\n" +
                "    \"soundcloud\",\n" +
                "    \"amazon\",\n" +
                "    \"cafepress\",\n" +
                "    \"walmart\",\n" +
                "    \"ftc\",\n" +
                "    \"fotki\",\n" +
                "    \"google\",\n" +
                "    \"skyrock\",\n" +
                "    \"hao123\",\n" +
                "    \"phpbb\",\n" +
                "    \"people\",\n" +
                "    \"mit\",\n" +
                "    \"homestead\",\n" +
                "    \"narod\",\n" +
                "    \"home\",\n" +
                "    \"pbs\",\n" +
                "    \"creativecommons\",\n" +
                "    \"abc\",\n" +
                "    \"hud\",\n" +
                "    \"1688\",\n" +
                "    \"usda\",\n" +
                "    \"addtoany\",\n" +
                "    \"gravatar\",\n" +
                "    \"webmd\",\n" +
                "    \"themeforest\",\n" +
                "    \"flavors\",\n" +
                "    \"miitbeian\",\n" +
                "    \"moonfruit\",\n" +
                "    \"e-recht24\",\n" +
                "    \"sohu\",\n" +
                "    \"yelp\",\n" +
                "    \"ft\",\n" +
                "    \"nytimes\",\n" +
                "    \"studiopress\",\n" +
                "    \"wiley\",\n" +
                "    \"addthis\",\n" +
                "    \"liveinternet\",\n" +
                "    \"slate\",\n" +
                "    \"sun\",\n" +
                "    \"indiegogo\",\n" +
                "    \"sciencedaily\",\n" +
                "    \"howstuffworks\",\n" +
                "    \"meetup\",\n" +
                "    \"buzzfeed\",\n" +
                "    \"usnews\",\n" +
                "    \"nasa\",\n" +
                "    \"xrea\",\n" +
                "    \"apple\",\n" +
                "    \"bloomberg\",\n" +
                "    \"desdev\",\n" +
                "    \"psu\",\n" +
                "    \"naver\",\n" +
                "    \"networkadvertising\",\n" +
                "    \"tamu\",\n" +
                "    \"goo\",\n" +
                "    \"360\",\n" +
                "    \"amazon\",\n" +
                "    \"example\",\n" +
                "    \"bloglovin\",\n" +
                "    \"fastcompany\",\n" +
                "    \"opensource\",\n" +
                "    \"dailymotion\",\n" +
                "    \"wisc\",\n" +
                "    \"jalbum\",\n" +
                "    \"dailymail\",\n" +
                "    \"gov\",\n" +
                "    \"privacy\",\n" +
                "    \"usatoday\",\n" +
                "    \"icio\",\n" +
                "    \"squidoo\",\n" +
                "    \"spotify\",\n" +
                "    \"wp\",\n" +
                "    \"zdnet\",\n" +
                "    \"yolasite\",\n" +
                "    \"rediff\",\n" +
                "    \"altervista\",\n" +
                "    \"soup\",\n" +
                "    \"wikipedia\",\n" +
                "    \"wufoo\",\n" +
                "    \"tinyurl\",\n" +
                "    \"last\",\n" +
                "    \"ycombinator\",\n" +
                "    \"smh\",\n" +
                "    \"prnewswire\",\n" +
                "    \"w3\",\n" +
                "    \"geocities\",\n" +
                "    \"senate\",\n" +
                "    \"reddit\",\n" +
                "    \"facebook\",\n" +
                "    \"flickr\",\n" +
                "    \"gmpg\",\n" +
                "    \"businessweek\",\n" +
                "    \"china\",\n" +
                "    \"edublogs\",\n" +
                "    \"fema\",\n" +
                "    \"netlog\",\n" +
                "    \"nsw\",\n" +
                "    \"hc360\",\n" +
                "    \"oaic\",\n" +
                "    \"washington\",\n" +
                "    \"pcworld\",\n" +
                "    \"blogs\",\n" +
                "    \"ucla\",\n" +
                "    \"seattletimes\",\n" +
                "    \"who\",\n" +
                "    \"google\",\n" +
                "    \"ovh\",\n" +
                "    \"topsy\",\n" +
                "    \"deviantart\",\n" +
                "    \"g\",\n" +
                "    \"imgur\",\n" +
                "    \"parallels\",\n" +
                "    \"vistaprint\",\n" +
                "    \"earthlink\",\n" +
                "    \"columbia\",\n" +
                "    \"craigslist\",\n" +
                "    \"phoca\",\n" +
                "    \"mtv\",\n" +
                "    \"prweb\",\n" +
                "    \"hatena\",\n" +
                "    \"technorati\",\n" +
                "    \"chicagotribune\",\n" +
                "    \"marketwatch\",\n" +
                "    \"opera\",\n" +
                "    \"google\",\n" +
                "    \"angelfire\",\n" +
                "    \"biblegateway\",\n" +
                "    \"sogou\",\n" +
                "    \"oakley\",\n" +
                "    \"ed\",\n" +
                "    \"washingtonpost\",\n" +
                "    \"state\",\n" +
                "    \"elpais\",\n" +
                "    \"ameblo\",\n" +
                "    \"wikispaces\",\n" +
                "    \"macromedia\",\n" +
                "    \"indiatimes\",\n" +
                "    \"tinypic\",\n" +
                "    \"reference\",\n" +
                "    \"dropbox\",\n" +
                "    \"wunderground\",\n" +
                "    \"diigo\",\n" +
                "    \"forbes\",\n" +
                "    \"alibaba\",\n" +
                "    \"a8\",\n" +
                "    \"cmu\",\n" +
                "    \"slashdot\",\n" +
                "    \"dmoz\",\n" +
                "    \"cloudflare\",\n" +
                "    \"smugmug\",\n" +
                "    \"github\",\n" +
                "    \"dagondesign\",\n" +
                "    \"npr\",\n" +
                "    \"yellowbook\",\n" +
                "    \"vimeo\",\n" +
                "    \"sitemeter\",\n" +
                "    \"surveymonkey\",\n" +
                "    \"ox\",\n" +
                "    \"constantcontact\",\n" +
                "    \"nyu\",\n" +
                "    \"so-net\",\n" +
                "    \"google\",\n" +
                "    \"shareasale\",\n" +
                "    \"google\",\n" +
                "    \"google\",\n" +
                "    \"bloglines\",\n" +
                "    \"bigcartel\",\n" +
                "    \"feedburner\",\n" +
                "    \"reuters\",\n" +
                "    \"issuu\",\n" +
                "    \"admin\",\n" +
                "    \"usgs\",\n" +
                "    \"unicef\",\n" +
                "    \"weibo\",\n" +
                "    \"nifty\",\n" +
                "    \"google\",\n" +
                "    \"bing\",\n" +
                "    \"alexa\",\n" +
                "    \"is\",\n" +
                "    \"mashable\",\n" +
                "    \"noaa\",\n" +
                "    \"nbcnews\",\n" +
                "    \"livejournal\",\n" +
                "    \"rambler\",\n" +
                "    \"mediafire\",\n" +
                "    \"cbc\",\n" +
                "    \"com\",\n" +
                "    \"google\",\n" +
                "    \"mozilla\",\n" +
                "    \"omniture\",\n" +
                "    \"photobucket\",\n" +
                "    \"spiegel\",\n" +
                "    \"webeden\",\n" +
                "    \"yellowpages\",\n" +
                "    \"ucsd\",\n" +
                "    \"hostgator\",\n" +
                "    \"businesswire\",\n" +
                "    \"arstechnica\",\n" +
                "    \"hugedomains\",\n" +
                "    \"de\",\n" +
                "    \"va\",\n" +
                "    \"t\",\n" +
                "    \"time\",\n" +
                "    \"ustream\",\n" +
                "    \"pagesperso-orange\",\n" +
                "    \"linkedin\",\n" +
                "    \"uol\",\n" +
                "    \"booking\",\n" +
                "    \"netvibes\",\n" +
                "    \"mapquest\",\n" +
                "    \"vk\",\n" +
                "    \"newyorker\",\n" +
                "    \"jugem\",\n" +
                "    \"nydailynews\",\n" +
                "    \"mac\",\n" +
                "    \"youtube\",\n" +
                "    \"live\",\n" +
                "    \"examiner\",\n" +
                "    \"google\",\n" +
                "    \"freewebs\",\n" +
                "    \"microsoft\",\n" +
                "    \"cnet\",\n" +
                "    \"joomla\",\n" +
                "    \"tumblr\",\n" +
                "    \"foxnews\",\n" +
                "    \"instagram\",\n" +
                "    \"cocolog-nifty\",\n" +
                "    \"comcast\",\n" +
                "    \"ifeng\",\n" +
                "    \"digg\",\n" +
                "    \"youku\",\n" +
                "    \"ehow\",\n" +
                "    \"tripod\",\n" +
                "    \"illinois\",\n" +
                "    \"tuttocitta\",\n" +
                "    \"japanpost\",\n" +
                "    \"miibeian\",\n" +
                "    \"dyndns\",\n" +
                "    \"usa\",\n" +
                "    \"comsenz\",\n" +
                "    \"amazonaws\",\n" +
                "    \"imdb\",\n" +
                "    \"eventbrite\",\n" +
                "    \"nymag\",\n" +
                "    \"simplemachines\",\n" +
                "    \"cbslocal\",\n" +
                "    \"goo\",\n" +
                "    \"1und1\",\n" +
                "    \"weebly\",\n" +
                "    \"guardian\",\n" +
                "    \"unesco\",\n" +
                "    \"statcounter\",\n" +
                "    \"weather\",\n" +
                "    \"loc\",\n" +
                "    \"msn\",\n" +
                "    \"answers\",\n" +
                "    \"imageshack\",\n" +
                "    \"ted\",\n" +
                "    \"aol\",\n" +
                "    \"typepad\",\n" +
                "    \"ca\",\n" +
                "    \"disqus\",\n" +
                "    \"samsung\",\n" +
                "    \"qq\",\n" +
                "    \"mayoclinic\",\n" +
                "    \"slideshare\",\n" +
                "    \"ucoz\",\n" +
                "    \"wired\",\n" +
                "    \"purevolume\",\n" +
                "    \"huffingtonpost\",\n" +
                "    \"pinterest\",\n" +
                "    \"exblog\",\n" +
                "    \"cbsnews\",\n" +
                "    \"domainmarket\",\n" +
                "    \"plala\",\n" +
                "    \"aboutads\",\n" +
                "    \"umn\",\n" +
                "    \"intel\",\n" +
                "    \"chronoengine\",\n" +
                "    \"yandex\",\n" +
                "    \"cargocollective\",\n" +
                "    \"msu\",\n" +
                "    \"github\",\n" +
                "    \"nps\",\n" +
                "    \"kickstarter\",\n" +
                "    \"europa\",\n" +
                "    \"wikia\",\n" +
                "    \"taobao\",\n" +
                "    \"nih\",\n" +
                "    \"irs\",\n" +
                "    \"blog\",\n" +
                "    \"163\",\n" +
                "    \"pen\",\n" +
                "    \"hibu\",\n" +
                "    \"stanford\",\n" +
                "    \"stumbleupon\",\n" +
                "    \"cornell\",\n" +
                "    \"geocities\",\n" +
                "    \"reverbnation\",\n" +
                "    \"cisco\",\n" +
                "    \"upenn\",\n" +
                "    \"networksolutions\",\n" +
                "    \"mysql\",\n" +
                "    \"hubpages\",\n" +
                "    \"acquirethisname\",\n" +
                "    \"redcross\",\n" +
                "    \"bbb\",\n" +
                "    \"jiathis\",\n" +
                "    \"wikimedia\",\n" +
                "    \"springer\",\n" +
                "    \"barnesandnoble\",\n" +
                "    \"seesaa\",\n" +
                "    \"devhub\",\n" +
                "    \"csmonitor\",\n" +
                "    \"yahoo\",\n" +
                "    \"eepurl\",\n" +
                "    \"sina\",\n" +
                "    \"princeton\",\n" +
                "    \"cdc\",\n" +
                "    \"bluehost\",\n" +
                "    \"webnode\",\n" +
                "    \"paginegialle\",\n" +
                "    \"ow\",\n" +
                "    \"ihg\",\n" +
                "    \"hp\",\n" +
                "    \"toplist\",\n" +
                "    \"histats\",\n" +
                "    \"multiply\",\n" +
                "    \"mozilla\",\n" +
                "    \"boston\",\n" +
                "    \"amazon\",\n" +
                "    \"ning\",\n" +
                "    \"about\",\n" +
                "    \"scientificamerican\",\n" +
                "    \"icq\",\n" +
                "    \"list-manage\",\n" +
                "    \"ask\",\n" +
                "    \"marriott\",\n" +
                "    \"harvard\",\n" +
                "    \"webs\",\n" +
                "    \"hexun\",\n" +
                "    \"shutterfly\",\n" +
                "    \"chron\",\n" +
                "    \"discuz\",\n" +
                "    \"latimes\",\n" +
                "    \"elegantthemes\",\n" +
                "    \"cam\",\n" +
                "    \"php\",\n" +
                "    \"berkeley\",\n" +
                "    \"merriam-webster\",\n" +
                "    \"vkontakte\",\n" +
                "    \"sakura\",\n" +
                "    \"netscape\",\n" +
                "    \"engadget\",\n" +
                "    \"yahoo\",\n" +
                "    \"amazon\",\n" +
                "    \"theglobeandmail\",\n" +
                "    \"ezinearticles\",\n" +
                "    \"yale\",\n" +
                "    \"google\",\n" +
                "    \"furl\",\n" +
                "    \"archive\",\n" +
                "    \"virginia\",\n" +
                "    \"fda\",\n" +
                "    \"ocn\",\n" +
                "    \"fc2\",\n" +
                "    \"infoseek\",\n" +
                "    \"xinhuanet\",\n" +
                "    \"blogtalkradio\",\n" +
                "    \"tripadvisor\",\n" +
                "    \"wsj\",\n" +
                "    \"ebay\",\n" +
                "    \"globo\",\n" +
                "    \"gizmodo\",\n" +
                "    \"cnn\",\n" +
                "    \"symantec\",\n" +
                "    \"quantcast\",\n" +
                "    \"sphinn\",\n" +
                "    \"sourceforge\",\n" +
                "    \"apache\",\n" +
                "    \"blogger\",\n" +
                "    \"over-blog\",\n" +
                "    \"prlog\",\n" +
                "    \"shop-pro\",\n" +
                "    \"wordpress\",\n" +
                "    \"delicious\",\n" +
                "    \"bandcamp\",\n" +
                "    \"census\",\n" +
                "    \"shinystat\",\n" +
                "    \"accuweather\",\n" +
                "    \"odnoklassniki\",\n" +
                "    \"blinklist\",\n" +
                "    \"squarespace\",\n" +
                "    \"state\",\n" +
                "    \"jimdo\"\n" +
                "  ],\n" +
                "  \"topLevelDomains\": [\n" +
                "    \"co.jp\",\n" +
                "    \"com\",\n" +
                "    \"net\",\n" +
                "    \"co.uk\",\n" +
                "    \"ru\",\n" +
                "    \"cc\",\n" +
                "    \"gov\",\n" +
                "    \"ca\",\n" +
                "    \"be\",\n" +
                "    \"com.hk\",\n" +
                "    \"org\",\n" +
                "    \"de\",\n" +
                "    \"cn\",\n" +
                "    \"com.cn\",\n" +
                "    \"edu\",\n" +
                "    \"pl\",\n" +
                "    \"net.au\",\n" +
                "    \"me\",\n" +
                "    \"gov.cn\",\n" +
                "    \"gl\",\n" +
                "    \"uk\",\n" +
                "    \"gov.au\",\n" +
                "    \"us\",\n" +
                "    \"io\",\n" +
                "    \"fm\",\n" +
                "    \"com.au\",\n" +
                "    \"jp\",\n" +
                "    \"int\",\n" +
                "    \"it\",\n" +
                "    \"co\",\n" +
                "    \"cz\",\n" +
                "    \"ne.jp\",\n" +
                "    \"fr\",\n" +
                "    \"tx.us\",\n" +
                "    \"ac.uk\",\n" +
                "    \"ch\",\n" +
                "    \"com.br\",\n" +
                "    \"gd\",\n" +
                "    \"vu\",\n" +
                "    \"tv\",\n" +
                "    \"nl\",\n" +
                "    \"or.jp\",\n" +
                "    \"info\",\n" +
                "    \"eu\",\n" +
                "    \"ly\"\n" +
                "  ]\n" +
                "}";
    }

    public static class DomainNameData {
        public String[] topLevelDomains;
        public String[] subDomains;
    }
}
