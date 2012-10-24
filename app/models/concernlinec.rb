 # coding: utf-8
class Concernlinec
   include Mongoid::Document
   include Mongoid::Timestamps
 
     field :line, :type=>String
     field :emaillist, :type=>Array
     field :smslist, :type=>Array
     index ({ line: 1 }, { unique: true})
end
