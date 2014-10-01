(defproject lshift "0.0.1"
	:description "Count 1 bits"
	:url "https://lshift.com"
	:dependencies [[org.clojure/clojure "1.5.1"]
					[compojure "1.1.5"]
					[clj-http "0.7.6"]
					[com.taoensso/timbre "2.7.1"]]
	:plugins [[lein-ring "0.8.5"]]
	:main lshift.main
	:profiles
	{:dev {:dependencies [[midje "1.5.1"]
						  ; [io.aviso/pretty "0.1.10"]
]}})