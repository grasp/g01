# coding: utf-8
class Concernuserc
  include Mongoid::Document
  include Mongoid::Timestamps
 
  field :userid, :type=>String
  field :emaillist, :type=>Array
  field :smslist, :type=>Array
   index ({ userid: 1 }, { unique: true})
end
