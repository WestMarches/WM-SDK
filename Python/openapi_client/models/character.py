# coding: utf-8

"""
    WestMarches API

    West Marches API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import inspect
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class Character(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'id': 'str',
        'owner': 'User',
        'server': 'Campaign',
        'name': 'str',
        'level': 'int',
        'inspiration': 'int',
        'currency': 'int',
        'format': 'str',
        'experience': 'int',
        'experience_cap': 'int',
        'alive': 'bool',
        'inventory': 'list[Stock]',
        'roles': 'list[UserRoles]',
        'ready_date': 'datetime',
        'dd_beyond': 'int'
    }

    attribute_map = {
        'id': 'id',
        'owner': 'owner',
        'server': 'server',
        'name': 'name',
        'level': 'level',
        'inspiration': 'inspiration',
        'currency': 'currency',
        'format': 'format',
        'experience': 'experience',
        'experience_cap': 'experienceCap',
        'alive': 'alive',
        'inventory': 'inventory',
        'roles': 'roles',
        'ready_date': 'readyDate',
        'dd_beyond': 'ddBeyond'
    }

    def __init__(self, id=None, owner=None, server=None, name=None, level=None, inspiration=None, currency=None, format=None, experience=None, experience_cap=None, alive=None, inventory=None, roles=None, ready_date=None, dd_beyond=None, local_vars_configuration=None):  # noqa: E501
        """Character - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._owner = None
        self._server = None
        self._name = None
        self._level = None
        self._inspiration = None
        self._currency = None
        self._format = None
        self._experience = None
        self._experience_cap = None
        self._alive = None
        self._inventory = None
        self._roles = None
        self._ready_date = None
        self._dd_beyond = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if owner is not None:
            self.owner = owner
        if server is not None:
            self.server = server
        self.name = name
        self.level = level
        self.inspiration = inspiration
        self.currency = currency
        self.format = format
        self.experience = experience
        if experience_cap is not None:
            self.experience_cap = experience_cap
        self.alive = alive
        self.inventory = inventory
        self.roles = roles
        self.ready_date = ready_date
        if dd_beyond is not None:
            self.dd_beyond = dd_beyond

    @property
    def id(self):
        """Gets the id of this Character.  # noqa: E501


        :return: The id of this Character.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Character.


        :param id: The id of this Character.  # noqa: E501
        :type id: str
        """

        self._id = id

    @property
    def owner(self):
        """Gets the owner of this Character.  # noqa: E501


        :return: The owner of this Character.  # noqa: E501
        :rtype: User
        """
        return self._owner

    @owner.setter
    def owner(self, owner):
        """Sets the owner of this Character.


        :param owner: The owner of this Character.  # noqa: E501
        :type owner: User
        """

        self._owner = owner

    @property
    def server(self):
        """Gets the server of this Character.  # noqa: E501


        :return: The server of this Character.  # noqa: E501
        :rtype: Campaign
        """
        return self._server

    @server.setter
    def server(self, server):
        """Sets the server of this Character.


        :param server: The server of this Character.  # noqa: E501
        :type server: Campaign
        """

        self._server = server

    @property
    def name(self):
        """Gets the name of this Character.  # noqa: E501


        :return: The name of this Character.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Character.


        :param name: The name of this Character.  # noqa: E501
        :type name: str
        """
        if self.local_vars_configuration.client_side_validation and name is None:  # noqa: E501
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def level(self):
        """Gets the level of this Character.  # noqa: E501


        :return: The level of this Character.  # noqa: E501
        :rtype: int
        """
        return self._level

    @level.setter
    def level(self, level):
        """Sets the level of this Character.


        :param level: The level of this Character.  # noqa: E501
        :type level: int
        """
        if self.local_vars_configuration.client_side_validation and level is None:  # noqa: E501
            raise ValueError("Invalid value for `level`, must not be `None`")  # noqa: E501

        self._level = level

    @property
    def inspiration(self):
        """Gets the inspiration of this Character.  # noqa: E501


        :return: The inspiration of this Character.  # noqa: E501
        :rtype: int
        """
        return self._inspiration

    @inspiration.setter
    def inspiration(self, inspiration):
        """Sets the inspiration of this Character.


        :param inspiration: The inspiration of this Character.  # noqa: E501
        :type inspiration: int
        """
        if self.local_vars_configuration.client_side_validation and inspiration is None:  # noqa: E501
            raise ValueError("Invalid value for `inspiration`, must not be `None`")  # noqa: E501

        self._inspiration = inspiration

    @property
    def currency(self):
        """Gets the currency of this Character.  # noqa: E501


        :return: The currency of this Character.  # noqa: E501
        :rtype: int
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this Character.


        :param currency: The currency of this Character.  # noqa: E501
        :type currency: int
        """
        if self.local_vars_configuration.client_side_validation and currency is None:  # noqa: E501
            raise ValueError("Invalid value for `currency`, must not be `None`")  # noqa: E501

        self._currency = currency

    @property
    def format(self):
        """Gets the format of this Character.  # noqa: E501


        :return: The format of this Character.  # noqa: E501
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """Sets the format of this Character.


        :param format: The format of this Character.  # noqa: E501
        :type format: str
        """

        self._format = format

    @property
    def experience(self):
        """Gets the experience of this Character.  # noqa: E501


        :return: The experience of this Character.  # noqa: E501
        :rtype: int
        """
        return self._experience

    @experience.setter
    def experience(self, experience):
        """Sets the experience of this Character.


        :param experience: The experience of this Character.  # noqa: E501
        :type experience: int
        """
        if self.local_vars_configuration.client_side_validation and experience is None:  # noqa: E501
            raise ValueError("Invalid value for `experience`, must not be `None`")  # noqa: E501

        self._experience = experience

    @property
    def experience_cap(self):
        """Gets the experience_cap of this Character.  # noqa: E501


        :return: The experience_cap of this Character.  # noqa: E501
        :rtype: int
        """
        return self._experience_cap

    @experience_cap.setter
    def experience_cap(self, experience_cap):
        """Sets the experience_cap of this Character.


        :param experience_cap: The experience_cap of this Character.  # noqa: E501
        :type experience_cap: int
        """

        self._experience_cap = experience_cap

    @property
    def alive(self):
        """Gets the alive of this Character.  # noqa: E501


        :return: The alive of this Character.  # noqa: E501
        :rtype: bool
        """
        return self._alive

    @alive.setter
    def alive(self, alive):
        """Sets the alive of this Character.


        :param alive: The alive of this Character.  # noqa: E501
        :type alive: bool
        """
        if self.local_vars_configuration.client_side_validation and alive is None:  # noqa: E501
            raise ValueError("Invalid value for `alive`, must not be `None`")  # noqa: E501

        self._alive = alive

    @property
    def inventory(self):
        """Gets the inventory of this Character.  # noqa: E501


        :return: The inventory of this Character.  # noqa: E501
        :rtype: list[Stock]
        """
        return self._inventory

    @inventory.setter
    def inventory(self, inventory):
        """Sets the inventory of this Character.


        :param inventory: The inventory of this Character.  # noqa: E501
        :type inventory: list[Stock]
        """

        self._inventory = inventory

    @property
    def roles(self):
        """Gets the roles of this Character.  # noqa: E501


        :return: The roles of this Character.  # noqa: E501
        :rtype: list[UserRoles]
        """
        return self._roles

    @roles.setter
    def roles(self, roles):
        """Sets the roles of this Character.


        :param roles: The roles of this Character.  # noqa: E501
        :type roles: list[UserRoles]
        """

        self._roles = roles

    @property
    def ready_date(self):
        """Gets the ready_date of this Character.  # noqa: E501


        :return: The ready_date of this Character.  # noqa: E501
        :rtype: datetime
        """
        return self._ready_date

    @ready_date.setter
    def ready_date(self, ready_date):
        """Sets the ready_date of this Character.


        :param ready_date: The ready_date of this Character.  # noqa: E501
        :type ready_date: datetime
        """
        if self.local_vars_configuration.client_side_validation and ready_date is None:  # noqa: E501
            raise ValueError("Invalid value for `ready_date`, must not be `None`")  # noqa: E501

        self._ready_date = ready_date

    @property
    def dd_beyond(self):
        """Gets the dd_beyond of this Character.  # noqa: E501


        :return: The dd_beyond of this Character.  # noqa: E501
        :rtype: int
        """
        return self._dd_beyond

    @dd_beyond.setter
    def dd_beyond(self, dd_beyond):
        """Sets the dd_beyond of this Character.


        :param dd_beyond: The dd_beyond of this Character.  # noqa: E501
        :type dd_beyond: int
        """

        self._dd_beyond = dd_beyond

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = inspect.getargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Character):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Character):
            return True

        return self.to_dict() != other.to_dict()
