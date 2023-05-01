package y3;
/* loaded from: classes.dex */
public interface b {
    @i5.k({"Content-Type: application/json"})
    @i5.o("/api/main_history")
    Object a(@i5.a i iVar, e4.d<? super g5.b0<k>> dVar);

    @i5.k({"Content-Type: application/json"})
    @i5.o("api/main_asset")
    Object b(@i5.a i iVar, e4.d<? super g5.b0<k>> dVar);

    @i5.k({"Content-Type: application/json"})
    @i5.o("api/chpass")
    Object c(@i5.a p pVar, e4.d<? super g5.b0<e>> dVar);

    @i5.o("api/login")
    g5.b<q3.q> d(@i5.a l lVar);

    @i5.o("api/send_input")
    g5.b<q3.q> e(@i5.a m mVar);

    @i5.k({"Content-Type: application/json"})
    @i5.o("api/chpass/newPass")
    Object f(@i5.a p pVar, e4.d<? super g5.b0<e>> dVar);

    @i5.k({"Content-Type: application/json"})
    @i5.o("api/register")
    Object g(@i5.a j jVar, e4.d<? super g5.b0<k>> dVar);

    @i5.o("api/send")
    g5.b<q3.q> h(@i5.a m mVar);

    @i5.k({"Content-Type: application/json"})
    @i5.o("api/register/auth")
    Object i(@i5.a j jVar, e4.d<? super g5.b0<k>> dVar);
}
