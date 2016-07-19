#!/usr/bin/env ruby

require 'yaml'
require 'erb'

yaml = IO.read(".rainbow")
obj = YAML.load(yaml)

dependencies = obj["dependencies"]
run = obj["run"]

docker_file = ERB.new("
FROM ubuntu:14.04
RUN apt-get update && apt-get install -y --force-yes <% dependencies.each do |dependency| %><%= dependency %> <% end %>
CMD <%= run %>
").result

IO.write("Dockerfile", docker_file)