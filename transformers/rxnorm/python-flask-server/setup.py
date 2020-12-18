# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "openapi_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "connexion>=2.0.2",
    "swagger-ui-bundle>=0.0.2",
    "python_dateutil>=2.6.0"
]

setup(
    name=NAME,
    version=VERSION,
    description="Transformer API for RxNorm",
    author_email="translator@broadinstitute.org",
    url="",
    keywords=["OpenAPI", "Transformer API for RxNorm"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['openapi/openapi.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['openapi_server=openapi_server.__main__:main']},
    long_description="""\
    Transformer API for RxNorm. \&quot;This product uses publicly available data courtesy of the U.S. National  Library of Medicine (NLM), National Institutes of Health, Department of Health and Human Services;  NLM is not responsible for the product and does not endorse or recommend this or any other product.\&quot;
    """
)

