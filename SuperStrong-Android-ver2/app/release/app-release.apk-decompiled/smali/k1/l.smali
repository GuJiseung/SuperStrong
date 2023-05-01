.class public abstract Lk1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk1/l$b;

.field public static final b:Lk1/l$c;

.field public static final c:Lk1/l$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/l$a;

    invoke-direct {v0}, Lk1/l$a;-><init>()V

    new-instance v0, Lk1/l$b;

    invoke-direct {v0}, Lk1/l$b;-><init>()V

    sput-object v0, Lk1/l;->a:Lk1/l$b;

    new-instance v0, Lk1/l$c;

    invoke-direct {v0}, Lk1/l$c;-><init>()V

    sput-object v0, Lk1/l;->b:Lk1/l$c;

    new-instance v0, Lk1/l$d;

    invoke-direct {v0}, Lk1/l$d;-><init>()V

    new-instance v0, Lk1/l$e;

    invoke-direct {v0}, Lk1/l$e;-><init>()V

    sput-object v0, Lk1/l;->c:Lk1/l$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(Li1/a;)Z
.end method

.method public abstract d(ZLi1/a;Li1/c;)Z
.end method
