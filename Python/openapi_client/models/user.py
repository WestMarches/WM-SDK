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


class User(object):
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
        'given_name': 'str',
        'family_name': 'str',
        'date_created': 'datetime',
        'characters': 'list[Character]',
        'credentials': 'list[UserCredentials]',
        'campaigns_owned': 'list[Campaign]'
    }

    attribute_map = {
        'id': 'id',
        'given_name': 'givenName',
        'family_name': 'familyName',
        'date_created': 'dateCreated',
        'characters': 'characters',
        'credentials': 'credentials',
        'campaigns_owned': 'campaignsOwned'
    }

    def __init__(self, id=None, given_name=None, family_name=None, date_created=None, characters=None, credentials=None, campaigns_owned=None, local_vars_configuration=None):  # noqa: E501
        """User - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._given_name = None
        self._family_name = None
        self._date_created = None
        self._characters = None
        self._credentials = None
        self._campaigns_owned = None
        self.discriminator = None

        if id is not None:
            self.id = id
        self.given_name = given_name
        self.family_name = family_name
        self.date_created = date_created
        self.characters = characters
        self.credentials = credentials
        self.campaigns_owned = campaigns_owned

    @property
    def id(self):
        """Gets the id of this User.  # noqa: E501


        :return: The id of this User.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this User.


        :param id: The id of this User.  # noqa: E501
        :type id: str
        """

        self._id = id

    @property
    def given_name(self):
        """Gets the given_name of this User.  # noqa: E501


        :return: The given_name of this User.  # noqa: E501
        :rtype: str
        """
        return self._given_name

    @given_name.setter
    def given_name(self, given_name):
        """Sets the given_name of this User.


        :param given_name: The given_name of this User.  # noqa: E501
        :type given_name: str
        """

        self._given_name = given_name

    @property
    def family_name(self):
        """Gets the family_name of this User.  # noqa: E501


        :return: The family_name of this User.  # noqa: E501
        :rtype: str
        """
        return self._family_name

    @family_name.setter
    def family_name(self, family_name):
        """Sets the family_name of this User.


        :param family_name: The family_name of this User.  # noqa: E501
        :type family_name: str
        """

        self._family_name = family_name

    @property
    def date_created(self):
        """Gets the date_created of this User.  # noqa: E501


        :return: The date_created of this User.  # noqa: E501
        :rtype: datetime
        """
        return self._date_created

    @date_created.setter
    def date_created(self, date_created):
        """Sets the date_created of this User.


        :param date_created: The date_created of this User.  # noqa: E501
        :type date_created: datetime
        """
        if self.local_vars_configuration.client_side_validation and date_created is None:  # noqa: E501
            raise ValueError("Invalid value for `date_created`, must not be `None`")  # noqa: E501

        self._date_created = date_created

    @property
    def characters(self):
        """Gets the characters of this User.  # noqa: E501


        :return: The characters of this User.  # noqa: E501
        :rtype: list[Character]
        """
        return self._characters

    @characters.setter
    def characters(self, characters):
        """Sets the characters of this User.


        :param characters: The characters of this User.  # noqa: E501
        :type characters: list[Character]
        """

        self._characters = characters

    @property
    def credentials(self):
        """Gets the credentials of this User.  # noqa: E501


        :return: The credentials of this User.  # noqa: E501
        :rtype: list[UserCredentials]
        """
        return self._credentials

    @credentials.setter
    def credentials(self, credentials):
        """Sets the credentials of this User.


        :param credentials: The credentials of this User.  # noqa: E501
        :type credentials: list[UserCredentials]
        """

        self._credentials = credentials

    @property
    def campaigns_owned(self):
        """Gets the campaigns_owned of this User.  # noqa: E501


        :return: The campaigns_owned of this User.  # noqa: E501
        :rtype: list[Campaign]
        """
        return self._campaigns_owned

    @campaigns_owned.setter
    def campaigns_owned(self, campaigns_owned):
        """Sets the campaigns_owned of this User.


        :param campaigns_owned: The campaigns_owned of this User.  # noqa: E501
        :type campaigns_owned: list[Campaign]
        """

        self._campaigns_owned = campaigns_owned

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
        if not isinstance(other, User):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, User):
            return True

        return self.to_dict() != other.to_dict()