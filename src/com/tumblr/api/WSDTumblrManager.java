
package com.tumblr.api;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import wsdarwin.javax.ws.rs.WebApplicationException;
import wsdarwin.javax.ws.rs.core.Response;
import wsdarwin.javax.ws.rs.core.UriBuilder;
import wsdarwin.javax.annotation.Generated;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.uri.UriTemplate;



@Generated(
		value = {
    "wadl|file:/var/lib/tomcat7/webapps/wsdarwin_1.0.0/files/wadlForProxy_static.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2015-01-09T10:40:07.387-07:00")
public class WSDTumblrManager {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://api.tumblr.com/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = WSDTumblrManager.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static WSDTumblrManager.V2 v2(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new WSDTumblrManager.V2(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(ClientConfig cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static com.sun.jersey.api.client.Client createClientInstance(ClientConfig cc) {
        return com.sun.jersey.api.client.Client.create(cc);
    }

    /**
     * Create a new Client instance
     * 
     */
    public static com.sun.jersey.api.client.Client createClient() {
        ClientConfig cc = new DefaultClientConfig();
        customizeClientConfiguration(cc);
        return createClientInstance(cc);
    }

    public static WSDTumblrManager.V2 v2() {
        return v2(createClient(), BASE_URI);
    }

    public static WSDTumblrManager.V2 v2(com.sun.jersey.api.client.Client client) {
        return v2(client, BASE_URI);
    }

    public static class V2 {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private V2(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public V2(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("v2");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public WSDTumblrManager.V2 .Blog blog() {
            return new WSDTumblrManager.V2 .Blog(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Blog {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Blog(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Blog(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("blog");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public WSDTumblrManager.V2 .Blog.Resource2 resource2(String resource2) {
                return new WSDTumblrManager.V2 .Blog.Resource2(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), resource2);
            }

            public static class Resource2 {

                private com.sun.jersey.api.client.Client _client;
                private UriBuilder _uriBuilder;
                private Map<String, Object> _templateAndMatrixParameterValues;

                private Resource2(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                    _client = client;
                    _uriBuilder = uriBuilder.clone();
                    _templateAndMatrixParameterValues = map;
                }

                /**
                 * Create new instance using existing Client instance, and a base URI and any parameters
                 * 
                 */
                public Resource2(com.sun.jersey.api.client.Client client, URI baseUri, String resource2) {
                    _client = client;
                    _uriBuilder = UriBuilder.fromUri(baseUri);
                    _uriBuilder = _uriBuilder.path("{resource2}");
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    _templateAndMatrixParameterValues.put("resource2", resource2);
                }

                /**
                 * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
                 * 
                 */
                public Resource2(com.sun.jersey.api.client.Client client, URI uri) {
                    _client = client;
                    StringBuilder template = new StringBuilder(BASE_URI.toString());
                    if (template.charAt((template.length()- 1))!= '/') {
                        template.append("/v2/blog/{resource2}");
                    } else {
                        template.append("v2/blog/{resource2}");
                    }
                    _uriBuilder = UriBuilder.fromPath(template.toString());
                    _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    UriTemplate uriTemplate = new UriTemplate(template.toString());
                    HashMap<String, String> parameters = new HashMap<String, String>();
                    uriTemplate.match(uri.toString(), parameters);
                    _templateAndMatrixParameterValues.putAll(parameters);
                }

                /**
                 * Get resource2
                 * 
                 */
                public String getResource2() {
                    return ((String) _templateAndMatrixParameterValues.get("resource2"));
                }

                /**
                 * Duplicate state and set resource2
                 * 
                 */
                public WSDTumblrManager.V2 .Blog.Resource2 setResource2(String resource2) {
                    Map<String, Object> copyMap;
                    copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                    UriBuilder copyUriBuilder = _uriBuilder.clone();
                    copyMap.put("resource2", resource2);
                    return new WSDTumblrManager.V2 .Blog.Resource2(_client, copyUriBuilder, copyMap);
                }

                public WSDTumblrManager.V2 .Blog.Resource2 .Posts posts() {
                    return new WSDTumblrManager.V2 .Blog.Resource2 .Posts(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                }

                public static class Posts {

                    private com.sun.jersey.api.client.Client _client;
                    private UriBuilder _uriBuilder;
                    private Map<String, Object> _templateAndMatrixParameterValues;

                    private Posts(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                        _client = client;
                        _uriBuilder = uriBuilder.clone();
                        _templateAndMatrixParameterValues = map;
                    }

                    /**
                     * Create new instance using existing Client instance, and a base URI and any parameters
                     * 
                     */
                    public Posts(com.sun.jersey.api.client.Client client, URI baseUri) {
                        _client = client;
                        _uriBuilder = UriBuilder.fromUri(baseUri);
                        _uriBuilder = _uriBuilder.path("posts");
                        _templateAndMatrixParameterValues = new HashMap<String, Object>();
                    }

                    public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                        UriBuilder localUriBuilder = _uriBuilder.clone();
                        com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                        com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                        resourceBuilder = resourceBuilder.accept("application/json");
                        com.sun.jersey.api.client.ClientResponse response;
                        response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                        if (response.getStatus()>= 400) {
                            throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                        return response.getEntity(returnType);
                    }

                    public<T >T getAsJson(Class<T> returnType) {
                        UriBuilder localUriBuilder = _uriBuilder.clone();
                        com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                        com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                        resourceBuilder = resourceBuilder.accept("application/json");
                        com.sun.jersey.api.client.ClientResponse response;
                        response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                        if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                        }
                        if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                            return response.getEntity(returnType);
                        } else {
                            return returnType.cast(response);
                        }
                    }

                    public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, com.sun.jersey.api.client.GenericType<T> returnType) {
                        UriBuilder localUriBuilder = _uriBuilder.clone();
                        if (notesInfo == null) {
                        }
                        if (notesInfo!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                        }
                        if (apiKey == null) {
                        }
                        if (apiKey!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                        }
                        if (reblogInfo == null) {
                        }
                        if (reblogInfo!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                        }
                        if (limit == null) {
                        }
                        if (limit!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                        }
                        if (offset == null) {
                        }
                        if (offset!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                        }
                        com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                        com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                        resourceBuilder = resourceBuilder.accept("application/json");
                        com.sun.jersey.api.client.ClientResponse response;
                        response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                        if (response.getStatus()>= 400) {
                            throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                        }
                        return response.getEntity(returnType);
                    }

                    public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, Class<T> returnType) {
                        UriBuilder localUriBuilder = _uriBuilder.clone();
                        if (notesInfo == null) {
                        }
                        if (notesInfo!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                        }
                        if (apiKey == null) {
                        }
                        if (apiKey!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                        }
                        if (reblogInfo == null) {
                        }
                        if (reblogInfo!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                        }
                        if (limit == null) {
                        }
                        if (limit!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                        }
                        if (offset == null) {
                        }
                        if (offset!= null) {
                            localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                        } else {
                            localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                        }
                        com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                        com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                        resourceBuilder = resourceBuilder.accept("application/json");
                        com.sun.jersey.api.client.ClientResponse response;
                        response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                        if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                        }
                        if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                            return response.getEntity(returnType);
                        } else {
                            return returnType.cast(response);
                        }
                    }

                    public WSDTumblrManager.V2 .Blog.Resource2 .Posts.Link link() {
                        return new WSDTumblrManager.V2 .Blog.Resource2 .Posts.Link(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    }

                    public WSDTumblrManager.V2 .Blog.Resource2 .Posts.Text text() {
                        return new WSDTumblrManager.V2 .Blog.Resource2 .Posts.Text(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    }

                    public WSDTumblrManager.V2 .Blog.Resource2 .Posts.Photo photo() {
                        return new WSDTumblrManager.V2 .Blog.Resource2 .Posts.Photo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                    }

                    public static class Link {

                        private com.sun.jersey.api.client.Client _client;
                        private UriBuilder _uriBuilder;
                        private Map<String, Object> _templateAndMatrixParameterValues;

                        private Link(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                            _client = client;
                            _uriBuilder = uriBuilder.clone();
                            _templateAndMatrixParameterValues = map;
                        }

                        /**
                         * Create new instance using existing Client instance, and a base URI and any parameters
                         * 
                         */
                        public Link(com.sun.jersey.api.client.Client client, URI baseUri) {
                            _client = client;
                            _uriBuilder = UriBuilder.fromUri(baseUri);
                            _uriBuilder = _uriBuilder.path("link");
                            _templateAndMatrixParameterValues = new HashMap<String, Object>();
                        }

                        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                        public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (notesInfo == null) {
                            }
                            if (notesInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                            }
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            if (reblogInfo == null) {
                            }
                            if (reblogInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                            }
                            if (limit == null) {
                            }
                            if (limit!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                            }
                            if (offset == null) {
                            }
                            if (offset!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (notesInfo == null) {
                            }
                            if (notesInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                            }
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            if (reblogInfo == null) {
                            }
                            if (reblogInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                            }
                            if (limit == null) {
                            }
                            if (limit!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                            }
                            if (offset == null) {
                            }
                            if (offset!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                    }

                    public static class Photo {

                        private com.sun.jersey.api.client.Client _client;
                        private UriBuilder _uriBuilder;
                        private Map<String, Object> _templateAndMatrixParameterValues;

                        private Photo(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                            _client = client;
                            _uriBuilder = uriBuilder.clone();
                            _templateAndMatrixParameterValues = map;
                        }

                        /**
                         * Create new instance using existing Client instance, and a base URI and any parameters
                         * 
                         */
                        public Photo(com.sun.jersey.api.client.Client client, URI baseUri) {
                            _client = client;
                            _uriBuilder = UriBuilder.fromUri(baseUri);
                            _uriBuilder = _uriBuilder.path("photo");
                            _templateAndMatrixParameterValues = new HashMap<String, Object>();
                        }

                        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                        public<T >T getAsJson(String apiKey, com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(String apiKey, Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                    }

                    public static class Text {

                        private com.sun.jersey.api.client.Client _client;
                        private UriBuilder _uriBuilder;
                        private Map<String, Object> _templateAndMatrixParameterValues;

                        private Text(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                            _client = client;
                            _uriBuilder = uriBuilder.clone();
                            _templateAndMatrixParameterValues = map;
                        }

                        /**
                         * Create new instance using existing Client instance, and a base URI and any parameters
                         * 
                         */
                        public Text(com.sun.jersey.api.client.Client client, URI baseUri) {
                            _client = client;
                            _uriBuilder = UriBuilder.fromUri(baseUri);
                            _uriBuilder = _uriBuilder.path("text");
                            _templateAndMatrixParameterValues = new HashMap<String, Object>();
                        }

                        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                        public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, com.sun.jersey.api.client.GenericType<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (notesInfo == null) {
                            }
                            if (notesInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                            }
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            if (reblogInfo == null) {
                            }
                            if (reblogInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                            }
                            if (limit == null) {
                            }
                            if (limit!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                            }
                            if (offset == null) {
                            }
                            if (offset!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (response.getStatus()>= 400) {
                                throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                            }
                            return response.getEntity(returnType);
                        }

                        public<T >T getAsJson(Boolean notesInfo, String apiKey, Boolean reblogInfo, Integer limit, Integer offset, Class<T> returnType) {
                            UriBuilder localUriBuilder = _uriBuilder.clone();
                            if (notesInfo == null) {
                            }
                            if (notesInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", notesInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("notes_info", ((Object[]) null));
                            }
                            if (apiKey == null) {
                            }
                            if (apiKey!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", apiKey);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("api_key", ((Object[]) null));
                            }
                            if (reblogInfo == null) {
                            }
                            if (reblogInfo!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", reblogInfo);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("reblog_info", ((Object[]) null));
                            }
                            if (limit == null) {
                            }
                            if (limit!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", limit);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("limit", ((Object[]) null));
                            }
                            if (offset == null) {
                            }
                            if (offset!= null) {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                            } else {
                                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                            }
                            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                            resourceBuilder = resourceBuilder.accept("application/json");
                            com.sun.jersey.api.client.ClientResponse response;
                            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                if (response.getStatus()>= 400) {
                                    throw new WSDTumblrManager.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                                }
                            }
                            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                                return response.getEntity(returnType);
                            } else {
                                return returnType.cast(response);
                            }
                        }

                    }

                }

            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
