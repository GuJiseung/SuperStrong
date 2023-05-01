.class public final Lg5/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/f<",
        "Lv4/a0;",
        "Lv4/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lg5/a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg5/a$b;

    invoke-direct {v0}, Lg5/a$b;-><init>()V

    sput-object v0, Lg5/a$b;->b:Lg5/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv4/a0;

    return-object p1
.end method
