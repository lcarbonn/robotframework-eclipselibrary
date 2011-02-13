#  Copyright 2011 laurent.carbonnaux
#
# A jython module that implements a Java interface to
# with BuiltIn robotframework library

from org.robotframework.jybuiltin.interfaces import JyBuiltIn
from robot.libraries.BuiltIn import BuiltIn
from java.util import HashMap
from java.lang import Object
from jarray import array

class JyBuiltIn(JyBuiltIn):

### Since java doesn't support multiple inheritance, 
### all BuiltIn subclasses methods are reported here in line
  
### begin methods from class _Variables:

    def get_variables(self):
        variables = BuiltIn().get_variables()
        vars = HashMap()
        for name in sorted(variables.keys(), key=lambda string: string.lower()):
            vars.put(str(name), variables[name])
        return vars
    
    def get_variable(self, name):
        """Get the given variable value."""
        values = BuiltIn().get_variables()[name]
        if isinstance(values, basestring):
            return values
        return array(values, Object)

    def log_variables(self, level='INFO'):
        """Logs all variables in the current scope with given log level."""
        BuiltIn().log_variables(level)
        
    def variable_should_exist(self, name, msg=None):
        BuiltIn().variable_should_exist(name, msg)

    def variable_should_not_exist(self, name, msg=None):
        BuiltIn().variable_should_not_exist(name, msg)

    def replace_variables(self, text):
        value = BuiltIn().replace_variables(text)
        if isinstance(value, basestring):
            return value
        return str(value)

    def set_test_variable(self, name, values):
        BuiltIn().set_test_variable(name, *values)

    def set_suite_variable(self, name, values):
        BuiltIn().set_suite_variable(name, *values)

    def set_global_variable(self, name, values):
        BuiltIn().set_global_variable(name, *values)

### end methods from _Variables:

### begin methods from class _Misc:

    def no_operation(self):
        BuiltIn().no_operation()

    def sleep(self, time, reason=None):
        BuiltIn().sleep(time, reason)

    def catenate(self, items):
        return BuiltIn().catenate(*items)

    def log(self, message, level="INFO"):
        BuiltIn().log(message, level)
        
    def log_many(self, messages):
        BuiltIn().log_many(*messages)

    def comment(self, messages):
        BuiltIn().comment(*messages)

    def set_log_level(self, level):
        return BuiltIn().set_log_level(level)

    def import_library(self, name, args):
        BuiltIn().import_library(name, *args)
        
    def import_variables(self, path, args):
        BuiltIn().import_variables(path, *args)
        
    def import_resource(self, path):
        BuiltIn().import_resource(path)

    def set_library_search_order(self, libraries):
        return BuiltIn().set_library_search_order(*libraries)

    def get_time(self, format='timestamp', time='NOW'):
        return BuiltIn().get_time(format, time)

    def evaluate(self, expression, modules=None):
        return BuiltIn().evaluate(expression, modules)

    def call_method(self, object, method_name, args):
        return BuiltIn().call_method(object, method_name, *args)

    def regexp_escape(self, patterns):
        return BuiltIn().regexp_escape(*patterns)

    def set_test_message(self, message):
        BuiltIn().set_test_message(message)
        
    def set_tags(self, tags):
        BuiltIn().set_tags(*tags)

    def remove_tags(self, tags):
        BuiltIn().remove_tags(*tags)

    def get_library_instance(self, name):
        return BuiltIn().get_library_instance(name)

### end methods from class _Misc:
