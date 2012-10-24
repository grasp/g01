# coding: utf-8
class Concernphonec
  include Mongoid::Document
  include Mongoid::Timestamps
 
  field :phone, :type=>String
  field :emaillist, :type=>Array
  field :smslist, :type=>Array
   index ({ phone: 1 }, { unique: true})
end
