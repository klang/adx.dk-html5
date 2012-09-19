(ns html5-examples.views.welcome
  (:require [html5-examples.views.common :as common])
  (:use [noir.core :only [defpage]]
	[hiccup.page :only [include-css html5]]))

(defpage "/html5" []
  (html5
   [:head
    [:meta {:charset "UTF-8"}]
    [:title "HTML5"]
    (include-css "/css/html5-kursus.css")]
   [:body
    [:header [:h1 "HTML5"]]
    [:nav [:h2 "Menu"]
     [:p [:a {:href "#top"} "Top"]]
     [:p [:a {:href "#animation"} "Animation"]]
     [:p [:a {:href "#medier"} "Medier"]]
     [:p [:a {:href "#canvas"} "Canvas"]]
     [:p [:a {:href "#geolocation"} "GeoLocation"]]
     [:p [:a {:href "#formular"} "Formular"]]
     [:p [:a {:href "#svg"} "SVG"]]
     [:p "&nbsp;"]]
    [:section
     [:h2 "New English"]
     [:article {:id "art1"}
      [:p "The European Commission has just announced an agreement whereby English will be the official language of the EU (European Union) rather than German which was the other possibility.  As part of the negotiations, Her Majesty's Government conceded that English spelling had some room for improvement and has accepted a 5 year phase-in plan that would be known as &quot;Euro-English&quot;."]
      [:p "In the first year, &quot;s&quot; will replace the soft &quot;c&quot;.  Sertainly, this will make the sivil servants jump with joy. The hard &quot;c&quot; will be dropped in favour of the&quot;k&quot;. This should klear up konfusion and keyboards kan have one less letter."]
      [:p "There will be growing publik enthusiasm in the sekond year, when the troublesome &quot;ph&quot; will be replaced with &quot;f&quot;. This will make words like &quot;fotograf&quot; 20% shorter."]
      [:p "In the 3rd year, publik akseptanse of the new spelling kan be ekspekted to reach the stage where more komplikated changes are possible.  Governments will enkorage the removal of double letters, which have always ben a deterent to akurate speling. Also, al wil agre that the horible mes of the silent &quot;e&quot;s in the language is disgraseful, and they should go away."]      [:p "By the fourth year, peopl wil be reseptiv to steps such as replasing &quot;th&quot; with &quot;z&quot; and &quot;w&quot; with &quot;v&quot;.  During ze fifz year, ze unesesary &quot;o&quot; kan be dropd from vords kontaining &quot;ou&quot; and similar changes vud of kors be aplid to ozer kombinations of leters."]
      [:p "After zis fifz yer, ve vil hav a reli sensibl riten styl. Zer vil be no mor trubl or difikultis and evrivun vil find it ezi to understand ech ozer.  Ze drem vil finali kum tru!  And zen ve vil tak over ze world!"]]
     [:article {:id "art2"}
      [:h2 "Animation"]
      [:div {:id "outerspace"}
       [:div {:class "rocket"} [:img {:src "images/lunar.png"}]]]]
     [:article {:id "art3"}
      [:h1 "Pidgin"]
      [:p [:img {:src "images/txtlogo.png" :alt "HTML5 logo" :align "right" :class "twist"}]] "Sampela manmeri ikam long Niugini Ailan long nambawan taim long faivpela ten tausen yia i go pinis. Ol pipol bilong Hailans i wokim gaden long nain tausen yia i go pinis - emi klostu nambawan taim long wol long wokim gaden. Olsem fopela tausen yia i go pinis, ol lain oli kolim Ostronisien i kamap long Papua Niugini, na oli bringim ol pik, pasin bilong hukim pis, pasin bilong wokim pot, na ol nupela tokples i kam." [:p "Olsem tri handet yia i go pinis, kaukau i kam long Saut Amerika. Kaukau i winim taro long karim planti kaikai, na nau namba bilong ol manmeri i go antap long Hailans na sampela ol narapela hap. Dispela nem \"Papua Niugini\" i kamap long tok \"Papua\", hap tok bilong Malesia long kain gras bilong ol manmeri bilong Melanesia, na tok \"Niu Gini\", i kam long wanpela man bilong Spen, Yaigo Ortiz de Retez, husait i tingim lukluk bilong ol manmeri bilong Niugini i wankain ol manmeri bilong hap Gini long Afrika."] [:p "Long yia 1883, kantri Briten i kam long Sauten Rijen na tokaut olsem emi giraun bilong ol nau. Ol i kirapim gavman bilong dispela hap na givim nem \"British New Guinea\", o \"Niugini bilong Briten\". Kapitol bilong dispela gavman emi Pot Mosbi."]
      [:p "Long yia 1884, kantri Jemani i kam long Ailans Rijen na Momase Rijen na tokaut olsem emi giraun bilong ol nau. Ol i no kirapim gavman tru pastaim, tasol oli tokim Kampani bilong Niugini (Tok Siaman: Neuguinea-Kompanie) long bosim dispela giraun. Nambawan taun bilong dispela kampani oli kolim HerbertshÃ¶he long Tok Siaman. Nau yumi save long dispela taun long nem Kokopo. Long yia 1899, gavman bilong Jemani i tokim kampani olsem i mas pinis long bosim giraun, na gavman i kirapim ofis bilong gavman long bosim Niugini bilong Jemani. Taim wo i stat long 1915, ami bilong Ostrelia i rausim gavman bilong Jemani na bosim tupela giraun: \"Papua\" (Sauten Rijen) na \"New Guinea\" (Ailans Rijen na Momase Rijen). Wo i pinis long 1918, na bihain Ostrelia i kisim tokorait long Lig bilong ol Kantri (Tok Inglis: League of Nations) long bosim tupela giraun. Wo i kamap gen long 1941, taim ami bilong Siapan i kam na holim planti hap long Niugini olsem Niu Ailan, Manus, Niu Briten, Bogenvil, Momase Rijen na tu Oro na Milen Be. Planti pait i kamap long kainkain hap long kantri long dispela taim. Dispela wo i pinis long 1945. Bihain long wo, Papua na Niugini i pas wantaim olsem wanpela giraun, wantaim nem Papua na Niugini, na Ostrelia i lukautim. Haus bilong Asembli, olsem Palamen, i stat long 1964."]
      [:p "Long 1972 nupela ileksen i kamap long Palamen tru, na ol memba i makim Michael Somare olsem nambawan Praim Minista bilong kantri. Long dispela taim, nem bilong kantri i senis i go long Papua Niugini. Long yia 1975, long 16 Septemba, Papua Niugini i kisim independens long Ostrelia, na em i sanap olsem wanpela kantri em yet nau. Michael Somare bilong Pangu Pati i stap olsem Praim Minista inap long yia 1980, na long dispela taim Palamen i vot long rausim em na Julius Chan i kisim nambawan sia nau. </p>"]
      
      [:p "Long yia 1982, Michael Somare i winim vot na sanap olsem Praim Minista gen, tasol Palamen i rausim em long 1985 na givim dispela posisen i go long Paias Wingti. Wingti i stap yet olsem Praim Minista bihain long ol ileksen bilong yia 1987, tasol Palamen i rausim em long 1988 na makim Rabbie Namaliu. Traipela pait long Bogenvil i stat long yia 1988 i go long yia 1997. Klostu tupela ten tausen manmeri i dai pinis long dispela pait. </p>"]
      [:p "Long yia 1992, Sir Julius Chan i kisim pawa gen, inap long 1997, taim emi risain bihain long traubel wantaim Sandlain long Bogenvil. Palamen i makim Bill Skate olsem Praim Minista long dispela taim. Long 1999, oli rausim em gen, na Sir Mekere Morauta emi sanap olsem nupela Praim Minista bilong kantri. Long ileksen bilong yia 2002, nupela pati bilong Sir Michael Somare, Nesenel Alains, i wokim nupela gavman, na long nambawan taim long kantri, dispela gavman istap long faivpela yia inap long ol ileksen long yia 2007. Long nesenel ileksen bilong yia 2007, Nesenel Alains i winim ol narapela pati na kirapim nupela gavman gen.</p>"]
      [:p "&nbsp;"]]
     [:a {:id "medier"}]
     [:h2 "Medier"]
     [:audio {:controls "controls"}
      [:source {:src "http://adx.dk/html5/media/cph.org" :type "audio/ogg"}]
      [:source {:src "http://adx.dk/html5/media/cph.mp3" :type "audio/mpeg"}]
      "Your browser does not support the audio element"]
     [:p "&nbsp;"]
     [:video {:controls "controls" :poster "http://adx.dk/html5/images/poster.jpg" :track "Roadmovie"}
      [:source {:src "http://adx.dk/html5/media/road.ogg" :type "video/ogg"}]
      [:source {:src "http://adx.dk/html5/media/road.mp4" :type "video/mp4"}]
      [:source {:src "http://adx.dk/html5/media/road.flv" :type "video/flv"}]
      "Your browser does not support the video element"]
     [:p "&nbsp;"]

     [:a {:id "canvas"}]
     [:p "Vi ser her to interaktive eksempler på brugen af Canvas i en iframe, og ét i et nyt vindue."]
     [:p [:a {:href "canvas/skitse.html" :target "iframe"}]]
     [:p
      [:a {:href "canvas/skitse.html"} "Skitse"] "&nbsp;|&nbsp;"
      [:a {:href "canvas/color.html" :target "iframe"} "Farvelæg"] "&nbsp;|&nbsp;"
      [:a {:href "http://mugtug.com/sketchpad/" :target "_blank"} "Helt tegneprogram"]]
     [:iframe {:src "canvas/skitse.html" :width "490" :height "350" :scrolling "no" :marginheight "0" :marginwidth "0" :name "iframe" :frameborder "0"}]
     [:p "&nbsp;"]
     [:a {:id "geolocation"}]
     [:h2 "GeoLocation"]
     [:div
      [:button {:id "btnInit"} "Find mig!"]
      [:button {:id "btnStop"} "Stop positionering"]]
     [:p "&nbsp;"]
     [:p "&nbsp;"]
     [:a {:id "formular"}]
     [:h2 "Formular"]
     [:form {:action "xxx.asp"}
      "Fornavn:"     [:input {:type "text" :name "fnavn"}] "&nbsp;" 
      "Efternavn:"   [:input {:type "text" :name "enavn"}] [:br]
      "E-mail:"      [:input {:type "text" :name "email"}] "&nbsp;" 
      "Antal kager:" [:input {:type "text" :name "kager"}] [:br]
      [:input {:type "submit"}]]
     [:p "&nbsp;"]
     [:a {:id "svg"}]
     [:h2 "SVG"]
     [:img {:src "images/HTML5_Badge.png"}]
     [:p "&nbsp;"]
     [:p "&nbsp;"]
     [:p "&nbsp;"]
     [:p "&nbsp;"]]
    [:aside {:id "aside1"}
     [:h2 "HTML5"]
     [:p "Fremtiden i din browser"]]
    [:aside {:id "aside2"}
     [:h2 "CSS3"]
     [:p "enne side er udfærdiget i HTML5 og CSS3"]]
    [:div {:id "logo"}]
    [:footer [:h6 "Copyright 2012 © MicroWorld A/S"]]
    ]))